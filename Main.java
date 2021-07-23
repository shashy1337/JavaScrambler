package Scrambler;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------SIMPLE_SCRAMBLER------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string to decode: ");
        String scanStr = scanner.next().toUpperCase(Locale.ROOT);
        Scrambler scrambler = new Scrambler(scanStr);
        System.out.print("Your encrypted word: ");
        scrambler.crypt();
        System.out.print("Decrypted word: ");
        scrambler.decrypt();
    }
}
