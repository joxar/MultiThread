package chap4;

import java.io.IOException;
import java.util.Random;

public class ChangerThread extends Thread {

	private Data data;
	private Random random;

	public ChangerThread(Data data, String name) {
		super(name);
		this.data = data;
		random = new Random();
	}

	public void run() {
		for (int i = 0; i < 10000; i++) {
			data.change("No." + i);
			try {
				Thread.sleep(random.nextInt(1000));
				data.save();
			} catch (IOException | InterruptedException e) {
			}

		}
	}
	
}
