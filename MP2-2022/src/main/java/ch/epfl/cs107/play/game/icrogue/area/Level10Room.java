package ch.epfl.cs107.play.game.icrogue.area.level10.rooms;

import ch.epfl.cs107.play.game.icrogue.area.ICRogueRoom;

public class Level10Room extends ICRogueRoom {
    ICRogueRoom player= new ICRogueRoom() {
        @Override
        public float getCameraScaleFactor() {
            return 0;
        }
    }

    @Override
    public String getTitle() {
        return "icrogue/level0";
    }

    @Override
    public float getCameraScaleFactor() {
        return 0;
    }
}
