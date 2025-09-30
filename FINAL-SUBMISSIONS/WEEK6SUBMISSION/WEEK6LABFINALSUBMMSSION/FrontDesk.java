public class FrontDesk {
  public static void main(String[] args) {
    Book book = new Book();
    book.type();
    book = new NormalBook();
    book.type();
    book = new EBook();
    book.type();
    book = new AudioBook();
    book.type();
    book = new TextFile();
    book.type();
  }
}
