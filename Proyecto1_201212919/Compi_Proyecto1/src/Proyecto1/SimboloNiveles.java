
package Proyecto1;
/**
 * * @author Estergema
 */
public class SimboloNiveles {
   
    private String id;
    private String nombre; 
    private String orden;
    
    public SimboloNiveles(){
      id="";
      nombre="";
      orden ="";
    }
    
    
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    
    public String getNombre() {
        return nombre;
    }
   
   ////////////////////////////
    public void setOrden(String orden) {
        this.orden = orden;
    }
    
    public String getOrden() {
        return orden;
    }
   
    
    ////////////////////
   
}
