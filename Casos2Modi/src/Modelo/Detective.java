package Modelo;

import java.util.Scanner;
import java.util.ArrayList;

public class Detective {

    private int no_identificacion;
    private String nombres;
    private String apellidos;
    private int año_experiencia;
    private int especializado;
    Scanner leer = new Scanner(System.in);

    public Detective() {
    }

    public Detective(int no_identificacion, String nombres, String apellidos, int año_experiencia, int especializado) {
        this.no_identificacion = no_identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.año_experiencia = año_experiencia;
        this.especializado = especializado;
    }

    public int getEspecializado() {
        return especializado;
    }

    public void setEspecializado(int especializado) {
        this.especializado = especializado;
    }

    public int getNo_identificacion() {
        return no_identificacion;
    }

    public void setNo_identificacion(int no_identificacion) {
        this.no_identificacion = no_identificacion;
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

    public int getAño_experiencia() {
        return año_experiencia;
    }

    public void setAño_experiencia(int año_experiencia) {
        this.año_experiencia = año_experiencia;
    }
    ArrayList<Detective> listadDetectives = new ArrayList();
    Detective detective1[] = new Detective[50];

    public void DatosDetectives() {
        System.out.println("Introduzca el numero de dectectives: ");
        int numDect = leer.nextInt();
        for (int i = 0; i < numDect; i++) {

            System.out.println("----------|INGRESE DATOS DEL DETECTIVE|----------");
            System.out.println("Ingrese su numero de identificaion: ");
            no_identificacion = leer.nextInt();
            setNo_identificacion(no_identificacion);
            System.out.println("Ingrese su nombre: ");
            nombres = leer.next();
            setNombres(nombres);
            System.out.println("Ingrese su Apellido: ");
            apellidos = leer.next();
            setApellidos(apellidos);
            System.out.println("Ingrese cuantos años de experiencia tiene: ");
            año_experiencia = leer.nextInt();
            setAño_experiencia(año_experiencia);
            System.out.println("Ingrese la especializacion opcion (1, 2 o 3) ( 1 = Homicidio, 2 = Cybercrimen, 3 = Narcotico): ");
            int especiali = leer.nextInt();
            setEspecializado(especiali);
            detective1[i]=new Detective(no_identificacion, nombres, apellidos, año_experiencia, especializado);
            listadDetectives.add(detective1[i]);
        }
    }

    public void imprimirEspecia() {
        switch (getEspecializado()) {
            case 1:
                System.out.println("Detective especializado en caso de Homicidio");
                break;

            case 2:
                System.out.println("Detective especializado en caso de Cybercrimen");
                break;

            case 3:
                System.out.println("Detective especializado en caso de Narcotico");
                break;
        }
    }

    public static void imprimir2(Detective detective1) {
        System.out.println("----------|DATOS DEL DETECTIVE|----------");
        System.out.println("Su numero de identificacion es: " + detective1.getNo_identificacion() + "\n" + "Su nombre es: " + detective1.getNombres() + "\n" + "Su apellido es: " + detective1.getApellidos() + "\n" + "Tienes " + detective1.getAño_experiencia() + " años de experiencia");

    }

    public void mostarInfoDectectives() {
        for (Detective detective1 : listadDetectives) {
            imprimir2(detective1);
            imprimirEspecia();
            
        }
    }

}
