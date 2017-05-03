package chap8;

public class ClientThread extends Thread {

	private Channel channel;

	public ClientThread(Channel channel, String name) {
		super(name);
		this.channel = channel;
	}

	public void run() {
		try {
			for (int i = 0; i < 1000; i++) {
				Request request = new Request(getName(), i);
				channel.putRequest(request);
				System.out.println(request);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
		}
	}

}
