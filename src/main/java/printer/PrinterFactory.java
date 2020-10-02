package printer;

public class PrinterFactory {
	
	public PrinterFactory() {
	}
	
	public Printer create(String printerType) {
		
		if (printerType.equals("hd")) {
			return new PrinterHD();
		} else if (printerType.equals("hi")) {
			return new PrinterHI();
		} else if (printerType.equals("vd")) {
			return new PrinterVD();
		} else if (printerType.equals("vi")) {
			return new PrinterVI();
		} else {
			// TODO Remove System.exit(1);
			System.exit(1);
			throw new IllegalArgumentException("El argumento de typo de impresión es inválido.");
		}
	}
}
