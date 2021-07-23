package Scrambler;

public class Scrambler {

    private String stringToScramble;
    private final char[] key = {'0', '1', '2', 'B', '4'};
    private final char[] values = {'A', 'E', 'I', 'O', 'U'};
    private StringBuilder cryptedString = new StringBuilder();
    private StringBuilder decryptedString = new StringBuilder();

    Scrambler(String stringToScramble) {
        this.stringToScramble = stringToScramble;
    }

    public String crypt() {
        char[] letters = stringToScramble.toCharArray();
        for (char chrs : letters) {
            if (chrs == 'A') {
                cryptedString.append(key[0]);
            } else if (chrs == 'E') {
                cryptedString.append(key[1]);
            } else if (chrs == 'I') {
                cryptedString.append(key[2]);
            } else if (chrs == 'O') {
                cryptedString.append(key[3]);
            } else if (chrs == 'U') {
                cryptedString.append(key[4]);
            } else if (chrs == ' ') {
                cryptedString.append(' ');
            } else {
                cryptedString.append(chrs);
            }

        }
        return cryptedString.toString();
    }

    public String decrypt() {
        char[] lettersCryptedString = cryptedString.toString().toCharArray();
        for (char letters : lettersCryptedString) {
            if (letters == '0') {
                decryptedString.append(values[0]);
            } else if (letters == '1') {
                decryptedString.append(values[1]);
            } else if (letters == '2') {
                decryptedString.append(values[2]);
            } else if (letters == 'B') {
                decryptedString.append(values[3]);
            } else if (letters == '4') {
                decryptedString.append(values[4]);
            } else decryptedString.append(letters);

        }
        return decryptedString.toString();
    }
}
