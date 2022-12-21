// Classe Accout

public class Account{
    private String name; //váriavel de instância

    // o construtor inicializa name com o nome do parâmetro
    public Account(String name){
        this.name = name;
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