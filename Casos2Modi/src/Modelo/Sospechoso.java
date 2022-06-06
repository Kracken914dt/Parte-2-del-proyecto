package Modelo;

import java.util.Scanner;
import java.util.ArrayList;

public class Sospechoso {

    private int noID;
    private String nombres;
    private String apellidos;
    private int edad;
    private String descripcionFisica;
    Scanner leer = new Scanner(System.in);

    public Sospechoso() {
    }

    public Sospechoso(int noID, String nombres, String apellidos, int edad, String descripcionFisica) {
        this.noID = noID;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.descripcionFisica = descripcionFisica;
    }

    public int getNoID() {
        return noID;
    }

    public void setNoID(int noID) {
        this.noID = noID;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDescripcionFisica() {
        return descripcionFisica;
    }

    public void setDescripcionFisica(String descripcionFisica) {
        this.descripcionFisica = descripcionFisica;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    ArrayList<Sospechoso> listaspSospechoso = new ArrayList();
    Sospechoso sospechoso1[] = new Sospechoso[50];

    public void DatoSospechoso() {
        System.out.println("Introduzca cuantos sospechosos quiere resgistrar: ");
        int numSospe = leer.nextInt();
        for (int i = 0; i < numSospe; i++) {

            System.out.println("----------|INGRESE LOS DATOS DEL SOSPECHOSO|----------");
            System.out.println("Ingrese su numero de id: ");
            noID = leer.nextInt();
            setNoID(noID);
            System.out.println("Ingrese su nombre: ");
            nombres = leer.next();
            setNombres(nombres);
            System.out.println("Ingrese su Apellido: ");
            apellidos = leer.next();
            setApellidos(apellidos);
            System.out.println("Ingrese su edad: ");
            edad = leer.nextInt();
            setEdad(edad);
            sospechoso1[i]=new Sospechoso(noID, nombres, apellidos, edad, descripcionFisica);
            listaspSospechoso.add(sospechoso1[i]);
        }

    }

    public static void imprimir3(Sospechoso sospechoso1) {
        System.out.println("----------|DATOS DEL SOSPECHOSO|----------");
        System.out.println("Su id es: " + sospechoso1.getNoID() + "\n" + "Su nombre es: " + sospechoso1.getNombres() + "\n" + "Su apellido es: " + sospechoso1.getApellidos() + "\n" + "Su edad es: " + sospechoso1.getEdad());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public void mostarInfoSospechoso() {
        for (Sospechoso sospechoso1 : listaspSospechoso) {
            imprimir3(sospechoso1);

        }
    }

    public void obtenerfoto() {
    }

}
