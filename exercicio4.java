import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner (System.in);
		
		int n,m,d;
		
		System.out.println("Escreva em ordem decrescente o tamanho dos lados do seu tri�ngulo e descubra qual � o seu tipo:");
		n=leitor.nextInt();
		m=leitor.nextInt();
		d=leitor.nextInt();
		
		if (n==m&&m==d)
			System.out.println("� um tri�ngulo equil�tero.");
		if (n==m&&m!=d)
			System.out.println("� um tri�ngulo is�sceles.");
		if (n!=m&&m!=d&&n!=d)
			System.out.println("� um tri�ngulo escaleno.");
		
		
		
		
		
		
		
		
		
		
	}

}
