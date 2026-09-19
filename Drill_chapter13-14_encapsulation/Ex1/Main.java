public class Main {
  public static void main(String[] args) {
    Book book = new Book("Java入門", 3200);
    System.out.println("タイトル：" + book.getTitle());
    System.out.println("価格：" + book.getPrice() + "円");
    book.setTitle("Java入門(応用編)");
    System.out.println("タイトル：" + book.getTitle());
  }
}
