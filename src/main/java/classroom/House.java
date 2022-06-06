package classroom;

public class House {

//    int houseNumber = 69;
//    String propertyType = "house";
//    byte stories = 2;
//    int bedrooms = 3;
//    double marketValue = 15402;

    int houseNumber;
    String propertyType;
    byte stories;
    int bedrooms;
    double marketValue;
    int year = 2020;

    public void printInformation() {
        System.out.println("House number: " + houseNumber);
        System.out.println("Property type: " + propertyType);
        System.out.println("Stories: " + stories);
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Market value: " + marketValue);

    }

    public boolean isHouseOld(){
        boolean isOld;
        if (year < 2000) {
            System.out.println("House is old!");
            isOld = true;
        }
        else {
            System.out.println("Pretty new!");
            isOld = false;
        }
        return isOld;
    }
}
