import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("PAR OU ÍMPAR?");
        System.out.println("...................................");
        System.out.println("Digite um número inteiros qual quer: ");

        int num = entrada_do_usuario.nextInt();
        int result = 0;

            if ((num % 2) != 0){
                System.out.println("O número " + num + " é impar");
                result = num + 8;
                System.out.println("Resultado = " + result);
            } else {
                System.out.println("O número " + num + " é par");
                result = num + 5;
                System.out.println("Resultado = " + result);
            }
    }
}
