public class Main_2 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        // Добавляем записи (несколько телефонов у Иванова)
        phoneBook.add("Ivanov", "+7-912-345-67-89");
        phoneBook.add("Ivanov", "+7-912-345-67-90");
        phoneBook.add("Ivanov", "+7-912-345-67-91");
        phoneBook.add("Petrova", "+7-913-123-45-67");
        phoneBook.add("Sidorov", "+7-914-987-65-43");

        // Поиск по фамилии
        System.out.println("Телефоны Ivanov: " + phoneBook.get("Ivanov"));
        System.out.println("Телефоны Petrova: " + phoneBook.get("Petrova"));
        System.out.println("Телефоны Sidorov: " + phoneBook.get("Sidorov"));
        System.out.println("Телефоны Kozlov (нет в справочнике): " + phoneBook.get("Kozlov"));
    }
}

