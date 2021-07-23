package Scrambler;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("----------SIMPLE_SCRAMBLER------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string to decode: ");
        String scanStr = scanner.next().toUpperCase(Locale.ROOT);

        File file = new File("src/Scrambler", "CryptedTextInTxt.txt");
        File file2 = new File("src/Scrambler", "deCryptedTextInTxt.txt");

        if (file.exists() && file2.exists()){
            ;
        } else {
            System.out.println("isCreated CryptedTextTxt " + file.createNewFile());
            System.out.println("isCreated deCryptedTextTxt " + file2.createNewFile());
        }


        Scrambler scrambler = new Scrambler(scanStr);
        System.out.println("Your results save in next two files!");


        try {
            Files.write(Paths.get("src/Scrambler/CryptedTextInTxt.txt"),
                    scrambler.crypt().getBytes(), StandardOpenOption.APPEND);
            Files.write(Paths.get("src/Scrambler/deCryptedTextInTxt.txt"),
                     scrambler.decrypt().getBytes(), StandardOpenOption.APPEND);
        }  catch (IOException ignored){}

        System.out.println("Data is saved!");

    }
}
