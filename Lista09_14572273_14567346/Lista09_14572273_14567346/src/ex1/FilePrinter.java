package ex1;

import java.io.PrintWriter;

public class FilePrinter implements PrinterDAO {

	@Override
	public void print(String s) {
		PrintWriter w;
		try {
			w = new PrintWriter("print.txt", "UTF-8");
		} catch (Exception e) {
			System.out.print(e);
			return;
		}
	
		w.print(s);
		w.close();
	}

}
