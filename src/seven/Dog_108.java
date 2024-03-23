package seven;

public class Dog_108 {
	String name,breed;
	Dog_108(String name, String breed)
	{
		this.name=name;
		this.breed=breed;
	}
	String display_name()
	{
		return name;
	}
	String display_breed()
	{
		return breed;
	}
	public void setvalues(String name,String breed)
	{
		this.name=name;
		this.breed=breed;
	}
	public void display()
	{
		System.out.println("Name:"+name+" Breed:"+breed);
	}
}

class Dog_main {
	public static void main(String[] args) {
		Dog_108 d1=new Dog_108("Tyson","German Shepherd");
		Dog_108 d2=new Dog_108("Pepsi","Labrador Retriever");
		d1.display();
		d2.display();
		d1.setvalues("Bingo","BullDog");
		d1.display();
	}
}