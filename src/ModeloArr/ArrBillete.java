/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloArr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author M
 */
public class ArrBillete {

    Billetes[] ArrBilletes;
    public int posAct;
    private String img1;
    private String img2;

    public ArrBillete() {
        ArrBilletes = new Billetes[20];
        this.posAct = 0;
        this.img1=  "c:/";
        this.img2= "c:/";
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public Billetes[] getArrBilletes() {
        return ArrBilletes;
    }

    public int getPosAct() {
        return posAct;
    }
    public void cargarimagenes() {
   try{

            File rutaOriginalFichero = new File("C:\\carpeta1\\img.txt");

            File rutaDestinoFichero = new File("C:\\carpeta2\\img2.txt");

            boolean estatus = rutaOriginalFichero.renameTo(rutaDestinoFichero);

            if (!estatus) {

                System.out.println("Error no se ha podido mover el  archivo del directorio");

           }else{

                System.out.println("Se movió el archivo del directorio exitosamente");

           }

        }catch(Exception e){

           System.out.println(e);

        }

    }
    
    public void insertarBilletes(Billetes Billete) {

        this.ArrBilletes[this.posAct] = Billete;
        this.posAct++;

    }
     public String optionList(String[] options, String mensaje, String mensajebarra) {
        String input = (String) JOptionPane.showInputDialog(null,
                mensaje,
                mensajebarra,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
        return (input);
        //El return retorna el dato que se encuentra en el String option
        //En caso de que se necesite un objeto dentro de un arreglo, con el return de este método se debe invocar el método Buscar de un arreglo
    }//FIN OPTIONLIST
 
     public Billetes[] obtenerArreglo(){
         return ArrBilletes;
     }
     
     
 
 public String[] getArrNombres(){
       String[] arreglo = new String[posAct];
       for (int i = 0; i<arreglo.length;i++){
           arreglo[i] = this.ArrBilletes[i].getBanco().toString();
       }
       return arreglo;
 }

    //retorna el billete, segun el nombre enviado como parametro
    public Billetes buscarBillete(int codigo) {
        for (int i = 0; i < ArrBilletes.length; i++) {
            Billetes billete = ArrBilletes[i];
            if (billete.getCodigoBillete() == codigo) {
                return billete ;//salir del ciclo
            }
        }
        return null;
    }
    
    public int getIndexBillete(int codigo) {
        for (int i = 0; i < ArrBilletes.length; i++) {
            Billetes billete = ArrBilletes[i];
            if (billete.getCodigoBillete() == codigo) {
                return i ;//salir del ciclo
            }
        }
        return 0;
    }
    
    public void eliminar(int pos){
        if ((pos>=0) && (pos<posAct)){
            for (int i = pos; i < posAct; i++) {
                ArrBilletes[i] = ArrBilletes[i+1];
            }
            posAct--;
        }
            
    }


//    public boolean modificarBillete(String nombre, Billetes billete, ArrBillete Arrbill) {
//    
//        int pos = this.buscarBilletes(nombre);
//        if (pos != -1) {
//            this.ArrBilletes[pos] = billete; //reemplazo la posicion de la empresa anterior por la nueva
//            return true;
//        }
//       return false;
//    }

    public String listarBilletes() {
        String datos = "";//billete registrados ir guardando 
        for (int i = 0; i < ArrBilletes.length; i++) {
            Billetes billete = ArrBilletes[i];
            if (billete == null) { // 0 siempre y tenga datos conitnua
                continue;//salir del ciclo
            }
            //codigo, ancho, alto, unidad, materi, empres, banc, caract1, caract2, pai, denominacion, dolar, anio, elemSeguri
            //lo que ya tenia + 0) Tipo: 
            datos = datos + "\nNúmero Billete: " + (i + 1)
                    + "\nCódigo: " + billete.getCodigoBillete()
                    + "\nAncho: " + billete.getAncho()
                    + "\nAlto: " + billete.getAlto()
                    + "\nUnidad de Medida: " + billete.getUnidadMedida()
                    + "\nMateria: " + billete.getMaterial()
                    + "\nFabricante: " + billete.getFabricante()
                    + "\nBanco Emisor: " + billete.getBanco()
                    + "\nCaracteristica Lado 1: " + billete.getCaractLado1()
                    + "\nCaracteristica Lado 2: " + billete.getCaractLado2()
                    + "\nPais: " + billete.getPais()
                    + "\nDenominación: " + billete.getValorDenominacion()
                    + "\nValor en Dolar: " + billete.getValorDolar() + " dolares"
                    + "\nAño de Edición: " + billete.getAnioEdicion()
                    + "\nElementos de Seguridad: " + billete.getElementosSeg();
            
////                    +"\nImagenLado1: " + bil;lete.getImagenlado()
//                     +"\nImagenLado2: " + billete.getImagenLado2()
                    
          

        }
        return datos;
    }



}
