public class Ex18 {
  public static void main(String[] args) {
    System.out.print("体重(kg) >>");
    double weight = new java.util.Scanner(System.in).nextDouble();
    System.out.print("身長(cm) >>");
    double tall = new java.util.Scanner(System.in).nextDouble();
    double bmi = weight/((tall/100)*(tall/100));
    double jst = ((tall/100)*(tall/100))*22;
    System.out.println("体重は"+weight+"kgで身長が"+tall+"cmのBMIは"+(double)((int)(bmi*100))/100+"です。");
    System.out.println("身長が"+tall+"cmの適正体重は"+(double)((int)(jst*100))/100+"kgです。");
  }
}
