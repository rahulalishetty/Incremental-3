interface CycleTwo {
    void balance();
}

class Unicycle implements CycleTwo {
    public void balance(){
        System.out.println("balance method in UniCycle class");
    }
}

class Bicycle implements CycleTwo {
    public void balance(){
        System.out.println("balance method in BiCycle class");
    }
}

class Tricycle implements CycleTwo {
    public void balance(){
        System.out.println("balance method in BiCycle class");
    }
}
class CycleFactory{
    public static CycleTwo createCycle(String type) {
        if("Unicycle".equalsIgnoreCase(type))
            return new Unicycle();
        else if ("Bicycle".equalsIgnoreCase(type))
            return new Bicycle();
        else if("Tricycle".equalsIgnoreCase(type))
            return  new Tricycle();
        else {
            System.out.println("not valid cycle returing a bicycle");
            return new Bicycle();
        }
    }
}

class Incremental34 {
    public static void main(String[] args){
        CycleTwo unicycle = CycleFactory.createCycle("Unicycle");
        unicycle.balance();
        CycleTwo bicycle = CycleFactory.createCycle("Bicycle");
        bicycle.balance();
        CycleTwo tricycle = CycleFactory.createCycle("Tricycle");
        tricycle.balance();
    }
}
