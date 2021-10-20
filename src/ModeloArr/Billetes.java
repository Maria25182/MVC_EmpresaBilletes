package ModeloArr;



public class Billetes {
    
    private int codigoBillete;
    private double ancho;
    private double alto;
    private String unidadMedida;
    private Materiales material;
    private Empresa fabricante;
    private String banco;
    private String caractLado1;
    private String caractLado2;
    private Pais pais;
    private String valorDenominacion;
    private double valorDolar;
    private int anioEdicion;
    private String elementosSeg;
    private String imagenlado;
    private String imagenLado2;


    public Billetes(){
        
    }

    public Billetes(int codigoBillete, double ancho, double alto, String unidadMedida, Materiales material, Empresa fabricante, String banco, String caractLado1, String caractLado2, Pais pais, String valorDenominacion, double valorDolar, int anioEdicion, String elementosSeg,String imagenlado,String imagenLado2) {
        this.codigoBillete = codigoBillete;
        this.ancho = ancho;
        this.alto = alto;
        this.unidadMedida = unidadMedida;
        this.material = material;
        this.fabricante = fabricante;
        this.banco= banco;
        this.caractLado1 = caractLado1;
        this.caractLado2 = caractLado2;
        this.pais = pais;
        this.valorDenominacion = valorDenominacion;
        this.valorDolar = valorDolar;
        this.anioEdicion = anioEdicion;
        this.elementosSeg = elementosSeg;
        this.imagenlado = imagenlado;
        this.imagenLado2 = imagenLado2;
    }

    public String getImagenlado() {
        return imagenlado;
    }

    public void setImagenlado(String imagenlado) {
        this.imagenlado = imagenlado;
    }

    public String getImagenLado2() {
        return imagenLado2;
    }

    public void setImagenLado2(String imagenLado2) {
        this.imagenLado2 = imagenLado2;
    }



    public String getElementosSeg() {
        return elementosSeg;
    }

    public void setElementosSeg(String elementosSeg) {
        this.elementosSeg = elementosSeg;
    }

   
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public int getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }
 
    /**
     * @return the codigoBillete
     */
    public int getCodigoBillete() {
        return codigoBillete;
    }

    /**
     * @param codigoBillete the codigoBillete to set
     */
    public void setCodigoBillete(int codigoBillete) {
        this.codigoBillete = codigoBillete;
    }

    /**
     * @return the ancho
     */
    public double getMedidaLado1() {
        return ancho;
    }

    /**
     * @param medidaLado1 the ancho to set
     */
    public void setMedidaLado1(double medidaLado1) {
        this.ancho = medidaLado1;
    }

    /**
     * @return the alto
     */
    public double getMedidaLado2() {
        return alto;
    }

    /**
     * @param medidaLado2 the alto to set
     */
    public void setMedidaLado2(double medidaLado2) {
        this.alto = medidaLado2;
    }

  
    public String getUnidadMedida() {
        return unidadMedida;
    }

  
    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

  
    public String getCaractLado1() {
        return caractLado1;
    }

    public void setCaractLado1(String caractLado1) {
        this.caractLado1 = caractLado1;
    }

  
    public String getCaractLado2() {
        return caractLado2;
    }

  
    public void setCaractLado2(String caractLado2) {
        this.caractLado2 = caractLado2;
    }

    public Materiales getMaterial() {
        return material;
    }

    public void setMaterial(Materiales material) {
        this.material = material;
    }

    public Empresa getFabricante() {
        return fabricante;
    }

    public void setFabricante(Empresa fabricante) {
        this.fabricante = fabricante;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

 

    public Pais getPais() {
        return pais;
    }


    public void setPais(Pais pais) {    
        this.pais = pais;
    }

    public String getValorDenominacion() {
        return valorDenominacion;
    }

    
    public void setValorDenominacion(String valorDenominacion) {
        this.valorDenominacion = valorDenominacion;
    }

    public double getValorDolar() {
        return valorDolar;
    }

    /**
     * @param valorDolar the valorDolar to set
     */
    public void setValorDolar(double valorDolar) {
        this.valorDolar = valorDolar;
    }

    @Override
    public String toString() {
        return "Billetes{" + "codigoBillete=" + codigoBillete + 
                ", \"\nancho=" + ancho + 
                ",  \"\nalto=" + alto + 
                ",  \"\nunidadMedida=" + unidadMedida +
                ",  \"\nmaterial=" + material + 
                ",  \"\nfabricante=" + fabricante +
                ",  \"\nbanco=" + banco + 
                ",  \"\ncaractLado1=" + caractLado1 + 
                ", \"\ncaractLado2=" + caractLado2 +
                ", \"\npais=" + pais +
                ",  \"\nvalorDenominacion=" + valorDenominacion +
                ",  \"\nvalorDolar=" + valorDolar +
                ",  \"\nanioEdicion=" + anioEdicion +
                ",  \"\nelementosSeg=" + elementosSeg + '}';
    }

    
    
    
    
}
