public class myBooking{

    //attribute
    private String name;
    private int ID;
    private String address;
    private int contactNo;
    private String eventName;
    private String eventVenue;
    private String eventDate;
    private int eventStart;
    private int eventEnd;
    private int diffHour;
    private int diffMinutes;
    
    //default constructor
    private myBooking(){}
    
    //normal constructor
    public myBooking(String n, int id, String a, int no, String en, String ev, String ed, int es, int ee, int dh, int dm){
        this.name = n;
        this.ID = id;
        this.address = a;
        this.contactNo = no;
        this.eventName = en;
        this.eventVenue = ev;
        this.eventDate = ed;
        this.eventStart = es;
        this.eventEnd = ee;
        this.diffHour = dh;
        this.diffMinutes = dm;
    }
    
    //mutator
    public void setName(String n) {this.name = n;}
    public void setNRIC(int id) {this.ID = id;}
    public void setAddress(String a) {this.address = a;}
    public void setContactNo(int no) {this.contactNo = no;}
    public void setEventName(String en) {this.eventName = en;}
    public void setEventVenue(String ev) {this.eventVenue = ev;}
    public void setEventDate(String ed) {this.eventDate = ed;}
    public void setEventStart(int es) {this.eventStart = es;}
    public void setEventEnd(int ee) {this.eventEnd = ee;}
    public void setDiffHour(int dh) {this.diffHour = dh;}
    public void setDiffMinutes(int dm) {this.diffMinutes = dm;}
    
    //accessor
    public String getName() {return this.name;}
    public int getID() {return this.ID;}
    public String getAddress() {return this.address;}
    public int getContactNo() {return this.contactNo;}
    public String getEventName() {return this.eventName;}
    public String getEventVenue() {return eventVenue;}
    public String getEventDate() {return eventDate;}
    public int getEventStart() {return eventStart;}
    public int getEventEnd() {return eventEnd;}
    public int getDiffHour() {return diffHour;}
    public int getDiffMinutes() {return diffMinutes;}
    
    //processor
    public double calculateTotalPrice() {
        double totalPrice = 0;
        
        if(this.eventVenue.equalsIgnoreCase("DT")){
            totalPrice = 300 * this.diffHour;
        }
        else if(this.eventVenue.equalsIgnoreCase("DK300")){
            totalPrice = 150 * this.diffHour;
        }
        else if (this.eventVenue.equalsIgnoreCase("DK200")){
            totalPrice = 100 * this.diffHour;
        }
        return totalPrice;
    }
    
    //printer
    public String toString() {
    String str = "\nName : " + this.getName() + "\n" + 
                 "ID : " + this.getID() + "\n" +
                 "Address : " + this.getAddress() + "\n" +
                 "Contact Number : " + this.getContactNo() + "\n" +
                 "Event Name : " + this.getEventName() + "\n" +
                 "Event Venue : " + this.getEventVenue() + "\n" +
                 "Event Date : " + this.getEventDate() + "\n" +
                 "Booking time (starting) : " + this.getEventStart() + "\n" +
                 "Booking time (ending) : " + this.getEventEnd() + "\n"+
                 "Usage Hour : " + this.getDiffHour() + 
                 " hour(s) " + this.getDiffMinutes() + " minute(s) " + "\n" +
                 "Booking charge : RM " + this.calculateTotalPrice();
    return str;
    }
}

//comments
/*****************************
PROGRAMMER #1
Name: MUHAMMAD MU'IZZ BIN RUSDI
Student ID: 2020488798
Group: CS1102B
Phone Number: 01111850771

PROGRAMMER #2
Name:MUHAMMAD ISHRAQI BIN MOHD RIZAL
Student ID: 2020463392
Group: CS1102B
Phone Number: 0172915854

PROGRAMMER #3
Name: MUHAMMAD HANIF BIN HAMIZAN
Student ID: 2020601086
Group: CS1102B
Phone Number: 01137959011
*****************************/
