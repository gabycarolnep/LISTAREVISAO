import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("LENDO SEU NOME");
        System.out.println("...................................");

        System.out.println("Digite o seu nome completo");
        String nome = entrada_do_usuario.next();

        System.out.println("Digite o número de vezes que deseja vê-lo impresso na tela");
        int num = entrada_do_usuario.nextInt();

        for (int i = 0; i < num; i++){
            System.out.println(nome);
        }

    }
}
