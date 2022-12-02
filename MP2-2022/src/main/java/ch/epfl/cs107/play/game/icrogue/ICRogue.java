package ch.epfl.cs107.play.game.icrogue;

import ch.epfl.cs107.play.game.areagame.Area;
import ch.epfl.cs107.play.game.areagame.AreaGame;
import ch.epfl.cs107.play.game.areagame.actor.Orientation;
import ch.epfl.cs107.play.game.icrogue.actor.ICRoguePlayer;
import ch.epfl.cs107.play.game.icrogue.area.level10.rooms.Level10Room;
import ch.epfl.cs107.play.game.tutosSolution.actor.GhostPlayer;
import ch.epfl.cs107.play.game.tutosSolution.area.Tuto2Area;
import ch.epfl.cs107.play.io.FileSystem;
import ch.epfl.cs107.play.math.DiscreteCoordinates;
import ch.epfl.cs107.play.window.Window;


public class ICRogue extends AreaGame {
    private ICRoguePlayer player ;
    Level10Room level;
    private int areaIndex;
    public String getTitle() {
        return "ICRogue";
    }

    private final String[] areas={"icrogue/Level0Room"};
    private void initLevel(){
        level= new Level10Room("icrogue/Level0Room" ,new DiscreteCoordinates(0,0));
    }
    public boolean begin(Window window, FileSystem fileSystem){
        if (super.begin(window, fileSystem)) {
            initLevel();
            areaIndex = 0;
            return true;
        }
        return false;
    }
    @Override
    public void update(float deltaTime) {

    }
    @Override
    public void end() {
    }
    //protected void switchArea() {



        //Tuto2Area currentArea = (Tuto2Area)setCurrentArea(areas[areaIndex], false);

    //}
    private void initArea(String areaKey) {

        Tuto2Area area = (Tuto2Area)setCurrentArea(areaKey, true);
        DiscreteCoordinates coords = area.getPlayerSpawnPosition();
        //

    }


}
