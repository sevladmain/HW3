package com.goit.javaonline.module7;

import static java.lang.Math.round;

/**
 * Created by SeVlad on 03.06.2016.
 */
public class TemperatureTransform {
    double celTemp;
    double farTemp;
    public TemperatureTransform(){
        celTemp = 0;
        farTemp = 32;
    }
    // Анти-шаблон: Magic number
    // Решение: виделить две константы метода: koefTransform = 9/5 и zeroDegree = 32
    // и использовать их при ининциализации в конструкторе и функциях преобразования
    public static double Celsium2Farenh(double c){
        return c * 9 / 5 + 32;
    }
    public static double Farenh2Celsium (double f){
        return (f - 32) * 5 / 9;
    }

    // Анти-шаблон: Magic number
    // Решение: виделить повторяющуюся строку  "Temperature is not valid" в отдельный enum
    public double getCelTemp() {
        if (round(farTemp) != round(Celsium2Farenh(celTemp))){
            throw  new IllegalStateException("Temperature is not valid");
        }
        return celTemp;
    }

    public void setCelTemp(double celTemp) {
        this.celTemp = celTemp;
        this.farTemp = Celsium2Farenh(celTemp);
    }

    public double getFarTemp() {
        if (round(farTemp) != round(Celsium2Farenh(celTemp))){
            throw  new IllegalStateException("Temperature is not valid");
        }
        return farTemp;
    }

    public void setFarTemp(double farTemp) {
        this.farTemp = farTemp;
        this.celTemp = Farenh2Celsium(farTemp);
    }
}
