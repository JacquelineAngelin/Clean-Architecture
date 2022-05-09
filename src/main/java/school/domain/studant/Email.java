package school.domain.studant;

public class Email {

    //Value Object
    private String endereco;
    private String email;

    public Email(String endereco) {
        if (endereco == null || !endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$")){
            throw new IllegalArgumentException("E-mail invalido");
        }
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail(String endereco) {
        return email;
    }
}
