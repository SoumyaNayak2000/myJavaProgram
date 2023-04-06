package OopConcept;

import java.sql.SQLOutput;

public class classesAndObjects {
    int x;

    public static void main(String[] args) {
        int a=5;
        classesAndObjects obj1=new classesAndObjects();
        obj1.x=10;
        classesAndObjects obj2=new classesAndObjects();
        obj2.x += a;
        classesAndObjects obj3=new classesAndObjects();
        //dot operation is used to access any of the variable or any of the methode

        System.out.println(obj1.x);

        System.out.println(obj2.x);
        System.out.println(obj3.x);
    }
}
//      [obj1 x]
//      [obj2 x]