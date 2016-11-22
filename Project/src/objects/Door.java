package objects;

public class Door {

    private String color;
    private int height;
    private String position = "Open";

    public void open (){
        position = "Open";
    }

    public void close(){
        position = "Close";
    }

    public String getPosition(){
        return position;
            }



}
