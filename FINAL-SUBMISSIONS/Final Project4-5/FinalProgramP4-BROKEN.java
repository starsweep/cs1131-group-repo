import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author Samuel Mitchell, Andrew Martin
 *
 */
public class FinalProgramP4 extends AbstractClass {
   /*
    * userTrackMap: An instance level variable that contains a HashMap.
    * The HashMap is used to associate a list of TrackInfo with a user.
    */

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

   // from the abstract class and is going to be overidded
   @Override
   public ArrayList< TrackInfo > makePlaylist( String user, String fieldName, String method, int numberOfTracks ){
      return null;
   }

   @Override
   public double calculateSimilarity( String user1, String user2, String fieldName, String method ){
      
      Double similar = 0.0;

      //Find User
      if(!(getUsers().contains(user1.toUpperCase()))){
         System.out.println("User1 not found!");
         return -1; 
      } 

      if(!(getUsers().contains(user2.toUpperCase()))){
         System.out.println("User2 not found!");
         return -1;
      }


      //Find FieldName
      if(fieldName.toUpperCase().equals("TITLE")){

      }
      else if(fieldName.toUpperCase().equals("ARTIST")){

      }
      else if(fieldName.toUpperCase().equals("GENRE")){

      }
      else{
         System.out.println("Invaild field!");
         return -1;
      }


      //Find Method
      if(method.toUpperCase().equals("EUCLIDEAN")){

      }
      else if(method.toUpperCase().equals("PEARSON")){

      }
      else if(method.toUpperCase().equals("HAMMING DISTANCE")){

      }
      else{
         System.out.println("Invaild Method!");
         return -1;
      }


      return similar;
   }   

   @Override
   public HashMap< String, Double > calculateAllSimilarity( String user, String fieldName, String method  ){


      return null;
   }

// taken from the link given to us 
    public static double hammingDistance( ArrayList< Double > array1, ArrayList< Double > array2 ) {

        if (array1.size() != array2.size()) {

            throw new IllegalArgumentException("Strings must be of equal length.");
        }
        int distCounter = 0;

        for (int n = 0; n < array1.size(); n++) {

           double temp1 = array1.get(n);

           double temp2 = array2.get(n);

            if (temp1 != temp2) {

                distCounter++;
            }
       
      }
       double finaldistCounter = 1.0 /distCounter;
        return finaldistCounter;
   }


   public static void main(String[] args){
      
     FinalProgramP4 fin = new FinalProgramP4();

     testHammingDistance(fin);
     testCalculateSimilarity(fin);
     
   }

   public static void testHammingDistance(FinalProgramP4 fin){
      

      


         ArrayList<Double> array1 = new ArrayList<>();
         ArrayList<Double> array2 = new ArrayList<>();

         array1.add(2.0);
         array1.add(3.0);
         array1.add(1.0);
         array1.add(0.0);
         array1.add(2.0);

         array2.add(2.0);
         array2.add(4.0);
         array2.add(7.0);
         array2.add(0.0);
         array2.add(1.0);

         System.out.println(fin.hammingDistance(array1, array2));

   }

   public static void testCalculateSimilarity(FinalProgramP4 fin){
         fin.calculateSimilarity("Aria", "Asher", "genre", "EUCLIDEAN");
   }

   public static void testCalculateAllSimilarity(FinalProgramP4 fin){

   }

   public static void testMakePlaylist(FinalProgramP4 fin){

   }

}
