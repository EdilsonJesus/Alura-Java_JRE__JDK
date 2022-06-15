
public class TestaCondicionais2 {
	public static void main(String [] args) {
		
		System.out.println("Testando Condicionais");
	  // Uma maneira para reduzir o if 
//		int idade = 16;
//		int quantidadePessoas = 1;
//		
//		if (idade >= 18 || quantidadePessoas >= 2 ) {
//			System.out.println("Seja bem vindo");			
//		} else {
//			System.out.println("Acessso recusado");
//		}
		
		// Agora testando o Boolean
		
		int idade = 18;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		if (idade >= 18 || acompanhado ) {
			System.out.println("Seja Bem Vindo");
		} else {
			System.out.println("Acesso recusado");
			
		}
	}
	
}
