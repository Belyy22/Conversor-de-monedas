import java.util.Scanner;

public class Conversor {
    public static double convertir(double monto, double tasaOrigen, double tasaDestino) {
        return monto * (tasaDestino / tasaOrigen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double usd = 1.0;
        double ars = 900.0;
        double bob = 6.96;
        double brl = 5.1;

        double dolares, cambio = 0;
        String eleccion;
        String respuesta = "";
        String continuar;

        do {
            System.out.println("Escriba la cantidad de dólares que quiere convertir:");
            dolares = sc.nextDouble();
            sc.nextLine();

            System.out.println("Elija a qué moneda cambiar sus dólares:");
            System.out.println("1 - ARS (Peso Argentino)");
            System.out.println("2 - BOB (Boliviano)");
            System.out.println("3 - BRL (Real Brasileño)");

            eleccion = sc.nextLine();

            switch (eleccion) {
                case "1":
                    cambio = ars;
                    respuesta = "Pesos Argentinos";
                    break;
                case "2":
                    cambio = bob;
                    respuesta = "Bolivianos";
                    break;
                case "3":
                    cambio = brl;
                    respuesta = "Reales Brasileños";
                    break;
                default:
                    System.out.println("Opcion no valida, No se realizara la conversion.");
                    cambio = 0;
                    respuesta = "";
            }

            if (cambio != 0) {
                double resultado = convertir(dolares, usd, cambio);
                System.out.printf("%.2f dólares equivalen a %.2f %s%n", dolares, resultado, respuesta);
            }

            System.out.println("¿Desea seguir convirtiendo? (S/N)");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Gracias por usar el conversor");
    }
}