# Encryptora

A comprehensive Java-based file encryption and decryption tool using AES encryption with an intuitive command-line interface.

## 🚀 Features

- **AES Encryption**: Secure file encryption using Advanced Encryption Standard
- **File Processing**: Encrypt and decrypt files of any type
- **Password Protection**: User-defined password-based encryption keys
- **Command-Line Interface**: Simple and intuitive text-based user interaction
- **Color-Coded Output**: Enhanced readability with colorful terminal output
- **User-Friendly Prompts**: Clear and helpful input guidance

## 🛠️ Technologies

- **Language**: Java
- **Encryption**: AES (Advanced Encryption Standard)
- **Libraries**: javax.crypto, java.io
- **Interface**: Command-line interface
- **IDE**: IntelliJ IDEA / Eclipse

## 📋 Requirements

- Java 8 or later
- JDK for compilation
- Files to encrypt/decrypt

## 🚀 Getting Started

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/AdamTroyan/Encryptora.git
   ```

2. Navigate to the project directory:
   ```bash
   cd Encryptora
   ```

3. Compile the Java files:
   ```bash
   javac *.java
   ```

4. Run the application:
   ```bash
   java Encryptora
   ```

### Usage

1. **Launch the application**:
   ```bash
   java Encryptora
   ```

2. **Choose operation**:
   - Select encryption or decryption from the menu
   - Enter the input file path
   - Specify the output file path
   - Provide a secure password

3. **File Processing**:
   - The tool will process your file using AES encryption
   - Encrypted/decrypted file will be saved to the specified location

## 📁 Project Structure

```
Encryptora/
├── Encryptora.java           # Main application entry point
├── EncryptionService.java    # Core encryption/decryption logic
├── UserInterface.java        # Command-line interface handler
├── LICENSE                   # License information
└── README.md                 # Project documentation
```

## 🔐 Security Features

- **AES Encryption**: Industry-standard encryption algorithm
- **Password-Based Keys**: User-defined password protection
- **Secure Processing**: Stream-based file processing for memory efficiency
- **No Data Retention**: Passwords and keys are not stored

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Adam Troyan** - [GitHub Profile](https://github.com/AdamTroyan)

---

*Built with ❤️ for secure file protection*
