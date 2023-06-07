import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("MÉDIA E APROVAÇÃO");
        System.out.println("...................................");

        System.out.println("Qual o seu número de matricula?");

        double num = entrada_do_usuario.nextDouble();

        System.out.println("Digite as notas das suas 3 avaliações");

        double nota1 = entrada_do_usuario.nextInt();
        double nota2 = entrada_do_usuario.nextInt();
        double nota3 = entrada_do_usuario.nextInt();

        System.out.println("Qual sua média nos exercícios?");

        double mediaExer = entrada_do_usuario.nextDouble();

        double mA = ((nota1) + (nota2 * 2) + (nota3 * 3) + mediaExer) / 7;

        System.out.println("Aluno número " + num + " segue abaixo as informações requeridas");
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Média dos exercícios: " + mediaExer);
        System.out.println("Média de aproveitamento: " + mA);

        if (mA >= 90){
            System.out.println("Você foi aprovado no conceito A");
        } else if (mA >= 75 && mA < 90){
            System.out.println("Você foi aprovado no conceito B");
        } else if (mA >= 60 && mA < 75){
            System.out.println("Você foi aprovado no conceito C");
        } else if (mA >= 40 && mA < 60){
            System.out.println("Você foi reprovado no conceito D");
        } else {
            System.out.println("Você foi reprovado no conceito E");
        }

    }
}
