import java.util.*;

public class Ejercicio3{
	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);
		int num;
		int fact=1;

		System.out.print("Escriba un número para calcular su factorial ");
		num = entrada.nextInt();

		if (num >0) {
			//calcula el factorial
			for(int i=num; i>=1; i--){
				System.out.print(i+"*");
				fact *= i; 
			}	
			System.out.println("\nEl factorial del número ingresado es: "+fact);
		} else {
			System.out.println("Ingreso un número que no es valido");
		}
		
	}
}