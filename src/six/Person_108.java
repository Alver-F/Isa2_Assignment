package six;

public class Person_108 {
	String name;
	int age;
	Person_108(String name,int age)
	{
		this.age=age;
		this.name=name;
	}
	void set_name(String name){
		this.name=name;
	}
	void set_age(int age){
		this.age=age;
	}
	String display_name(){
		return name;
	}
	int display_age(){
		return age;
	}
	public void display_values(){
		System.out.println("Name:"+name+" Age:"+age);
	}
	
}
class person_main {
	public static void main(String[] args) {
		Person_108 p1=new Person_108("Alver",19);
		Person_108 p2=new Person_108("Sita",15);
		p1.display_values();
		p2.display_values();
	}
}
