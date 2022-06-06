package Modelo;

import java.util.Scanner;

public class Narcotico extends Caso {

    private String Caso_Narcotico;
    Scanner Leer = new Scanner(System.in);

    public Narcotico() {
    }

    public Narcotico(String Caso_Narcotico) {
        this.Caso_Narcotico = Caso_Narcotico;
    }

    public String getCaso_Narcotico() {
        return Caso_Narcotico;
    }

    public void setCaso_Narcotico(String Caso_Narcotico) {
        this.Caso_Narcotico = Caso_Narcotico;
    }

    public Scanner getLeer() {
        return Leer;
    }

    public void setLeer(Scanner Leer) {
        this.Leer = Leer;
    }
    
    public void Narcotico() {
        System.out.println("Narcotico");
        System.out.println("se registra adicionalmente si es un caso local, estatal o federal");         
    }

}
