import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class EncryptionService {
    private static final String ALGORITHM = "AES";

    public void encrypt(String inputFilePath, String outputFilePath, String password) throws Exception {
        SecretKeySpec key = new SecretKeySpec(password.getBytes(), ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);

        processFile(cipher, inputFilePath, outputFilePath);
    }

    public void decrypt(String inputFilePath, String outputFilePath, String password) throws Exception {
        SecretKeySpec key = new SecretKeySpec(password.getBytes(), ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key);

        processFile(cipher, inputFilePath, outputFilePath);
    }

    private void processFile(Cipher cipher, String inputFilePath, String outputFilePath) throws Exception {
        try (FileInputStream fis = new FileInputStream(inputFilePath);
             FileOutputStream fos = new FileOutputStream(outputFilePath)) {
            byte[] inputBytes = new byte[64];
            int bytesRead;

            while ((bytesRead = fis.read(inputBytes)) != -1) {
                byte[] outputBytes = cipher.update(inputBytes, 0, bytesRead);
                if (outputBytes != null) {
                    fos.write(outputBytes);
                }
            }
            byte[] outputBytes = cipher.doFinal();
            if (outputBytes != null) {
                fos.write(outputBytes);
            }
        }
    }
}