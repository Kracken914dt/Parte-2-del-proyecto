package Vista;

import Modelo.*;
import java.util.ArrayList;
import java.util.Scanner;

public class VistaCasos {

    public static void main(String[] args) {

        Oficina caso1 = new Oficina();
        Anotacion anotacion1 = new Anotacion();
        Detective detective1 = new Detective();
        Sospechoso sospechoso1 = new Sospechoso();
        Direccion direccion1 = new Direccion();
        int Opciones;

        do {

            System.out.println("----------|MENU|----------");
            System.out.println("1 Introducir datos");
            System.out.println("2 Consultar casos");
            System.out.println("3 Editar casos");
            System.out.println("4 Eliminar casos");
            System.out.println("5 Consultar datos del detective");
            System.out.println("6 Consultar datos del Sospechoso");
            System.out.println("7 Salir");
            System.out.println("-------------------------------------");
            System.out.println("Elija una opcion");
            Scanner Leer = new Scanner(System.in);
            Opciones = Leer.nextInt();
            switch (Opciones) {
                case 1:
                    System.out.println("----------|MENU|----------");
                    System.out.println("1 Introducir datos del caso");
                    System.out.println("2 Introducir datos del detective");
                    System.out.println("3 Introducir datos del sospechoso");
                    System.out.println("4 Salir");
                    System.out.println("Elija una opcion");
                    int Opciones2 = Leer.nextInt();
                    if (Opciones2 == 1) {
                        System.out.println("1 Introducir datos del caso");
                        caso1.Introducir_datos();
                        anotacion1.PedirObservaciones();
                    } else {
                        if (Opciones2 == 2) {
                            System.out.println("1 Introducir datos del detective");
                            detective1.DatosDetectives();

                        } else {
                            if (Opciones2 == 3) {
                                System.out.println("2 Introducir datos del sospechoso");
                                sospechoso1.DatoSospechoso();
                                direccion1.DatoDireccion();

                            } else {
                                if (Opciones2 == 4) {
                                    System.out.println("Salir");
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 2:

                    caso1.mostarInfoCaso();
                    caso1.imprimirtipocaso();
                    anotacion1.mostarInfoAnota();
                    break;

                case 3:
                    System.out.println("3 Editar casos");
                    break;

                case 4:
                    System.out.println("Eliminar casos");
                    caso1.Borrarcaso();
                    break;

                case 5:
                    detective1.mostarInfoDectectives();
                    detective1.imprimirEspecia();

                    break;

                case 6:
                    sospechoso1.mostarInfoSospechoso();
                    direccion1.mostraUltiDire();
                    break;

                case 7:
                    break;
            }

        } while (Opciones != 7);

    }

}
