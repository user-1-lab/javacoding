package day5;
import java.io.*;
public class BufferDemo {
	// to clear the exception error when there is no throws the readline will shows an unexpection handle error so include the throws IOexception
	public static void main (String args[]) throws IOException
	{
		int eid;
		String ename;
		double salary;
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		System.out.println("ENTER YOUR DETAILS : ");
		// type casting using the datatype.parse()
		eid = Integer.parseInt(br.readLine());
		ename = br.readLine();
		salary = Double.parseDouble(br.readLine());
		System.out.println("Employee id : "+ eid);
		System.out.println("Employee name : "+ ename);
		System.out.println("Employee salary : "+ salary);
		
	}

}
