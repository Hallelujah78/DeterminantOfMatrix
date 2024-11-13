/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package determinantofmatrix;

/**
 *
 * @author gavan
 */
public class DeterminantOfMatrix {

    // only works for 2x2 matrices
    private static int calcDeterminant(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matrix[][] = {{2, -1}, {3, 2}};
        // determinants only apply to square matrices
        // a   b
        // c   d
        // |matrix| = a*d - b*c
        //          = [0][0] * [1][1] + [0][1] * [1][0]

        System.out.println("Determinant of matrix is: " + calcDeterminant(matrix));
    }

}
