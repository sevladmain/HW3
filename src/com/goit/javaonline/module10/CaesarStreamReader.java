package com.goit.javaonline.module10;

import com.goit.javaonline.module9.CaesarCode;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by SeVlad on 24.06.2016.
 */
public class CaesarStreamReader extends CaesarCode{
    String fName;
    public CaesarStreamReader() {
        super();
        fName = "example.txt";
    }

    void Write(String pass) throws IOException{
        FileWriter writer = null;
        try {
            writer = new FileWriter(fName);
            writer.write(Encode(pass));
            System.out.println("File saved");
        } catch (FileNotFoundException e){
            System.out.println("FILE NOT FOUND: " + e.getMessage());
        } catch (IOException e){
            System.out.println("IO EXCEPTION: " + e.getMessage());
        } finally {
            if (writer != null)
                writer.close();
        }
    }
    void Read(String pass) throws IOException{
        FileReader reader = null;
        try {
            reader = new FileReader(fName);
            StringBuilder builder = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                builder.append((char)c);
            }
            System.out.println("Encode: " + builder);
            System.out.println("Decode: " + Decode(builder.toString()));
        } catch (FileNotFoundException e){
            System.out.println("FILE NOT FOUND: " + e.getMessage());
        } catch (IOException e){
            System.out.println("IO EXCEPTION: " + e.getMessage());
        } finally {
            if (reader != null)
                reader.close();
        }
    }

}
