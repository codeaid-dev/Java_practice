public class Ex60 {
  public static void main(String[] args) {
    System.out.print("横幅と縦幅：");
    String s = new java.util.Scanner(System.in).nextLine();
    String[] ss = s.split(",");
    int yoko = Integer.parseInt(ss[0]);
    int tate = Integer.parseInt(ss[1]);
    String[] words = {"o", "x"};
    int order = 1;
    for (int i=0; i<tate; i++) {
        String moji = "";
        order = 1 - order;
        for (int j=0; j<yoko; j++) {
            if (j % 2 == 0)
                moji += words[order];
            else
                moji += words[1 - order];
        }
        System.out.println(moji);
    }
  }
}
