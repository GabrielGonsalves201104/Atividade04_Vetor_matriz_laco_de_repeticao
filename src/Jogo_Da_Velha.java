import java.util.Scanner;

public class Jogo_Da_Velha {
    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];
        Scanner sc = new Scanner(System.in);
        char jogadorAtual = 'X';
        int jogadas = 0;

        // Inicializa o tabuleiro com espaços vazios
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }

        while (jogadas < 9) {
            exibirTabuleiro(tabuleiro);
            System.out.println("Jogador " + jogadorAtual + ", digite a linha e a coluna (0-2):");
            int linha = sc.nextInt();
            int coluna = sc.nextInt();

            if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
                tabuleiro[linha][coluna] = jogadorAtual;
                jogadas++;

                if (jogadorAtual == 'X') {
                    jogadorAtual = 'O';
                } else {
                    jogadorAtual = 'X';
                }
            } else {
                System.out.println("Posição inválida ou já ocupada. Tente novamente.");
            }
        }

        exibirTabuleiro(tabuleiro);
        System.out.println("Fim do jogo!");
        sc.close();
    }

    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }
}