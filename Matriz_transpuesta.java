package fundamentos;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        int matriz[] [] = new int [3] [3];

        System.out.println("Digite la matriz");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Matriz["+i+"] ["+j+"]: ");
                matriz [i][j] = entrada.nextInt();
            }
        }
        System.out.println("\n Matriz Original: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }

        //transponiendo la matriz
        int aux;
        for(int i=0;i<3;i++){
            for(int j=0;j<i;j++){
                aux = matriz[i] [j];
                matriz[i] [j] = matriz[j] [i];
                matriz[j] [i] = aux;

            }
        }
        System.out.println("\n La matriz transpuesta es: ");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matriz[i] [j]+" ");
            }
            System.out.println("");
        }

    }
}
