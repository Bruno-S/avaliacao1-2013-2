/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inscricao.faces.mngbeans;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utfpr.faces.support.PageBean;

/**
 *
 * @author Kinopf
 */

@ManagedBean
@SessionScoped

public class LoginBean extends PageBean {
    
    private String usuario;
    private String senha;
    private boolean senhaIncorreta = false;
    
    private LoginListBean loginListBean = (LoginListBean) getBean("loginListBean");

    public boolean isSenhaIncorreta() {
        return senhaIncorreta;
    }

    public void setSenhaIncorreta(boolean senhaIncorreta) {
        this.senhaIncorreta = senhaIncorreta;
    }
    private boolean isAdmin = false;

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    
    
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String Entrar(){
    
        if (usuario.equals(senha)){
            senhaIncorreta = false;
            Login novoLogin = new Login();
            novoLogin.setUsuario(this.usuario);
            novoLogin.setData(new Date());
            loginListBean.insereLogin(novoLogin);
            if(isAdmin){
                return "admin";
            }
            else{
                return "cadastro";
            }
        }
        else{
            senhaIncorreta = true;
            return "login";
        }
    
    }
    
}
