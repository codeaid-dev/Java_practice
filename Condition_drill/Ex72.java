public class Ex72 {
  public static void main(String[] args) {
    System.out.print("母親の遺伝子型 >>");
    String mom = new java.util.Scanner(System.in).nextLine().toUpperCase();
    String[] moms = mom.split("");
    System.out.print("父親の遺伝子型 >>");
    String dad = new java.util.Scanner(System.in).nextLine().toUpperCase();
    String[] dads = dad.split("");
    String[] child = new String[4];
    int i=0;
    for (String m : moms) {
        for (String d : dads) {
            child[i]=m+d;
            i++;
        }
    }
    String[] blood = new String[4];
    i=0;
    for (String ch : child) {
      if (ch.equals("AA") || ch.equals("AO") || ch.equals("OA")) {
        if (!java.util.Arrays.asList(blood).contains("A型")) {
          blood[i] = "A型";
          i++;
        }
      } else if (ch.equals("BB") || ch.equals("BO") || ch.equals("OB")) {
        if (!java.util.Arrays.asList(blood).contains("B型")) {
          blood[i] = "B型";
          i++;
        }
      } else if (ch.equals("OO")) {
        if (!java.util.Arrays.asList(blood).contains("O型")) {
          blood[i] = "O型";
          i++;
        }
      } else {
        if (!java.util.Arrays.asList(blood).contains("AB型")) {
          blood[i] = "AB型";
          i++;
        }
      }
    }
    for (int j=0; j<blood.length; j++) {
      if (blood[j] == null) blood[j] = "";
    }
    String result = String.join("",blood);
    System.out.println("子の血液型は"+result+"の可能性があります");    
  }
}
