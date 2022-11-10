package q16;


	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map;

	public class hm {

	    public static void main(String[] args) {
	        Map<String, Long> phoneBook = new HashMap<String, Long>();
	        phoneBook.put("Vikram",8149101254L);
	        phoneBook.put("Mike",9020341211L);
	        phoneBook.put("Jim",7788111284L);

	        Iterator<String> keyIterator = phoneBook.keySet().iterator();

	        while (keyIterator.hasNext()){
	            String key = keyIterator.next();
	            if ("Vikram".equals(key)){
	                phoneBook.put("John",9220341211L);
	            }
	        }
	    }
	}


