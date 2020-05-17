import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leitor = new Scanner (System.in);
		
		int idade;
		
		System.out.println(" Digite a idade para obter a categoria do nadador:");
		idade=leitor.nextInt();
		
		if (idade>=5 && idade<=10)
			System.out.println("Categoria> INFANTIL.");
		if  (idade>=11 && idade<=17)
			System.out.println("Categoria> JUVENIL.");
		if  (idade>17)
			System.out.println("Categoria> ADULTO.");
		if (idade<5) 
			 System.out.println("Categoria não disponível");

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
