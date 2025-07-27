package core_java;

public class oops_01 {
	String name;
	String opt;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOpt() {
		return opt;
	}
	public String setOpt(String opt) {
		return this.opt = opt;
	}
	public oops_01 getAll(String name, String opt) {
		oops_01 o1=new oops_01();
		o1.setName(name);
		o1.setOpt(opt);
		return (o1);
	}
	

	public static void main(String[] args) {
		
	oops_01 o1=new oops_01();
	//Below are EXample of oops
	parent o2=new child();
	parent o3=new parent();
	child o4=new child();
	absClass abs=new child();
	System.out.println("Runtime Polymorphism\t: "+ o2.getAge()); //  check with commend and uncommed child class getAge() method 
	System.out.println("invariance child class uses parent property\t: "+ o4.getAge(56));
	System.out.println("compiletime Polymorphism\t: "+ o3.getAge()+" " +o2.getAge(30));
	System.out.println("Encapsulation \t:"+ o1.getAll("mango","Veg").getName()+ "  " +o1.getAll("mango","Veg").getOpt());
	System.out.println("Abstarction\t :"+abs.absVal());
	abs.check("poomani");
	}


}
 class parent extends absClass
 {
	 public int getAge() {
			return 35;
		}
	 public int getAge(int i) {
			return i;
		}
	 @Override
	 public void check(String name) {
		 System.out.println("Name :"+name);
	 }

 }
class child extends parent{
	public int getAge() {
		return 10;
	}
	
}
abstract class absClass {
    abstract void check(String name); // Abstract method
    public String absVal() {
    	return "Abstract class can have normal metode and abstract methodes";
    }
}
 // ------------------- Completed Now will Update in future--------------------