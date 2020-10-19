import java.awt.*;

public class  Player implements Drawable{
    private int positionX;
    private int positionY;

    public Player(int x, int y){
        positionX = x;
        positionY = y;
    }
    @Override
    public void draw(Graphics go){
        go.setColor(Color.GREEN);
        go.fillRect(positionX, positionY,20, 20);

        if(positionX > 400) positionX = 400;
        if(positionY > 400) positionY = 400;
        if(positionX < 0) positionX = 0;
        if(positionY < 400) positionY = 0;
    }

    public void left(){
        positionX -= 20;
    }

    public void right(){
        positionX += 20;
    }

    public void shoot() {
        //stub
    }
}
