package Unidad3;

import java.util.Scanner;

public class Ldm_Ud3_Actividad_4 {

	public static void main(String[] args) {
		// Mayor
		
		Scanner sc=new Scanner (System.in);
		int n1,n2;
		
		System.out.print("Introduce n1: ");
		n1=sc.nextInt();
		System.out.print("Introduce n2: ");
		n2=sc.nextInt();
		
		if (n1>n2)
			System.out.print("n1 es mayor que n2: ");
		else
			System.out.print("n2 es mayor que n1: ");
		
	sc.close();	
	
	}

}
