
/**
 * Write a description of KivaCommand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */




 enum KivaCommand {

    FORWARD("F"), TURN_LEFT("L"), TURN_RIGHT("R"), TAKE("T"), DROP("D");

 public final String key;

    private KivaCommand(String key) {
        this.key = key;
    }

}



