import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class GUI extends JFrame implements ActionListener {
    public static JFrame frame;

    public static void main(String args[]) {
        new GUI();
    }

    public GUI() {
        frame = this;
        this.setAlwaysOnTop(true);
        this.setName("Picture thing");
        JButton button = new JButton("Show Picture");
        JMenuBar menuBar = new JMenuBar();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setMaximumSize(new Dimension(1900, 1000));
        this.setMaximumSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));

        button.addActionListener(this);
        button.setActionCommand("showPic");

        JMenu menu1 = new JMenu("Options");
        JMenu menu2 = new JMenu("File");

        JMenuItem preferences = new JMenuItem("Preferences");
        preferences.addActionListener(this);
        preferences.setActionCommand("options.preferences");
        menu1.add(preferences);

        JMenuItem quit = new JMenuItem("Quit");
        quit.addActionListener(this);
        quit.setActionCommand("options.quit");
        menu1.add(quit);

        JMenuItem minimize = new JMenuItem("Minimize");
        minimize.addActionListener(this);
        minimize.setActionCommand("options.minimize");
        menu1.add(minimize);

        JMenuItem maximize = new JMenuItem("Maximize");
        maximize.addActionListener(this);
        maximize.setActionCommand("options.maximize");
        menu1.add(maximize);

        JMenuItem load = new JMenuItem("Load");
        load.addActionListener(this);
        load.setActionCommand("file.load");
        menu2.add(load);

        JMenuItem save = new JMenuItem("Save");
        save.addActionListener(this);
        save.setActionCommand("file.save");
        menu2.add(save);

        JMenuItem saveAs = new JMenuItem("Save As");
        saveAs.addActionListener(this);
        saveAs.setActionCommand("file.save_as");
        menu2.add(saveAs);

        JMenuItem saveAll = new JMenuItem("Save All");
        saveAll.addActionListener(this);
        saveAll.setActionCommand("file.save_all");
        menu2.add(saveAll);

        menuBar.add(menu1);
        menuBar.add(menu2);

        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(menuBar, BorderLayout.NORTH);
        this.getContentPane().add(button, BorderLayout.CENTER);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        if (e.getActionCommand() == "showPic") {
            System.out.println("showPic");
            // frame.add()
        }
        switch (e.getActionCommand()) {
            case "options.preferences":
                System.out.println("preferences");
                break;
            case "options.quit":
                System.out.println("quit");
                break;
            case "options.minimize":
                frame.setVisible(false);
                break;
            case "options.maximize":
                frame.setSize(frame.getMaximumSize());
                break;
            case "file.load":
                System.out.println("load");
                break;
            case "file.save":
                System.out.println("save");
                break;
            case "file.save_as":
                System.out.println("save as");
                break;
            case "file.save_all":
                System.out.println("save all");
                break;
            default:
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        }
    }
}
