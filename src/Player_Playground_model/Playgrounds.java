package Player_Playground_model;

import java.util.ArrayList;

public class Playgrounds {
    ////////////////// Attributes ///////////////////
    protected String playgroundName;
    protected String playgroundLocation;
    protected int playgroundSize;
    protected int validTimes;
    protected  double price;
    protected PlaygroundOwner owner;
    protected Boolean PlaygroundStatus ;


    ////////////////// Constructors //////////////////
    /**
     * Parametrized Constructor in case the object is supplied with object data at creation
     * @param playgroundName this initializes playground Name attribute with play ground Name name
     * @param playgroundLocation this initializes playground Location attribute with play ground Location
     * @param playgroundSize this initializes playground Size attribute with play ground Size
     * @param price this initializes price attribute with play ground price
     * @param validTimes this initializes valid time attribute with play ground valid time
     * */

    public Playgrounds(String playgroundName, String playgroundLocation, int playgroundSize,int validTimes,double price) {
        this.playgroundName = playgroundName;
        this.playgroundLocation = playgroundLocation;
        this.playgroundSize = playgroundSize;
        this.validTimes=validTimes;
        this.price=price;
    }
    ////////////////// Setters and Getters //////////////////

    /**
     * the getPlaygroundName method returns Play ground Name
     * @return string Name of play ground
     */
    public String getPlaygroundName() {
        return playgroundName;
    }

    /**
     *  setPlaygroundName function sets string value to attribute PlaygroundName of class Playgrounds
     * @param playgroundName set name to playgroundName Attribute
     */
    public void setPlaygroundName(String playgroundName) {
        this.playgroundName = playgroundName;
    }

    /**
     * the getPlaygroundLocation method returns Play ground location
     * @return string location of play ground
     */
    public String getPlaygroundLocation() {
        return playgroundLocation;
    }

    /**
     *  setPlaygroundLocation function sets string value to attribute playgroundLocation of class Playgrounds
     * @param playgroundLocation set location to playgroundLocation Attribute
     */
    public void setPlaygroundLocation(String playgroundLocation) {
        this.playgroundLocation = playgroundLocation;
    }

    /**
     * the getPlaygroundSize method returns Play ground size
     * @return int size of play ground
     */
    public int getPlaygroundSize() {
        return playgroundSize;
    }

    /**
     *  setPlaygroundSize function sets string value to attribute playgroundSize of class Playgrounds
     * @param playgroundSize set Size  to playgroundSize Attribute
     */
    public void setPlaygroundSize(int playgroundSize) {
        this.playgroundSize = playgroundSize;
    }

    /**
     * the getValidTimes method returns Play ground valid times
     * @return int valid times of play ground
     */
    public int getValidTimes() {
        return validTimes;
    }

    /**
     *  setValidTimes function sets int value to attribute validTimes of class Playgrounds
     * @param validTimes set Validtime to validTimes Attribute
     */
    public void setValidTimes(int validTimes) {
        this.validTimes = validTimes;
    }

    /**
     * the getPrice method returns Play ground price
     * @return int price of play ground
     */
    public double getPrice() {
        return price;
    }

    /**
     *  setPrice function sets int value to attribute price of class Playgrounds
     * @param price set price to price Attribute
     */
    public void setPrice(double price) {
        this.price = price;
    }

    public PlaygroundOwner getOwner() {
        return owner;
    }

    public void setOwner(PlaygroundOwner owner) {
        this.owner = owner;
    }

    /**
     * the getPlaygroundStatus method returns Play ground Status
     * @return Bool status of play ground
     */
    public Boolean getPlaygroundStatus() {
        return PlaygroundStatus;
    }

    /**
     *  setPlaygroundStatus function sets int value to attribute playgroundStatus of class Playgrounds
     * @param playgroundStatus set status to playgroundStatus Attribute
     */
    public void setPlaygroundStatus(Boolean playgroundStatus) {
        PlaygroundStatus = playgroundStatus;
    }

    /**
     * Overriding toString method to
     * @return data as a string in a certain way */
    @Override
    public String toString () {
        String PlaygroundInfo=
                "\n******************************************\n" +
                        "\nPlayground name: "+playgroundName +
                        "\nPlayground location: "+playgroundLocation +
                        "\nPlayground size: "+playgroundSize +
                        "\nprice : " + price +
                        "\nValid time slots: " + validTimes +
                        "\n******************************************\n" ;
        return PlaygroundInfo;
    }

}