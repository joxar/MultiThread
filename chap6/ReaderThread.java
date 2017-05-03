package chap6;

public class ReaderThread extends Thread {

	private Data data;

	public ReaderThread(Data data, String name) {
		super(name);
		this.data = data;		
	}
	
	public void run() {
		while (true) {
			String readStr = "";
			try {				
				readStr = data.read();
				System.out.println(Thread.currentThread().getName() + " reads " + readStr);
				Thread.sleep(500);
			} catch (InterruptedException e) {				
			}			
		}
	}

}
