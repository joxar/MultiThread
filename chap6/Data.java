package chap6;

public class Data {

	private ReadWriteLock lock = new ReadWriteLock();
	private String content;

	public Data(String content) {
		this.content = content;
	}

	public String read() throws InterruptedException {
		lock.readLock();
		try {
			return doRead();
		} finally {
			lock.readUnlock();
		}
	}

	private String doRead() {
		return content;
	}

	public void write(String newContent) throws InterruptedException {
		lock.writeLock();
		try {
			doWrite(newContent);
		} finally {
			lock.writeUnlock();
		}
		
	}

	private void doWrite(String newContent) {
		content = newContent;
	}

}
