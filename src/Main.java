
import java.util.HashMap;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John", 12345);
        empIds.put("Carl", 54321);
        empIds.put("Jerry", 9864);
        empIds.put("Edwin", 86942);

        System.out.println(empIds);
        System.out.println(empIds.get("Carl"));
        System.out.println(empIds.containsKey("Carl"));

    }
}