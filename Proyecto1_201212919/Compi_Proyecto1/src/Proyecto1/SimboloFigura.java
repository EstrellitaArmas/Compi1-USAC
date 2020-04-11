
package Proyecto1;
/**
 * * @author Estergema
 */
public class SimboloFigura {
   
    private String id;
    private String nombre; 
    private String vida;
    private String imagen;
    private String tipo;
    private String destruye;
    private String descripcion;
    
    public SimboloFigura(){
      id="";
      nombre="";
      vida ="";
      imagen="";
      tipo=""; 
      descripcion=""; 
    }
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
      public String getdestruye() {
        return destruye;
    }
    public void setdestruye(String destruye) {
        this.destruye = destruye;
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
    public String getdescripcion() {
        return descripcion;
    }
   
    public void setdescripcion(String val) {
        this.descripcion = val;
    }
    ////////////////////
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    /////////////
    public String getVida() {
        return vida;
    }
    public void setVida(String vida) {
        this.vida = vida;
    }
}
