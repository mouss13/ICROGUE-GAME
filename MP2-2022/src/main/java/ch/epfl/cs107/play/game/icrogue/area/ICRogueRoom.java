package ch.epfl.cs107.play.game.icrogue.area;

import ch.epfl.cs107.play.game.areagame.Area;
import ch.epfl.cs107.play.game.areagame.actor.Background;
import ch.epfl.cs107.play.game.areagame.actor.Foreground;
import ch.epfl.cs107.play.math.DiscreteCoordinates;

public abstract class ICRogueRoom extends Area {

   public ICRogueRoom(String behaviorName , DiscreteCoordinates roomCoordinates){
       behaviorName="icrogue/Level0Room";

    }
    @Override
    public String getTitle() {
        return "ICRogueRoom";
    } // a changer

    public DiscreteCoordinates getPlayerSpawnPosition() {
        return new DiscreteCoordinates(2,10);
    }

    protected void createArea() {
        // Base
        registerActor(new Background(this));
        registerActor(new Foreground(this));
    }


}
