class std{
	String name ;
	String fname;
	int fee;
	int age;
	String sname;
	
	void input(String n,String f,String s,int a,int F) {
		name =n;
		fname=f;
		age = a;
		fee = F;
		sname =s;
	}
	
	void print() {
		System.out.println(name+" "+fname+" "+sname+" "+fee+" "+age);
	}
}
public class Assignment1 {
	public static void main(String[] args) {
		std a = new std();
		std b = new std();
		std c = new std();
		std d = new std();
		std e = new std();
		
		a.input("Anurag", "Anjani kumar", "BKKG", 22, 3000);
		a.print();
	}
}
