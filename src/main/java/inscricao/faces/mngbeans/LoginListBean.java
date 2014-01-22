/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inscricao.faces.mngbeans;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Kinopf
 */

@ManagedBean
@ApplicationScoped

public class LoginListBean implements Serializable {
    
    private ArrayList<Login> login = new ArrayList<>();

    public ArrayList<Login> getLogin() {
        return login;
    }

    public void setLogin(ArrayList<Login> login) {
        this.login = login;
    }
    
    public void insereLogin(Login login){
        
        this.login.add(login);
        
    }
    
}
