import java.util.Scanner;

public class Ranking_Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alunos = new String[5];
        double[][] notas = new double[5][2];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            alunos[i] = sc.next();
            System.out.print("Digite a primeira nota: ");
            notas[i][0] = sc.nextDouble();
            System.out.print("Digite a segunda nota: ");
            notas[i][1] = sc.nextDouble();
        }

        System.out.println("\n--- Média dos Alunos ---");
        for (int i = 0; i < 5; i++) {
            double media = (notas[i][0] + notas[i][1]) / 2;
            System.out.println("Aluno: " + alunos[i] + " - Média: " + String.format("%.2f", media));
        }
        sc.close();
    }
}