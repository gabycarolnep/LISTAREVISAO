import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner entrada_do_usuario = new Scanner(System.in);
        System.out.println("REAJUSTE SALARIAL");
        System.out.println("...................................");

        double ajuste = 0;
        double aumento = 0;
        double salarioAtual = 0;
        double salarioNovo = 0;

        List < Double > salarios = new ArrayList<>();
        List < Double > ajustes = new ArrayList<>();

        for (int i = 0; i >= 0; i++){
            System.out.println("Digite o " + i + "º salário");
            salarioAtual = entrada_do_usuario.nextDouble();

            if (salarioAtual >= 0){
                salarios.add((double) salarioAtual);
            } else {
                break;
            }
        }

        System.out.println("Digite o valor do reajuste: ");
        ajuste = entrada_do_usuario.nextDouble();

        double ajustePorcent = ajuste * 0.01;

        for (int i = 0; i < salarios.size(); i++){
            aumento = salarios.get(i) + ajustePorcent;
            salarioNovo = salarios.get(i) + aumento;
            ajustes.add(salarioNovo);
        }

        System.out.println(salarios);
        System.out.println(ajustes);

    }
}
