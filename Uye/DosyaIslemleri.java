import java.io.*;
import java.util.ArrayList;

public class DosyaIslemleri {
    public static void elitUyeEkle(String ad, String soyad, String email) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("elitUyeler.txt", true));
            writer.write(ad + "\t" + soyad + "\t" + email + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void genelUyeEkle(String ad, String soyad, String email) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("genelUyeler.txt", true));
            writer.write(ad + "\t" + soyad + "\t" + email + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<ElitUye> elitUyeleriOku() {
        ArrayList<ElitUye> elitUyeler = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("elitUyeler.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\t");
                elitUyeler.add(new ElitUye(tokens[0], tokens[1], tokens[2]));
            }
            reader.close();
        } catch (IOException