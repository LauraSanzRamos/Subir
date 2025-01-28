/* Escribe un programa que pida 10 números por teclado, los almacene en un array y que luego muestre el máximo valor, el mínimo y las posiciones que ocupan en el array.*/

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {

		double [] numeros= new double [10];
		double numero=0;
		double numeroMenor=10;
		int contador=1;
		String [] personas=new String [10];
		String persona=" ";
		String personaMenor=" ";
		
		Scanner scan = new Scanner(System.in); 
		for(int i=0; i<10; i++){    
		System.out.println("Nombre?");
		personas [i]=scan.nextLine();
		
		System.out.println("Di cual es el número:" + contador); 
		numeros[i] = scan.nextDouble(); 
		
		if(numeros[i]>numero){
			numero=numeros[i];
			persona=personas[i];
		}
		if(numeros[i]<numeroMenor){
			numeroMenor=numeros[i];
			personaMenor=personas[i];
		}
		scan.nextLine();
		contador++;
		}
		System.out.println("el mayor número es el:" + numero);
		for(int i=0; i<10; i++){
			if(numeros[i]==numero){
				System.out.println(" - " + personas[i]);
				System.out.println("posición: " + i);
			}
		}
		System.out.println("el numero menor es: " + numeroMenor);
		for(int i=0; i<10; i++){
			if(numeros[i]==numeroMenor){
				System.out.println(" - " + personas[i]);
				System.out.println("posición: " + i);
			}
		}
		}
	}

