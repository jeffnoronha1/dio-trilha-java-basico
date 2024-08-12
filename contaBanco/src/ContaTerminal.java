import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta ");
        int numero = entradaDeDados.nextInt();
        entradaDeDados.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = entradaDeDados.nextLine();

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = entradaDeDados.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = entradaDeDados.nextDouble();

        entradaDeDados.close();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo " +
                String.format("%.2f", saldo) + " já está disponível para saque.";

        System.out.println(mensagem);
    }
}