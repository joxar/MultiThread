package chap5;

public class Main {

	public static void main(String[] args) {
		Table table = new Table(3);
		new MakerThread(table, "Maker-1").start();
		new EaterThread(table, "Eater-1").start();
	}

}
