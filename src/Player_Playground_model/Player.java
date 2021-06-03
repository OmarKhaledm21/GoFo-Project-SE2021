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

    /**
     * The setName function sets string value to attribute name of class Player
     * @param name sets name to name attribute
     * */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The getID method returns player ID
     * @return returns string ID of player*/
    public String getID() {
        return ID;
    }

    /**
     * The setID function sets string value to attribute ID of class Player
     * @param ID sets ID to ID attribute
     * */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * The getPassword method returns password of player
     * @return returns string password of player*/
    public String getPassword() {
        return password;
    }

    /**
     * The setPassword function sets string value to attribute Password of class Player
     * @param password sets password to password attribute
     * */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * The getPhone method returns players phone number
     * @return returns string phone number of player*/
    public String getPhone() {
        return phone;
    }

    /**
     * The setPhone function sets string value to attribute phone of class Player
     * @param phone sets string phone number to phone attribute
     * */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * The getLocation method returns players location
     * @return returns string location of player*/
    public String getLocation() {
        return location;
    }

    /**
     * The setLocation function sets string value to attribute location of class Player
     * @param location sets player location to string location attribute
     * */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * The getBooking method returns object of type Playgrounds
     * @return returns instance of Playgrounds*/
    public Playgrounds getBooking() {
        return booking;
    }

    /**
     * The setBooking function sets object of type Playground to object booking of class Player
     * @param booking sets booking object of type Playground to booking object
     * */
    public void setBooking(Playgrounds booking){
        this.booking=booking;
    }

    ////////////////// Methods //////////////////
    /**
     * function to display player bookings of playground objects*/
    public void displayBookings(){
        System.out.println("Bookings Details: ");
        System.out.println(booking.toString());
    }

    /**
     * Overriding toString method to
     * @return data as a string in a certain way */
    @Override
    public String toString () {
        String playerData="******************************************\nPlayer name: "+name+"\nPlayer phone: "+phone+
                "\nPlayer phone: "+phone+"\nPlayer location: "+location;
        return playerData;
    }
}
