public class Mobile {
	
	SIM sim;
	
	public void setSIM(SIM sim){
		this.sim=sim;
	}
	
	public void doCall(){
		if(sim!=null){
			sim.calling();
		}else{
			System.out.println("Please Insert SIM");
		}
	}
	public void doMessage(){
		if(sim!=null){
			sim.messaging();
		}else{
			System.out.println("Please Insert SIM");
		}
	}
	
	public static void main(String args[]){
		Mobile mobile=new Mobile();
		//mobile.setSIM(new AirtelSIM());
		mobile.setSIM(new IdeaSIM());
		mobile.doCall();
		mobile.doMessage();
	}
}
