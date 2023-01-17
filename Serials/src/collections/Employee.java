package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	 private long empId;
	  private String name;
	  private int age;
	  private String designation;
	  
	  public Employee(long empId, String name, int age, String designation) {
	    super();
	    this.empId = empId;
	    this.name = name;
	    this.age = age;
	    this.designation = designation;
	  }
	  public long getEmpId() {
	    return empId;
	  }
	  public void setEmpId(long empId) {
	    this.empId = empId;
	  }
	  public String getName() {
	    return name;
	  }
	  public void setName(String name) {
	    this.name = name;
	  }
	  public int getAge() {
	    return age;
	  }
	  public void setAge(int age) {
	    this.age = age;
	  }
	  public String getDesignation() {
	    return designation;
	  }
	  public void setDesignation(String designation) {
	    this.designation = designation;
	  }
	  public static void main(String[] args){       
		  List<Employee> empList = new ArrayList<Employee>();
		  empList.add(new Employee(1,"Avinash",34,"Manager"));
		  empList.add(new Employee(2,"Madhu",22,"GeneralManager"));
		  empList.add(new Employee(3,"Abi",26,"Admin"));
		  empList.add(new Employee(4,"Rakesh",34,"Developer"));
		  empList.add(new Employee(5,"Bindhu",40,"QA"));
		  empList.add(new Employee(6,"Dinesh",45,"Assistant"));
		      
		  List<Employee> tempList = empList.stream()
		              .filter (user -> user.getAge()>20)
		              .filter(user -> user.getAge()<30)
		              .collect(Collectors.toList());
		  
		  tempList.forEach(e -> System.out.println( "Age : " + e.getAge()));       
		}
	  
}  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	

