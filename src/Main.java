
import java.util.Scanner;

class  Operaciones {

    //EJEMPLOS CON VOID
    public static void Inicio() {
        System.out.println("Inicio de actividad");
    }

    public static void Prueba() {
        System.out.println("Ejemplo de void");
    }

    // EJEMPLOS CON INT
    public static int sumar(int x, int y) {
        return x + y;
    }

    public static int Obtener_Num_Mayor(int x, int y) {
        return (x > y) ? x : y;
    }

    // EJEMPLOS CON Double
    public static double calcular_el_Promedio(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    public static double convertir_Dolares_A_Pesos(double dolares) {
        double tasa = 3940; // 1 USD = 3940 COP
        return dolares * tasa;
    }

    // EJEMPLOS CON String
    public static String saludo_Personalizado(String nombre) {
        return "Como estas? " + nombre + " qué gusto verte por aqui";
    }

    public static String unir_Cadenas(String x1, String x2) {
        return x1 + " " + x2;
    }

    // EJEMPLOS CON Boolean
    public static boolean Par(int numero) {
        return numero % 2 == 0;
    }

    public static boolean Es_mayor_de_edad(int edad) {
        return edad >= 18;
    }

    // MOSTRAR MENU
    public static void Mostrar_Menu() {
        System.out.println("\nMenu de opciones");
        System.out.println("1.inicio void");
        System.out.println("2.prueba void)");
        System.out.println("3. ejemplo 1 (int)");
        System.out.println("4. ejemplo 2(int)");
        System.out.println("5. ejemplo 1(double)");
        System.out.println("6. ejemplo 2(double)");
        System.out.println("7. ejemplo 1(String)");
        System.out.println("8. ejemplo 2(String)");
        System.out.println("9. ejemplo 1(boolean)");
        System.out.println("10.ejemplo 2(boolean)");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // rama inicial
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opciones;

        do {
            Mostrar_Menu();
            opciones = sc.nextInt();
            sc.nextLine();

            switch (opciones) {
                case 1:
                    Inicio();
                    break;
                case 2:
                    Prueba();
                    break;
                case 3:
                    System.out.print("Digite el primer número: ");
                    int x = sc.nextInt();
                    System.out.print("Digite el segundo número: ");
                    int y = sc.nextInt();
                    System.out.println("Resultado: " + sumar(x, y));
                    break;
                case 4:
                    System.out.print("Dijite el primer número: ");
                    int x1 = sc.nextInt();
                    System.out.print("Dijite el segundo número: ");
                    int y1 = sc.nextInt();
                    System.out.println("Mayor: " + Obtener_Num_Mayor(x1, y1));
                    break;
                case 5:
                    System.out.print("Digite el primer número: ");
                    double n1 = sc.nextDouble();
                    System.out.print("Digite el segundo número: ");
                    double n2 = sc.nextDouble();
                    System.out.println("Promedio: " + calcular_el_Promedio(n1, n2));
                    break;
                case 6:
                    System.out.print("Digite la cantidad en dólares: ");
                    double dolares = sc.nextDouble();
                    System.out.println("Esto en pesos colombianos es: " + convertir_Dolares_A_Pesos(dolares));
                    break;
                case 7:
                    System.out.print("Digite cualquier nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println(saludo_Personalizado(nombre));
                    break;
                case 8:
                    System.out.print("Digite la primera cadena: ");
                    String c1 = sc.nextLine();
                    System.out.print("Digite la segunda cadena: ");
                    String c2 = sc.nextLine();
                    System.out.println("Resultado es: " + unir_Cadenas(c1, c2));
                    break;
                case 9:
                    System.out.print("Digite un número: ");
                    int num = sc.nextInt();
                    System.out.println("Es par " + Par(num));
                    break;
                case 10:
                    System.out.print("Digite su edad: ");
                    int edad = sc.nextInt();
                    System.out.println("Mayor de edad " + Es_mayor_de_edad(edad));
                    break;
                case 0:
                    System.out.println("Nos vemos");
                    break;
                default:
                    System.out.println("Opción no válida, saliendo...");
            }
        } while (opciones != 0);

        sc.close();
    }
}