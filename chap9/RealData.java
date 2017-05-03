package chap9;

public class RealData implements  Data {

	private String content;

	public RealData(int count, char c) {
		char[] buffer = new char[count];
		for (int i = 0; i < count; i++) {
			buffer[i] = c;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
		this.content = new String(buffer);
	}

	@Override
	public String getContent() {
		return content;
	}

}
