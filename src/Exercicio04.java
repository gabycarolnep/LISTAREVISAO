import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("COMPARANDO VALORES");
        System.out.println("...................................");

        int num = 1;
        int soma = 0;

        while (num <= 20) {
            System.out.println("Digite a idade da " + num + "ª pessoa");
            int idade = entrada_do_usuario.nextInt();
            num += 1;
            soma = soma + idade;
        }
        System.out.println("A soma das idades das 20 pessoas é: " + soma);
    }


}
