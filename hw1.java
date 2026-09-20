import java.util.HashMap;
import java.util.Map;

public class hw1 {
    public static void main(String[] args) {
        Map<String, Integer> bankValue = new HashMap<>();


        bankValue.put("Алексей", 100000);
        bankValue.put("Марат", 150000);
        bankValue.put("Лиза", 120000);

        Integer alexeiValue = bankValue.get("Алексей");
        System.out.println("Счёт Алексея: " + alexeiValue);

        Integer alexeiRemoved = bankValue.remove("Алексей");
        System.out.println("Удалено значение: " + alexeiRemoved);

        System.out.println("Карта после удаления: " + bankValue);
    }
}
