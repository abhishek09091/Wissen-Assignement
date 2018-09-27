package wissen;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
 
public class TraderRequest {
 
	public static void main(String[] args) {
 
		//This is done by using the classical thread usage but everything is maintained by the user
 
		/*try {
			Thread t1 = new Thread(new ResearchAnalystApproval());
			Thread t2 = new Thread(new FundManagerApproval());
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			Thread t3 = new Thread(new DivisionHeadApproval());
			t3.start();
			t3.join();
			Thread t4 = new Thread(new OperationsApproval());
			t4.start();
		} catch (Exception e) {
			System.out.println("Exception while approving the requests: "+e.getMessage());
		}*/
 
 
 
		//We can use the Executor class also to manage our thread for the parallel processing
		try {
 
			// We have two process(i.e. Fund Manager and Research Analyst Approval because they are two independent process) to run them parallel
			ExecutorService executor = Executors.newFixedThreadPool(2);
			List<Callable<Object>> calls = new ArrayList<Callable<Object>>();
			calls.add(Executors.callable(new ResearchAnalystApproval()));
			calls.add(Executors.callable(new FundManagerApproval()));
			List<Future<Object>> futures = executor.invokeAll(calls);
			executor.shutdown();
			calls.clear();
			//After the FundManager and Research Analyst Approval get completed.
 
 
			//After the FundManager Approval and Research Analyst Approval done we will DivisionsHeadApproval and OperationsApproval done sequentially. 
			 executor = Executors.newSingleThreadExecutor();
			 executor.submit(Executors.callable(new DivisionHeadApproval()));
			 executor.submit(Executors.callable(new OperationsApproval()));
			 executor.shutdown();
 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
 
	}
 
}
 
