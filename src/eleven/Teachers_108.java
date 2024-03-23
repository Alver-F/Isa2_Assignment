package eleven;
import java.util.Scanner;
public class Teachers_108{
	String type;
	Teachers_108(String type)
	{
		this.type=type;
	}
	public void teaches()
	{
		System.out.println("The teacher is teaching");
	}
}

class teacherTeaches extends Teachers_108{
	String name;
	teacherTeaches(String type,String name) {
		super(type);
		this.name=name;
	}
	public void subjects()
	{
		System.out.println("The teacher is teaching "+type);
	}
}

class Teacher_Main {
	public static void main(String[] args) {
		String type;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the subject:");
		type=scan.next();
		teacherTeaches t1=new teacherTeaches(type,"John");
		t1.subjects();
	}
}
