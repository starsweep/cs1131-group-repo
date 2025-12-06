import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author Samuel Mitchell
 *
 */
public class FinalProgramPart3 {
   /*
    * userTrackMap: An instance level variable that contains a HashMap.
    * The HashMap is used to associate a list of TrackInfo with a user.
    */
   private HashMap< String, ArrayList< TrackInfo > > userTrackMap;
   public HashMap< String, ArrayList< TrackInfo > > getUserTrackMap( ) {
      return userTrackMap;
   }
   public void setUserTrackMap( HashMap< String, ArrayList< TrackInfo > > value ) {
      userTrackMap = value;
   }

   /*
    * Develop this method to add track information to the supplied HashMap.
    */
   void addTrack( HashMap< String, ArrayList< TrackInfo > > map, String user, int rank, String title, String artist, String album, String genre, int plays ) {

      TrackInfo trackInfo = new TrackInfo(user,title,artist,album,genre,rank,plays);
      // checks if the user input and if its in there adds the track
      if(map.containsKey(user)){
         map.get(user).add(trackInfo);
      }
      else{
         // adds the track info and user to an array and puts it in a hashmap
         ArrayList<TrackInfo> arrayList = new ArrayList<TrackInfo>();
         arrayList.add(trackInfo);
         map.put(user,arrayList);
      }
   }
   
   /*
    * Develop this method to read in track information from the supplied file.
    */
   void readInput( String filename  ) {
      File file = new File(filename);
      try (Scanner scan = new Scanner(file)){
         while(scan.hasNextLine()){
            String inFo = scan.nextLine();
            String[] splitInfo = inFo.split(",");
            addTrack(getUserTrackMap(), splitInfo[1],Integer.parseInt(splitInfo[2]),splitInfo[3],splitInfo[4],splitInfo[6],splitInfo[5],Integer.parseInt(splitInfo[7]));

         }
      } catch (FileNotFoundException e){
         System.out.printf("File Not Found @ %s%n",filename);
        }
   }
   
   /*
    * Develop this method to list all artists for the given genre.
    * No duplicate artists should appear in the result list.
    */
   ArrayList< String > listGenreArtists( String genre ) {
      ArrayList<String> artists = new ArrayList<String>();
      for(ArrayList<TrackInfo> trackList : userTrackMap.values()){
         for(TrackInfo trackFo : trackList){
            if(trackFo.getGenre().equalsIgnoreCase(genre)){
               String artist = trackFo.getArtist();
               if(!artist.contains(artist)){
                  artists.add(artist);
               }
            }
         }
      }
      return artists;
   }
}
