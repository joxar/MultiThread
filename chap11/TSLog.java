package chap11;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TSLog {

	private PrintWriter writer = null;

	public TSLog(String filename) {
		try {
			writer  = new PrintWriter(new FileWriter(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		writer.println("End");
		writer.close();
	}

	public void println(String s) {
		writer.println(s);
	}

}
