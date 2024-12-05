import java.util.Scanner;

public class Acount 
{
    private Scanner scan = new Scanner(System.in);
    private int numberAcc;
    private String name;
    private int value;
    
    public void Acount()
    {

    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getNumberAcc() {
        return numberAcc;
    }
    public void setNumberAcc(int numberAcc) {
        this.numberAcc = numberAcc;
    }

    public void setAttributes()
    {
        System.out.println("Qual o Seu nome?");
        setName(scan.next());

        System.out.println("Qual a Sua Conta?");
        setNumberAcc(scan.nextInt());

        System.out.println("Qual o Valor depositado?");
        setValue(scan.nextInt());

        System.out.println("Conta Criada !! \nNome : " + getName() + "\nNumero da Conta : " + getNumberAcc() + "\nValor : " + getValue());

        
    }



}
