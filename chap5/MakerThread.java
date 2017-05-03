package chap5;

public class MakerThread extends Thread {

	private Table table;

	public MakerThread(Table table, String name) {
		super(name);
		this.table = table;
	}
	
	public void run() {
		for (int i = 0; i < 1000; i++) {
			String cake = "cake No." + i;
			System.out.println(getName() + " made " + cake + ".");
			table.put(cake);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
			}
		}
	}
}
