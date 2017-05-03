package chap9;

public class FutureData implements Data {

	private boolean ready = false;
	private RealData realData;

	@Override
	public synchronized String getContent() {
		while (!ready) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		return realData.getContent();
	}

	public synchronized void setRealData(RealData realData) {
		if (ready) {
			return;
		}
		this.realData = realData;
		this.ready = true;
		notifyAll();
	}

}
