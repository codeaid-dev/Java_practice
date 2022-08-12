public class Ex50 {
  public static void main(String[] args) {
    String[] country = {"カザフ","ウズベキ","トルクメニ","タジキ","アフガニ","パキ"};
    for (int i=0; i<country.length; i++) {
      country[i] += "スタン";
    }
    System.out.println(java.util.Arrays.toString(country));
  }
}
