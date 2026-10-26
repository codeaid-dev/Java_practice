public enum Season {
  // 1. 定数に初期値を渡す（コンストラクタが呼び出される）
  SPRING("春", 15), 
  SUMMER("夏", 30), 
  AUTUMN("秋", 18), 
  WINTER("冬", 5);

  // 2. フィールド変数
  private final String japaneseName;
  private final int averageTemperature;

  // 3. コンストラクタ（アクセス修飾子は常にprivate）
  private Season(String japaneseName, int averageTemperature) {
    this.japaneseName = japaneseName;
    this.averageTemperature = averageTemperature;
  }
  // 4. ゲッターメソッド
  public String getJapaneseName() {
    return this.japaneseName;
  }

  public int getAverageTemperature() {
    return this.averageTemperature;
  }
}
