package october7task;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class TestThread {
	public static void main(final String[] args) throws InterruptedException {
		// concurrent many things happening in parallel : T1 T2

		Executor executor = Executors.newCachedThreadPool();// when we want to multiply things at one point
		executor.execute(new Task());// passing the constructor call for thread creation threads with different
										// durations
		// Repeat same task for the pool of the task

		ThreadPoolExecutor pool = (ThreadPoolExecutor) executor;// ThreadPoolExecutor Pool of threads
		// Pool of threads means many threads with = same = 5 minutes
		pool.shutdown();
	}
}
