public class Ex7 {
  public static void main(String[] args) {
    String[] names = {"Ken", "Naoko", "Masaki", "Tom", "Kazue"};

    for (String name : names) {
      if (name.length() >= 5) {
          System.out.println(name);
      }
    }
  }
}
