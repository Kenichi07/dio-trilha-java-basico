import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, Digite seu primeiro nome: ");
        String nome = scanner.nextLine();

        // System.out.println("Por favor, Digite o número da sua agência: ");
        // String agencia = scanner.nextLine();

        // System.out.println("Por favor, Digite o seu saldo: ");
        // double saldo = scanner.nextDouble();

        // System.out.println("Por favor, Digite o número da sua conta: ");
        // int numConta = scanner.nextInt();
        scanner.close();

        System.out.println("Olá " + nome + "");
    }
}
