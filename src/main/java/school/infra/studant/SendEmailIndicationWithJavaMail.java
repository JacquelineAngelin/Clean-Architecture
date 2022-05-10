package school.infra.studant;

import school.application.indication.IndicationEmailSend;
import school.domain.studant.Studant;

public class SendEmailIndicationWithJavaMail implements IndicationEmailSend {

    //using lib Java Mail
    @Override
    public void sendTo(Studant indicated) {

    }
}
