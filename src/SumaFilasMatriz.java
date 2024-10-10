public class SumaFilasMatriz {
    public static void Ej3y4(double[][] arreglo, int M) {
        /*
        Generar una nueva matriz de N filas por 1 columna que contenga en cada celda
        de la columna la sumatoria de las celdas de cada una de las filas de la matriz
        cargada en el punto 1

        Mostrar la matriz resultante por pantalla
         */

        double[][] arregloB = new double[M][1];

        for (int i = 0; i < arregloB.length; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                arregloB[i][0] += arreglo[i][j];
            }

        }

        //Mostramos la nueva matriz
        System.out.println("La nueva matriz con la sumatoria de celdas es: ");

        for (int i = 0; i < arreglo.length; i++) {//filas
            //columnas
            System.out.print(arregloB[i][0] + " ");

            System.out.println();//salto de linea


        }


    }
}

