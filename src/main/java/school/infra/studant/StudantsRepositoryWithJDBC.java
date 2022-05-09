package school.infra.studant;

import school.domain.studant.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudantsRepositoryWithJDBC implements StudantsRepository {

    private final Connection connection;

    public StudantsRepositoryWithJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void register(Studant studant) throws SQLException {
        try {
            String sql = "INSERT INTO ALUNO VALUES(?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, studant.getCpf());
            ps.setString(2, studant.getName());
            ps.setString(3, studant.getEmail());
            ps.execute();

            sql = "INSERT INTO ALUNO VALUES(?,?)";
            ps = connection.prepareStatement(sql);
            for (Phone phone : studant.getPhones()){
                ps.setString(1, phone.getDdd());
                ps.setString(2, phone.getNumero());
                ps.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Studant findByCPF(CPF cpf) {
        try {
            String sql = "SELECT id, nome, email FROM ALUNO WHERE cpf = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, cpf.getCpf());

            ResultSet rs = ps.executeQuery();
            boolean encontrou = rs.next();
            if (!encontrou){
                throw new StudantNotfound(cpf);
            }
            String name = rs.getString("name");
            Email email = new Email(rs.getString("email"));
    }

    @Override
    public List<Studant> listAllStudantsRegistered() {

            studant.add(studant);
        }
            return studant;
    }
}
