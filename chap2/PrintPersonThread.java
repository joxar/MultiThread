package chap2;

public class PrintPersonThread extends Thread {

	private Person alice;

	public PrintPersonThread(Person alice) {
		this.alice = alice;
	}
	
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName() + ": " + alice.toString());
		}
	}

}
