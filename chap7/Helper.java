package chap7;

public class Helper {

	public void handle(int count, char c) {
		try {
			for (int i = 0; i < count; i++) {
				System.out.print(c);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {			
		}
	}

}
