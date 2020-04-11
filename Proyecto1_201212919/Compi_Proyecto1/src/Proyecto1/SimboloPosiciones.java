
package Proyecto1;
/**
 * * @author Estergema
 */
public class SimboloPosiciones {
   
    private String id;
    private String nombre; 
    private String vida;
    private String posix;
    private String posiy;
    private String posfx;
    private String posfy;
    
    public SimboloPosiciones(){
      id="";
      nombre="";
      posix ="";
      posiy="";
      posfx=""; 
      posfy=""; 
    }
    
  
     
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    ////////////////////////////
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   ////////////////////////////
      public String getposix() {
       return posix;
    }
    public void setposix(String ix) {
        this.posix = ix;
    }
    ////////////////////////////////
    public String getposiy() {
        return posiy;
    }
   
    public void setposiy(String iy) {
        this.posiy = iy;
    }
    ///////////////////
    public String getposfx() {
        return posfx;
    }
    public void setposfx(String fx) {
        this.posfx = fx;
    }
    /////////////
    public String getposfy() {
        return posfy;
    }
    public void setposfy(String fy) {
        this.posfy = fy;
    }
}
