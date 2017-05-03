package chap9;

public class Host {

	public Data request(final int count, final char c) {		
		
		FutureData future = new FutureData();
		
		new Thread() {
			public void run() {
				RealData realData = new RealData(count, c);
				future.setRealData(realData);
			}
		}.start();
		
		return future;
	}

}
