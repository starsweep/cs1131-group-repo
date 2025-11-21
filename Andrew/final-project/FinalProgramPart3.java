import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author 
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
      // YOUR CODE HERE
   }
   
   /*
    * Develop this method to read in track information from the supplied file.
    */
   void readInput( String filename  ) {
      // YOUR CODE HERE
   }
   
   /*
    * Develop this method to list all artists for the given genre.
    * No duplicate artists should appear in the result list.
    */
   ArrayList< String > listGenreArtists( String genre ) {
      // YOUR CODE HERE
   }
}
