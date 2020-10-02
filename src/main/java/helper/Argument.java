package helper;

public class Argument {
	
	String printStyle;
	int serieNumber;

	public Argument () {
	}
	
	public Argument (String[] args) {
		
		// Get the arguments
		// Expect 1 argument: serie number
		if (args.length == 1) {
			
			// Set the default print style
			this.printStyle = "hd";
			
			// Validate and Set number argument
			assertSerieNumberArgument(args[0]);
			
		// Expect 2 arguments: print style and serie number
		} else if (args.length==2) {
			
			// Validate and Set print style
			assertPrintStyleArgument(args[0].substring(3));
						
			// Validate and Set number argument
			assertSerieNumberArgument(args[1]);
			
		} else {
			// Si no hay argumentos o hay más de 2 -> Exception
			// throw new IllegalArgumentException("Opciones no validas. La cantidad de argumentos válidos es 1 o 2");
			System.out.println("Opciones no validas. La cantidad de argumentos válidos es 1 o 2");
			System.exit(1);
			// TODO Remove System.exit(1);
		}
	}
		

	
	private void assertSerieNumberArgument(String argument) {
		
		try {
			this.serieNumber = Integer.parseInt(argument);
			
		} catch (Exception e) {

			// throw new IllegalArgumentException("Opciones no validas. El argumento para la serie debe ser un número entero. Ej: 8");
			System.out.println("Opciones no validas. El argumento para la serie debe ser un número entero. Ej: 8");
			System.exit(1);
			// TODO Remove System.exit(1);
		}
	}
	
	
	private void assertPrintStyleArgument(String printArgument) {

		if (printArgument.equals("hd") || printArgument.equals("hi") || printArgument.equals("vd") || printArgument.equals("vi") ) {
			this.printStyle = printArgument;
		} else {
			// throw new IllegalArgumentException("Argumento invalido. Los valores validos son: -o=hd -o=hi -o=vd -o=vi");
			System.out.println("Argumento invalido. Los valores validos son: -o=hd -o=hi -o=vd -o=vi");
			System.exit(1);
			// TODO Remove System.exit(1);
		}
	}	
	

	public String getPrintStyle() {
		return printStyle;
	}

	public int getSerieNumber() {
		return serieNumber;
	}

}
