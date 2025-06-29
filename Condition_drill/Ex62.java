public class Ex62 {
  public static void main(String[] args) {
    String[] place = {"アテネ","パリ","セントルイス","ロンドン","ストックホルム","ベルリン","アントワープ","パリ","アムステルダム","ロサンゼルス","ベルリン","ヘルシンキ","ロンドン","ロンドン","ヘルシンキ","メルボルン","ローマ","東京","メキシコシティ","ミュンヘン","モントリオール","モスクワ","ロサンゼルス","ソウル","バルセロナ","アトランタ","シドニー","アテネ","北京","ロンドン","リオデジャネイロ","東京","パリ"};
    System.out.print("開催年 >>");
    int year = new java.util.Scanner(System.in).nextInt();
//    int year = new java.util.Scanner(System.in, "Shift-JIS").nextInt(); //for Windows
    int times = (year - 1896) / 4;
    if ((year - 1896) % 4 != 0) {
      times += 1;
    }
    for (int i=times; i<place.length; i++) {
      if (i!=5 && i!=11 && i!=12) {
          System.out.println("第"+(i+1)+"回 "+place[i]); 
      } 
    }  
  }
}
