package school.application.studant.register;

import school.domain.studant.Studant;
import school.domain.studant.StudantsRepository;

public class StudantRegister {

    private final StudantsRepository repository;

    public StudantRegister(StudantsRepository repository){
        this.repository = repository;
    }
    // COMMAND
    public void executa(StudantRegisterDto dada) {
        Studant novo = dada.criarStudant();
        repository.register(novo);
    }

}
