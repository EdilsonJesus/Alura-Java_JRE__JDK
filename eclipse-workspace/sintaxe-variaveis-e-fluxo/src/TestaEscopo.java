public class TestaEscopo {
	public static void main (String[]args) {
		int idade = 16;
		int quantidade = 3;
		
		//Escopo Global 
		boolean acompanhado = true;
		
		if (idade >= 18 || quantidade >= 3) {
			//Escopo local
			 acompanhado = true;  
			System.out.println("Acesso Liberado, seja bem vindo ! " + acompanhado);
		} else {
			acompanhado = false;
			System.out.println("Acesso Negado, você não pode entrar " + acompanhado);
		}
		
		  boolean foiPromovido = true;

	        if(foiPromovido) {
	            double salario = 4200.0;
	            System.out.println(salario);
	        } else {
	            double salario = 3800.0;
	            System.out.println(salario);
	        }

	        
	}
	
	
}
