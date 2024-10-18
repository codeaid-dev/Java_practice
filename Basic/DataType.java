public class DataType {
  public static void main(String[] args) {
    boolean bool = true;
    System.out.println(bool);
    char ch1 = 'A', ch2 = '\u3042';
    System.out.println(ch1);
    System.out.println(ch2);
    byte by = 127;
    System.out.println(by);
//    short sh = 32767;
    short sh = 0x7fff;
//    short sh = 0b0111111111111111;
    System.out.println(sh);
    int i = 2147483647;
    System.out.println(i);
    long l = 214748364789L;
    System.out.println(l);
    float f = 3.14f;
    System.out.println(f);
    double d = 3.14159265359;
    System.out.println(d);
  }
}
