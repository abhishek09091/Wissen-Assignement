package wissen;

public class DivisionHeadApproval implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Division Head  Approval Starts");
		for(int i=0; i<100; i++){
			System.out.println("Division Head thinking to approve");
		}
		System.out.println("Division Head Finally Approved the Funds");
	}

}
