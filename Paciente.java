import java.util.Scanner;

public class Paciente {

    private String nombre;
    private int tipoEnfermedad;
    private int edad;
    private int diasEstancia;

    public Paciente(String nombre, int tipoEnfermedad, int edad, int diasEstancia) {
        this.nombre = nombre;
        this.tipoEnfermedad = tipoEnfermedad;
        this.edad = edad;
        this.diasEstancia = diasEstancia;
    }

    public double calcularCosto() {
        double costoDiario = obtenerCostoDiario();
        double costoTotal = costoDiario * diasEstancia;
        if (edad >= 14 && edad <= 22) {
            costoTotal += costoTotal * 0.1;
        }
        return costoTotal;
    }

    public double obtenerCostoDiario() {
        double costoDiario = 0;
        switch (tipoEnfermedad) {
            case 1:
                costoDiario = 250;
                break;
            case 2:
                costoDiario = 160;
                break;
            case 3:
                costoDiario = 200;
                break;
            case 4:
                costoDiario = 320;
                break;
            case 5:
                costoDiario = 1240;
                break;    
        }
        return costoDiario;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del paciente: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el tipo de enfermedad (1-4): ");
        int tipoEnfermedad = scanner.nextInt();

        System.out.println("Ingrese la edad del paciente: ");
        int edad = scanner.nextInt();

        System.out.println("Ingrese los días de estancia: ");
        int diasEstancia = scanner.nextInt();

        System.out.println("ingresar nombre de hijos");
        int hijos = scanner.nextInt();


        Paciente paciente = new Paciente(nombre, tipoEnfermedad, edad, diasEstancia, hijos);
        double costoTotal = paciente.calcularCosto();

        System.out.println("Recibo de paciente");
        System.out.println("Nombre: " + paciente.nombre);
        System.out.println("Tipo de enfermedad: " + paciente.tipoEnfermedad);
        System.out.println("Edad: " + paciente.edad);
        System.out.println("Días de estancia: " + paciente.diasEstancia);
        System.out.println("Costo total: " + costoTotal);
        System.out.println("nombre de hijos " + paciente.hijos);
    }
}
