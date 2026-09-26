public class hw1 {
    public static void main(String[] args) {

        MyHashMap<String, Integer> bankValue = new MyHashMap<>();

        bankValue.put("Алексей", 100000);
        bankValue.put("Марат", 150000);
        bankValue.put("Лиза", 120000);

        Integer alexeiValue = bankValue.get("Алексей");
        System.out.println("Счёт Алексея: " + alexeiValue);

        Integer alexeiRemoved = bankValue.remove("Алексей");
        System.out.println("Удалено значение: " + alexeiRemoved);

        System.out.println("Счёт Алексея после удаления: "
                + bankValue.get("Алексей"));
    }
}