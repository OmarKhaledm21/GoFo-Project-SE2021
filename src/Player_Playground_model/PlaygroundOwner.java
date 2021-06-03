package Player_Playground_model;
import Player_Playground_model.Playgrounds;

import java.util.ArrayList;

public class PlaygroundOwner extends Player{
    /***
     * @param ownedPlaygrounds, an array list that holds the ownedPlaygrounds of the Owner.
     */

    ////////////////// Attributes ///////////////////
    private ArrayList<Playgrounds>ownedPlaygrounds;

    /***
     *
     * @param name name of the playgroundOwner
     * @param ID ID of the Playground owner (will be used in the log in process)
     * @param password password of the playgroundOwner (will be used in the log in process)
     * @param phone phone number of the playgroundOwner
     * @param location location of the PlaygoundOwner
     */
    ////////////////// Constructors //////////////////

    public PlaygroundOwner(String name, String ID, String password, String phone, String location) {
        super(name, ID, password, phone, location);
        ownedPlaygrounds = new ArrayList<Playgrounds>();
    }

    /***
     *
     * @return Playgrounds arraylist
     */
    ////////////////// Setters and Getters //////////////////
    public ArrayList<Playgrounds> getOwnedPlaygrounds() {
        return ownedPlaygrounds;
    }

    /***
     *
     * @param ownedPlayground sets the owner's owned playground
     */
    public void setOwnedPlaygrounds(Playgrounds ownedPlayground) {
        ownedPlaygrounds.add(ownedPlayground);
    }
    ////////////////// Methods //////////////////

    public void displayOwnedPlaygrounds(){
        System.out.println("****************************\nowned playgrounds are: ");
        for(int i=0; i<ownedPlaygrounds.size(); i++){
            System.out.println(ownedPlaygrounds.get(i).toString());
        }
    }
}