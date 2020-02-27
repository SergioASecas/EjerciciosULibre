package Taller;

import java.util.Scanner;

public class Notas {

	private Scanner sc;
	private Scanner sc2;
	private Scanner sc3;
	private Scanner sc4;
	private Scanner sc5;


	public static void main(String[] args) {
		
		Notas ej = new Notas();
		ej.notas();
		ej.sumatoria();
		ej.vocal();
		ej.leerCaracter();
		ej.leerMultiplo();
	}
	
	public void notas() {
		System.out.println(" ************** NOTAS DE ESTUDIANTES *******************");
		sc5 = new Scanner(System.in);
		System.out.println("Ingrese la nota 1");
		double nota1 = sc5.nextDouble();
		System.out.println("Ingrese la nota 2");
		double nota2 = sc5.nextDouble();
		System.out.println("Ingrese la nota 3");
		double nota3 = sc5.nextDouble();
		
		double notaFinal = (nota1*25)/100 +(nota2*35)/100 + (nota3*40)/100;
		
		if(notaFinal>=3) {
			System.out.println("El estudiante pasó la materia con: "+notaFinal);
		}
		else {
			System.out.println("El estudiante perdió la materia con : "+notaFinal);
		}
	}
	
	public void sumatoria() {
		System.out.println(" ************** SUMATORIA DE NÚMEROS *******************");
		sc4 = new Scanner(System.in);
		System.out.println("Ingrese numero 1");
		double nota1 = sc4.nextDouble();
		System.out.println("Ingrese numero 2");
		double nota2 = sc4.nextDouble();
		System.out.println("Ingrese numero 3");
		double nota3 = sc4.nextDouble();
		double suma=nota1+nota2+nota3;
		
		System.out.println("Sumatoria de los numeros: "+suma );
	}
	
	public void vocal() {
		System.out.println(" ************** VOCALES *******************");
		sc3 = new Scanner(System.in);
		System.out.println("Ingrese un caracter");
		char c = sc3.next().charAt(0);
		
		if (c=='a'|| c=='e'|| c=='i' || c=='o' || c=='u') {
			System.out.println("Es una vocal");
		}
		else {
			System.out.println("No es una vocal");
		}
	}
	
	public void leerCaracter() {
		System.out.println(" ************** LETRAS Y NÚMEROS (CARACTERES) *******************");
		sc2 = new Scanner(System.in);
		System.out.println("Ingrese un caracter");
		char c = sc2.next().charAt(0);
		if (c=='a' || c=='b' || c=='c' || c=='d' || c=='e' || c=='f' || c=='g' || c=='h' || c=='i' || c=='j' || c=='k' || c=='l' || c=='m' ||
			c=='n' || c=='ñ' || c=='o' || c=='p' || c=='q' || c=='r' || c=='s' || c=='t' || c=='u' || c=='v' || c=='w' || c=='x' || c=='y' ||
			c=='z') {
			System.out.println("Es una letra");
		}
		else {
			System.out.println("Es un número ");
		}
	}	
	
	
	public void leerMultiplo() {
		System.out.println(" ************** MÚLTIPLOS *******************");
		sc = new Scanner(System.in);
		System.out.println("Ingrese un número");
		int n1 = sc.nextInt();
		System.out.println("Ingrese otro número");
		int n2 = sc.nextInt();
		
		if (n1%n2==0) {
			System.out.println(n1+" Es múltiplo de "+n2);
		}
		else {
			System.out.println(n1+" No es múltiplo de "+n2);
		}			
	}	
}
