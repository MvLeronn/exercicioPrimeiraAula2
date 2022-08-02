import java.util.Scanner;

public class ClassePrincipal {

    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        System.out.println("Entre com seu nome:");
        String nome = valor.nextLine();
        System.out.println("Entre com sua idade:");
        int idade = valor.nextInt();
        System.out.println("Entre com seu cpf:");
        long cpf = valor.nextLong();
        System.out.println("Voce tem titulo de eleitor? 0-nao 1-sim");
        int titulo = valor.nextInt();

        System.out.println(nome);
        if(titulo == 1)
            System.out.println("Ela é capaz de votar");
        else
            System.out.println("Ela não é capaz de votar");
        
    }
}
