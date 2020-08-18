package com.missfresh.weigh;

public class WeightData {
    private String sMode;
    private String sStatus;
    private boolean sZero;
    private String sUnit;
    private String sNetWeight;
    private String sTareWeight;
    private String sGrossWeight;
    private boolean isStable;


    public WeightData() {
    }

    public String getsMode() {
        return sMode;
    }

    public void setsMode(String sMode) {
        this.sMode = sMode;
    }

    public String getsStatus() {
        return sStatus;
    }

    public void setsStatus(String sStatus) {
        this.sStatus = sStatus;
    }

    public boolean issZero() {
        return sZero;
    }

    public void setsZero(boolean sZero) {
        this.sZero = sZero;
    }

    public String getsUnit() {
        return sUnit;
    }

    public void setsUnit(String sUnit) {
        this.sUnit = sUnit;
    }

    public String getsNetWeight() {
        return sNetWeight;
    }

    public void setsNetWeight(String sNetWeight) {
        this.sNetWeight = sNetWeight;
    }

    public String getsTareWeight() {
        return sTareWeight;
    }

    public void setsTareWeight(String sTareWeight) {
        this.sTareWeight = sTareWeight;
    }

    public String getsGrossWeight() {
        return sGrossWeight;
    }

    public void setsGrossWeight(String sGrossWeight) {
        this.sGrossWeight = sGrossWeight;
    }

    public boolean isStable() {
        return isStable;
    }

    public void setStable(boolean stable) {
        isStable = stable;
    }
}
