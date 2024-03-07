public class Formulaire implements FormulaireInterface {
    private String email;

    public Formulaire(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
