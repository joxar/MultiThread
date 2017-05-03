package chap5;

public class EaterThread extends Thread {

	private Table table;

	public EaterThread(Table table, String name) {
		super(name);
		this.table = table;
	}
	
	public void run() {
		while (true) {
			String cake = table.take();
			System.out.println("          " + getName() + " eats " + cake + ".");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}

}
