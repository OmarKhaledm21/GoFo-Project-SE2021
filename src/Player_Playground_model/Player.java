package Player_Playground_model;

public class Player {
    ////////////////// Attributes ///////////////////
    protected String name;
    protected String ID;
    protected String password;
    protected String phone;
    protected String location;
    private Playgrounds booking;

    ////////////////// Constructors //////////////////
    /**
     * Parametrized Constructor in case the object is supplied with object data at creation
     * @param phone this initializes phone attribute with players phone number
     * @param password this initializes password attribute with players password
     * @param name this initializes name attribute with players name
     * @param location this initializes location attribute with players location
     * @param ID this initializes ID attribute with players ID
     * */
    public Player(String name,String ID,String password,String phone,String location){
        this.name=name;
        this.ID=ID;
        this.password=password;
        this.phone=phone;
        this.location=location;
        booking=null;
    }

    ////////////////// Setters and Getters //////////////////
    /**
     * The getName method returns player name
     * @return returns string name of player*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The getID method returns player ID
     * @return returns string ID of player*/
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * The getPassword method returns password of player
     * @return returns string password of player*/
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * The getPhone method returns players phone number
     * @return returns string phone number of player*/
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * The getPlayground method returns players location
     * @return returns instance of Playgrounds*/
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * The getPlayground method returns object of type Playgrounds
     * @return returns instance of Playgrounds*/
    public Playgrounds getBooking() {
        return booking;
    }

    public void setBooking(Playgrounds booking){
        this.booking=booking;
    }

    ////////////////// Methods //////////////////
    public void displayBookings(){
        System.out.println("Bookings Details: ");
        System.out.println(booking.toString());
    }

    @Override
    public String toString () {
        String playerData="******************************************\nPlayer name: "+name+"\nPlayer phone: "+phone+
                "\nPlayer phone: "+phone+"\nPlayer location: "+location;
        return playerData;
    }
}
