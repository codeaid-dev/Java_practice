public class Ex35 {
  public static void main(String[] args) {
    System.out.print("体重(kg) >>");
    double weight = new java.util.Scanner(System.in).nextDouble();
    System.out.print("身長(cm) >>");
    double tall = new java.util.Scanner(System.in).nextDouble();
    double bmi = weight/((tall/100)*(tall/100));
    double jst = ((tall/100)*(tall/100))*22;
    System.out.printf("体重は%.2fkgで身長が%.2fcmのBMIは%.2fです。\n",weight,tall,bmi);
    System.out.printf("身長が%.2fcmの適正体重は%.2fkgです。\n",tall,jst);
  }
}
