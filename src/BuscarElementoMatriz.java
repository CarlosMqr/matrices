import java.util.Scanner;

public class BuscarElementoMatriz {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          int[][] matriz = {
                  {35, 90, 1978},
                  {15, 2020, 10, 5},
                  {677, 127, 3278, 5243},
          };

          System.out.println("Elementos de la matriz");

          for (int i =0; i < matriz.length; i++){
               for (int j =0; j < matriz[i].length; j++){
                    System.out.print(matriz[i][j] + "\t");
               }
               System.out.println();
          }

          System.out.println("Que numero desea buscar en la matriz");
          int buscar = scanner.nextInt();
          boolean encontrado = false;
          int i;
          int j = 0;

          etiqueta: for (i = 0; i < matriz.length; i++) {
               for (j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] == buscar) {
                         encontrado = true;
                         break etiqueta;
                    }
               }
          }

          if (encontrado) {
               System.out.println("El numero se encuentra en la fila: " + (i +1) + " columna: " + (j+1));
          } else {
               System.out.println("Numero no encontrado");
          }

     }
}
