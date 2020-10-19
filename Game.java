import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

public class Game extends JFrame implements ActionListener, KeyListener{
    private  Space space;
    private  Player player;
    private  Aliens aliens;
    private Defender defenders[];
    private  Score score;
    private ScoreTable scoreTable;
    private timeDisplay;

    public Game(){
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Scores");
        menuBar.add(menu);
        JMenuItem menuSave = new JMenuItem("Save");
        menu.add(menuSave);
        menuSave.addActionListener(this);
        JMenuItem menuShow = new JMenuItem("Show");
        menu.add(menuShow);
        menuShow.addActionListener(this);
        setJMenuBar(menuBar);

        player = new Player(400,400); // intial postion 400,400
        aliens = new Aliens(100,100);
        defenders = new Defenders[3];
        defenders[0] = new Defender(100,370);
        defenders[1] = new Defender(200,370);
        defenders[3] = new Defender(300,370);
        score = new Score();
        timeDisplay = new TimeDisplay();
        space = new Space(player,aliens,score,timeDisplay,defenders);
        scoreTable = new ScoreTable();
        scoreTable.load();

        this.getContentPane().add(space);
        this.addKeyListener(this);
    }

    public void startTimer(){
        Timer timer = new Timer(100, this);
        timer.start();
    }

    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        if (s!=null && s.equals("Save")) {
            scoreTable.save(score);
        } else if (s!=null && s.equals("Show"))
            scoreTable.show(this);
        else {
            space.repaint();
        }
    }

    public static void main(String[] args){
        Game win = new Game();
        win.setSize(500, 500);
        win.setVisible(true);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.startTimer();
    }

    @Override
    public void keyReleased(KeyEvent e){
        int keyCode = e.getKeyCode();
        switch ( keyCode ) {
            case KeyEvent.VK_UP:      break;
            case KeyEvent.VK_DOWN:    break;
            case KeyEvent.VK_LEFT:    pacman.left(); break;
            case KeyEvent.VK_RIGHT:   pacman.right(); break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) { }

    @Override
    public void keyPressed(KeyEvent e) { }

}