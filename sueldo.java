import java.util.Scanner;

public class sueldo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el RFC del empleado: ");
        String rfc = scanner.nextLine();

        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el sueldo actual del empleado: ");
        int sueldoActual = scanner.nextInt();

        // Obtenemos el rango del empleado
        int rango = ObtenerRango(sueldoActual);

        // Obtenemos el aumento del sueldo
        int aumento = ObtenerAumento(rango);

        // Calculamos el nuevo sueldo
        int sueldoNuevo = sueldoActual + aumento;

        // Calculamos el porcentaje de aumento
        float porcentajeAumento = (aumento * 100) / sueldoActual;

        // Imprimimos el resultado
        System.out.println("El nuevo sueldo del empleado es: " + sueldoNuevo);
        System.out.println("El porcentaje de aumento fue de: " + porcentajeAumento + "%");
    }

    private static int ObtenerRango(int sueldoActual) {
        int rango = 0;

        if (sueldoActual <= 10000) {
            rango = 1;
        } else if (sueldoActual <= 20000) {
            rango = 2;
        } else if (sueldoActual <= 30000) {
            rango = 3;
        } else if (sueldoActual <= 40000) {
            rango = 4;
        } else {
            rango = 5;
        }

        return rango;
    }

    private static int ObtenerAumento(int rango) {
        int aumento = 0;

        switch (rango) {
            case 1:
                aumento = 500;
                break;
            case 2:
                aumento = 700;
                break;
            case 3:
                aumento = 1000;
                break;
            case 4:
                aumento = 1500;
                break;
            case 5:
                aumento = 2000;
                break;
        }

        return aumento;
    }
}