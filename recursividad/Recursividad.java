package datos.unidad1.recursividad;

public class Recursividad {

    public static int sumar(int[] numeros, int posicion) {

        if (posicion == numeros.length) {
            return 0;
        }

        return numeros[posicion] + sumar(numeros, posicion + 1);
    }

    public static void main(String[] args) {

        int[] numeros = {3, 4, 5, 6, 7, 8};

        int resultado = sumar(numeros, 0);

        System.out.println("La suma es: " + resultado);
    }
}