package ass_3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Count {

    public static void main(String[] args) {
        File file=new File("F:\\practice/input.txt");

        try {
              boolean x=file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter fileWriter=new FileWriter("F:\\practice/input.txt");
            fileWriter.write("Hello\nraju\nravi\nrahul\nRamesh\nHinrika\nRampyari");
            fileWriter.flush();
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fileReader=new FileReader("F:\\practice/input.txt");
            int index=fileReader.read();
            while(index!=-1){
                System.out.println((char)index);
                index=fileReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
