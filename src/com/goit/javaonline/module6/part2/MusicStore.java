package com.goit.javaonline.module6.part2;

import java.util.*;

/**
 * Created by SeVlad on 28.05.2016.
 */
public class MusicStore {
    private List<MusicInstrument> instruments;

    public List<MusicInstrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(List<MusicInstrument> instruments) {
        this.instruments = instruments;
    }

    public void sellInstrument(MusicInstrument m){

    }
    public void buyInstrument(MusicInstrument m){

    }
    public static List<MusicInstrument> prepareInstruments(Map<String, Integer> order) throws WrongInstrumentException{
        List<MusicInstrument> musicInstruments = new ArrayList<>();
        MusicInstrument instrument;
        for (Map.Entry<String, Integer> item: order.entrySet()) {
            if (item.getValue() <= 0){
                throw new IllegalArgumentException("Value of item " + item.getKey() + " = " + item.getValue() +
                        ", but not positive");
            } else{
                switch (item.getKey()){
                    case "piano": instrument = new Piano(item.getKey());
                        break;
                    case "guitar": instrument = new Guitar(item.getKey());
                        break;
                    case "trumpet": instrument = new Trumpet(item.getKey());
                        break;
                    default: throw new WrongInstrumentException(item.getKey());
            }
                for (int index = 0; index < item.getValue(); index++) {
                    musicInstruments.add(instrument);
                }
            }

        }
        return musicInstruments;
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter number of instruments: ");
        int numberOfInstruments = scanner.nextInt();
        String instrument;
        int quantity;
        Map<String, Integer> order = new HashMap<String, Integer>();
        List<MusicInstrument> musicInstruments = new ArrayList<>();
        for (int index = 0; index < numberOfInstruments; index++) {
            System.out.println("Enter instrument");
            instrument = scanner.next();
            System.out.println("Enter quantity of " + instrument + " :");
            quantity = scanner.nextInt();
            order.put(instrument, quantity);
        }
        try {
            musicInstruments = prepareInstruments(order);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(musicInstruments.toString());
    }
}
