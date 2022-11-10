package Types;

public class Types {

    public static void main(String[] args) {

       /* Para este primer ejercicio tendréis que realizar lo siguiente:

        Crea un proyecto de Java desde 0

        Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.

        Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.

        Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.
        */

        // 1. numericos


        // 1.1 enteros
        byte numero = 5;
        System.out.println("Este es un numero de 1 digito " + numero);
        short numero2 = 10;
        System.out.println("Este es un numero de 2 digitos " + numero2);
        long numero3 = 100;
        System.out.println("Este es un numero de 3 digitos " + numero3);
        long numeroLargo = 666555444;
        System.out.println("Este es un numerp mas largo " + numeroLargo);


        // 1.2 decimales
        float flotante = 5.5f;
        System.out.println("Numero con coma " + flotante);
        double precioEjemplo = 49.99d;
        System.out.println("Numero con doble decimal "+ precioEjemplo);

        // 2. boolean
        boolean booleanTrue = false;
        boolean booleanFalse = true;
        System.out.println("Imprime un booleano " +booleanFalse);

        // 3. text
        char caracter = 'a';
        System.out.println("Imprime un caracter solo " + caracter);
        String texto = "Lorem ipsum dolor sit amet.....";
        System.out.println("Imprime un String "+ texto);
    }
}
