public class StaticInitializer {
    // staticフィールド
    static int number;

    // static初期化ブロック
    static {
        System.out.println("staticブロックが実行されました。");
        number = 100;
    }

    public static void main(String[] args) {
        System.out.println("mainメソッド開始");
        System.out.println("numberの値 = " + number);
    }
}
