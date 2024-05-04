import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        

        System.out.println("Por favor, digite o número da conta: ");
        int Numero = scanner.nextInt();

        // Limpar o buffer
        scanner.nextLine();

        System.out.println("Por favor, digite a agência: ");
        String Agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        String NomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo do cliente: ");
        double Saldo = scanner.nextDouble();

        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", 
        NomeCliente, Agencia, Numero, Saldo);

        System.out.println(mensagem);
        
        scanner.close();
    }
}
