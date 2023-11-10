package Unidad3;

import java.util.Scanner;

public class Ldm_Ud3_Actividad_1 {

	public static void main(String[] args) {
		// par o impar
		
		Scanner sc=new Scanner (System.in);
		int num;
		
		System.out.print("Introduzca un numero: ");
		num=sc.nextInt();
		
		if (num % 2 == 0)
		System.out.print("Este numero es par: ");
		else 
		System.out.print("Este numero es impar: ");
		sc.close();
	}

}
