package ch.epfl.cs107.play.game.icrogue.area.level10.rooms;
import ch.epfl.cs107.play.game.icrogue.area.ICRogueRoom;
import ch.epfl.cs107.play.math.DiscreteCoordinates;

public class Level10Room extends ICRogueRoom {

    ICRogueRoom level ;

    public Level10Room(String behaviorName, DiscreteCoordinates roomCoordinates) {
        super(behaviorName, roomCoordinates);
    }

    @Override
    public DiscreteCoordinates getPlayerSpawnPosition() {
        return super.getPlayerSpawnPosition();
    }
    public int getX(){
        return getPlayerSpawnPosition().x;
    }
    public int getY(){
        return getPlayerSpawnPosition().y;
    }

    @Override
    public String getTitle() {
        return "icrogue/level0"+getX()+getY();
    }
    @Override
    public float getCameraScaleFactor() {
        return 0;
    }
}
