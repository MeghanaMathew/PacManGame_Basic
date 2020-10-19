import java.awt.*;

public class Aliens implements Drawable {
    private int positionX;
    private int positionY;

    public Aliens(int x, int y) {
        positionX = x;
        positionY = y;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.RED);

        int direction = 0         // randomly decide direction of change
        if (Math.random()>0.5)
            if (Math.random()>0.5)
                direction += 20;  // shift right
            else
                direction -= 20;  // shift left

        int tempX = positionX
        int tempY = positionY
        for(int i = 0; i < 6; i++){
            if (tempY >= 400) // reached end of line
                continue:
            else{
                tempX = positionX
                    for(int j =0; j < 6; j++) {
                        if (tempX < 0) then tempX = 0;
                        if (tempX > 400) then tempX = 400;
                        g.fillRect(tempX, tempY, 20, 20);  // draw alien at tempX, tempY
                        tempX += direction;
                    }
                tempY += 20;
            }
        }
    }
}