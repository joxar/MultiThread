package chap7;

/**
 * Thread per Message
 * @author snufkin
 *
 */
public class Main {

	public static void main(String[] args) {
		Host host = new Host();
		host.request(10, 'A');
		host.request(20, 'B');
		host.request(30, 'C');
	}

}
