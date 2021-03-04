package com.pratap.abstracdatatypes.hashtable;

public class SimpleHashtable {

	private StoredEmployee[] hashtable;
	
	public SimpleHashtable() {
		hashtable = new StoredEmployee[10];
	}
	
	public void put(String key, Employee employee) {
		int hashedKey = hashKey(key);
		
		/**
		 * Do the liner probing, if particular index is occupied
		 */
		if(occupied(hashedKey)) {
			//check further indexes
			int stopIndex = hashedKey;
			
			// start searching empty place from starting
			if(hashedKey == hashtable.length - 1) {
				hashedKey = 0;
			} else {
				hashedKey++;
			}
			
			while(occupied(hashedKey) && hashedKey != stopIndex) {
				hashedKey = (hashedKey + 1) % hashtable.length;
			}
		}
		
		if(occupied(hashedKey)) {
			System.out.println("Sorry, there's already an employee at position "+hashedKey);
		}
		else {
			hashtable[hashedKey] = new StoredEmployee(key, employee);
		}
	}
	
	/**
	 * complexity O(1)
	 * @param key
	 * @return Employee
	 */
	public Employee get(String key) {
		int hashedKey = findKey(key);
		
		if(hashedKey == -1) {
			return null;
		}
		
		return hashtable[hashedKey].employee;
	}
	
	/**
	 * calculate hashKey based on key passed in to
	 * @param key
	 * @return
	 */
	private int hashKey(String key) {
		return key.length() % hashtable.length;
	}
	
	public boolean occupied(int index) {
		return hashtable[index] != null;
	}
	// return right key
	private int findKey(String key) {
		int hashedKey = hashKey(key);
		
		if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
			
			return hashedKey;
		}
		
		int stopIndex = hashedKey;
		
		// start searching empty place from starting
		if(hashedKey == hashtable.length - 1) {
			
			hashedKey = 0;
			
		} else {
			
			hashedKey++;
		}
		
		while(hashedKey != stopIndex && hashtable[hashedKey] != null && !hashtable[hashedKey].key.equals(key)) {
			hashedKey = (hashedKey + 1) % hashtable.length;
		}
		
		if(stopIndex == hashedKey) {
			return -1;
		}
		else {
			return hashedKey;
		}
	}
	
	public void printHashtable() {
		for(int i = 0; i < hashtable.length; i++) {
			System.out.println(hashtable[i]);
		}
	}
}
