package school.infra.studant;

import school.domain.studant.PasswordCifrator;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordCifratorWithMD5 implements PasswordCifrator {

    @Override
    public String cifratePassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        }catch (NoSuchAlgorithmException e){
            throw new RuntimeException("erro ao gerar hash da senha");
        }


    }

    @Override
    public boolean validateCifratedPassword(String cifratedPassword, String password) {
        return cifratedPassword.equals(cifratePassword(password));
    }
}
