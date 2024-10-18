import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner = new Scanner(System.in);
    private final EncryptionService encryptionService = new EncryptionService();

    // ANSI escape codes
    public static final String RESET = "\u001B[0m";  // Reset color
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public void start() {
        boolean continueRunning = true;
        System.out.flush();
        System.out.println(GREEN + "Welcome to Encryptora!" + RESET);

        while (continueRunning) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    handleEncryption();
                    break;
                case 2:
                    handleDecryption();
                    break;
                case 3:
                    continueRunning = false;
                    System.out.println(RED + "\nExiting Encryptora. Goodbye!" + RESET);
                    break;
                default:
                    System.out.println(YELLOW + "\nInvalid choice. Please try again." + RESET);
            }
        }
        scanner.close();
    }

    private void displayMenu() {
        System.out.println(CYAN + "\nChoose an option:" + RESET);
        System.out.println(BLUE + "1. Encrypt a file" + RESET);
        System.out.println(BLUE + "2. Decrypt a file" + RESET);
        System.out.println(RED + "3. Exit" + RESET);
    }

    private void handleEncryption() {
        System.out.print(YELLOW + "\nEnter file path: " + RESET);
        String inputFilePath = scanner.nextLine();
        System.out.print(YELLOW + "\nEnter output file path: " + RESET);
        String outputFilePath = scanner.nextLine();
        System.out.print(YELLOW + "\nEnter password (16 characters for AES): " + RESET);
        String password = scanner.nextLine();

        try {
            encryptionService.encrypt(inputFilePath, outputFilePath, password);
            System.out.println(GREEN + "\nFile encrypted successfully!\n" + RESET);
        } catch (Exception e) {
            System.err.println(RED + "\nError: " + e.getMessage() + RESET);
        }
    }

    private void handleDecryption() {
        System.out.print(YELLOW + "\nEnter file path: " + RESET);
        String inputDecryptPath = scanner.nextLine();
        System.out.print(YELLOW + "\nEnter output file path: " + RESET);
        String outputDecryptPath = scanner.nextLine();
        System.out.print(YELLOW + "\nEnter password (16 characters for AES): " + RESET);
        String decryptPassword = scanner.nextLine();

        try {
            encryptionService.decrypt(inputDecryptPath, outputDecryptPath, decryptPassword);
            System.out.println(GREEN + "\nFile decrypted successfully!\n" + RESET);
        } catch (Exception e) {
            System.err.println(RED + "\nError: " + e.getMessage() + RESET);
        }
    }
}
