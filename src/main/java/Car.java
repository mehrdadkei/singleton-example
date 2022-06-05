public class Car {
    private String windshield;
    private String tire;
    private Integer door;
    private String color;


    private static Car uniqueObject = new Car("dark","highQuality",2,"red");

    private Car(String windshield, String tire, Integer door, String color) {

        this.windshield = windshield;
        this.tire = tire;
        this.door = door;
        this.color = color;
    }

    public static Car getUniqueObject(){
        return uniqueObject;
    }

    @Override
    public String toString() {
        return "Car{" +
                "windshield='" + windshield + '\'' +
                ", tire='" + tire + '\'' +
                ", door=" + door +
                ", color='" + color + '\'' +
                '}';
    }
}
