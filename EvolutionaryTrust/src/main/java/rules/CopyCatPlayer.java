package rules;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;

public class CopyCatPlayer implements PlayerBehaviour {

    private int count = 1;
//    private String moveType;

    @Override
    public MoveType getMoveType() throws IOException {
        if (count == 1) {
            count++;
            return MoveType.COOPERATE;
        }
//        else {
//            System.out.println("Calling catMove"+getCopyCatMOveType());
//            return getCopyCatMOveType();
//        }

        return null;
    }

//    private MoveType getCopyCatMOveType()
//    {
//        return MoveType.getMoveType(moveType);
//    }
//
//    @Override
//    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
//        System.out.println("Event Type ->" + propertyChangeEvent.getPropertyName());
//        System.out.println("Old Value ->" + propertyChangeEvent.getOldValue());
//        System.out.println("New Value ->" + propertyChangeEvent.getNewValue());
//        MoveType m = (MoveType) propertyChangeEvent.getNewValue();
//        this.moveType = MoveType.getMoveType(m);
//        System.out.println("After Setting " + this.moveType);
//    }
}
