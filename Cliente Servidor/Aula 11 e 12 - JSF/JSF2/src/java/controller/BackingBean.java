package controller;

import model.Usuario;

public class BackingBean {

    private Usuario usuario;

    public BackingBean() {
        usuario = new Usuario();
    }

    public String ok() {
        if (usuario.getUsuario().equals("adm") && usuario.getSenha().equals("adm")) {
            return "sucesso"; //vai para main.jsp   
        } else {
            return null; //retorna para a mesma página   
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
