package wissen;

public class FundManagerApproval implements Runnable {

	@Override
	public void run() {
		System.out.println("FundManager Approval Starts");
		for(int i=0; i<1000; i++){
			System.out.println("Fund Manager thinking to approve");
		}
		System.out.println("Fund Manager Finally Approved the Funds");
	}

}
