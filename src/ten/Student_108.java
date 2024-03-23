package ten;


public class Student_108 {
	String name,address;
	int age;
	Student_108(){
		age=0;
		name="Unknown";
		address="Not Available";
	}
	public void setInfo(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void setInfo(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public void display()
	{
		System.out.println("Name:"+name+" Age:"+age+" Address:"+address);
	}
}

class Student_Main {
	public static void main(String[] args) {
	Student_108[] arr = new Student_108[2];
	arr[0]=new Student_108();
	arr[1]=new Student_108();
	arr[0].setInfo("Alver",19);
	arr[1].setInfo("Shane", 19,"Margao");
	arr[0].display();
	arr[1].display();
}
}
