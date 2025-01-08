class Book {
  private String title;
  private int price;

  public Book(String title, int price) {
    this.title = title;
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getPrice() {
    return price;
  }
}

public class Ex1 {
  public static void main(String[] args) {
    Book book = new Book("Java入門", 3200);
    System.out.println("タイトル：" + book.getTitle());
    System.out.println("価格：" + book.getPrice() + "円");
    book.setTitle("Java入門(応用編)");
    System.out.println("タイトル：" + book.getTitle());
  }
}