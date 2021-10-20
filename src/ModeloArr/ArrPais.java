/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloArr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author M
 */
public class ArrPais {

    Pais[] ArrPais;
    private int tam;
    private int posAct;
    private String nomArchivo;

    public ArrPais() {
        ArrPais = new Pais[500];
        this.posAct = 0;
        this.nomArchivo = "c:/paises.txt";
    }

    public Pais[] getArrPais() {
        return ArrPais;
    }

    public int getTam() {
        return tam;
    }

    public int getPosAct() {
        return posAct;
    }

    public void insertarPAIS(Pais pais) {
        this.ArrPais[posAct] = pais;
        this.posAct++;

    }

    public String getNomArchivo() {
        return nomArchivo;
    }

    public void setNomArchivo(String nomArchivo) {
        this.nomArchivo = nomArchivo;
    }

    public void asignarPaises() {

        FileReader fr;
        String linea = "";
        String[] datPais;
        try {
//
            fr = new FileReader(this.nomArchivo);
            BufferedReader bf = new BufferedReader(fr);

            while ((linea = bf.readLine()) != null) {
                datPais = linea.split(",");
                this.insertarPAIS(new Pais(datPais[0], datPais[1], datPais[2]));

            }

            fr.close();
        } catch (IOException e) {

        }

    }//fin asignar

    public void cargarpaises() {
        Pais objPais = new Pais();
        objPais.setPais("Ecuador");
        objPais.setISO2("EC");
        objPais.setISO3("ECU");

        //this es para señalar que el método a invocar es de la misma clase donde es invocado
        this.insertarPAIS(objPais);

        objPais = new Pais();
        objPais.setPais("Alemania");
        objPais.setISO2("DE");
        objPais.setISO3("DEU");

        this.insertarPAIS(objPais);

        objPais = new Pais();
        objPais.setPais("Argentina");
        objPais.setISO2("AR");
        objPais.setISO3("ARG");

        this.insertarPAIS(objPais);
        objPais = new Pais();
        objPais.setPais("Portugal");
        objPais.setISO2("PT");
        objPais.setISO3("PRT");

        this.insertarPAIS(objPais);
        objPais = new Pais();
        objPais.setPais("Perú");
        objPais.setISO2("PE");
        objPais.setISO3("PER");

        this.insertarPAIS(objPais);
    }

    public int buscarPais(String nompais) {
        int cont = 0;
        while (!nompais.equals(this.ArrPais[cont].getPais())) {
            cont++;
        }
        if (this.ArrPais[cont] != null) {
            return cont;
        } else {
            return -1;
        }
    }//fin buscar

    public void eliminarPais(String nomaterial) {
        Pais[] Aux = new Pais[this.ArrPais.length];
        int posTem = this.buscarPais(nomaterial);
        this.ArrPais[buscarPais(nomaterial)] = null;

        this.posAct--;

        while ((this.ArrPais[this.posAct] != null) && ((this.posAct + 1) < this.ArrPais.length)) {
            this.ArrPais[this.posAct] = Aux[this.posAct + 1];
        }
    }// FIN ELIMINAR

//         
//          public void ModificarPais(int pos, cPais pais){
//     this.ArrPais[pos]= pais;
//     
//     
// }
    public String[] getArrNombres() {
        String[] arreglo = new String[posAct];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = this.ArrPais[i].getPais();
        }
        return arreglo;
    }

    public String mostrarArreglo() {
        String cadena = "";
        for (int i = 0; i < this.posAct; i++) {
            cadena = cadena + ArrPais[i].toString() + "\n";
        }
        return cadena;
    }

}//fin

