import java.util.HashMap;
import java.util.Map;

public class Ex12 {
  public static void main(String[] args) {
    Map<String,Map<String,String>> emp = new HashMap<>();
    Map<String,String> person1 = new HashMap<>();
    person1.put("name","Yamada");
    person1.put("salary","200000");
    emp.put("emp1",person1);
    Map<String,String> person2 = new HashMap<>();
    person2.put("name","Tanaka");
    person2.put("salary","100000");
    emp.put("emp2",person2);
    Map<String,String> person3 = new HashMap<>();
    person3.put("name","Sato");
    person3.put("saraly","120000");
    emp.put("emp3",person3);
    System.out.println(emp.toString());
    emp.get("emp2").put("salary","150000");
    System.out.println(emp.toString());
  }
}
