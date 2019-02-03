package Entities;

public enum AlcoholType {
    Wine, DistilledLiquor, MaltBeverage;

    public int toInt(){
        if(this == Wine){
            return 1;
        } else if (this == DistilledLiquor){
            return 2;
        } else {
            return 3;
        }
    }
}
