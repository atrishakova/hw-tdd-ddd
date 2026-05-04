import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    private final Map<String, String> nameToNumber = new TreeMap<>();
    private final Map<String, String> numberToName = new HashMap<>();

    public int add (String name, String phoneNumber) {
        if (nameToNumber.containsKey(name)) {
            return nameToNumber.size();
        }

        nameToNumber.put(name, phoneNumber);
        numberToName.put(phoneNumber, name);

        return nameToNumber.size();
    }

    public String findByNumber (String phone) {
        return numberToName.get(phone);
    }

    public String findByName(String name) {
        return nameToNumber.get(name);
    }

    public void printAllNames() {}
}
