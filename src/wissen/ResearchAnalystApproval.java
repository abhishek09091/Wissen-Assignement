package wissen;

public class ResearchAnalystApproval implements Runnable {

	@Override
	public void run() {
		System.out.println("Research Analyst Approval Starts");
		for(int i=0; i<1000; i++){
			System.out.println("Reasearch Analyst thinking to approve");
		}
		System.out.println("Research Analyst Finally Approved the Funds");
	}

}
