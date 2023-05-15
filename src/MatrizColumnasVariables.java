public class MatrizColumnasVariables {
     public static void main(String[] args) {
          int[][] matriz = new int[3][];//no se defino la cantidad de columnas

          // una matriz con diferentes tamaños de columnas
          // forma de inicializar
          matriz[0] = new int[2];// para la fila 0 se definieron 2 columnas
          matriz[1] = new int[3];// para la fila 1 se definieron 3 columnas
          matriz[2] = new int[4];// para la fila 2 se definieron 4 columnas

          for(int i=0; i < matriz.length; i ++){
               for (int j=0; j < matriz[i].length; j++){
                    matriz[i][j] = i*j;// llenado automatico de valores para la matriz
               }
          }

          for (int i =0; i < matriz.length; i++){
               for(int j=0; j < matriz[i].length; j++){// siempre se pone matriz[i].length en segundo for()
                    System.out.print( matriz[i][j] + "\t");
               }
               System.out.println();
          }

     }
}
