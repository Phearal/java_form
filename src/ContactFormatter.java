public class ContactFormatter implements FormatCsvInterface<Contact>, FormatHtmlInterface<Contact>, FormatJsonInterface<Contact> {
    private Contact contact;

    public ContactFormatter(Contact contact) {
        this.contact = contact;
    }
    public String formatToCsv(Contact contact) {
        return contact.getObjet() + ";" + contact.getEmail() + ";" + contact.getMessage();
    }
    public String formatToHtml(Contact contact) {
        return "<div><h2>Contact :</h2>" + "<p>Email : " + contact.getEmail() + "</p>" + "<p>Objet : " + contact.getObjet() + "</p>" + "<p>Message : " + contact.getMessage() + "</p></div>";
    }
    public String formatToJson(Contact contact) {
        return "{objet : " + contact.getObjet() + ",email : " + contact.getEmail() + ",message : " + contact.getMessage() + "}";
    }
}
