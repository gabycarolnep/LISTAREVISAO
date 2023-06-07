import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("LENDO NÚMEROS");
        System.out.println("...................................");

        int i = 1;
        int qtd = 0;

        while (i <= 20) {
            System.out.println("Digite o " + i + "º número");
            int num = entrada_do_usuario.nextInt();
            i += 1;

            if (num > 0 && num < 100){
                qtd++;
                System.out.println("Este número está entre 0 e 100");
            } else {
                System.out.println("Este número não está entre 0 e 100");
            }
        }
        System.out.println("A quantidade de números digitados que se encontra entre 0 e 100 é: " + qtd);
    }
}
