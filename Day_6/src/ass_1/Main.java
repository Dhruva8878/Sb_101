package ass_1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File file=new File("F:\\practice/abc.txt");

        try {
            boolean x= file.createNewFile();
            if(x){
                System.out.println("new file created");
            }
            else{
                System.out.println("file is already exist");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(file.exists());


        try {
            FileWriter fileWriter=new FileWriter("F:\\practice/abc.txt");
            fileWriter.write("Hello");
            fileWriter.write("your welcome");
            fileWriter.flush();
            fileWriter.close();


            FileReader fileReader=new FileReader("F:\\practice/abc.txt");
            int index=fileReader.read();

            while(index!=-1){
                System.out.println((char) index);
                index=fileReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
