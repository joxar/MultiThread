package chap1;

public class UserThread extends Thread {
	private Gate gate;
	private String name;
	private String adrs;

	public UserThread(Gate gate, String name, String adrs) {
		this.gate = gate;
		this.name = name;
		this.adrs = adrs;
	}

	public void run() {
		while (true) {
			gate.pass(name, adrs);
		}
	}

}
