import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("SOMANDO NÚMEROS DE UMA SEQUENCIA");
        System.out.println("...............................");

        int soma = 0;
        int num = 0;
        int i = 0;

        while (num >= 0){
            i += 1;
            System.out.println("Digite o " + i + "º número");
            num = entrada_do_usuario.nextInt();

            if (num > 0){
                soma += num;
            }
        }
        System.out.println("A soma de todos os numeros dessa sequencia é: " + soma);
    }
}

