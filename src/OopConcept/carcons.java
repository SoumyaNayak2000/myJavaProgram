package OopConcept;

public class carcons {
    int modelYear;
    String modelName;
    //methode with same as class name,no return type,must have same name as classs name.
    public carcons(int modelYear,String modelName){
     /*
     modelYear=year;
     modelName=model;
     */
        this.modelYear=modelYear;
       this.modelName=modelName;

    }
    public carcons(){

    }
    public carcons(int modelyear){
        this.modelYear=modelyear+3;
    }


    public static void main(String[] args) {
        carcons benz=new carcons(2012,"mercedes");
        System.out.println(benz.modelYear);
        System.out.println(benz.modelName);

        carcons tata=new carcons(2022,"nexon");
        System.out.println(tata.modelYear);
        System.out.println(tata.modelName);

        carcons mg=new carcons(1998);
        System.out.println(mg.modelYear);
    }

}
