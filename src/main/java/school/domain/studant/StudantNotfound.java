package school.domain.studant;

public class StudantNotfound extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public StudantNotfound(CPF cpf) {
        super("Aluno nao encontrado com CPF: " + cpf.getCpf());
    }
}
