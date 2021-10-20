/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloArr;

import Vista.MenuAdmin;
import javax.swing.JOptionPane;

/**
 *
 * @author M
 */
public class ArrMateriales {

    Materiales[] ArrMateriales;
    private int tam;
    public int posAct;

    public ArrMateriales() {
        ArrMateriales = new Materiales[100];
        this.posAct = 0;
    }

    public int getPosAct() {
        return posAct;
    }

    public Materiales[] getArrMateriales() {
        return ArrMateriales;
    }

    public void insertarMaterial(Materiales materiales) {

        this.ArrMateriales[this.posAct] = materiales;
        this.posAct++;

    }

    public void cargarMateriales() {
        //Asignar identificador al objeto y crear nueva instancia
        Materiales Material = new Materiales();
        //Asignar valores al atributo del objeto
        Material.setNombreMaterial("Papel normal");
        this.insertarMaterial(Material);

        //crear nueva instancia del objeto
        Material = new Materiales();
        //Asignar valores a la nueva instancia atributo del objeto
        Material.setNombreMaterial("Papel Algodon");
        this.insertarMaterial(Material);

        //crear nueva instancia del objeto
        Material = new Materiales();
        //Asignar valores a la nueva instancia atributo del objeto
        Material.setNombreMaterial("Papel Polimero");
        this.insertarMaterial(Material);
    }

    public int buscarmaterial(String nomaterial) {
        int cont = 0;
        while (!nomaterial.equals(this.ArrMateriales[cont].getNombreMaterial())) {
            cont++;
        }
        if (this.ArrMateriales[cont] != null) {
            return cont;
        } else {
            return -1;
        }
    }//Fin buscar Material
//           public void eliminarMaterial(String nomaterial) {
//        cMateriales [] Aux = new cMateriales[this.ArrMateriales.length];
//         int posTem =this.buscarmaterial(nomaterial);
//        this.ArrMateriales[buscarmaterial(nomaterial)] = null;
//
//       this.posAct--;
//
//        while ((this.ArrMateriales[this.posAct] != null) && ((this.posAct + 1) < this.ArrMateriales.length)) {
//           this.ArrMateriales[this.posAct] = Aux[this.posAct + 1];
//        }
//    }// FIN 

    public void eliminarMat(int pos) {
        if ((pos >= 0) && (pos < posAct)) {
            for (int i = pos; i < posAct; i++) {
                ArrMateriales[i] = ArrMateriales[i + 1];
                posAct--;
            }

        }
    }

    public Materiales buscarmaterial(int codigo) {
        for (int i = 0; i < ArrMateriales.length; i++) {
            Materiales mat = ArrMateriales[i];
            if (mat.getID() == codigo) {
                return mat;//salir del ciclo
            }
        }
        return null;
    }

    public boolean modificarmaterial(String nombre, Materiales empresa, ArrMateriales Arrmat) {
        //busco la empresa a modificar, este metodo me retorna la posicion en el array
        int pos = this.buscarmaterial(nombre);
        if (pos != -1) {
            this.ArrMateriales[pos] = empresa; //reemplazo la posicion de la empresa anterior por la nueva
            return true;
        }
        return false;
    }

    public String[] getArrNombres() {
        String[] arreglo = new String[posAct];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = this.ArrMateriales[i].getNombreMaterial();
        }
        return arreglo;
    }
    int indiceBuscar;

    public int getIndexMat(int codigo) {
        for (int i = 0; i < ArrMateriales.length; i++) {
            Materiales mat = ArrMateriales[i];
            if (mat.getID() == codigo) {
                return i;//salir del ciclo
            }
        }
        return 0;
    }

    public String listarMateriales() {
        String datos = "";//billete registrados ir guardando 
        for (int i = 0; i < ArrMateriales.length; i++) {
            Materiales materiales = ArrMateriales[i];
            if (materiales == null) { // 0 siempre y tenga datos conitnua
                continue;//salir del ciclo
            }

            datos = datos
                    + "\nCódigo: " + materiales.getID()
                    + "\nDescripcion: " + materiales.getDescripcion()
                    + "\nNombre: " + materiales.getNombreMaterial();
        }

        return datos;

    }

}//fin clase
