package chap5;

public class Table {

	private String[] buffer;
	private int tail = 0;
	private int head = 0;
	private int count = 0;

	public Table(int count) {
		this.buffer = new String[count];
	}

	public synchronized void put(String cake) {
		while (count  >= buffer.length) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		this.buffer[tail] = cake;
		tail = (tail + 1) % buffer.length;
		count++;
		notifyAll();
	}

	public synchronized String take() {
		while (count <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		String cake = buffer[head];
		head = (head + 1) % buffer.length;
		count--;
		notifyAll();
		return cake;
	}
}
