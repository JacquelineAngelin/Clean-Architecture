package school.domain.studant;

import java.sql.SQLException;
import java.util.List;

public interface StudantsRepository {

    void register(Studant studant) throws SQLException;

    Studant findByCPF(CPF cpf);

    List<Studant> listAllStudantsRegistered();
}
