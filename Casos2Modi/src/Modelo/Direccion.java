package Modelo;

import java.util.Scanner;
import java.util.ArrayList;

public class Direccion {

    private String ultidireconocidad; //ultima direcion conocidad
    private String localidad;
    private String ciudad;
    private String departamento;
    private String pais;
    Scanner leer = new Scanner(System.in);

    public Direccion() {
    }

    public Direccion(String ultidireconocidad, String localidad, String ciudad, String departamento, String pais) {
        this.ultidireconocidad = ultidireconocidad;
        this.localidad = localidad;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.pais = pais;
    }

    public String getUltidireconocidad() {
        return ultidireconocidad;
    }

    public void setUltidireconocidad(String ultidireconocidad) {
        this.ultidireconocidad = ultidireconocidad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    ArrayList<Direccion> listaDireccion = new ArrayList();
    Direccion direccion1[] = new Direccion[20];

    public void DatoDireccion() {
        System.out.println("Introduzca el numero de direcciones segun el numero de sospechoso: ");
        int numDire = leer.nextInt();
        for (int i = 0; i < numDire; i++) {

            System.out.println("----------|INGRESE LOS DATOS DEL SOSPECHOSO|----------");
            System.out.println("Ingrese su ultima direcion conocidad: ");
            ultidireconocidad = leer.next();
            setUltidireconocidad(ultidireconocidad);
            System.out.println("Ingrese su localidad: ");
            localidad = leer.next();
            setLocalidad(localidad);
            System.out.println("Ingrese su Ciudad: ");
            ciudad = leer.next();
            setCiudad(ciudad);
            System.out.println("Ingrese su departamento: ");
            departamento = leer.next();
            setDepartamento(departamento);
            System.out.println("Ingrese su pais: ");
            pais = leer.next();
            setPais(pais);
            direccion1[i] = new Direccion(ultidireconocidad, localidad, ciudad, departamento, pais);
            listaDireccion.add(direccion1[i]);
        }
    }

    public static void imprimir4(Direccion direcion1) {
        System.out.println("----------|DIRECCION DEL SOSPECHOSO|----------");
        System.out.println("Su ultima direccion fue: " + direcion1.getUltidireconocidad() + "\n" + "Su localidad es: " + direcion1.getLocalidad() + "\n" + "Su ciudad es: " + direcion1.getCiudad() + "\n" + "Su departamento es: " + direcion1.getDepartamento() + "\n" + "Su pais es: " + direcion1.getPais());
    }

    public void mostraUltiDire() {
        for (Direccion direccion1 : listaDireccion) {
            imprimir4(direccion1);
        }
    }
}
