package theater;

/**
 * Represents a play, containing its name and type (e.g., tragedy, comedy).
 */
public class Play {

    private final String name;
    private final String type;

    /**
     * Constructs a new Play.
     *
     * @param name the name of the play
     * @param type the type of the play (e.g., "tragedy", "comedy")
     */
    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Gets the name of the play.
     *
     * @return the play's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the type of the play.
     *
     * @return the play's type
     */
    public String getType() {
        return type;
    }
}
