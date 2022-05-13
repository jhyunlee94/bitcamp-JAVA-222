package _0513;

public class _mainPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cnt; //¿ë

		InkjetPrinter i = new InkjetPrinter();
		LaserPrinter l = new LaserPrinter();
		
		i.print();
		System.out.println("-----");
		i.print();
		System.out.println();
		System.out.println("-----");
		l.print();
		System.out.println("-----");
		l.print();
		
		
	}

}
