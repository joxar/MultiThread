package chap8;

public class Request {

	private int num;
	private String name;

	public Request(String name, int num) {
		this.name = name;
		this.num = num;
	}

	public void execute() {
		System.out.println(Thread.currentThread().getName() + " exectes " + this);
	}
	
	public String toString() {
		return "[ Request from " + name + ": No." + num + " ]";
	}

}
