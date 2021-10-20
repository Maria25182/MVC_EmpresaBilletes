package ModeloArr;

public class Banco {

    private String nombreBanco;
    private String pais;

    public Banco() {
    }

    public Banco(String nombreBanco, String pais) {
        this.nombreBanco = nombreBanco;
        this.pais = pais;
    }

    /**
     * @return the nombreBanco
     */
    public String getNombreBanco() {
        return nombreBanco;
    }

    /**
     * @param nombreBanco the nombreBanco to set
     */
    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombreBanco=" + nombreBanco + ", pais=" + pais + '}';
    }
    

}
