package constructors;

public class Student {
	Student()
	{
		System.out.println("Default constructor");
	}
	Student(int i, int j)
	{
		System.out.println("its a 2 parameters constructor");
	}
	Student(int i, String name){
		System.out.println("Constructor with an int and string");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		Student obj2=new Student(34,87);
		Student obj3=new Student(21,"dreamer");
	}

}
