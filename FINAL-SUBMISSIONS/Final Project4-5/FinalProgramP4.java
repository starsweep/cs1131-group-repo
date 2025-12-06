import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Samuel Mitchell, Andrew Martin
 */

public class FinalProgramP4 extends AbstractClass {

    public FinalProgramP4() {
        setTrackDB(new ArrayList<>());
        setUsers(new ArrayList<>());
        setTitles(new ArrayList<>());
        setArtists(new ArrayList<>());
        setAlbums(new ArrayList<>());
        setGenres(new ArrayList<>());
        setUserTrackMap(new HashMap<>());

        readInput("Responses.csv");
    }

    private ArrayList<Double> buildFrequencyVector(String user, String fieldName) {

        ArrayList<Double> counts = new ArrayList<>();

        ArrayList<String> type;

        switch (fieldName.toUpperCase()) {
            case "TITLE":
                type = getTitles();
                break;
            case "ARTIST":
                type = getArtists();
                break;
            case "GENRE":
                type = getGenres();
                break;
            case "ALBUM":
                type = getAlbums();
                break;
            default:
                return null;
        }

        for (int i = 0; i < type.size(); i++) {
            counts.add(0.0);
        }

        ArrayList<TrackInfo> tracks = getUserTrackMap().get(user.toUpperCase());
        if (tracks == null){
            return counts;
        }

        for (TrackInfo t : tracks) {
            String value;
            if (fieldName.equalsIgnoreCase("TITLE")) {
                value = t.getTitle();
            } else if (fieldName.equalsIgnoreCase("ARTIST")) {
                value = t.getArtist();
            } else if (fieldName.equalsIgnoreCase("GENRE")) {
                value = t.getGenre();
            } else {
                value = t.getAlbum();
            }
            int index = type.indexOf(value);
            if (index >= 0) {
                counts.set(index, counts.get(index) + 1);
            }
        }
        return counts;
    }

    @Override
    public double calculateSimilarity(String user1, String user2, String fieldName, String method) {

        user1 = user1.toUpperCase();
        user2 = user2.toUpperCase();

        if (!getUsers().contains(user1) || !getUsers().contains(user2)) {
            return -1;
        }

        ArrayList<Double> v1 = buildFrequencyVector(user1, fieldName);
        ArrayList<Double> v2 = buildFrequencyVector(user2, fieldName);

        if (v1 == null || v2 == null) {
            return -1;
        }

        switch (method.toUpperCase()) {
            case "EUCLIDEAN":
                return euclideanDistance(v1, v2);

            case "PEARSON":
                return pearsonDistance(v1, v2);

            case "HAMMING":
                return hammingSimilarity(v1, v2);

            default:
                System.out.println("Invalid method.");
                return -1;
        }
    }

    public double hammingSimilarity(ArrayList<Double> a, ArrayList<Double> b) {
        if (a.size() != b.size()) {
            return 0;
        }

        int matches = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equals(b.get(i))) {
                matches++;
            }
        }

        return (double) matches / a.size();
    }

    @Override
    public HashMap<String, Double> calculateAllSimilarity(String user, String fieldName, String method) {

        HashMap<String, Double> result = new HashMap<>();

        for (String other : getUsers()) {
            if (!other.equalsIgnoreCase(user)) {
                double sim = calculateSimilarity(user, other, fieldName, method);
                if (sim >= 0) {
                    result.put(other, sim);
                }
            }
        }
        return result;
    }

    @Override
    public ArrayList<TrackInfo> makePlaylist(String user, String fieldName, String method, int numberOfTracks) {

        HashMap<String, Double> sims = calculateAllSimilarity(user, fieldName, method);

        ArrayList<String> sorted = new ArrayList<>(sims.keySet());
        sorted.sort((a, b) -> Double.compare(sims.get(b), sims.get(a)));

        ArrayList<TrackInfo> playlist = new ArrayList<>();

        for (String u : sorted) {
            for (TrackInfo t : getUserTrackMap().get(u)) {
                playlist.add(t);
                if (playlist.size() == numberOfTracks) {
                    return playlist;
                }
            }
        }
        return playlist;
    }


    public static void testSimilarity(FinalProgramP4 f) {
        double sim = f.calculateSimilarity("Aria", "Asher", "GENRE", "EUCLIDEAN");
        System.out.println("Similarity = " + sim);
        System.out.println();

        HashMap<String, Double> all = f.calculateAllSimilarity("Chloe", "ARTIST", "PEARSON");
        System.out.println("All Similarity = " + all);
        System.out.println();
    }

    public static void testMakePlaylist(FinalProgramP4 f){
        ArrayList<TrackInfo> play = f.makePlaylist("Ella", "GENRE", "HAMMING", 60);
        System.out.println("PlayList = " + play);
        System.out.println();
    }

    public static void testHamming(FinalProgramP4 f) {
        ArrayList<Double> a = new ArrayList<>();
        ArrayList<Double> b = new ArrayList<>();

        a.add(1.0); a.add(2.0); a.add(3.0);
        b.add(1.0); b.add(9.0); b.add(3.0);

        System.out.println("Hamming similarity = " + f.hammingSimilarity(a, b));
        System.out.println();
    }

    public static void main(String[] args) {
        FinalProgramP4 f = new FinalProgramP4();
        testSimilarity(f);
        testMakePlaylist(f);
        testHamming(f);
    }
}
