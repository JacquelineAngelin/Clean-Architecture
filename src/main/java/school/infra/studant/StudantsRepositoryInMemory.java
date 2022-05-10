package school.infra.studant;

import school.domain.studant.CPF;
import school.domain.studant.Studant;
import school.domain.studant.StudantNotfound;
import school.domain.studant.StudantsRepository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudantsRepositoryInMemory implements StudantsRepository {

    private List<Studant> registereds = new ArrayList<>();

    @Override
    public void register (Studant studant){
        this.registereds.add(studant);
    }

    @Override
    public Studant findByCPF(CPF cpf) {
        return this.registereds.stream()
                .filter(studant -> studant.getCpf().equals(cpf.getCpf()))
                .findFirst()
                .orElseThrow(() -> new StudantNotfound(cpf));
    }

    @Override
    public List<Studant> listAllStudantsRegistered() {
        return this.registereds;
    }

}
