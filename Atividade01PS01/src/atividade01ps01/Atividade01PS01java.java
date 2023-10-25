package atividade01ps01;
import java.util.Scanner;
/**
 *
 * @author Andressa Flavia Atelli
 */
public class Atividade01PS01 {

    public static void main(String[] args) {
        //linhas - colunas
        Scanner scanner = new Scanner(System.in);
        
        //Requisito 01
        System.out.println("Informe o número de linhas da Matriz A: ");
        int linhasA = scanner.nextInt();
        System.out.println("Informe o número de colunas da Matriz A: ");
        int colunasA = scanner.nextInt();
        
        int[][] matrizA = new int[linhasA][colunasA];
        
        System.out.println("Informe os elementos da matriz A: ");
        for (int l = 0; l < linhasA; l++) {
            for (int c = 0; c < colunasA; c++) {
                matrizA[l][c] = scanner.nextInt();
            }
        }
        
        System.out.println("Informe o número de linhas da Matriz B: ");
        int linhasB = scanner.nextInt();
        System.out.println("Informe o número de colunas da Matriz B: ");
        int colunasB = scanner.nextInt();
        
        int[][] matrizB = new int[linhasB][colunasB];
        
        System.out.println("Informe os elementos da matriz B: ");
        for (int l = 0; l < linhasB; l++) {
            for (int c = 0; c < colunasB; c++) {
                matrizB[l][c] = scanner.nextInt();
            }
        }
        
        //Requisito 02
        if (colunasA != linhasB) {
            System.out.println("Não é possível multiplicar as matrizes");
        } else {
            //Requisito 03
            int [][] matrizC = new int[linhasA][colunasB];
            for (int l = 0; l < linhasA; l++) {
                for (int c = 0; c < colunasB; c++) {
                    for (int x = 0; x < colunasA; x++) {
                        matrizC[l][c] += matrizA[l][x] * matrizB[l][c];
                    }
                }
            }
            
            //Requisito 04
            System.out.println("Matriz A: ");
            for (int l = 0; l < linhasA; l++) {
                for (int c = 0; c < colunasA; c++) {
                    System.out.println(matrizA[l][c] + " ");
                }
                System.out.println();                
            }
            
            System.out.println("Matriz B: ");
            for (int l = 0; l < linhasB; l++) {
                for (int c = 0; c < colunasB; c++) {
                    System.out.println(matrizB[l][c] + " ");
                }
                System.out.println();
            }
            
            System.out.println("Matriz A x Matriz B = Matriz C: ");
            for (int l = 0; l < linhasA; l++) {
                for (int c = 0; c < colunasB; c++) {
                    System.out.println(matrizC[l][c] + " ");
                }
                System.out.println();
            }
        }
        
        scanner.close();
    }    
}
