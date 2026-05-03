import java.util.*;

    public class PhoneBook {
        private Map<String, List<String>> phoneBook;

        public PhoneBook() {
            phoneBook = new HashMap<>();
        }

        public void add(String surname, String phoneNumber) {
            phoneBook.computeIfAbsent(surname, k -> new ArrayList<>()).add(phoneNumber);
        }

        public List<String> get(String surname) {
            return phoneBook.getOrDefault(surname, new ArrayList<>());
        }

        public void printAll() {
            for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        public boolean removePhone(String surname, String phoneNumber) {
            List<String> phones = phoneBook.get(surname);
            if (phones != null && phones.remove(phoneNumber)) {
                if (phones.isEmpty()) {
                    phoneBook.remove(surname);
                }
                return true;
            }
            return false;
        }

        public boolean removeAllPhones(String surname) {
            return phoneBook.remove(surname) != null;
        }
    }
