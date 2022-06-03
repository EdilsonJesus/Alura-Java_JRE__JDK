
public class TestaConversao {
	public static void main(String[] args) {
		
		double salario = 1270.50;
		System.out.println("Usando o double de " + salario);
		
		// Vamos fgazer a conversão passando o casting na nova  atribuição  váriavel como inteiro 
		int valor = (int) salario;
		System.out.println(valor);
		
		//Outra maneira de declarar números decimais
		float pontoFlutuante = 3.14f;		
		System.out.println("Outra maneira de declarar nbúmero decimal " + pontoFlutuante);
		
		//Da forma abaixo também é valida 
		float pontoFlutuante1 = (float) 3.14;
		System.out.println(pontoFlutuante1);
		
		//Para guardar números com mais de 64 bits
		long numeroGrande = 3243344343L;
		System.out.println("Para número com 64 bits " + numeroGrande);
		
		//para guardar um número ou informação menor que 16bits
		short b = 2131;
		System.out.println("O SHORT guarda até " + b + " bits !"  );
		
		// Agora temos um case extranho
		double valor1 = 0.2;
		double valor2 = 0.3;
		double total = valor1 + valor2;
		System.out.println("A saída será um número absurdo, pesquisar no Google " + total);
	}
}
