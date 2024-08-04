class Employee{
	String name;
	int sal;
	String cname;
	void show() {
		System.out.println(name+" "+cname+" "+sal);
	}
	void input(String a,String b,int c) {
		name = a;
		cname = b;
		sal = c;
	}
}
public class ClassObjectEx2 {
	public static void main(String[] args) {
		Employee a = new Employee();
		Employee b = new Employee();
		Employee c = new Employee();
		Employee d = new Employee();
		Employee e = a;
		
		a.input("Anurag", "Infosys", 1000000);
		b.input("Anshu", "Infosys", 110000);
		c.input("Ankur", "Infosys", 200000);
		d.input("Rohit", "Infosys", 30000);
		
		a.show();
		b.show();
		c.show();
		d.show();
	}
}
