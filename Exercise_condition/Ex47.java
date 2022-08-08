public class Ex47 {
  public static void main(String[] args) {
    int[] listOne = {3,6,6,12,15,18,21};
    int[] listTwo = {4,8,12,16,20,24,28};
    int[] listThree = new int[7];
    for (int i=0; i<listOne.length; i++) {
      if (i%2==1) {
        listThree[i] = listOne[i];
      } else {
        listThree[i] = listTwo[i];
      }
    }
    System.out.println(java.util.Arrays.toString(listThree));
  }
}
