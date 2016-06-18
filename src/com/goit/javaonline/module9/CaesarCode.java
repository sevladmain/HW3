package com.goit.javaonline.module9;

import java.util.*;

/**
 * Created by SeVlad on 18.06.2016.
 */
public class CaesarCode {
    Map<Character, Character> code;

    public CaesarCode() {
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
        Character character = new Character('a');
        StringBuilder stringBuilder = new StringBuilder(decodeStr);
        for (int i = 0; i < stringBuilder.length(); i++) {
            for (Map.Entry<Character, Character> entry :
                    code.entrySet()) {
                if (entry.getValue() == stringBuilder.charAt(i)){
                    character = entry.getKey();
                    break;
                }
            }
            stringBuilder.setCharAt(i, character);
        }
        return stringBuilder.toString();
    }

}
