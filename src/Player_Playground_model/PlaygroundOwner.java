package Player_Playground_model;
import Player_Playground_model.Playgrounds;

import java.util.ArrayList;

public class PlaygroundOwner extends Player {
    private ArrayList<Playgrounds>ownedPlaygrounds;

    public PlaygroundOwner(String name, String ID, String password, String phone, String location) {
        super(name, ID, password, phone, location);
        ownedPlaygrounds = new ArrayList<Playgrounds>();
    }

    public ArrayList<Playgrounds> getOwnedPlaygrounds() {
        return ownedPlaygrounds;
    }

    public void setOwnedPlaygrounds(Playgrounds ownedPlayground) {
        ownedPlaygrounds.add(ownedPlayground);
    }

    public void displayOwnedPlaygrounds(){
        System.out.println("****************************\nowned playgrounds are: ");
        for(int i=0; i<ownedPlaygrounds.size(); i++){
            System.out.println(ownedPlaygrounds.get(i).toString());
        }
    }
}
