package ex1;

public class SystemOutPrinter implements PrinterDAO {

	@Override
	public void print(String s) {
		System.out.print(s);
	}

}
