import java.util.*;
public class Fourth {
    public static void main(String args[]) {
        Employees e1 = new Employees(22, "Ram", "trainee");
        Employees e2 = new Employees(30, "Shayam", "manager");
        Employees e3 = new Employees(25, "Rohit", "director");
        Employees e4 = new Employees(31, "Deep", "CEO");

        Map<Employees, Integer> map = new LinkedHashMap<>();

        map.put(e1, 15000);
        map.put(e2, 20000);
        map.put(e3, 30000);
        map.put(e4, 1855232);
        for (Employees key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }
}
