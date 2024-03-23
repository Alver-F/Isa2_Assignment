package eight;

public class Employee_108 {
	int hra,basic_salary;
	String name,job_title;
	double total_salary,da;
	Employee_108(String name,String job_title,int basic_salary)
	{
		this.name=name;
		this.job_title=job_title;
		this.basic_salary=basic_salary;
	}
	
	int calculate_da()
	{
		int da=(basic_salary*10)/100;
		return da;
	}
	
	public void calculate()
	{
		hra=5000;
		da=calculate_da();
		total_salary=basic_salary+hra+da;
	}
	public void display()
	{
		System.out.println("Name:"+name+" Job title:"+job_title+"Total Salary:"+total_salary);
	}
}

class employee_main {
	public static void main(String[] args) {
		Employee_108 e1=new Employee_108("Alver","Manager",10000);
		e1.calculate();
		e1.display();
	}
}