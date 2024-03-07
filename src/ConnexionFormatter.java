public class ConnexionFormatter implements FormatCsvInterface<Connexion>, FormatHtmlInterface<Connexion>, FormatJsonInterface<Connexion> {
    private Connexion connexion;

    public ConnexionFormatter(Connexion connexion) {
        this.connexion = connexion;
    }
    public String formatToCsv(Connexion connexion) {
        return connexion.getPseudo() + ";" + connexion.getEmail();
    }
    public String formatToHtml(Connexion connexion) {
        return "<div><h2>Connexion :</h2>" + "<p>Pseudo : " + connexion.getPseudo() + "</p>" + "<p>Email : " + connexion.getEmail() + "</p></div>";
    }
    public String formatToJson(Connexion contact) {
        return "{Pseudo : " + contact.getPseudo() + ",email : " + connexion.getEmail()+"}";
    }
}
