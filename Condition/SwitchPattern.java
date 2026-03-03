public class SwitchPattern {
  public static void main(String[] args) {
    String str;
    str = formatterPatternSwitch(100);
    System.out.println(str);
    str = formatterPatternSwitch(100L);
    System.out.println(str);
    str = formatterPatternSwitch(0.5);
    System.out.println(str);
    str = formatterPatternSwitch("0.5");
    System.out.println(str);
    str = formatterPatternSwitch(new StringBuilder("ABC"));
    System.out.println(str);
  }
  static String formatterPatternSwitch(Object o) {
    return switch (o) {
      case Integer i -> String.format("int %d", i);
      case Long l    -> String.format("long %d", l);
      case Double d  -> String.format("double %f", d);
      case String s  -> String.format("String %s", s);
      default        -> o.toString();
    };
  }
}
