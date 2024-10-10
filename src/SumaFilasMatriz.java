public class SumaFilasMatriz {
    public static void Ej3(double[][]arreglo, int M){
        /*
        Generar una nueva matriz de N filas por 1 columna que contenga en cada celda
        de la columna la sumatoria de las celdas de cada una de las filas de la matriz
        cargada en el punto 1
         */

        double[] array = new double[M];
        double suma = 0.0;

        for (int i = 0; i < arreglo.length ; i++) {//filas
            suma=0.0;//reiniciar suma
            for (int j = 0; j <arreglo[0].length ; j++) {//columnas

                suma+= arreglo[i][j];
            }

            array[i] = suma;//guardar suma total de una fila
        }

        //mostrar array con los resultados
        for (int i = 0; i <array.length ; i++) {
            System.out.println("fila "+(i+1)+": "+array[i]);
        }


    }


}

