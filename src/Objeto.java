/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sanch
 */
public class Objeto {
   
    protected String Nombre;
    protected int tamano;
    
    public Objeto(String nombre,int tamano){
    this.Nombre=nombre;
    this.tamano=tamano;
    
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    
    public Objeto buscar_Carpeta(String nombre){
        return null;
    }
}
