package ModeloArr;

public class Materiales {

    //Hibrido o Simple
    private String nombreMaterial;
    
    //Descripción del material
    private String descripcion;
    private int ID;
    
    /*
    
    Leer capitulo 3 
        Explicacion teorica de los metodos
        Ejercicios resueltos 
    */

    public Materiales(String nombreMaterial, String descripcion, int ID) {
        this.nombreMaterial = nombreMaterial;
        this.descripcion = descripcion;
        this.ID = ID;
    }
    
    

    public Materiales() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

   

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Materiales{" + "nombreMaterial=" + nombreMaterial +  '}';
    }

    
  
    
    
    
    
}
