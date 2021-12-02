import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Calculadora\n\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir\n\n->: ");
		}while (menu(Integer.parseInt(sc.next())));
	}
	
	public static boolean menu(int opt) {
		switch(opt) {
		case 1:
			suma();
			break;
		case 2:
			resta();
			break;
		case 3:
			multi();
			break;
		case 4:
			divi();
			break;
		case 5:
			return false;
			default:
				System.out.println("Elige correctamente\n\n");
				break;
		}
		return true;
	}
	
	 public static void suma() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Num1: ");
		 int num1 = Integer.parseInt(sc.next());
		 System.out.print("Num2: ");
		 int num2 = Integer.parseInt(sc.next());
		 System.out.println("Resultado: "+ (num1+num2));
	 }
	 
	 public static void resta() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Num1: ");
		 int num1 = Integer.parseInt(sc.next());
		 System.out.print("Num2: ");
		 int num2 = Integer.parseInt(sc.next());
		 System.out.println("Resultado: "+ (num1-num2));
	 }
	 public static void multi() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Num1: ");
		 int num1 = Integer.parseInt(sc.next());
		 System.out.print("Num2: ");
		 int num2 = Integer.parseInt(sc.next());
		 System.out.println("Resultado: "+ (num1*num2));
	 }
	 public static void divi() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Num1: ");
		 int num1 = Integer.parseInt(sc.next());
		 System.out.print("Num2: ");
		 int num2 = Integer.parseInt(sc.next());
		 System.out.println("Resultado: "+ (num1/num2));
	 }

}
