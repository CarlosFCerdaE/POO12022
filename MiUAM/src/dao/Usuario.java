/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;

/**
 *
 * @author labc205
 */
public class Usuario {
    private ArrayList <modelos.Usuario> lista = new ArrayList<>();

    public Usuario() {
    }

    public ArrayList <modelos.Usuario> getLista() {
        return lista;
    }

    public void setLista(ArrayList <modelos.Usuario> lista) {
        this.lista = lista;
    }
    
    public void agregarUsuario (String user, String pw, String nombres, String apellidos, String email){
        this.lista.add(new modelos.Usuario(user,pw,nombres,apellidos,email));
    }
    
    public void editarUsuario (String user, String pw, String nombres, String apellidos, String email){
        for(modelos.Usuario foruser: this.lista){
            if(foruser.existe(user)){
                foruser.setPw(pw);
                foruser.setNombres(nombres);
                foruser.setApellidos(apellidos);
                foruser.setEmail(email);
            }
        }
    }
    
    public boolean autenticarUsuario (String user, String pw){
        for(modelos.Usuario us: this.lista){
            if(us.verificarUsuario(user, pw)) return true;
        }
        return false;
    }
    public boolean eliminarUsuario(String userName){
        for (modelos.Usuario usuario : this.lista){
            if(usuario.existe(userName)){
                this.lista.remove(usuario);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList buscarXNombre(String valor){
        ArrayList<modelos.Usuario> resultado = 
                new ArrayList<>();
        for(modelos.Usuario usuario : this.lista){
            String userN = usuario.getNombres().toUpperCase()
                    +  " " +usuario.getApellidos().toUpperCase();
            if(userN.startsWith(valor.toUpperCase())){
                resultado.add(usuario);
            }
        }
        return resultado;
    }
    
}
