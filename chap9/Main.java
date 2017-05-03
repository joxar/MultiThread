package chap9;

/**
 * Future
 * @author snufkin
 *
 */
public class Main {

	public static void main(String[] args) {
		Host host = new Host();
		Data data1 = host.request(10, 'A');
		Data data2 = host.request(20, 'B');
		Data data3 = host.request(30, 'C');
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		System.out.println(data1.getContent());
		System.out.println(data2.getContent());
		System.out.println(data3.getContent());
	}

}
