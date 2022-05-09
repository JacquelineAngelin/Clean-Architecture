package school.domain.studant;

public class StudantFactory {

    private Studant studant;

    //Factory Method
    public StudantFactory withNameCpfEmail(String name, String cpf, String email) {
        this.studant = new Studant(new String(cpf), name, new String(email));
        return this;
    }

    public StudantFactory withPhone (String ddd, String numero){
        this.studant.addPhone(ddd, numero);
        return this;
    }

    //
    public Studant builder(){
        return this.studant;
    }

    //To create a Studant
//    public static void main (String[] args){
//        StudantFactory fabrica = new StudantFactory();
//        fabrica.withNameCpfEmail("","","")
//        .withPhone("","")
//        .withPhone("", "")
//        .builder();
//    }
}
