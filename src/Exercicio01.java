import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("COMPARANDO VALORES");
        System.out.println("...................................");
        System.out.println("Digite 2 números inteiros quais quer que desejar: ");

        int a = entrada_do_usuario.nextInt();
        int b = entrada_do_usuario.nextInt();
        int c = 0;

        if (a == b){
            c = a + b;
            System.out.println("Os números digitados são iguais");
            System.out.println("A soma dos respectivos valores é: " + c);
        }
        else {
            c = a * b;
            System.out.println("Os números digitados não são iguais");
            System.out.println("O produto dos respectivos valores é: " + c);
        }

    }
}
