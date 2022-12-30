
import java.util.Scanner;

public class Teste{
    public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
    	int N = 10;
    	//String jogador1, jogador2;

    	for (int i = 0; i < N; i++) {
            System.out.println("Jogador 1?");
            String jogador1 = sc.nextLine();
            System.out.println("Jogador 2?");
            String jogador2 = sc.nextLine();
    		if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque")) System.out.println("Aniquilacao mutua");
    		else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel")) System.out.println("Ambos venceram");
    		else if (jogador1.equalsIgnoreCase("ataque")) System.out.println("Jogador 1 venceu");
    		else if (jogador2.equalsIgnoreCase("ataque")) System.out.println("Jogador 2 venceu");
    		else if (jogador2.equalsIgnoreCase("papel")) System.out.println("Jogador 1 venceu");
    		else if (jogador1.equalsIgnoreCase("papel")) System.out.println("Jogador 2 venceu");
    		else System.out.println("Sem ganhador");
			sc.close();
    	}
    }
}