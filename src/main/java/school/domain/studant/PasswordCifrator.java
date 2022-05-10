package school.domain.studant;

public interface PasswordCifrator {

    String cifratePassword(String password);

    boolean validateCifratedPassword(String cifratedPassword, String password);
}
