import epam.inter.HttpHandler;
import epam.service.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum StatusMail {
    INFORMATIINAL(100, 199, new InfoHandler()), SUCCESS(200, 299, new SuccessHandler()),
    REDIRECTIONAL(300, 399, new RedirectHandler()),
    CLIENT_ERROR(400, 499, new ClientError()), SERVER_ERROR(500, 599, new ServError());

    private final int min;
    private final int max;
    private final HttpHandler handler;


    public static StatusMail findByCode(int num) {
        StatusMail[] statusMails = values();
        for (StatusMail statusMail : statusMails) {
            if (statusMail.max>num & statusMail.min<num) {
               HttpHandler handler = statusMail.getHandler();
               handler.showDirection();
                return statusMail;
            }

        }
        throw  new IllegalArgumentException(num + "is out of list");
    }

}
