public class E5 {
    public static void MatrizNueva_MatrizE3(double[][]array, int M){
        /*
        Generar una nueva matriz de tamaño N filas por 2 columnas donde la primer
        columna contenga los valores calculados en el punto 3 pero ordenados de
        Mayor a Menor, y en la segunda columna asignar el valor de la fila que poseía
        originalmente en la matriz del punto 3
         */

        double [][]arregloc = new double[M][2];

        for (int i = 0; i < arregloc.length; i++) {
            for (int j = 0; j < 1; j++) {
                arregloc[i][j] = array[i][j];
            }
        }


        //ordenar de mayor a menor


        for (int i = 0; i < M; i++){
            arregloc[i][0] = array[i][0];
            arregloc[i][1] = i;
        }
        for (int i = 1; i < M; i++){
            double[] valor = arregloc[i];
            int j = i-1;
            while ( j >= 0 && arregloc[j][0] < valor[0]){
                arregloc[j+1] = arregloc[j];
                j--;
            }
            arregloc[j+1] = valor;
        }

        //mostrar arregloc

        System.out.println("SUMA     POSICION");
        for (int i = 0; i < M; i++) {
            System.out.print(arregloc[i][0]);
            System.out.print("     ");
            System.out.print(arregloc[i][1] + "\n");
        }




    }
}
