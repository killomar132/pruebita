/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package honorio1;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Honorio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Leer la dimensión de la matriz
        System.out.print("Introduce la dimensión de la matriz (d): ");
        int d = sc.nextInt();
        
        // Crear la matriz de dimensión d x d
        int[][] matriz = new int[d][d];
        
        // Leer los elementos de la matriz
        System.out.println("Introduce los elementos de la matriz:");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        
        // Inicializar las sumas de las diagonales
        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;
        
        // Calcular la suma de ambas diagonales
        for (int i = 0; i < d; i++) {
            sumaDiagonalPrincipal += matriz[i][i];            // Elementos de la diagonal principal
            sumaDiagonalSecundaria += matriz[i][d - 1 - i];   // Elementos de la diagonal secundaria
        }
        
        // Mostrar las sumas
        System.out.println("Suma de la diagonal principal: " + sumaDiagonalPrincipal);
        System.out.println("Suma de la diagonal secundaria: " + sumaDiagonalSecundaria);
        
        sc.close();
    }
}