package Exercise_var;

public class Ex37 {
  public static void main(String[] args) {
    System.out.print("体重 >>");
    int weight = new java.util.Scanner(System.in).nextInt();
    System.out.print("身長 >>");
    int tall = new java.util.Scanner(System.in).nextInt();
    double bmi = weight/(((double)tall/100)*((double)tall/100));
    double jst = (((double)tall/100)*((double)tall/100))*22;
    System.out.println("体重は"+weight+"kgで身長が"+tall+"cmのBMIは"+bmi+"です。");
    System.out.println("身長が"+tall+"cmの適正体重は"+jst+"kgです。");
  }
}
