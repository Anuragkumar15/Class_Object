class Employeee{
	private String name;
	private int sal;
	private String cname;
	void show() {
		System.out.println(name+" "+cname+" "+sal);
	}
	void input(String a,String b,int c) {
		name = a;
		cname = b;
		sal = c;
	}
}
public class ClassObjectEx3 {
	public static void main(String[] args) {
		Employeee a = new Employeee();
		Employeee b = new Employeee();
		Employeee c = new Employeee();
		Employeee d = new Employeee();
		
		
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
