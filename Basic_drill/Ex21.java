public class Ex21 {
  public static void main(String[] args) {
    String sweets = "cake,ice cream,french toast,fruits,coffee";
    String[] items = sweets.split(",");
    System.out.println("I like "+items[2]+" and "+items[4]);
  }
}
