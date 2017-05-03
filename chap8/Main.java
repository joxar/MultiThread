package chap8;

/**
 * Worker Thread
 * @author snufkin
 *
 */
public class Main {

	public static void main(String[] args) {
		Channel channel = new Channel(5);
		channel.startWorkers();
		new ClientThread(channel, "Alice").start();
		new ClientThread(channel, "Bob").start();
		new ClientThread(channel, "Chris").start();
	}

}
