import java.awt.*;

public class Defender implements Drawable{
    private int positionX;
    private int positionY;

    public Defender(int x, int y) {
        positionX = x;
        positionY = y;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(positionX, positionY, 20, 20);
    }
}
