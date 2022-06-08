
public class TestaCaracters {
	
	public static void main(String[] args) {
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 1;
		System.out.println(valor);
		
		// Somente para trabalhar ou brincar com a tabela UNICODE
		char valor1 = 2;
		System.out.println(valor1);
		char valor2 = 3;
		System.out.println(valor2);
		char valor3 = 4;
		System.out.println(valor3);
		
		char valor4 = 5;
		System.out.println(valor4);
		char valor5 = 98;
		System.out.println(valor5);
		
		// Tentar somar número inteiro com a váriavel do tipo char
		
		valor = (char) (valor + 98); 
		System.out.println(valor);
		
		// Agora para trabalhar com Strings grandes 
		
		String palavra = "Alura Cursos de Tecnólogia";
		System.out.println(palavra);
		
		//O tipo Strng aceita uma concatenação normalmente 
		palavra = palavra + 2022;
		System.out.println(palavra);
	}
}
