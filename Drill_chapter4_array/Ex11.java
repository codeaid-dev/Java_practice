public class Ex11 {
  public static void main(String[] args) {
    String[] animals = {"cat", "elephant", "dog", "giraffe"};
    String longest = animals[0];

    for (int i = 1; i < animals.length; i++) {
      if (animals[i].length() > longest.length()) {
        longest = animals[i];
      }
    }

    System.out.println("名前が最長の動物は: " + longest);
  }
}
