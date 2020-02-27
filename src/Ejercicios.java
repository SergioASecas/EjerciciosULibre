import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		
		Ejercicios ej = new Ejercicios();
		//ej.palindromo();
		ej.leerDigitos();
		
	}
	
	public void leerDigitos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un n�mero");
		int n = sc.nextInt();
		
		if (n<10) {
			System.out.println(n+" Es de un d�gito");
		}
		else if (n<100) {
			System.out.println(n+" Es de dos d�gitos");
		}
		else if (n<1000) {
			System.out.println(n+" Es de tres digitos");
		}
	}
	
	public void leer() {
		int a,b=0;
		char c= 0;
		Scanner sc = new Scanner(System.in);	
		System.out.println("Ingrese un n�mero");
		a = sc.nextInt();
		System.out.println("Ingrese un n�mero");
		b = sc.nextInt();
		System.out.println("Ingrese una operaci�n");
		c = sc.next().charAt(0);
		digitos(a, b, c);
	}
	
	public int digitos(int a, int b, char c) {	
		int operacion=0;
		if (c=='+') {
			 int suma = a+b;
			 operacion = suma;
			 System.out.println("Suma: " +suma);
		}
		else if (c=='-') {
			if (b>a) {
				System.out.println("No se puede realizar la resta");
			}
			else {
				int resta = a-b;
				operacion = resta;
				System.out.println("Resta: " +resta);
			}
		}
		else if (c=='*') {
			int mult = a*b;
			operacion = mult;
			System.out.println("Multiplicaci�n: " +mult);
		}
		else if (c=='/') {
			if (b==0) {
				System.out.println("No se puede realizar divisi�n por 0");
			}
			else {
				int div = a/b;
				operacion = div;
				System.out.println("Division: " +div);
			}
		}
		return operacion;
	}
	
	public void palindromo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un n�mero");
		int n = sc.nextInt();
		System.out.println("Ingrese un n�mero");
		int x = sc.nextInt();		
		System.out.println("Ingrese un n�mero");
		int z = sc.nextInt();		
		if (n==z) {
			System.out.println(n+" Es palindromo");
		}
		else if (n!=z) {
			System.out.println(n+" No es palindromo");
		}
	}
}
