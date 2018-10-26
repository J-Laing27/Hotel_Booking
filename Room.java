import java.util.Scanner;

public class Room {

    private int roomNos;
    private Customer occupier;
    private boolean status;

    public Room(int rnos) {

        roomNos = rnos;
        status = true; //empty
    }

    public void Display() {

        System.out.println("Room Number: " + roomNos);
        if (status == true)
            System.out.println("Room is free");
        else
            occupier.display();
    }

    public void BookRoom(Customer newPerson) {

        if(status==true) {

            status = false;
            occupier = newPerson;
        } else
            System.out.println("Sorry room booked");
    }

    public void BookRoom() {

        System.out.println("Room "+roomNos);
        if(status==true) {
            Customer newPerson = new Customer();
            newPerson.getname();
            newPerson.getemail();
            status = false;
            occupier = newPerson;
        } else
            System.out.println("Sorry room booked");
    }

    public void CancelRoom() {

        status = true;
        occupier = null;
        System.out.println("Room cancelled");
    }

    public int returnRoomNos()
    {
        return(roomNos);
    }
}