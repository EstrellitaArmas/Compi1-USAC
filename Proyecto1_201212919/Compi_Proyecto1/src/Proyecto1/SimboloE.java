
package Proyecto1;
/**
 * * @author Estergema
 */
public class SimboloE {
   
    private String id;
    private String nombre; 
    private String fondo;
   private String ancho; 
    private String alto;
    
    public SimboloE(){
      id="";
      nombre="";
      fondo ="";
      alto="";
      ancho="";
      
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
    public String getfondo() {
        return fondo;
    }
   
    public void setfondo(String fondo) {
        this.fondo = fondo;
    }
    ////////////////////
  public String getancho() {
        return ancho;
    }
   
    public void setancho(String ancho) {
        this.ancho = ancho;
    }
    ///////
    public String getalto() {
        return alto;
    }
   
    public void setalto(String alto) {
        this.alto = alto;
    }
}
