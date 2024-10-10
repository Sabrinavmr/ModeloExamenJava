import java.util.Scanner;

public class CrearMatriz {
    public static void Ej1(double [][] arreglo, Scanner sc){
        for (int i = 0; i <arreglo.length ; i++) {//filas
            for (int j = 0; j <arreglo[0].length ; j++) {//columnas
                System.out.println("Ingrese un valor para la fila: "+(i+1)+", columna: "+(j+1));
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
