import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, Digite o número da sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, Digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Por favor, Digite o número da sua conta: ");
        int numConta = scanner.nextInt();
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
