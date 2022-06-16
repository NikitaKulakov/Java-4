package Java4;

public class References extends Java4.Literature {

    private String direction;
    private int volume;
    private int part;

    public References(int code, String type, String name, int year, String namePublic, int numberPages, String writer, String direction, int volume, int part) {
        super(code, type, name, year, namePublic, numberPages, writer);
        this.direction = direction;
        this.volume = volume;
        this.part = part;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPart() {
        return part;
    }

    public void setPart(int part) {
        this.part = part;
    }

    public String toString() {
        return "\n" + super.toString() +
                "\nDirection: " + direction +
                "\nVolume: " + volume+
                "\nPart: " + part;
    }
}