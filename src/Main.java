import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Date fecha = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
		
		String fechaActual = sdf.format(fecha);
		String nombre; 
		String domicilio;
		
		String producto1;
		int cant_prod1;
		double valunitario1;
		double valtotal1;
		
		String producto2;
		int cant_prod2;
		double valunitario2;
		double valtotal2;
		
		double subtotal;
		double iva;
		double total;
		
		System.out.println("Ingrese su nombre");
		nombre = scan.nextLine(); 
		
		System.out.println("Ingrese su domicilio");
		domicilio = scan.nextLine();
		
		System.out.println("Ingrese el nombre del producto");
		producto1 = scan.nextLine();
		
		System.out.println("Ingrese la cantidad de unidades");
		cant_prod1 = scan.nextInt();
		
		System.out.println("Ingrese el valor unitario del producto");
		valunitario1 = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("Ingrese el nombre del segundo producto");
		producto2 = scan.nextLine();
		
		System.out.println("Ingrese la cantidad de unidades");
		cant_prod2 = scan.nextInt();
		
		System.out.println("Ingrese el valor unitario del producto");
		valunitario2 = scan.nextDouble();
		
		valtotal1 = valunitario1 * cant_prod1;
		valtotal2 = valunitario2 * cant_prod2;
		
		subtotal = valtotal1 + valtotal2;
		iva = subtotal * 0.21;
		total = subtotal + iva;
		
		System.out.println("*************************************************************************************");
		System.out.println("FECHA:" + fechaActual );
		System.out.println("*************************************************************************************");
		System.out.println("NOMBRE: " + nombre );
		System.out.println("DOMICILIO: " + domicilio);
		System.out.println("*************************************************************************************");
		System.out.println("Cant. | Descripcion        | P. unit | P. total");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println( cant_prod1 + " | " + producto1 + "        | $" + valunitario1 + " | $" + valtotal1 );
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println( cant_prod2 + " | " + producto2 + "        | $" + valunitario2 + " | $" + valtotal2 );
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("IVA: $" + iva);
		System.out.println("Subtotal: $" + subtotal);
		System.out.println("Total: $" + total);
		System.out.println("*************************************************************************************");
	
	}

}
