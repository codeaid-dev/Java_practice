public class SwitchFormula {
  public static void main(String[] args) {
    int day = 1;
    String typeOfDay = switch (day) {
      case 1, 2, 3, 4, 5 -> "Working Day";
      case 6, 7 -> "Weekend";
      default -> "Invalid day";
    };
    System.out.println(typeOfDay);
  }
}