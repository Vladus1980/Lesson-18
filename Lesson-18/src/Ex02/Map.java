package Ex02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Map<K, V> extends MyEntry<K, V> {

	public HashMap<K, V> map;

	public Map(K ob1, V ob2) {
		super(ob1, ob2);
		this.map = new HashMap<K, V>();
		this.map.put(ob1, ob2);
	}
	

	public void addObToMap(K ob1, V ob2) {
		map.put(ob1, ob2);
	}

	public void removeObFromMap(K ob1) {
		map.remove(ob1);
	}

	public void viewMap() {
		Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<K, V> entry = (Entry<K, V>) iterator.next();
			System.out.println("Ключ: " + entry.getKey().toString() + " Значення: " + entry.getValue().toString());
		}
	}

	public void removeObFromValue(V ob2) {
		Iterator<Entry<K, V>> iterator1 = map.entrySet().iterator();
		while (iterator1.hasNext()) {
			Entry<K, V> entry = (Entry<K, V>) iterator1.next();
			if (entry.getValue().equals(ob2)) {
				map.remove(entry.getKey());

			}

		}
	}
	
	public void viewKey() {
		Iterator<Entry<K, V>> iterator2 = map.entrySet().iterator();
		while (iterator2.hasNext()) {
			Entry<K, V> entry = (Entry<K, V>) iterator2.next();
			System.out.println("Ключі: " + entry.getKey().toString());
			
		}
	}
	
	public void viewValue() {
		Iterator<Entry<K, V>> iterator3 = map.entrySet().iterator();
		while (iterator3.hasNext()) {
			Entry<K, V> entry = (Entry<K, V>) iterator3.next();
			System.out.println("Значення: " + entry.getValue().toString());
		}
	}

}
