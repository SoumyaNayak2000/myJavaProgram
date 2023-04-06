package OopConcept;

public class car {
    String colour;
    String brand;
    int yearOfManufacture;
    public void drive(){
        System.out.println("apply acclerator");
    }
    public void stop(){
        System.out.println("apply break");
    }

    public static void main(String[] args) {
        car audi=new car();
        car mercedes =new car();
        car swift=new car();

        audi.colour="black";
        audi.brand="hexamine";
        audi.yearOfManufacture=2013;
        audi.drive();
        System.out.println(audi.colour);
        System.out.println(audi.brand);
        System.out.println(audi.yearOfManufacture);
        audi.stop();


        mercedes.colour="white";
        mercedes.brand="benz";
        mercedes.yearOfManufacture=2010;
        mercedes.drive();
        System.out.println(mercedes.colour);
        System.out.println(mercedes.brand);
        System.out.println(mercedes.yearOfManufacture);
        mercedes.stop();


        System.out.println(swift.brand);




    }

}
