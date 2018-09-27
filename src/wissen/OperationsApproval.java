package wissen;

public class OperationsApproval implements Runnable {

	@Override
	public void run() {
		System.out.println("Operations Approval Starts");
		for(int i=0; i<100; i++){
			System.out.println("Operations thinking to approve");
		}
		System.out.println("Operations Finally Approved the Funds");
	}

}
