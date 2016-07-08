package com.goit.javaonline.module10;

import java.io.*;
import java.util.*;

/**
 * Created by SeVlad on 18.06.2016.
 */
public class CaesarCode {
    Map<Character, Character> code;
    Map<Character, Character> decode;
    public CaesarCode() {
        this("code.txt");
    }

    public CaesarCode(String fName) {
        try{
            FileInputStream fileInputStream = new FileInputStream(fName);
            ObjectInputStream in = new ObjectInputStream(fileInputStream);
            code = (HashMap<Character, Character>)in.readObject();
            in.close();
            fileInputStream.close();
        }catch (Exception e){
            FormRandomMatrix();
        }
        FormDecodeMatrix();
        SaveCodeToFile(fName);
    }
    private void FormRandomMatrix(){
        code = new HashMap<>();
        char litera;
        int random;
        Random randomGenerator = new Random();
        // переміщуємо алфавіт
        List<Character> alphabet = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
            if(i < 26){
                litera = (char) ((int)'A' + i);
            } else{
                litera = (char) ((int)'a' + i - 26);
            }
            alphabet.add(litera);
        }
        for (int i = 0; i < 52; i++) {
            if(i < 26){
                litera = (char) ((int)'A' + i);
            } else{
                litera = (char) ((int)'a' + i - 26);
            }
            random = randomGenerator.nextInt(alphabet.size());
            code.put(litera, alphabet.get(random));
            alphabet.remove(random);
        }
    }
    private void FormDecodeMatrix(){
        decode = new HashMap<>();
        for (Map.Entry<Character, Character> liter :
                code.entrySet()) {
            decode.put(liter.getValue(), liter.getKey());
        }
    }
    public int SaveCodeToFile(String fName){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(fName);
            ObjectOutputStream stream = new ObjectOutputStream(fileOutputStream);
            stream.writeObject(code);
            stream.close();
            fileOutputStream.close();
        }catch (Exception e){
            return -1;
        }
        return 0;
    }
    public void PrintCodeTable(){
        for (Map.Entry<Character, Character> pair : code.entrySet()){
            System.out.println(pair.getKey() + " -> " + pair.getValue());
        }
    }
    public String Encode(String encodeStr){
        if (encodeStr == null) return null;
        StringBuilder stringBuilder = new StringBuilder(encodeStr);
        for (int i = 0; i < stringBuilder.length(); i++) {
            stringBuilder.setCharAt(i, code.get(stringBuilder.charAt(i)));
        }
        return stringBuilder.toString();
    }

    public String Decode(String decodeStr){
        if (decodeStr == null) return null;
        StringBuilder stringBuilder = new StringBuilder(decodeStr);
        for (int i = 0; i < stringBuilder.length(); i++) {
            stringBuilder.setCharAt(i, decode.get(stringBuilder.charAt(i)));
        }
        return stringBuilder.toString();
    }

}
