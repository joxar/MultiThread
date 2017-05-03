package chap10;

public class CountupThread extends Thread {

	private int count = 0;
	private boolean shutdownRequest = false;

	public void shutdownRequest() {
		shutdownRequest = true;
		interrupt();
	}
	
	public void run() {
		try {
			while (!isShutdownRequest()) {
				doWork();
			}
		} catch (InterruptedException e) {
		} finally {
			System.out.println("shutdown");
		}
	}

	private boolean isShutdownRequest() {
		return shutdownRequest ;
	}

	private void doWork() throws InterruptedException {
		count++;
		System.out.println("doWork No." + count);
		Thread.sleep(5000);
	}

}
