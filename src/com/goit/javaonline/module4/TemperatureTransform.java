package com.goit.javaonline.module4;

/**
 * Created by SeVlad on 03.06.2016.
 */
public class TemperatureTransform {
    private double celTemp;
    private double farTemp;
    public TemperatureTransform(){
        celTemp = 0;
        farTemp = 32;
    }
    public double Celsium2Farenh(double c){
        return c * 9 / 5 + 32;
    }
    public double Farenh2Celsium (double f){
        return (f - 32) * 5 / 9;
    }
    public double getCelTemp() {
        return celTemp;
    }

    public void setCelTemp(double celTemp) {
        this.celTemp = celTemp;
        this.farTemp = Celsium2Farenh(celTemp);
    }

    public double getFarTemp() {
        return farTemp;
    }

    public void setFarTemp(double farTemp) {
        this.farTemp = farTemp;
        this.celTemp = Farenh2Celsium(farTemp);
    }
}
