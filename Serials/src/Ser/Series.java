package Ser;

import java.io.*;
public class Series implements Serializable {
	int empid;
	String empname;
	String empdept;
	
	public Series(int empid, String empname, String empdept){
        this.empid = empid;
        this.empname = empname;
        this.empdept = empdept;
	}
	

public Series() {
		// TODO Auto-generated constructor stub
	}

//class User{

public static void main(String[] args) {
	Series s1 = new Series ();
    s1.empid = 2000;
    s1.empname = "Madhunika";
    s1.empdept = "Admin";
    
    
//    Read r= new Read();
//    User u=new User();
//    delete d=new delete();
//    u.method();
//    d.sample();
//    r.example();
    

    FileOutputStream fout = null;
	try {
		fout = new FileOutputStream("D:user_serialize.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    ObjectOutputStream out = null;
	try {
		out = new ObjectOutputStream(fout);
	} catch (IOException e) {
		e.printStackTrace();
	}

    try {
		out.writeObject(s1);
	} catch (IOException e) {
		e.printStackTrace();
	}
    
    try {
		out.flush();
	} catch (IOException e) {
		e.printStackTrace();
	}
    
    System.out.println("Success");

	try {
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:user_serialize.txt"));
		Series s =(Series)in.readObject();
		System.out.println(s.empid+ " "+s.empname+" "+s.empdept);
		in.close();	
	}catch(Exception e) {System.out.println(e);}
}
   
   }














