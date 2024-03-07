import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("======== CONTACT ========");
        Contact contact = new Contact("andre.raphael@gmail.com", "Raphoraph", "Bonjour, je souhaitais juste tester votre formulaire de contact.");
        ContactFormatter contactFormatter = new ContactFormatter(contact);
        System.out.println(contactFormatter.formatToCsv(contact));
        System.out.println(contactFormatter.formatToHtml(contact));
        System.out.println(contactFormatter.formatToJson(contact));

        System.out.println("======== CONNEXION ========");
        Connexion connexion = new Connexion("andre.raphael@gmail.com", "Raphoraph", "motDePasseTresSecurise-@321654987");
        ConnexionFormatter connexionFormatter = new ConnexionFormatter(connexion);
        System.out.println(connexionFormatter.formatToCsv(connexion));
        System.out.println(connexionFormatter.formatToHtml(connexion));
        System.out.println(connexionFormatter.formatToJson(connexion));
    }
}