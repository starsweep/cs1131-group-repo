import java.util.List;

/**
 * Test driver for the ObjectPair class.
 */
public class GenericDriver<A,B> {

   /**
    * Create several stadium associations,
    * then print the name of the stadium
    * with the largest capacity.
    *
    * @param args Not used.
    */
   public static void main(String[] args) {

      ObjectMap stadiums = new ObjectMap();
      stadiums.put("Bridgeforth Stadium", 25000);
      stadiums.put("Michigan Stadium", 109901);
      stadiums.put("Lane Stadium", "66,233");

      System.out.println("Bridgeforth Stadium: " +
           stadiums.get( "Bridgeforth Stadium" ));

      String largestStadium = largestStadium( stadiums );
      System.out.println(largestStadium + ": " +
           stadiums.get( largestStadium ));
   }

   /**
    * Returns the name of the stadium with the largest capacity.
    *
    * @param stadiumsMap A map of ObjectTwoples where each Twople
    *                    contains a stadium name followed by an
    *                    integer capacity
    * @return The name of the stadium with the largest capacity
    */
   public String largestStadium( ObjectMap stadiumsMap ) {
	String largest = "";
	A commaless = "";
	B size = 0;
	List list = stadiumsMap.keySet();

	for(int i = 0; i < stadiumsMap.size(); i++){

		commaless = ((stadiumsMap.get(list.get(i))).toString().replaceAll(",", ""));

		if(Integer.parseInt(commaless.toString()) > Integer.parseInt(size.toString())){
			size = stadiumsMap.get(list.get(i));
			largest = list.get(i).toString();
		}
	}

	// YOUR CODE HERE
	return largest;

   }

}
