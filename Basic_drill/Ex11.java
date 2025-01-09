public class Ex11 {
  public static void main(String[] args) {
    int count = 0;
    //int total = count++;
    int total = ++count;
    System.out.println("ひつじが"+count+"匹");
    //total = count++;
    total = ++count;
    System.out.println("ひつじが"+count+"匹");
    //total = count++;
    total = ++count;
    System.out.println("ひつじが"+count+"匹");
    System.out.println("全部で"+total+"匹");
  }
}
