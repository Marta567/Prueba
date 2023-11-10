package Unidad3;

import java.util.Scanner;

public class Ldm_Ud3_Actividad_6 {

	public static void main(String[] args) {
		// ordenadoes
		Scanner sc = new Scanner (System.in);
		int n1, n2, n3, aux;
		System.out.print("Introduce el primer número n1: ");
		n1= sc.nextInt();
		System.out.print("Introduce el segundo número n2: ");
		n2= sc.nextInt();
		System.out.print("Introduce el tercer número n3: ");
		n3= sc.nextInt();
		// Busco el número mayor y al final estará almacenado
		// en n1
		if (n2>n1) {
		aux=n1;
		n1=n2;
		n2=aux;
		}
		// Garantizo que entre n1 y n2, n1 es el mayor
		if (n3>n1) {
		aux=n1;
		n1=n3;
		n3=aux;
		}
      sc.close();
	}

}
