public class MatrizString {
     public static void main(String[] args) {

          // mostrar valores de una matriz usando foreach

          String[][] nombres = {{"jazmin","jessy"},{"adriana","daniela"},{"thalia","bell"}};
          for (String[] filas: nombres ) {
               for (String columnas: filas ) {
                    System.out.print(columnas + "\t");
               }
               System.out.println();
          }

          System.out.println("///////////////////////////////////////////////////////////////////");
          System.out.println("Usando for");
          String[][] nombresB = new String[3][2];
          nombresB[0][0] = "jazmin";
          nombresB[0][1] = "jessy";

          nombresB[1][0] = "adriana";
          nombresB[1][1] = "daniela";

          nombresB[2][0] = "thalia";
          nombresB[2][1] = "bell";

          for (int i=0; i<nombresB.length; i++){// for para recorrer las filas
               for (int j =0; j< nombresB[i].length; j++){//for para recorrer las columnas
                    System.out.print("Fila " + i +  " columna " + j + ": " + nombresB[i][j] + "\t");
               }
               System.out.println();
          }


     }
}
