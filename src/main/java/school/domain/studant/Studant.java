package school.domain.studant;

import java.util.ArrayList;
import java.util.List;

public class Studant {

    private String cpf;
    private String name;
    private String email;
    private List<Phone> phones = new ArrayList<>();
    private String senha;

    public Studant(String cpf, String name, String email) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
    }

    public void addPhone(String ddd, String numero){
        this.phones.add(new Phone(ddd, numero));
    }

    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Phone> getPhones() {
        return phones;
    }
}
