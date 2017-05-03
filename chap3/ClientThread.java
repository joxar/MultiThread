package chap3;

import java.util.Random;

public class ClientThread extends Thread {

	private RequestQueue requestQueue;
	private Random random = null;

	public ClientThread(RequestQueue requestQueue, String name, long seed) {
		super(name);
		this.requestQueue = requestQueue;
		this.random = new Random(seed);
	}
	
	public void run() {
		for (int i = 0; i < 10000; i++) {
			Request request = new Request("No." + i);
			requestQueue.putRequest(request);
			System.out.println(Thread.currentThread().getName() + " requests " + request);
			try {
				Thread.sleep(random.nextInt(1000));
			} catch (InterruptedException e) {
			}
		}
		
	}

}
