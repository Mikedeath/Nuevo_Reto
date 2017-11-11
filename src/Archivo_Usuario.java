/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sanch
 */
public class Archivo_Usuario extends Objeto {
    public String Extension;
    
    public Archivo_Usuario(String nombre,int tamano,String Extension){
    super(nombre,tamano);
    this.Extension=Extension;
    }
    
}
