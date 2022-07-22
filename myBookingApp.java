import java.util.*;

public class myBookingApp{
    public static void main(String[] args){
        
        //declare scanner
        Scanner in = new Scanner(System.in);
        Scanner inline = new Scanner(System.in);
        
        //array of object myBooking
        myBooking[] booking = new myBooking[20];
        
        String eventVenue = null;
        //store all data into array
        for(int i=0; i < booking.length; i++) {
            
            System.out.println("\n*********************UiTM’s Venues Booking System********************************");
            
            System.out.print("\nBooking " + (i+1));
            System.out.print("\nPerson in Charge Details : ");
            System.out.print("\nName : ");
            String name = inline.nextLine();
            System.out.print("For non-UiTM organisation/person, please enter your IC number");
            System.out.print("\nStaff/Student ID: ");
            int ID = in.nextInt();
            System.out.print("Address : ");
            String address = inline.nextLine();
            System.out.print("Contact Number : ");
            int contactNo = in.nextInt();
            
            System.out.println("\nEvent Details");
            System.out.print("Event Name : ");
            String eventName = inline.nextLine();
            System.out.println("Venue (Dewan Titiwangsa (DT), Dewan Kuliah 300 (DK300), Dewan Kuliah 200 (DK200) : ");
            eventVenue = in.next();
            System.out.print("Date : ");
            String eventDate = inline.nextLine();
            System.out.print("Booking time (start) : ");
            int eventStart = in.nextInt();
            System.out.print("Booking time (end) : ");
            int eventEnd = in.nextInt();
            
            System.out.println("Time difference in hour and minutes");
            System.out.print("Hour : ");
            int diffHour = in.nextInt();
            System.out.print("Minutes : ");
            int diffMinutes = in.nextInt();
            
            booking [i] = new myBooking(name, ID, address, contactNo, eventName, eventVenue, eventDate, eventStart, eventEnd, diffHour, diffMinutes);
        }
        
        for(int i=0; i < booking.length; i++) {
            if(booking[i].getEventVenue().equalsIgnoreCase("DT")) { eventVenue = "Dewan Titiwangsa"; }
            
        }
        
        //display toString
        for(int i=0; i < booking.length; i++) {
            System.out.println("\n*********************Bookings********************************");
            System.out.println(booking[i].toString());
        }
        
        //count and displaying total bookings for each venue
        int countDT = 0;
        int countDK300 = 0;
        int countDK200 = 0;
        for(int i=0; i < booking.length; i++) {
            if(booking[i].getEventVenue().equalsIgnoreCase("DT")) { countDT++; }
            else if(booking[i].getEventVenue().equalsIgnoreCase("DK300")) { countDK300++; }
            else if(booking[i].getEventVenue().equalsIgnoreCase("DK200")) { countDK200++; }
        }
        
        System.out.println("\n*********************Total Bookings********************************");
        System.out.print("\nDewan Titiwangsa : " + countDT);
        System.out.print("\nDewan Kuliah 300 : " + countDK300);
        System.out.print("\nDewan Kuliah 200 : " + countDK200);
        
        //calculating and displaying total bookings charged for all the venues
        double totalAllBooking = 0;
        for(int i=0; i < booking.length; i++) {
            totalAllBooking = totalAllBooking + booking[i].calculateTotalPrice();
        }
        
        System.out.println("\nTotal bookings charged for all the venues : RM " + totalAllBooking);
    }
}
