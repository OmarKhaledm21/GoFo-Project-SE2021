package System_model;
import Player_Playground_model.Player;
import Player_Playground_model.PlaygroundOwner;
import Player_Playground_model.Playgrounds;

import java.util.ArrayList;

public class SystemValidation {
    ////////////////// Attributes ///////////////////
    /**
     * This is the system entire data stored in array lists so that it acts as
     * a temporary database on a single (System Instance/State) they are private
     * to ensure external manipulations doesn't affect them but only through setters
     * and getters specified.
     * */
    private ArrayList<Player>playersData;
    private ArrayList<PlaygroundOwner>playgroundOwnersData;
    private ArrayList<Playgrounds>playgroundsData;

    ////////////////// Constructors //////////////////
    /**
     * Default Constructor in case the object is supplied with no data at creation */
    public SystemValidation() {
        playersData = new ArrayList<Player>();
        playgroundOwnersData = new ArrayList<PlaygroundOwner>();
        playgroundsData = new ArrayList<Playgrounds>();
    }

    ////////////////// Setters and Getters //////////////////
   /**
    * The getPlayground method returns object of type Playgrounds
    * @return returns instance of Playgrounds*/
    public Playgrounds getPlayground(int i){
        return playgroundsData.get(i-1);
    }

    /**
     * The getPlayerCount returns the value expressing number of players registered in the system
     * @return returns playersData arraylist size*/
    public int getPlayerCount(){
        return playersData.size();
    }

    /**
     * The getPlaygroundOwnerCount method returns the value expressing the number of playground owners registered in the system
     * @return returns the playgroundOwnersData arraylist size*/
    public int getPlaygroundOwnerCount(){
        return playgroundOwnersData.size();
    }

    /**
     * The getPlaygroundCount method returns the value expressing the number of playgrounds registered in the system
     * @return returns the playgroundsData arraylist size*/
    public int getPlaygroundCount(){
        return playgroundsData.size();
    }

    /**
     * The setPlayersData method assigns an arraylist containing multiple objects of type player to
     * @oaram PlayersData arraylist attribute of the class to store them
     * */
    public void setPlayersData(ArrayList<Player> playersData) {
        this.playersData = playersData;
    }

    /**
     * The setPlaygroundOwnersData method assigns an arraylist containing multiple objects of type PlaygroundOwner to
     * @oaram playgroundOwnersData arraylist attribute of the class to store them
     * */
    public void setPlaygroundOwnersData(ArrayList<PlaygroundOwner> playgroundOwnersData) {
        this.playgroundOwnersData = playgroundOwnersData;
    }

    /**
     * The setPlaygroundsData method assigns an arraylist containing multiple objects of type Playgrounds to
     * @oaram playgroundsData arraylist attribute of the class to store them
     * */
    public void setPlaygroundsData(ArrayList<Playgrounds> playgroundsData) {
        this.playgroundsData = playgroundsData;
    }

    ////////////////// Methods //////////////////
    /**
     * The registerPlayer function sets multiple values to different parameters of an instance of class
     * Player and then sets this instance in the arraylist for storing it in system class
     * @param ID saves player id to the instance
     * @param location saves player location to the instance
     * @param name save player name to the instance
     * @param password saves player password to the instance
     * @param phone saves player phone number to the instance*/
    public Player registerPlayer(String name, String ID, String password, String phone, String location){
        Player player = new Player(name,ID,password,phone,location);
        playersData.add(player);
        return player;
    }

    /**
     * The registerPlaygroundOwner function sets multiple values to different parameters of an instance
     * of class PlaygroundOwner and then sets this instance in the arraylist for storing it in system class
     * @param ID saves player id to the instance
     * @param location saves player location to the instance
     * @param name save player name to the instance
     * @param password saves player password to the instance
     * @param phone saves player phone number to the instance*/
    public PlaygroundOwner registerPlaygroundOwner(String name, String ID, String password, String phone, String location){
        PlaygroundOwner playgroundOwner = new PlaygroundOwner(name,ID,password,phone,location);
        playgroundOwnersData.add(playgroundOwner);
        return playgroundOwner;
    }

    /**
     * The registerPlaygrounds function sets multiple values to different parameters of an instance
     * of class Playgrounds and then sets this instance in the arraylist for storing it in system class
     * @param playgroundOwner saves playground owner object to the instance
     * @param playgroundLocation saves playground location to the instance
     * @param playgroundName save playground name to the instance
     * @param playgroundSize saves playground size to the instance*/
    public Playgrounds registerPlayground(PlaygroundOwner playgroundOwner, String playgroundName, String playgroundLocation, int playgroundSize, int validTimes, double price){
        Playgrounds playground= new Playgrounds(playgroundName,playgroundLocation,playgroundSize,validTimes,price);
        playgroundOwner.setOwnedPlaygrounds(playground);
        playground.setOwner(playgroundOwner);
        playgroundsData.add(playground);
        return playground;
    }

    /**
     * This class validates player data on login by matching supplied data with the
     * data stored on the system class arraylist and returns object of type Player
     * @return returns instance of player class*/
    public Player playerValidation(String username, String password){
        for(int i=0; i<playersData.size(); i++){
            if(playersData.get(i).getID().equals(username) && playersData.get(i).getPassword().equals(password)){
                return playersData.get(i);
            }
        }
        return null;
    }

    /**
     * This class validates playgroundOwners data on login by matching supplied data with the
     * data stored on the system class arraylist and returns object of type PlaygroundOwner
     * @return returns instance of playgroundOwner class*/
    public PlaygroundOwner playgroundOwnerValidation(String username, String password){
        for(int i=0; i<playgroundOwnersData.size(); i++){
            if(playgroundOwnersData.get(i).getID().equals(username) && playgroundOwnersData.get(i).getPassword().equals(password)){
                return playgroundOwnersData.get(i);
            }
        }
        return null;
    }

    /**
     * Overriding toString method to
     * @return data as a string in a certain way */
    public void displayPlaygrounds(){
        if(playgroundsData.size()==0){
            System.out.println("No playgrounds are registered in the system!");
        }else {
            for (int i = 0; i < playgroundsData.size(); i++) {
                System.out.println("Playground number: "+i+1);
                System.out.println(playgroundsData.get(i).toString());
            }
        }
    }
}
