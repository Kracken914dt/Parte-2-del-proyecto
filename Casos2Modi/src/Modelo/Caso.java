package Modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Caso extends Oficina{

    private int Codigo;
    private String Descripcion_caso;
    private String Causa_investigacion;
    private String Codigo_prioridad;
    private String Nombre_clave;
    private int TipoCaso;
    private Detective dectectives;

    public Caso() {
    }

    public Caso(int Codigo, String Descripcion_caso, String Causa_investigacion, String Codigo_prioridad, String Nombre_clave, int TipoCaso) {
        this.Codigo = Codigo;
        this.Descripcion_caso = Descripcion_caso;
        this.Causa_investigacion = Causa_investigacion;
        this.Codigo_prioridad = Codigo_prioridad;
        this.Nombre_clave = Nombre_clave;
        this.TipoCaso = TipoCaso;
    }

    Scanner Leer = new Scanner(System.in);

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion_caso() {
        return Descripcion_caso;
    }

    public void setDescripcion_caso(String Descripcion_caso) {
        this.Descripcion_caso = Descripcion_caso;
    }

    public String getCausa_investigacion() {
        return Causa_investigacion;
    }

    public void setCausa_investigacion(String Causa_investigacion) {
        this.Causa_investigacion = Causa_investigacion;
    }

    public String getCodigo_prioridad() {
        return Codigo_prioridad;
    }

    public void setCodigo_prioridad(String Codigo_prioridad) {
        this.Codigo_prioridad = Codigo_prioridad;
    }

    public String getNombre_clave() {
        return Nombre_clave;
    }

    public void setNombre_clave(String Nombre_clave) {
        this.Nombre_clave = Nombre_clave;

    }

    public int getTipoCaso() {
        return TipoCaso;
    }

    public void setTipoCaso(int TipoCaso) {
        this.TipoCaso = TipoCaso;
    }
    
}
