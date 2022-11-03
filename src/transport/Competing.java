package transport;

public interface Competing {

    String PIT="Pit Stop";
    String SPEED ="Max speed";
    String BEST="Best Lap Time";


    void pitStop();

    void bestLapTime();

    void maxSpeed();

}
