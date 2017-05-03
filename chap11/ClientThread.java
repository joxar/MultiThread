package chap11;

public class ClientThread extends Thread {

	public ClientThread(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			Log.println("i = " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
		Log.close();
	}

}