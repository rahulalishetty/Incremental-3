abstract class Rodent {
    protected String nameOfRodent;
    Rodent(){
        nameOfRodent="";
        System.out.println("this is rodent abstract class");
    }
    Rodent(String name){
        nameOfRodent=name;
        System.out.println("this is rodent abstract class");
    }
    abstract void getSpecies();
}

class Mouse extends Rodent{

    Mouse(String name){
        super(name);
        System.out.println("this is mouse class");
    }
    @Override
    void getSpecies() {
        System.out.println(nameOfRodent+" is Mouse");
    }
}

class Gerbil extends Rodent {

    Gerbil(String name){
        super(name);
        System.out.println("this is gerbil class");
    }

    @Override
    void getSpecies() {
        System.out.println(nameOfRodent+" is getbil");
    }
}

class Hamster extends Rodent {

    Hamster(String name){
        super(name);
        System.out.println("this is hamster class");
    }

    @Override
    void getSpecies() {
        System.out.println(nameOfRodent+" is hamster");
    }
}


public class Incremental31 {
    public static void main(String[] args) {
        //for question 1
        Rodent rodent1 = new Mouse("henry");
        Rodent rodent2 = new Gerbil("harry");
        Rodent rodent3 = new Hamster("adam");
        Rodent rodentArray[] = new Rodent[3];
        rodentArray[0] = rodent1;
        rodentArray[1] = rodent2;
        rodentArray[2] = rodent3;
        for (int i = 0; i < rodentArray.length; i++)
            rodentArray[i].getSpecies();
    }
}
