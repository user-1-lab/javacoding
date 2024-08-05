package day5constructor;

public class Student {
	//default constructor
	public Student() {
		this.sid=10;
		this.sname ="Mohan";
		this.mark = 100;
		System.out.println("Default constructor is created");
	}
//	parameterized constructor
	public Student(int sid, String sname, int mark) {
		this();// to invoke the previous constructor println 
//		if the line was not given in studentdemo see the comment line if you remove it give two database
		this.sid = sid;
		this.sname = sname;
		this.mark= mark;
	}

	private int sid;
	private String sname;
	private int mark;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", mark=" + mark + "]";
	}
	
	

}
