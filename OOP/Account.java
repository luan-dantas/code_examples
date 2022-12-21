// Classe Accout

public class Account{
    private String name; //váriavel de instância
    private double balance;

    // o construtor inicializa name com o nome do parâmetro
    public Account(String name, double balance){
        this.name = name;

        // valida que o balance é maior que 0.0.
        if(balance > 0.0) // se o saldo for válido 
            this.balance = balance; // o atribui á váriavel de instância balance
    }

    // método que deposita apenas uma quantia válida no saldo
    public void deposit(double depositAmount){
        if(depositAmount>0){ // se depositAmount for válido
            balance += depositAmount; // adiciona ao saldo
        }
    }

    // método que retorna o saldo da conta
    public double getBalance(){
        return balance;
    }

    // método para definir o nome do objeto
    public void setName(String name){
        this.name = name;
    }

    // método para recuperar o nome do objeto
    public String getName(){
        return name;
    }
}