package interfaceExample;

public class Boat implements Vehicle{

    private String type;
    private String speed;
    private String color;

    public Boat(String type, String speed,String color){
        super();
        this.type  = type;
        this.speed = speed;
        this.color = color;
    }
    /**
     * @return
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * @return
     */
    @Override
    public String getSpeed() {
        return speed;
    }

    /**
     * @return
     */
    @Override
    public String getColor() {
        return color;
    }
}
