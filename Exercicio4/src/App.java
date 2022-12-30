// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// TODO: complete os espaços em branco com sua solução para o problema
		String[] nomes = new String[10];
		
		for(int i=0 ; i<10 ; i++){
            System.out.println("Enter a name: ");
			nomes[i] = sc.nextLine();
			
			if(i==2)
			  System.out.println(nomes[i]);
			  
			else if (i==6)
			   System.out.println(nomes[i]);
			   
			else if (i==8)
			   System.out.println(nomes[i]);
			else
                ;
        }
        sc.close();	
	}

}
