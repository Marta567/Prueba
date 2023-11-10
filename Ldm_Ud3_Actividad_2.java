package Unidad3;

import java.util.Random;

public class Ldm_Ud3_Actividad_2 {

	public static void main(String[] args) {
		// Aleatorio
		
		int num;
		//Clae Ramdon para generar nuemro aleatorio
		Random numAleatorio= new Random ();
		//Generamos num aleatorio
		num=numAleatorio.nextInt(100);
		System.out.println("El numero generado es: " +num);
		if (num%2 ==0)
			System.out.println("Es par: ");
		else
			System.out.println("Es impar: ");

	
		

		
		
		

	}

}
