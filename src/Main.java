import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    private static JFrame frame = new JFrame("Tetris");

    public static void main(String[] args) {
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        int width = 800;
        int height = 800;
        frame.setPreferredSize(new Dimension(width, height + 24));

        JPanel panel = new Main(width, height);
        panel.setFocusable(true);
        panel.grabFocus();

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public Main(int w, int h){ //constructor
        setSize(w, h);


//        theWorld = new World(w/Cell.SIZE,h/Cell.SIZE);
//
//        interval = 1000;
//        intervalIncrements = 50; //allows player to adjust speed
//        timer = new Timer(interval, this);
//
//        addKeyListener(this);
//        addMouseListener(this);
//
//        menu.setLayout(new BoxLayout(menu, BoxLayout.X_AXIS));
//        menu.setBackground(new Color(255,163,146));
//
//        JButton start = new JButton("Start");
//        start.setActionCommand("Start");
//        start.addActionListener(this);
//
//        JButton stop = new JButton("Stop");
//        stop.setActionCommand("Stop");
//        stop.addActionListener(this);
//
//        JButton blinker = new JButton("Blinker");
//        blinker.setActionCommand("Blinker");
//        blinker.addActionListener(this);
//
//        JButton glider = new JButton("Glider");
//        glider.setActionCommand("Glider");
//        glider.addActionListener(this);
//
//        JButton gliderGun = new JButton("Glider Gun");
//        gliderGun.setActionCommand("Glider Gun");
//        gliderGun.addActionListener(this);
//
//        JButton restart = new JButton("Clear");
//        restart.setActionCommand("Clear");
//        restart.addActionListener(this);
//
//        JButton randomizeWorld = new JButton("Random");
//        randomizeWorld.setActionCommand("Random");
//        randomizeWorld.addActionListener(this);
//
//        JLabel title = new JLabel("    Elizabeth's Game of Life");
//
//        menu.add(start);
//        menu.add(stop);
//        menu.add(restart);
//        menu.add(blinker);
//        menu.add(glider);
//        menu.add(gliderGun);
//        menu.add(randomizeWorld);
//        menu.add(title);
//
//        frame.add(menu, BorderLayout.NORTH);
//        menu.setFocusable(true);
//        menu.grabFocus();

    }

}
