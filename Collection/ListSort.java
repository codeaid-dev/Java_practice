import java.util.*;

public class ListSort {
  private int age;
  private String name;
  public ListSort(int age, String name) {
    this.age = age;
    this.name = name;
  }
  int getAge() { return this.age; }
  String getName() { return this.name; }
  public static void main(String[] args) {
    List<Integer> nums2 = new ArrayList<>();
    nums2.add(50);
    nums2.add(30);
    nums2.add(10);
    nums2.add(40);
    nums2.add(20);
//    nums2.sort(null);
    nums2.sort(Comparator.naturalOrder());
    System.out.println("リスト: "+nums2);
    nums2.sort(Comparator.reverseOrder());
    System.out.println("リスト: "+nums2);

    List<ListSort> tl = new ArrayList<>();
    tl.add(new ListSort(50, "Tanaka"));
    tl.add(new ListSort(30, "Sato"));
    tl.add(new ListSort(20, "Tanaka"));
    tl.add(new ListSort(20, "Suzuki"));
    tl.add(new ListSort(20, "Abe"));
    tl.add(new ListSort(40, "Yamada"));
    tl.add(new ListSort(40, "Nakamura"));
    tl.sort(new TestComp());
    for (ListSort c : tl) {
      System.out.println(c.getAge()
       + "," + c.getName());
    }
  }
}

class TestComp implements Comparator<ListSort> {
  public int compare(ListSort c1, ListSort c2) {
    if(c1.getAge() < c2.getAge()) {
      return -1;
    } else if(c1.getAge() > c2.getAge()) {
      return 1;
    } else {
      return c1.getName().compareTo(c2.getName());
    }
  }
}