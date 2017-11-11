
import java.util.Scanner;

public class Main {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner Op = new Scanner(System.in);
        int x = 1;
        do {

            int Respuesta;
            System.out.println("Elige una opcion");
            System.out.println("1)Archivo de Usuario");
            System.out.println("2)Archivo de Sistema");
            Respuesta = Op.nextInt();

            switch (Respuesta) {

                case 1: {//Archivo de usuario
                    System.out.println("Ingrese Su nombre");
                    String nomb = Op.nextLine();
                    System.out.println("Ingrese el tamano");
                    int tamano = Op.nextInt();
                    System.out.println("Ingrese Extension");
                    String Extension = Op.nextLine();
                    Archivo_Usuario au = new Archivo_Usuario(nomb, tamano, Extension);
                }

                case 2: {// Archivo de Sistema
                    System.out.println("Ingrese Su nombre");
                    String nomb = Op.nextLine();
                    System.out.println("Ingrese el tamano");
                    int tamano = Op.nextInt();
                    System.out.println("Ingrese Tipo");
                    String Tipo = Op.nextLine();
                    Archivo_Sistema as = new Archivo_Sistema(nomb, tamano, Tipo);

                }

                case 3: {
                    x = 0;

                }
            }

        } while (x == 1);
    }
}
