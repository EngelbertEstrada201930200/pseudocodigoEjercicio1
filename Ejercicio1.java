import java.util.*;
public class Ejercicio1{
	public static void main (String []args ){
		int numero, aleatorio;
                 int pares=0;
                 int impares=0;
		Scanner entrada = new Scanner (System.in);

		System.out.println("Ingrese un numero");
		numero = entrada.nextInt();

		for(int i=0; i< numero ; i++){
                    
                    aleatorio = (int)(Math.random()*100+1);
                    System.out.println("Numero aleatorio "+(i+1)+" es: "+aleatorio);
                    
                    if (aleatorio%2 ==0) {
                    	
                        pares= pares+1;

                    }else { 

                        impares= impares+1;

                    }
                    
		}
		 System.out.println("La cantidad de pares "+ pares);
                 System.out.println("La cantidad de impares; "+impares);
	}
}
