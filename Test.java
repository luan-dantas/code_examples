import java.util.Scanner;
 
public class Test{
    public static void main(String[] args){
        
        //cria um objeto Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        // cria um objeto Account é atribui a MyAccoument
        Account myAccount = new Account();

        // exibe o valor inicial do nome
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        // solocita e lê o nome
        System.out.println("Please enter the name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);

        // exibe o nome armazenado no objeto myAccount
        System.out.printf("Name in objtect account is: %n%s%n", myAccount.getName());
    }
}