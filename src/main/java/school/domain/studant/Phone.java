package school.domain.studant;

public class Phone {

    private String ddd;
    private String numero;

    public Phone(String ddd, String numero) {
        if (ddd == null || numero == null){
            throw new IllegalArgumentException("DDD e Numero sao mandartorios para o cadastro");
        }
        if (!ddd.matches("\\d{2}")){
            throw new IllegalArgumentException("DDD invalido");
        }
        if (!numero.matches("\\d{8}|\\d{9}"))
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}
