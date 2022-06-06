package Modelo;

import java.util.Scanner;

public class cibercrimen extends Caso {

    private String Caso_Cybercrimen;
    Scanner Leer = new Scanner(System.in);

    public cibercrimen() {
    }

    public cibercrimen(String Caso_Cybercrimen) {
        this.Caso_Cybercrimen = Caso_Cybercrimen;
    }

    
    

    public String getCaso_Cybercrimen() {
        return Caso_Cybercrimen;
    }

    public void setCaso_Cybercrimen(String Caso_Cybercrimen) {
        this.Caso_Cybercrimen = Caso_Cybercrimen;
    }

    public Scanner getLeer() {
        return Leer;
    }

    
    public void Cibercrimen() {
        System.out.println("Cibercrimen");
        System.out.println("Se adiciona la línea de cibercrimen asociada (robo de identidad, robo de información, fraudes por internet, etc).");  
    }

}
