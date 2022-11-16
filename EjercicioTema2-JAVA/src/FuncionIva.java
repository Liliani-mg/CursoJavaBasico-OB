
//Crear una función que reciba un precio y devuela el precio con el iva incluido.

import java.util.Scanner;

public class FuncionIva {
    public static void main(String[] args) {
        double iva=0.21;

        Scanner scanner =new Scanner(System.in);
        System.out.println("Introduce un precio: ");
        double precio = scanner.nextDouble();     //precio sin IVA
        double precioConIva;                           //precio con IVA
        precioConIva = calcularIva(precio, iva);

        System.out.println("Precio con IVA: "+precioConIva);

    }
    private static double calcularIva(double precio, double valor) {
        double resultado;
        resultado = precio + precio*valor;
        return resultado;
    }
    }


