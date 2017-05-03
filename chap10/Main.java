package chap10;

/**
 * Two-Phase Termination
 * @author snufkin
 *
 */
public class Main {

	public static void main(String[] args) {
		try {
			CountupThread t = new CountupThread();
			t.start();

			Thread.sleep(1000);
			
			t.shutdownRequest();
			
			t.join();

		} catch (InterruptedException e) {
		}		
	}

}
