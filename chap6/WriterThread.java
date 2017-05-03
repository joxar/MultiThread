package chap6;

public class WriterThread extends Thread {

	private Data data;

	public WriterThread(Data data, String name) {
		super(name);
		this.data = data;
	}
	
	public void run() {
		try {
			for (int i = 0; i < 10000; i++) {
				String content = String.valueOf(i);
				data.write(content);
				System.out.println(Thread.currentThread().getName() + " writes " + content);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
		}
	}

}
