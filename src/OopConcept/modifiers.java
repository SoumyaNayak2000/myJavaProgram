package OopConcept;
/*access modifiers
public private protected default
with class we use two modifiers that is public and default
public class->class accessible by any other class
default class->class is accesible only in same package

variables and methods
        public -> code is accessible for all the classes
        private -> code is accessible only in declared class
        protected -> code is accessible only in same package or in subclass
        default -> code is only accessible only in same package

non access modifiers

final static abstract
with class
static class-> is not possible
final class -> cant be inherited
abstract class -> cant create object

with variable and methods
final -> final variable cant be modified,method cant be overridden;
static -> belongs to class not object
abstract -> cant used abstract variable,abstract methode only used in abstract class and it doesnt contain any body and child class provides it body after inheriting.

 */

public class modifiers {
    protected int a;
    protected int doit(){
        System.out.println("doit");
        return 9;
    }


}
