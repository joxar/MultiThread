package chap6;

/**
 * Read-Write Lock
 * @author snufkin
 *
 */
public class Main {

	public static void main(String[] args) {
		Data data = new Data("(empty)");
		new ReaderThread(data, "ReaderThread").start();
		new WriterThread(data, "WriterThread").start();
	}

}
