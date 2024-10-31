import java.util.HashMap;

public class Ex12 {
  public static void main(String[] args) {
    HashMap<String,HashMap<String,String>> emp = new HashMap<>();
    HashMap<String,String> person1 = new HashMap<>();
    person1.put("name","Yamada");
    person1.put("salary","200000");
    emp.put("emp1",person1);
    HashMap<String,String> person2 = new HashMap<>();
    person2.put("name","Tanaka");
    person2.put("salary","100000");
    emp.put("emp2",person2);
    HashMap<String,String> person3 = new HashMap<>();
    person3.put("name","Sato");
    person3.put("saraly","120000");
    emp.put("emp3",person3);
    System.out.println(emp.toString());
    emp.get("emp2").put("salary","150000");
    System.out.println(emp.toString());
  }
}
