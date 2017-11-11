/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sanch
 */
public class Archivo_Sistema extends Objeto{
    public String Tipo;
    public Archivo_Sistema(String nombre,int tamano,String tipo){
    super(nombre,tamano);
    this.Tipo=tipo;
    }
}
