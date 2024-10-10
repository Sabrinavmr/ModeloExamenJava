import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ejercicios(sc);


    }

    public static void Ejercicios(Scanner sc) {
        /*
        Cargar una matriz de números decimales (double) A de tamaño MxN y mostrar
        los datos cargados. El tamaño de la matriz debe ser solicitado e ingresado por
        el usuario, indicando un valor entero para las filas y un valor entero para las
        columnas, el valor mínimo valido debe ser de 3x2, crear la matriz y solicitar los
        valores numéricos para cargar de datos en cada posición.
         */

        //definir arreglo
        double[][] matriz;
        int M, N = 0;
        do {
            //pedir datos al usuario
            System.out.println("Ingrese numero de filas:");
            M = sc.nextInt();
            System.out.println("Ingrese numero de columnas");
            N = sc.nextInt();

            if (M < 3) {
                System.out.println("Ingrese para filas un numero mayor o igual a 3");

            } else if (N < 2) {
                System.out.println("Ingrese para columnas un numero mayor o igual a 2");
            }

        } while (M < 3 || N < 2);

        //guardar valores en la matriz
        matriz = new double[M][N];

        //llamamos metodo Crear Matriz
        CrearMatriz.Ej1y2(matriz, sc);

        //metodo Ejercicio 3
        SumaFilasMatriz.Ej3y4(matriz,M);

        //ejercicio 5
        /*
        Generar una nueva matriz de tamaño N filas por 2 columnas donde la primer
        columna contenga los valores calculados en el punto 3 pero ordenados de
        Mayor a Menor, y en la segunda columna asignar el valor de la fila que poseía
        originalmente en la matriz del punto 3
         */
        E5.MatrizNueva_MatrizE3(matriz,N);




    }
}