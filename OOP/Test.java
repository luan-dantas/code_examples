import java.util.Scanner;
 
public class Test{
    public static void main(String[] args){
        
        // cria dois objetos Account
        Account account1 = new Account("Jane Doe");
        Account account2 = new Account("Jhon Doe");

        // exibe o valor inicial de nome para cada Account
        System.out.printf("Account1 name is %s%n", account1.getName());
        System.out.printf("account2 name is %s%n", account2.getName());
    }
}