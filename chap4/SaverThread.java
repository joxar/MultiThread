package chap4;

import java.io.IOException;

public class SaverThread extends Thread {

	private Data data;

	public SaverThread(Data data, String name) {
		super(name);
		this.data = data;
	}
	
	public void run() {

		while (true) {
			try {
				data.save();
				Thread.sleep(1000);
			} catch (IOException | InterruptedException e) {
			}
		}
		
	}

}
