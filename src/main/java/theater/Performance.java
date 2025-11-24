package theater;

/**
 * Class representing a performance of a play.
 */
public class Performance {

    private final String playID;
    private final int audience;

    /**
     * Constructs a new Performance.
     *
     * @param playID   the ID of the play being performed
     * @param audience the number of people in the audience
     */
    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }

    /**
     * Gets the play ID for this performance.
     *
     * @return the play ID
     */
    public String getPlayID() {
        return playID;
    }

    /**
     * Gets the audience count for this performance.
     *
     * @return the audience count
     */
    public int getAudience() {
        return audience;
    }
}
