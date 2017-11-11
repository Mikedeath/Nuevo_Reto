
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sanch
 */
public class Directorio extends Objeto {

   
  private String Permisos;
  private ArrayList<Objeto> Arreglo;
  
  public Directorio(String nombre,int tamano,String Permisos,ArrayList<Objeto> Arreglo){
  super(nombre, tamano);
  this.Arreglo=Arreglo;
  this.Permisos=Permisos;
  }
   public String getPermisos() {
        return Permisos;
    }

    public void setPermisos(String Permisos) {
        this.Permisos = Permisos;
    }

    public ArrayList<Objeto> getArreglo() {
        return Arreglo;
    }

    public void setArreglo(ArrayList<Objeto> Arreglo) {
        this.Arreglo = Arreglo;
    }
     public Objeto buscar_Carpeta(String nombre)
    {
        if(nombre.equals(this.Nombre))
            return this;
        
        if(this.Arreglo == null)
            return null;
        else
        {
            for(int i = 0; i < Arreglo.size(); i++)
            {
                Objeto tmp = Arreglo.get(i);
                tmp = tmp.buscar_Carpeta(nombre);
                if(tmp != null)
                    return tmp;
            }
        }
        
        return null;
    }
    
   
    
  
}
