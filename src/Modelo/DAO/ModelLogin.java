
package Modelo.DAO;

public class ModelLogin {
    
    String email;
    String passwString;

   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswString() {
        return passwString;
    }

    public void setPasswString(String passwString) {
        this.passwString = passwString;
    }

    public ModelLogin(String email, String passwString) {
        this.email = email;
        this.passwString = passwString;
    }
    
    public ModelLogin() {
    }
}
