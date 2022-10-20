/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miuam;
import dao.Usuario;
import formularios.Login;

/**
 *
 * @author labc205
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario usuarios = new Usuario();
        usuarios.agregarUsuario("18020323", "123", "Carlos", "Cerda", "cfcerda@uamv.edu.ni");
        usuarios.agregarUsuario("21011522", "147", "Carlos", "Gurdian", "cgurdian@uamv.edu.ni");
        
        Login login = new Login();
        login.usuarios = usuarios;
        login.setVisible(true);
    }
    public void llenarUsuario(){
        Usuario usuarios = new Usuario();
        usuarios.agregarUsuario("18020323", "123", "Carlos", "Cerda", "cfcerda@uamv.edu.ni");
        usuarios.agregarUsuario("21011522", "147", "Carlos", "Gurdian", "cgurdian@uamv.edu.ni");
        
        Login login = new Login();
        login.usuarios = usuarios;
        login.setVisible(true);
    }
    
}
