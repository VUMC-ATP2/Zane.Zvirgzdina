package classroom;

public class Euronics extends Shop{

    boolean isAcceptingCards;

    public Euronics(String address, String telephoneNumber, String shopType, boolean isAcceptingCards) {
        super(address, telephoneNumber, shopType);
        this.isAcceptingCards = isAcceptingCards;
    }


}
