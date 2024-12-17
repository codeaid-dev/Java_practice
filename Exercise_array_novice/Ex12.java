public class Ex12 {
  public static void main(String[] args) {
    String[] arrayA = {"秋田県","山形県","山口県","宮崎県","高知県"};
    String[] arrayB = {"山口県","高知県","長崎県","北海道","石川県"};
    String result = "";
    for (int i = 0; i < arrayA.length; i++) {
      boolean exist = false;
      for (String s : arrayB) {
        if (s.equals(arrayA[i])) {
          exist = true;
          break;
        }
      }
      if (exist) {
        result += "(" + arrayA[i] + ")";
      }
    }

    System.out.println("2人とも行ったことのある場所：" + result);
  }
}
