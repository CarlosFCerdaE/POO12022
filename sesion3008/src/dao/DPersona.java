/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.Persona;
import modelos.Sexo;

/**
 *
 * @author labc205
 */
public class DPersona {
    private ArrayList<Persona> listPersona;

    public DPersona() {
    }

    public DPersona(ArrayList<Persona> listPersona) {
        this.listPersona = listPersona;
    }

    public ArrayList<Persona> getListPersona() {
        return listPersona;
    }

    public void setListPersona(ArrayList<Persona> listPersona) {
        this.listPersona = listPersona;
    }
  
    /**
     * Permite agregar un nuevo registro a mi lista
     * @param id
     * @param nombre
     * @param apellido
     * @param email
     * @param sexo
     * @return 
     */
    public int agregarPersona(int id,String nombre, String apellido, String email,Sexo sexo){
        int b = 0;
        Persona pers = new Persona(id,nombre,apellido,email,sexo);
        listPersona.add(pers);
        b = 1;
        return b;
    }
    /**
     * Devuelve una tabla con los registros almacenados
     * en el registro de personas
     * @return 
     */
    public DefaultTableModel getListPers(){
        
        DefaultTableModel dtm = new DefaultTableModel();
        String titulo[]= {"ID","NOMBRE","APELLIDOS","EMAIL","SEXO"};
        //Asigna los encabezados a mi tabla
        dtm.setColumnIdentifiers(titulo);
        
        //For each
        for(Persona per:listPersona){
            String reg[]= new String[5];
            reg[0]=""+per.getId();
            reg[1]=per.getNombre();
            reg[2]=per.getApellido();
            reg[3]=per.getEmail();
            reg[4]=""+per.getSexo();
            dtm.addRow(reg);
        }
        
        return dtm;
    }
    
}
