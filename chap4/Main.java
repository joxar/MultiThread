package chap4;

/**
 * Balking
 * @author snufkin
 *
 */
public class Main {
	public static void main(String[] args) {
		Data data = new Data("data.txt", "(empty)");
		new ChangerThread(data, "ChangerThread").start();
		new SaverThread(data, "SaverThread").start();
	}

}
