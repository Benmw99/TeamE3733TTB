package Entities;

import java.util.Objects;

public class WineFormItems {
    private int vintageYear;
    private float pH;
    private String grapeVarietal;
    private String appellation;

    public WineFormItems(int vintageYear, float pH, String grapeVarietal, String appellation) {
        this.vintageYear = vintageYear;
        this.pH = pH;
        this.grapeVarietal = grapeVarietal;
        this.appellation = appellation;
    }

    public WineFormItems(){

    }

    public int getVintageYear() {
        return vintageYear;
    }

    public void setVintageYear(int vintageYear) {
        this.vintageYear = vintageYear;
    }

    public float getpH() {
        return pH;
    }

    public void setpH(float pH) {
        this.pH = pH;
    }

    public String getGrapeVarietal() {
        return grapeVarietal;
    }

    public void setGrapeVarietal(String grapeVarietal) {
        this.grapeVarietal = grapeVarietal;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    boolean equals(WineFormItems aWine) {
        return (this.vintageYear == aWine.vintageYear &&
        this.pH == aWine.pH &&
        this.grapeVarietal.equals(aWine.grapeVarietal) &&
        this.appellation.equals(aWine.appellation));
    }
}
