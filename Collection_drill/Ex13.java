import java.util.HashMap;
import java.util.Map;

public class Ex13 {
  public static void main(String[] args) {
    Map<String,Map<String,String>> info = new HashMap<>();
    Map<String,String> meal = new HashMap<>();
    meal.put("朝食","食パンとコーヒー");
    meal.put("昼食","ハンバーガー");
    meal.put("夕食","ステーキ");
    info.put("山田",meal);
    meal = new HashMap<>();
    meal.put("朝食","ごはんと味噌汁");
    meal.put("昼食","焼き魚定食");
    meal.put("夕食","おでん");
    info.put("高橋",meal);
    meal = new HashMap<>();
    meal.put("朝食","シリアル");
    meal.put("昼食","パスタ");
    meal.put("夕食","アクアパッツァ");
    info.put("佐藤",meal);
    System.out.print("名前は？");
    String name = new java.util.Scanner(System.in).nextLine();
//    String name = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    System.out.print("どの食事？");
    String eat = new java.util.Scanner(System.in).nextLine();
//    String eat = new java.util.Scanner(System.in, "Shift-JIS").nextLine(); //for Windows
    System.out.println(name+"さんの"+eat+"は"+info.get(name).get(eat)+"です");
  }
}
