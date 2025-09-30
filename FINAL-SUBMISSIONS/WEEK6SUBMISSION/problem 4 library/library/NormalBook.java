public class NormalBook extends Book {
  private int bookmark = 0;
  public void type() {
    System.out.println("This book can be read");
  }
  public int setBookmark (int pageNumber) {
    this.bookmark = pageNumber;
    System.out.printf("Bookmarked page: %d", bookmark);
    return bookmark;
  }
}
