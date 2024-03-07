public class ContactFormatter implements FormatCsvInterface, FormatHtmlInterface, FormatJsonInterface {
    private Contact contact;

    public ContactFormatter(Contact contact) {
        this.contact = contact;
    }
    @Override
    public String formatToCsv(Contact contact) {
        return contact.getObjet() + ";" + contact.getEmail() + ";" + contact.getMessage();
    }

    @Override
    public String formatToHtml(Contact contact) {
        return "HTML format : " + contact.getObjet();
    }

    @Override
    public String formatToJson(Contact contact) {
        return "{objet : " + contact.getObjet() + ",email : " + contact.getEmail() + ",message : " + contact.getMessage() + "}";
    }
}
