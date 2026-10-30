public enum MemberRank {
  BRONZE(0),
  SILVER(5),
  GOLD(10),
  PLATINUM(15);

  private final int discountRate;

  private MemberRank(int discountRate) {
    this.discountRate = discountRate;
  }

  public int getDiscountRate() {
    return discountRate;
  }

  public int calculatePrice(int price) {
    return (int) (price * (100 - discountRate) / 100.0);
  }
}
