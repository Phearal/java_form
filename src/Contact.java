public class Contact extends Formulaire implements ContactInterface {
    private String objet;
    private String message;

    public Contact(String email, String objet, String message) {
        super(email);
        this.objet = objet;
        this.message = message;
    }

    public String getObjet() {
        return objet;
    }

    public String getMessage() {
        return message;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
