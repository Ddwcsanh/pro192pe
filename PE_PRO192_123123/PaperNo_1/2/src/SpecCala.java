public class SpecCala extends Cala {
    private int color;

    public SpecCala() {
    }

    public SpecCala(int color, String owner, int price) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return owner + "," + price + "," + color ;
    }


    public int getValue() {
        if(color%2 == 1) return price + 7;
        return price + 3;
    }

    public void setData() {
        if(owner.length() <= 2) owner+="XX";
        else
        owner = String.join("XX", owner.substring(0, 2), owner.substring(3));
    }
    
    
}
