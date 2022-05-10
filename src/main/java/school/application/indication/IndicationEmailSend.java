package school.application.indication;

import school.domain.studant.Studant;

public interface IndicationEmailSend {

    void sendTo(Studant indicated);
}
