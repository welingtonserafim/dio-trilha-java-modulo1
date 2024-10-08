import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número da conta:");
        int numeroConta = sc.nextInt();

        System.out.println("Informe o número da agência:");
        String agencia = sc.nextLine();

        System.out.println("Informe o nome do cliente:");
        String nomeCliente = sc.nextLine();

        System.out.println("Informe o nome do cliente:");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é" +
                agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponivel para saque.");
    }
}