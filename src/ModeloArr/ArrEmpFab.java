/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloArr;

/**
 *
 * @author M
 */
public class ArrEmpFab {

    Empresa[] ArrEmp;
    private int tam;
    public int posAct;

    public ArrEmpFab() {

        ArrEmp = new Empresa[100];
        this.posAct = 0;
    }

    public Empresa[] getArrEmp() {
        return ArrEmp;
    }

    public int getTam() {
        return tam;
    }

    public int getPosAct() {
        return posAct;
    }

    public void insetarEmpresa(Empresa em) {

        this.ArrEmp[this.posAct] = em;
        this.posAct++;

    }

    public void CargarEmp(ArrPais pais) {
        Empresa objEmp = new Empresa();
        objEmp.setNombreEmpresa("casa de moneda");
        objEmp.setPaisEmpresa(pais.ArrPais[0]);
        this.insetarEmpresa(objEmp);

//        objEmp = new Empresa("casa de moneda", pais.ArrPais[0]);
//        this.insetarEmpresa(objEmp);
//        
        objEmp = new Empresa();
        objEmp.setNombreEmpresa("banxico");
        objEmp.setPaisEmpresa(pais.getArrPais()[1]);
        this.insetarEmpresa(objEmp);

        objEmp = new Empresa();
        objEmp.setNombreEmpresa("casa de moneda");
        objEmp.setPaisEmpresa(pais.getArrPais()[2]);
        this.insetarEmpresa(objEmp);

        objEmp = new Empresa();
        objEmp.setNombreEmpresa("moneda y timbre");
        objEmp.setPaisEmpresa(pais.getArrPais()[3]);
        this.insetarEmpresa(objEmp);

        objEmp = new Empresa();
        objEmp.setNombreEmpresa("central de reserva");
        objEmp.setPaisEmpresa(pais.getArrPais()[4]);
        this.insetarEmpresa(objEmp);
    }

    public Empresa busModEmpresa(int codigo) {
        for (int i = 0; i < ArrEmp.length; i++) {
            Empresa emp = ArrEmp[i];
            if (emp.getIDEmpresa() == codigo) {
                return emp;//salir del ciclo
            }
        }
        return null;
    }

    public void eliminarempresa(int pos) {
        if ((pos >= 0) && (pos < posAct)) {
            for (int i = pos; i < posAct; i++) {
                ArrEmp[i] = ArrEmp[i + 1];
            }
            posAct--;
        }

    }

    public int getIndexEmp(int codigo) {
        for (int i = 0; i < ArrEmp.length; i++) {
            Empresa emp = ArrEmp[i];
            if (emp.getIDEmpresa() == codigo) {
                return i;//salir del ciclo
            }
        }
        return 0;
    }

    public String[] getArrNombres() {
        String[] arreglo = new String[posAct];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = this.ArrEmp[i].getNombreEmpresa();
        }
        return arreglo;
    }

    public String listarEmpresas() {
        String datos = "";//billete registrados ir guardando 
        for (int i = 0; i < ArrEmp.length; i++) {
            Empresa emp = ArrEmp[i];
            if (emp == null) { // 0 siempre y tenga datos conitnua
                continue;//salir del ciclo
            }
           
            datos = emp.getIDEmpresa() + datos
                    + "\nNombre Empresa: " + emp.getNombreEmpresa();


        }

        return datos;

    }
}//fin 
