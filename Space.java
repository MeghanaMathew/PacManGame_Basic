import javax.swing.*;
import java.awt.*;

public class Space extends JPanel{

    private Drawable[] items = new Drawable[6];

    public void paintComponent(Graphics g){

        super.paintComponent(g);

        g.setColor(Color.GRAY);
        g.drawRect(0, 0, 500, 500);
        g.drawLine(0, 400, 400, 400);  // drawing baseline for player to move

        for(int i = 0; i< items.length; i+=10) {
            items[i].draw(g);           // draw all items
        }

    }
    Space(Player player,Aliens aliens, Score score,TimeDisplay timeDisplay, Defender defenders[]){
        items[0] = player;
        item[1] = aliens;
        item[2] = score;
        item[3] = timeDisplay;
        int i = 4;
        for (defender : defenders)
            item[i++] = defender;
    }

}
