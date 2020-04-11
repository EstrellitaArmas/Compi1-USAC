
package Proyecto1;
/**
 * * @author Estergema
 */
public class SimboloDiseño {
   
    private String id;
    private String nombre; 
    private String pts;
    private String imagen;
    private String tipo;
    
    
    public SimboloDiseño(){
      id="";
      nombre="";
      pts ="";
      imagen="";
      tipo="";
    }
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   ////////////////////////////
    public String getpts() {
        return pts;
    }
   
    public void setpts(String val) {
        this.pts = val;
    }
    ////////////////////
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    /////////////
}
