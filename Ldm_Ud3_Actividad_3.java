package Unidad3;

import java.util.Scanner;

public class Ldm_Ud3_Actividad_3 {

	public static void main(String[] args) {
		// Iguales
		
		Scanner sc=new Scanner (System.in);
		int n1,n2;
		
		System.out.print("Introduce n1: ");
		n1=sc.nextInt();
		System.out.print("Introduce n2: ");
		n2=sc.nextInt();
		
		if (n1==n2)
			System.out.print("Los numeros son iguales: ");
		else
			System.out.print("Los numeros no son iguales: ");
		
	sc.close();	
	

	}

}
