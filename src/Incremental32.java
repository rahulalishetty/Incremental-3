class Cycle {
    void balance(){
        System.out.println("balance method in cycle class");
    }
}

class UniCycle extends Cycle{
    void balance(){
        System.out.println("balance method in UniCycle class");
    }
}

class BiCycle extends Cycle{
    void balance(){
        System.out.println("balance method in BiCycle class");
    }
}

class TriCycle extends Cycle {
}


public class Incremental32 {
    public static void main(String[] args) {
        UniCycle uniCycle = new UniCycle();
        BiCycle biCycle = new BiCycle();
        TriCycle triCycle = new TriCycle();

        Cycle cycleArray[] = new Cycle[3];
        cycleArray[0] = (Cycle) uniCycle;
        cycleArray[1] = (Cycle) biCycle;
        cycleArray[2] = (Cycle) triCycle;//upcasting to cycle class

        for (int i = 0; i < cycleArray.length; i++)
            cycleArray[i].balance();

        Cycle cycle1 = new UniCycle();
        Cycle cycle2 = new BiCycle();
        Cycle cycle3 = new TriCycle();

        cycle1 = (UniCycle) cycle1;//down casting
        cycleArray[0] = cycle1;
        cycle2 = (BiCycle) cycle2;
        cycleArray[0] = cycle2;
        cycle3 = (TriCycle) triCycle;
        cycleArray[0] = cycle3;

        for (int i = 0; i < cycleArray.length; i++)
            cycleArray[i].balance();
    }
}
