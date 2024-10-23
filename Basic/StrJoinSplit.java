public class StrJoinSplit {
  public static void main(String[] args) {
    String[] strs = {"I", "love", "Java"};
    System.out.println(String.join("-", "I", "love", "Java"));
    System.out.println(String.join(" ", strs));
    String str = "hoge:foo:bar";
    String[] data1 = str.split(":");
    String[] data2 = str.split(":", 2);
    System.out.println(java.util.Arrays.toString(data1));
    System.out.println(java.util.Arrays.toString(data2));
  }
}
