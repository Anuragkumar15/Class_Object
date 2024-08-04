class student{
	private String name ;
	private String fname;
	private int fee;
	private int age;
	private String sname;
	
	void input(String n,String f,String s,int a,int F) {
		name =n;
		fname =f;
		age = a;
		fee = F;
		sname =s;
	}
	
	void print() {
		System.out.println(name+" "+fname+" "+sname+" "+fee+" "+age);
	}
}
public class Assignment2 {
	public static void main(String[] args) {
		student a = new student();
		student b = new student();
		student c = new student();
		student d = new student();
		
		a.input("Anurag", "Anjani", "BKKG", 22, 3000);
		a.print();
		}
}
