import java.math.BigDecimal;
import java.util.Scanner; 

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        
        var scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência: ");
        String agency = scanner.next();
        System.out.println("Por favor, digite o número da sua conta: ");
        Integer account = scanner.nextInt();
        System.out.println("Por favor, digite o seu nome: ");
        String clientName = scanner.next();
        System.out.println("Por favor, digite o valor a ser depositado: ");
        BigDecimal deposit = scanner.nextBigDecimal();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %.2f já está disponível para saque", clientName, agency, account, deposit);
       
    }
}
