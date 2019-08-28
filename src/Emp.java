
public class Emp extends Person {

	private String desg;
	
	public Emp(String fname, String lname, String desg){
		super(fname,lname);
		this.desg=desg;
	}
	
	
	public static void main(String args[]){
	
		Emp e=new Emp("AAA","BBB","PM");
		
		
	}
}
