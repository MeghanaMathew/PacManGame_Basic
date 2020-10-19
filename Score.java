import java.awt.*;
import java.io.Serializable;

public class Score implements Drawable, Serializable {
    private int positionX = 400;
    private int positionY = 40;
    private static int score = 0;

    public Score(){

    }

    public Score(int x, int y){
        positionX = x;
        positionY = y;
    }
    @Override
    public void draw(Graphics g){
        g.setColor(Color.BLUE);
        Font myFont = new Font ("Courier New", 1, 36);
        g.setFont(myFont);
        g.drawString("" + score, positionX, positionY);
    }

    public void increment(){
        score++;
    }

    public int getScore(){
        return score;
    }

}
