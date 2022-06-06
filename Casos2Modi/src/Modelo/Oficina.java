package Modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Oficina {

    private final Caso caso1[] = new Caso[50];
    int ca = 0;
    int Ncaso;
    int tipocaso;
    Scanner Leer = new Scanner(System.in);


    public int getTipocaso() {
        return tipocaso;
    }

    public void setTipocaso(int tipocaso) {
        this.tipocaso = tipocaso;
    }

    public int getNcaso() {
        return Ncaso;
    }

    public void setNcaso(int Ncaso) {
        this.Ncaso = Ncaso;
    }
 
    ArrayList<Caso> listaCaso = new ArrayList();


    public void Introducir_datos() {
        System.out.println("Introduzca el numero de casos: ");
        int numcasos = Leer.nextInt();
        setNcaso(numcasos);
        
        for (int i = 0; i < numcasos; i++) {

            System.out.println("----------|INGRESE LOS DATOS DEL CASO "+(i+1)+" |----------");
            System.out.println("Escriba el codigo del caso: ");
            int codigo = Leer.nextInt();
            System.out.println("-----------------------------------------------");
            System.out.println("Escriba Descripcion del caso: ");
            String DescripCaso = Leer.next();
            System.out.println("-----------------------------------------------");
            System.out.println("Escriba la causa de investigacion: ");
            String Causa = Leer.next();
            System.out.println("-----------------------------------------------");
            System.out.println("Escriba el codigo de prioridad: (A = Minima, B = Media, C = Maxima)");
            String Codigo_Prioridad = Leer.next();
            System.out.println("-----------------------------------------------");
            System.out.println("Escriba el nombre clave: ");
            String nombre_clave = Leer.next();
            System.out.println("-----------------------------------------------");
            System.out.println("----------|INTRODUZCA EL TIPO DE CASO|----------");
            System.out.println("Escriba | 1 = Cybercrimen | , | 2 = Homicidio | , | 3 = Narcoticos | ");
            int tipocaso = Leer.nextInt();
            setTipocaso(tipocaso);
            caso1[i] = new Caso(codigo, DescripCaso, Causa, Codigo_Prioridad, nombre_clave, tipocaso);
            listaCaso.add(caso1[i]);
           
           
        }

    }
    public void imprimirtipocaso(){
         switch (getTipocaso()) {
                case 1:
                    cibercrimen casc = new cibercrimen();
                    casc.Cibercrimen();
                    break;

                case 2:
                    Homicidio casoh = new Homicidio();
                    casoh.Homicidio();
                    break;

                case 3:
                    Narcotico casn = new Narcotico();
                    casn.Narcotico();
                    break;
            }
    }

    public static void Imprimircaso(Caso caso1) {
        System.out.println("----------|DATOS DEL CASO|----------");
        System.out.println("CODIGO DEL CASO = " + caso1.getCodigo());
        System.out.println("----------------------------------");
        System.out.println("DESCRIPCION DEL CASO = " + caso1.getDescripcion_caso());
        System.out.println("----------------------------------");
        System.out.println("CAUSA DE INVESTIGACION = " + caso1.getCausa_investigacion());
        System.out.println("----------------------------------");
        System.out.println("NOMBRE CLAVE = " + caso1.getNombre_clave());
        System.out.println("----------------------------------");
        System.out.println("CODIGO DE PRIORIDAD = " + caso1.getCodigo_prioridad());
        System.out.println("----------------------------------");
    }

    public void mostarInfoCaso() {
        listaCaso.forEach(caso1 -> {
            Imprimircaso(caso1);
        });

    }
    public void Borrarcaso(){
        System.out.println("Escriba cuantos caso desea borrar");
        int B = Leer.nextInt();
        for (int i = 0; i < B; i++) {
            System.out.println("Escriba el codigo del caso que quiere borra:");
            int codigo = Leer.nextInt();
            int indice = listaCaso.indexOf(caso1[i]);
            if (indice != -1) {
                listaCaso.remove(indice);
                System.out.println("++++++++++++++++++++++++++");
                System.out.println("Caso Eliminado");
                System.out.println("++++++++++++++++++++++++++");
            } else {
                System.out.println("++++++++++++++++++++++++++");
                System.out.println("Dato no Encontrado");
                System.out.println("++++++++++++++++++++++++++");
            }
        }  
        }  
}

