import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // TODO: Conhecer e importr a classe Scanner
        // TODO: Exibir as mensagens para o nosso usuário
        // TODO: Obter, pela classe Scanner, o svalores digitados no terminal
        // Exibir a mensagem da conta criada.

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta ! ");
        int conta = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite o número da Agência ! ");
        String agencia = sc.nextLine();
        System.out.println("Qual seu nome? ");
        String nome = sc.nextLine();
        double saldo = 0.0;
        System.out.println("Por fim, qual o seu saldo?");
        if (sc.hasNextDouble()){
                saldo = sc.nextDouble();
        } else {
            System.out.println("Invalid input! Please enter a decimal value.");
        }

        System.out.printf("Olá %s,",nome);
        System.out.printf(" obrigado por criar uma conta em nosso banco, sua agêcia é %s,", agencia);
        System.out.printf(" conta %d", conta);
        System.out.printf(" e seu saldo %.2f já está disponível para saque.",saldo);



    }
}
