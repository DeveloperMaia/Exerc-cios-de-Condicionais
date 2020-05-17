import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner (System.in);
		
		int x;
		
		System.out.println("Digite um número e descubra se ele está entre 20 e 90:");
		x = leitor.nextInt();
		
		if  (x>=20 && x<=90)
		System.out.println(" Ele está entre 20 e 90!");
		
		else 
		System.out.println("Ele é menor que 20 ou maior que 90!");
		
		
		
		

	}

}
