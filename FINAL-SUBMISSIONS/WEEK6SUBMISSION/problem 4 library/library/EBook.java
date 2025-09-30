public class EBook extends Book {
  private int brightness;
  public void type() {
    System.out.println("This book can be read on a screen");
  }
  public int setBrightness(int newBrightness) {
    brightness = newBrightness;
    return brightness;
  }
}
