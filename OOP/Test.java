import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        
        // cria dois objetos Account
        Account account1 = new Account("Jane Doe", 50.00);
        Account account2 = new Account("Jhon Doe", -7.53);

        // exibe o saldo inicial de cada Account
        System.out.printf("%s balance is %.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance is %.2f %n", account2.getName(), account2.getBalance());

        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a deposit amount for account1: "); //prompt
        float depositAmount = input.nextFloat(); // entrada do usuário
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); // adiciona o saldo da account1

        //exibe os saldos
        System.out.printf("%s balance: %.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f %n", account2.getName(), account2.getBalance());

    }
}