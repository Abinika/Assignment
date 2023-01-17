package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {
	private long name;
	  private String age;
	  private int gender;
	  public Person(String string, int i, String string2) {
		// TODO Auto-generated constructor stub
	}

	public long getName() {
			return name;
		}

		public void setName(long name) {
			this.name = name;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}

		public int getGender() {
			return gender;
		}

		public void setGender(int gender) {
			this.gender = gender;
		}
	 public static void main(String[] args) {
	        // TODO Auto-generated method stub

	        //Person class (name, age , gender)
	        //Employee class (name, gender)
	        Map<String, List<Person>> mapPerson = new HashMap<String, List<Person>>();
	        Map<String, List<Employee>> employeeMap = new HashMap<>();

	        List<Person> personList1 = new ArrayList<Person>();
	        personList1.add(new Person("Adam", 22, "Male"));
	        personList1.add(new Person("Alon", 21, "Female"));

	        List<Person> personList2 = new ArrayList<Person>();
	        personList2.add(new Person("Chad", 23, "Male"));
	        personList2.add(new Person("Daina", 21, "Female"));

	        List<Person> personList3 = new ArrayList<Person>();
	        personList3.add(new Person("Mark", 22, "Female"));
	        personList3.add(new Person("Helen", 25, "Male"));

	        mapPerson.put("A", personList1);
	        mapPerson.put("B", personList2);
	        mapPerson.put("C", personList3);

	        for (Map.Entry<String, List<Person>> entry : mapPerson.entrySet()) {
	            String key = entry.getKey();
	            List<Person> values = entry.getValue();
	            System.out.println("Key = " + key);
	            System.out.println("Values = " + values + "n");
	        }
	        System.out.println("******************************************");
	        employeeMap = getEmployeeMap(mapPerson);

	        for(Map.Entry<String, List<Employee>> listMap : employeeMap.entrySet())
	        {
	            System.out.println("Key : " + listMap.getKey());
	            System.out.println("Values : " + listMap.getValue());
	            System.out.println("===============");
	        }
	    }

	private static Map<String, List<Employee>> getEmployeeMap(Map<String, List<Person>> mapPerson) {
		return null;
	}

	
}
