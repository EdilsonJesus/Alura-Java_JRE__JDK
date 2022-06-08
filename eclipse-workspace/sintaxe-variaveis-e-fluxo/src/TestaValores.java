
public class TestaValores {

	public static void main(String[] args) {
		
		//Váriaveis guardam valores e não referencias
		int primeiro = 5;
		int segundo = 7; 
		segundo = primeiro;
		primeiro = 10;
		
		System.out.println(segundo);
	}
}
