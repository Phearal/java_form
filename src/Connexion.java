public class Connexion extends Formulaire implements FormulaireInterface, ConnexionInterface {
    String pseudo;
    String password;

    public Connexion(String email, String pseudo, String password) {
        super(email);
        this.pseudo = pseudo;
        this.password = password;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
