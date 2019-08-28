
public class Person {
	
	private String fname;
	private String lname;
	
	public Person(){}
	
	public Person(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	public void info(){
		System.out.println(fname+","+lname);
	}
	
	
}
