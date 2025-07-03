import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome: ");
        var name = scanner.nextLine();
        name = name.toUpperCase();
        System.out.printf("%s, Digite o número da conta: ", name);
        var num = scanner.nextInt();
        System.out.printf("Agora, %s digite a Agência: ", name);
        var agencia = scanner.next();
        System.out.printf("%s, Digite qual é seu saldo: R$", name);
        var saldo = scanner.nextFloat();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$%s já está disponível para saque.\n", name, agencia, num, saldo);
    }
}
