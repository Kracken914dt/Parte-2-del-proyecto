package Modelo;

import java.util.Scanner;

public class Homicidio extends Caso {
    private String Caso_Homicidio;
    Scanner Leer = new Scanner(System.in);

    public Homicidio() {
    }

    public Homicidio(String Caso_Homicidio) {
        this.Caso_Homicidio = Caso_Homicidio;
    }

    public String getCaso_Homicidio() {
        return Caso_Homicidio;
    }

    public void setCaso_Homicidio(String Caso_Homicidio) {
        this.Caso_Homicidio = Caso_Homicidio;
    }
    public void Homicidio(){
        System.out.println("Homicidio");
        System.out.println("Se registra adicionalmente un segundo detective, que es el encargado de realizar tareas secundarias como interrogatorios, análisis de pruebas, etc.)");
    }
            
  
}