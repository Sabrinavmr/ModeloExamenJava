import java.util.Scanner;

public class CrearMatriz {
    public static void Ej1y2(double [][] arreglo, Scanner sc){
        /*
          1.Cargar una matriz de números decimales (double) A de tamaño MXN y mostrar
          los datos cargados. El tamaño de la matriz debe ser solicitado e ingresado por
          el usuario, indicando un valor entero para las filas y un valor entero para las
          columnas, el valor mínimo valido debe ser de 3x2, crear la matriz y solicitar los
          valores numéricos para cargar de datos en cada posición. (2 ptos)
          2. Mostrar la matriz resultante por pantalla en formato de matriz (filas y
          columnas)
         */
        for (int i = 0; i <arreglo.length ; i++) {//filas
            for (int j = 0; j <arreglo[0].length ; j++) {//columnas
                System.out.println("Ingrese un valor para la columna: "+(i+1)+", fila: "+(j+1));
                arreglo[i][j]= sc.nextInt();

            }

        }

        //mostrar matriz rellenada
        for (int i = 0; i <arreglo.length ; i++) {//filas
            for (int j = 0; j <arreglo[0].length ; j++) {//columnas
                System.out.print(arreglo[i][j]+" ");

            }
            System.out.println();//salto de linea
        }

        }
}
