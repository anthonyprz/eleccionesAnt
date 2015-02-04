package elecciones;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int eleccion=0;

		do
		{
			System.out.print("\n\nMENU:");
			System.out.print("\n1.Añadir un habitante");
			System.out.print("\n2.Añadir un inmueble");
			System.out.print("\n3.Añadir un espacio publico");
			System.out.print("\n4.Añadir un ayuntamiento");
			System.out.print("\n5.Añadir un partido politico");
			System.out.print("\n6.Leer lista de partidos politicos");
			System.out.print("\n7.Leer lista de censo");
			System.out.print("\n8.SALIR");

			System.out.println("\nIntroduce el numero de la accion que quieres realizar: ");

			eleccion=sc.nextInt();	
			
			System.out.println("****************************************************************");
			
			switch (eleccion) {
				case 1:
				{
					Habitante habitante = new Habitante();
					habitante.crearHabitante();
					break;
				}
				case 2:
				{
					Inmueble inmueble = new Inmueble();
					inmueble.crearInmueble();
					break;
				}
			
			}
		}while(eleccion != 8);
		
	}

}
