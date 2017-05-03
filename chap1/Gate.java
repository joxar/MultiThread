package chap1;

public class Gate {
	private int counter = 0;
	private String name;
	private String adrs;
	
	public void pass(String name, String adrs) {
		counter++;
		this.name = name;
		this.adrs = adrs;
		check();		
	}
	
	private void check() {
		if (name.charAt(0) != adrs.charAt(0)) {
			System.out.println("*** BROKEN *** No." + counter + ": " + name + "-" + adrs);
			System.exit(1);
		}
	}
}
