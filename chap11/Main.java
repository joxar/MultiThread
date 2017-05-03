package chap11;

/**
 * Thread-Specific Storage
 * @author snufkin
 *
 */
public class Main {

	public static void main(String[] args) {
		
		new ClientThread("Alice").start();
		new ClientThread("Bob").start();
	}

}
