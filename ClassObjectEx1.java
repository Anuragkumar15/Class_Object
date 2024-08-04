
public class ClassObjectEx1 {
	public static void main(String[] args) {
		emp a = new emp();
		emp b = new emp();
		emp c = new emp();
		emp d = new emp();
		
		emp e = a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		System.out.println(a.name+" "+a.cname+" "+a.sal);
		System.out.println(b.name+" "+b.cname+" "+b.sal);
		System.out.println(c.name+" "+c.cname+" "+c.sal);
		System.out.println(d.name+" "+d.cname+" "+d.sal);
		
		a.name  = "Anurag kumar";
		a.cname = "Infosys";
		a.sal = 100000;
		
		b.name  = "Ankur kumar";
		b.cname = "Infosys";
		b.sal = 100000;
		
		c.name  = "Anshu kumar";
		c.cname = "Infosys";
		c.sal = 100000;
		
		d.name  = "Rohit kumar";
		d.cname = "Infosys";
		d.sal = 100000;
		
		System.out.println(a.name+" "+a.cname+" "+a.sal);
		System.out.println(b.name+" "+b.cname+" "+b.sal);
		System.out.println(c.name+" "+c.cname+" "+c.sal);
		System.out.println(d.name+" "+d.cname+" "+d.sal);
	}
}
class emp{
	String name;
	int sal;
	String cname;
}