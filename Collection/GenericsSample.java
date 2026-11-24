public class GenericsSample {
  public static void main(String[] args) {
    Box<String> bs = new Box<>();
    Box<Integer> bi = new Box<>();
    bs.put("Hello!");
    bi.put(100);
    System.out.println(bs.get());
    System.out.println(bi.get());
  }
}

class Box<E> {
  private E data;
  public void put(E d) {
    this.data = d;
  }
  public E get() {
    return this.data;
  }
}
