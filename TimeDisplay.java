class TimeDisplay implements Drawable{

    private int positionX = 200;
    private int positionY = 40;
    private int time = 0;

    public TimeDisplay(){

    }
    public TimeDisplay(int x, int y){
        positionX = x;
        positionY = y;
    }
    
    @Override
    public void draw(Graphics g){
        g.setColor(Color.BLUE);
        Font myFont = new Font ("Courier New", 1, 36);
        g.setFont(myFont);
        increment();
        g.drawString("" + time, positionX, positionY);
    }
    private void increment()
    {
        time++;
    }
}