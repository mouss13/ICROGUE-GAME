package ch.epfl.cs107.play.game.icrogue;

import ch.epfl.cs107.play.game.areagame.AreaGame;
import ch.epfl.cs107.play.game.areagame.actor.Orientation;
import ch.epfl.cs107.play.game.icrogue.actor.ICRoguePlayer;
import ch.epfl.cs107.play.game.tutosSolution.actor.GhostPlayer;
import ch.epfl.cs107.play.game.tutosSolution.area.Tuto2Area;
import ch.epfl.cs107.play.io.FileSystem;
import ch.epfl.cs107.play.math.DiscreteCoordinates;
import ch.epfl.cs107.play.window.Window;


public class ICRogue extends AreaGame {
    private ICRoguePlayer player ;
    private int areaIndex;
    public String getTitle() {
        return "ICRogue";
    }

    private final String[] areas={" "};
    private void createAreas(){
    }
    public boolean begin(Window window, FileSystem fileSystem) {


        if (super.begin(window, fileSystem)) {
            createAreas();
            areaIndex = 0;
            return true;
        }
        return false;
    }
    @Override
    public void update(float deltaTime) {
        if(player.isWeak()){
            switchArea();
        }
        super.update(deltaTime);

    }
    @Override
    public void end() {
    }
    protected void switchArea() {

        player.leaveArea();

        areaIndex = (areaIndex==0) ? 1 : 0;

        Tuto2Area currentArea = (Tuto2Area)setCurrentArea(areas[areaIndex], false);
        player.enterArea(currentArea, currentArea.getPlayerSpawnPosition());

        player.strengthen();
    }
    private void initArea(String areaKey) {

        Tuto2Area area = (Tuto2Area)setCurrentArea(areaKey, true);
        DiscreteCoordinates coords = area.getPlayerSpawnPosition();
        player = new ICRoguePlayer(area, Orientation.DOWN, coords,"ghost.1");
        player.enterArea(area, coords);
        player.centerCamera();

    }


}
