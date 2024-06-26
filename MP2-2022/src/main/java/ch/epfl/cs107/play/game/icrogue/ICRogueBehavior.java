package ch.epfl.cs107.play.game.icrogue;

import ch.epfl.cs107.play.game.areagame.AreaBehavior;
import ch.epfl.cs107.play.game.areagame.actor.Interactable;
import ch.epfl.cs107.play.game.areagame.handler.AreaInteractionVisitor;
import ch.epfl.cs107.play.game.icrogue.actor.ICRoguePlayer;
import ch.epfl.cs107.play.window.Window;

public class ICRogueBehavior extends AreaBehavior {

    public class ICRogueCell extends AreaBehavior.Cell {

        /**
         * Default Cell constructor
         *
         * @param x (int): x-coordinate of this cell
         * @param y (int): y-coordinate of this cell
         */
        public ICRogueCell(int x, int y, ICRogueBehavior.ICRogueCellType type) {
            super(x, y);
            this.type=type;
        }

        @Override
        protected boolean canLeave(Interactable entity) {
            return false;
        }

        @Override
        protected boolean canEnter(Interactable entity) {
            return false;
        }

        @Override
        public boolean isCellInteractable() {
            return false;
        }

        @Override
        public boolean isViewInteractable() {
            return false;
        }

        @Override
        public void acceptInteraction(AreaInteractionVisitor v, boolean isCellInteraction) {

        }
    }
    public enum ICRogueCellType{
        //https://stackoverflow.com/questions/25761438/understanding-bufferedimage-getrgb-output-values
        NULL(0, false),
        WALL(-16777216, false),
        IMPASSABLE(-8750470, false),
        INTERACT(-256, true),
        DOOR(-195580, true),
        WALKABLE(-1, true),;

        final int type;
        final boolean isWalkable;

        ICRogueCellType(int type, boolean isWalkable){
            this.type = type;
            this.isWalkable = isWalkable;
        }

        public static ICRogueBehavior.ICRogueCellType toType(int type){
            for(ICRogueBehavior.ICRogueCellType ict : ICRogueBehavior.ICRogueCellType.values()){
                if(ict.type == type)
                    return ict;
            }
            // When you add a new color, you can print the int value here before assign it to a type
            System.out.println(type);
            return NULL;
        }
    }

    /**
     * Default Tuto2Behavior Constructor
     * @param window (Window), not null
     * @param name (String): Name of the Behavior, not null
     */
    public ICRogueBehavior(Window window, String name){
        super();
        int height = getHeight();
        int width = getWidth();
        for(int y = 0; y < height; y++) {
            for (int x = 0; x < width ; x++) {
                ICRogueBehavior.ICRogueCellType color = ICRogueBehavior.ICRogueCellType.toType(getRGB(height-1-y, x));
                setCell(x,y, new ICRogueBehavior.ICRogueCell(x,y,color));
            }
        }
    }
}
