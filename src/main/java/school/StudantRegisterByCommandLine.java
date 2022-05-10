package school;

import school.application.studant.register.StudantRegisterDto;
import school.domain.studant.CPF;
import school.domain.studant.Email;
import school.infra.studant.StudantsRepositoryInMemory;

public class StudantRegisterByCommandLine {

    public static void main(String[] args) {
        String name = "Javelino Silva";
        CPF cpf = new CPF("123.000.123-00");
        Email email = new Email("javelino@email.com");

        StudantRegisterByCommandLine studantRegisterByCommandLine = new StudantRegisterByCommandLine(new StudantsRepositoryInMemory());
        studantRegisterByCommandLine.execute(new StudantRegisterDto(name, cpf, email));
    }
}
