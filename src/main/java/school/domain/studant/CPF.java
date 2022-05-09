package school.domain.studant;

public class CPF {

    //Value Object
    private String cpf;

    public CPF(String cpf) {
        if (cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")){
            throw new IllegalArgumentException("CPF invalido");
        }
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
