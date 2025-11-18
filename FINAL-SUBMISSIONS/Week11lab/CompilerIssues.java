public class CompilerIssues {

   public static void main(String[] args) {

      GenericTwople<String, Integer> p1;
      GenericTwople<String, Number> p2;
      GenericTwople<Object, Object> p3;
      GenericTwople<?, ?> p4;
      GenericTwople<?, ? extends Number> p5;

      p1 = new GenericTwople<String, Integer>("A", 7);
      int a = p1.getSecond();

      p1 = new GenericTwople<Integer, Double>(23, 12.0);

      p2 = new GenericTwople<String, Integer>("B", 8);

      p3 = new GenericTwople<String, Integer>("C", 9);

      p4 = new GenericTwople<String, String>("House", "Car");
      p4 = new GenericTwople<String, Integer>("D", 10);

      Integer b = p4.getSecond();
      Integer c = (Integer) p4.getSecond();

      p5 = new GenericTwople<String, String>("E", "G");
      p5 = new GenericTwople<String, Double>("E", 11.0);
      p5 = new GenericTwople<String, Integer>("E", 11);

      Integer d = p4.getSecond();
      Integer e = (Integer) p4.getSecond();
   }
}