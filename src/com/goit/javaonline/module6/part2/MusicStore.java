package com.goit.javaonline.module6.part2;

import java.util.*;

/**
 * Created by SeVlad on 28.05.2016.
 */
public class MusicStore {
    private List<MusicInstrument> warehouse;

    public MusicStore() {
        warehouse = new ArrayList<>();
    }

    public List<MusicInstrument> getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(List<MusicInstrument> warehouse) {
        this.warehouse = warehouse;
    }

    public void GenerateWarehouse(){
        for (int i = 0; i < 10; i++) {
            switch (i % 3){
                case 0: warehouse.add(new Guitar("guitar"));
                    break;
                case 1: warehouse.add(new Piano("piano"));
                    break;
                case 2: warehouse.add(new Trumpet("trumpet"));
                    break;
            }
        }
    }

    public void sellInstrument(MusicInstrument m){
        if (!warehouse.remove(m)){
            throw new IllegalStateException("Can't find instrument " + m.getName() + " on a warehouse");
        }
    }
    public  List<MusicInstrument> prepareInstruments(Map<String, Integer> order) throws WrongInstrumentException{
        List<MusicInstrument> musicInstruments = new ArrayList<>(order.size());
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
        //cloning warehouse
        List<MusicInstrument> warehouseBackUp = new ArrayList<>(warehouse.size());
        for (MusicInstrument item : warehouse){
            warehouseBackUp.add(item.clone());
        }
        //deleting shipped warehouse from shop
       for(MusicInstrument item : musicInstruments) {
           if(!warehouseBackUp.remove(item)){
               throw new IllegalStateException("Can't find instrument " + item.getName() + " on a warehouse");
           }
        }
        //updating the warehouse
        warehouse = warehouseBackUp;
        return musicInstruments;
    }

}
