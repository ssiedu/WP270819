
public class SalaryCalculator {
	
	
	public static void showBonus(Employee emp){
		emp.bonusCalculation();
	}
	
	public static void showSalary(Employee emp){
		
		System.out.println("Computing Salary For  : "+emp.getEno()+","+emp.getEname());
		emp.salaryCalculation();
		System.out.println("_________________________________________________________");
	}
	
	
	
	
	public static void main(String args[]){
		
		PermanentEmployee e1=new PermanentEmployee(); e1.setEno(111); e1.setEname("AAA");
		TemporaryEmployee e2=new TemporaryEmployee(); e2.setEno(112); e2.setEname("BBB");
		
		showSalary(e1);
		showSalary(e2);
		showBonus(e2);
		
	}
}
