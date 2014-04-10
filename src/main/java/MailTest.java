public class MailTest {
    public static void main(String[] args) {
        MailService mailService = new MailService();

        String from = "polak.mariola@gmail.com";
        String to = "michalskidaniel2@gmail.com";
        String subcject = "subcject";
        String text = "message";

        boolean czyWysłany = mailService.sendEMail(from, to, subcject, text);

        System.out.println("Czy wysłano e-mail? " + czyWysłany);

    }
}