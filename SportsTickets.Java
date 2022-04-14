package Practice2;

import java.util.Scanner;

public class SportsTickets {
    private int numOfSeats;
    private boolean isSeatAvailable = true;
    private int costOfSeat;
    private int seatId=0;
    public int total = numOfSeats *  costOfSeat;
    public int currentPrice;
    private boolean stay = true;


    public SportsTickets(int costOfSeat, boolean isSeatAvailable) {
        this.costOfSeat = costOfSeat;
        this.isSeatAvailable = isSeatAvailable;
    }
    public SportsTickets (){}

    public void startUp(){
while(stay){
            intro();
            chooseSeatType();
            wouldYouPurchase();
    }}

    private void wouldYouPurchase() {
        System.out.println("\n Would you like to purchase these seats ? y/n: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        if (input.equals("y")) {
            System.out.println("\n# of seats purchased : " + this.numOfSeats );
            System.out.println("\ntype of seat: "+ seat());
            int totalPrice = this.numOfSeats * this.currentPrice;
            System.out.println("Total : " + totalPrice);
            setSeatAvailable(false);
            System.out.println("Please visit www.Payo.com to pay this total");
        }
        else{
            System.out.println("Bye!");
            stay = false;
            return;
        }
        System.out.println("Keep Shopping? y/n:");
        String inp = in.nextLine();
        if (inp.equals("y")){
            stay= true;
        }
        else {
            stay= false;
        }

    }

    private void chooseSeatType() {
        switch (seatId){
            case 1:
                CoursideSeats s = new CoursideSeats();
                this.currentPrice = s.getCostOfSeat();
                break;
                case 2:
                MiddleSeats m = new MiddleSeats();
                this.currentPrice = m.getCostOfSeat();
                break;
        }
    }

    private void intro() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many seats do you want?: ");
        this.numOfSeats = in.nextInt();
        System.out.println("Pick a seat type : \n 1. Courtside Seats \n 2. Middle Seats \n 3. Nosebleed Seats");
        this.seatId = in.nextInt();
        this.isSeatAvailable = true;
        if(isSeatAvailable){
            System.out.println("Seat is available !");
        }
        else {
            System.out.println("Seat is unavailable");
            return;
        }
    }


    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public boolean isSeatAvailable() {
        return isSeatAvailable;
    }

    public void setSeatAvailable(boolean seatAvailable) {
        isSeatAvailable = seatAvailable;
    }

    public int getCostOfSeat() {
        System.out.println("This seat is $" + costOfSeat);
        return costOfSeat;
    }


    public void setCostOfSeat(int costOfSeat) {
        this.costOfSeat = costOfSeat;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }
  public String seat(){
      String seatType = " ";
        switch (seatId){

            case 1:
                seatType = "Courside";
                break;
            case 2:
                seatType ="Middle Seats";
                break;
        }
      return seatType ;
  }
}
