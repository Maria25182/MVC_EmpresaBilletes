package ModeloArr;

public class Empresa {
   
    private String nombreEmpresa;
    private Pais paisEmpresa;
    private int IDEmpresa;
    
    public Empresa(){
        nombreEmpresa="";
    }

    public Empresa(String nombreEmpresa, Pais paisEmpresa, int IDEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.paisEmpresa = paisEmpresa;
        this.IDEmpresa = IDEmpresa;
    }

    public int getIDEmpresa() {
        return IDEmpresa;
    }

    public void setIDEmpresa(int IDEmpresa) {
        this.IDEmpresa = IDEmpresa;
    }

    

    /**
     * @return the nombreEmpresa
     */
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    /**
     * @param nombreEmpresa the nombreEmpresa to set
     */
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public Pais getPaisEmpresa() {
        return paisEmpresa;
    }

    public void setPaisEmpresa(Pais paisEmpresa) {
        this.paisEmpresa = paisEmpresa;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombreEmpresa=" + nombreEmpresa + '}';
    }


    
}
