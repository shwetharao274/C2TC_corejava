package constructors;

public class Student1 {
	String sname;
	String sadd;
	long phnum;
	int samt;
	Student1(){
		
	}
	public Student1(String name, String address,long phno, int sales_amt) {
		sname=name;
		sadd=address;
		phnum=phno;
		samt=sales_amt;
		System.out.println("object for Student1 is created");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 ob=new Student1();
		Student1 ob2=new Student1("dreamer","bangalore",234672600,4526);
		System.out.println(ob2.sname+"\t\t"+ob2.sadd+"\t"+ob2.phnum+"\t"+ob2.samt);
	}
}
