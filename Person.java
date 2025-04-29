import java.util.Scanner;

class Person {
	private String name;
	private int age;
	
	

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

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		Person obj1 = new Person();
		
		System.out.println("enter your name");
		String name = sc.nextLine();
		obj1.setName(name);
		
		System.out.println("enter your age");
		int age = sc.nextInt();
		obj1.setAge(age);
		
		System.out.println("your name is "+name);
		System.out.println("yor age is "+age);
		
		
	}

}
//Task: Complete the setters. Write a main method to accept user input and display details