public class AudioBook extends Book {
  private int volume = 0;
  public void type() {
    System.out.println("This book can be listened to");
  }
  public int setVolume(int newVolume) {
    volume = newVolume;
    return volume;
  }
}
