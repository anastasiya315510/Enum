import epam.service.InfoHandler;

public class Main {
    public static void main(String[] args) {
        StatusMail status = StatusMail.findByCode(405);
        System.out.println(status);

    }
}

