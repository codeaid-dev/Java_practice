public class CastSample {
  public static void main(String[] args) {
    // アップキャスト(暗黙的)
    SuperClass sc1 = new SubClass();
    
    // ダウンキャストできるかの確認
    if(sc1 instanceof SubClass) {
        // ダウンキャスト(明示的)
        SubClass sb1 = (SubClass)sc1;
        
        // SubClassのメソッド
        sb1.method1();
        sb1.method2();
    } else {
        System.out.println("sc1をダウンキャストできません");
    }
    
    SuperClass sc2 = new SuperClass();
    
    // ダウンキャストできるかの確認
    if(sc2 instanceof SubClass) {
        // ダウンキャスト(明示的)
        SubClass sb2 = (SubClass)sc2;
        
        // SubClassのメソッド
        sb2.method1();
        sb2.method2();
    } else {
        System.out.println("sc2をダウンキャストできません");
    }
  }
}

class SuperClass {
  public void method1() {
      System.out.println("スーパークラスのメソッドを実行");
  }
}

class SubClass extends SuperClass {
  public void method2() {
      System.out.println("サブクラスのメソッドを実行");
  }
}
