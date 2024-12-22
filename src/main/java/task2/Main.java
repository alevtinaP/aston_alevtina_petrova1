package task2;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Петрова", "29-7886709");
        phoneDirectory.add("Бутенко", "29-7778899");
        phoneDirectory.add("Сидорова", "29-4454545");
        phoneDirectory.add("Сидорова", "29-4474545");
        phoneDirectory.add("Иванова", "29-4474585");

        System.out.println("Петрова: " + phoneDirectory.get("Петрова"));
        System.out.println("Бутенко: " + phoneDirectory.get("Бутенко"));
        System.out.println("Сидорова: " + phoneDirectory.get("Сидорова"));
        System.out.println("Иванова: " + phoneDirectory.get("Иванова"));
    }
}
