import java.util.HashMap;
import java.util.Map;

public class HelloMap {
	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();

        	m.put(1, "George Washington");
        	m.put(2, "John Adams");
        	m.put(3, "Thomas Jefferson");
        	m.put(4, "James Madison");
        	m.put(5, "James Monroe");
       		m.put(6, "John Quincy Adams");
        	m.put(7, "Andew Jackson");
        	m.put(8, "Martin Van Buren");
        	m.put(9, "William Henry Harrison");
        	m.put(10, "John Tyler");

        	for (Map.Entry<Integer, String> entry : m.entrySet()) {
            		System.out.println("President #" + entry.getKey() + ": " + entry.getValue());
        	}
    }
}
