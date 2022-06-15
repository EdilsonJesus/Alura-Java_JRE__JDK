
public class TestaCondicionais {
	public static void main(String[]args) {
		
		int idade = 16;
		int quantidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoas >= 3){
				System.out.println("Acesso liberado, você está acompanhado por Adultos");
			} else {
				System.out.println("Infelizmente seu acesso foi recusado ");
			}
			 			
		} 
	}
}
