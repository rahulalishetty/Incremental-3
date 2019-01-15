//for question 3

interface Train{
    void getTrainName();
    void getTrainNo();
}

interface Ticket{
    void getTicketNo();
    void getTicketStatus();
}

interface Passenger{
    void getPassengerName();
    void getPassengerId();
}

interface PassengerTicketInfo extends Passenger,Ticket, Train{
    void getPrice();
}

class Concrete{
    void concreteMethod(){
        System.out.println("in concrete method");
    }
}

class ImplementInterface extends Concrete implements PassengerTicketInfo{

    @Override
    public void getTrainName() {
        System.out.println("Krishna express");
    }

    @Override
    public void getTrainNo() {
        System.out.println("124556");
    }

    @Override
    public void getTicketNo() {
        System.out.println("234123423988");
    }

    @Override
    public void getTicketStatus() {
        System.out.println("ticket booked");
    }

    @Override
    public void getPassengerName() {
        System.out.println("rahul");
    }

    @Override
    public void getPassengerId() {
        System.out.println("123423");
    }

    @Override
    public void getPrice() {
        System.out.println("250");
    }

    void trainInterface(Train train){
        train.getTrainName();
        train.getTrainNo();
    }

    void ticketInterface(Ticket ticket){
        ticket.getTicketNo();
        ticket.getTicketStatus();
    }

    void passengerInterface(Passenger passenger){
        passenger.getPassengerId();
        passenger.getPassengerName();
    }

    void infoInterface(PassengerTicketInfo passengerTicketInfo){
        passengerTicketInfo.getPrice();
    }
}

public class Incremental33 {
    public static void main(String[] args){
        ImplementInterface implementInterface=new ImplementInterface();
        implementInterface.trainInterface(implementInterface);
        implementInterface.passengerInterface(implementInterface);
        implementInterface.ticketInterface(implementInterface);
        implementInterface.infoInterface(implementInterface);
        implementInterface.concreteMethod();
    }
}
