package Unidad3;

import java.util.Scanner;

public class Ldm_Ud3_Actividad_7 {

	public static void main(String[] args) {
		// Nº de cifras
		Scanner sc = new Scanner (System.in);
		int num;
		System.out.print("Introduzca un nº entre el 0 y el 99999: ");
		num=sc.nextInt();
		if (num<10)
		System.out.print("Tiene 1 cifra");
		else if (num<100)
		System.out.print("Tiene 2 cifras");
		else if (num<1000)
		System.out.print("Tiene 3 cifras");
		else if (num<10000)
		System.out.print("Tiene 4 cifras");
		else
		System.out.print("Tiene 5 cifras");
		sc.close();
		}
	}