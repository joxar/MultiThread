package chap1;

/**
 * Single Threaded Execution
 * @author snufkin
 *
 */
public class Main {	
	public static void main(String[] args) {
		Gate gate = new Gate();
		new UserThread(gate, "Alex", "America").start();
		new UserThread(gate, "Bob", "Brazil").start();
		new UserThread(gate, "Chris", "Canada").start();
	}
}
