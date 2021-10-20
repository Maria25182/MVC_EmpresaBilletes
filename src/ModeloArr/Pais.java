package ModeloArr;

public class Pais {
    
    private String pais;
    private String ISO2;
    private String ISO3;
  

    public Pais(){
        
    }

    public Pais(String pais, String ISO2, String ISO3) {
        this.pais = pais;
        this.ISO2 = ISO2;
        this.ISO3 = ISO3;
    
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

    /**
     * @return the ISO2
     */
    public String getISO2() {
        return ISO2;
    }

    /**
     * @param ISO2 the ISO2 to set
     */
    public void setISO2(String ISO2) {
        this.ISO2 = ISO2;
    }

    /**
     * @return the ISO3
     */
    public String getISO3() {
        return ISO3;
    }

    /**
     * @param ISO3 the ISO3 to set
     */
    public void setISO3(String ISO3) {
        this.ISO3 = ISO3;
    }

    @Override
    public String toString() {
        return "Pais{" + "pais=" + pais + ", ISO2=" + ISO2 + ", ISO3=" + ISO3 + '}';
    }
    
    
    
}
