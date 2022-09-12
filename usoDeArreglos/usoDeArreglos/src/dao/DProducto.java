/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

import modelos.Producto;

/**
 *
 * @author cfco5
 */
public class DProducto {
    private ArrayList <Producto> listProducto = new ArrayList <>();

    public DProducto() {
    }
    
     public DProducto(ArrayList<Producto> listProducto) {
        this.listProducto = listProducto;
    }

    public ArrayList <Producto> getListProducto() {
        return listProducto;
    }

    public void setListProducto(ArrayList <Producto> listProducto) {
        this.listProducto = listProducto;
    }
    public int agregarProducto(int id, String nombre, double precio, double existencia){
    
        int x =0;
        Producto prod = new Producto (id,nombre,precio,existencia);
        listProducto.add(prod);
        x = 1;
        return x;
    }
    
    public DefaultTableModel getListProd(){
        
        DefaultTableModel dtm = new DefaultTableModel();
        String titulo[]= {"ID","NOMBRE","PRECIO","EXISTENCIA"};
        //Asigna los encabezados a mi tabla
        dtm.setColumnIdentifiers(titulo);
        
        //For each
        for(Producto product:listProducto){
            String reg[]= new String[4];
            reg[0]=""+product.getId();
            reg[1]=product.getNombre();
            reg[2]=""+product.getPrecio();
            reg[3]=""+product.getExistencia();
            dtm.addRow(reg);
        }
        
        return dtm;
    }
    
}
