public class AnnotationSample extends AnnoParent {
  //@Override
  //public void hoge() {
  //  System.out.println("子がオーバーライドしてます。");
  //}
  @SuppressWarnings("deprecation")
  public static void main(String[] args) {
    AnnotationSample an = new AnnotationSample();
    an.hoge();
  }
}
