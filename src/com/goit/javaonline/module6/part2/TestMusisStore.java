package com.goit.javaonline.module6.part2;

import java.util.*;

/**
 * Created by SeVlad on 11.06.2016.
 */
public class TestMusisStore {
    public static void main(String[] args) {
        MusicStore musicStore = new MusicStore();
        musicStore.GenerateWarehouse();
        System.out.println("Warehouse contains:");
        System.out.println(musicStore.getWarehouse().toString());
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter number of order items: ");
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
            musicInstruments = musicStore.prepareInstruments(order);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(musicInstruments.toString());
        System.out.println("Warehouse contains:");
        System.out.println(musicStore.getWarehouse().toString());
    }
}
