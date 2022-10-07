package october7task;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			long duration = (long) (Math.random() * 5);

			System.out.println("Running..");
			TimeUnit.SECONDS.sleep(duration);
			System.out.println("Completed");
		}

		catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
