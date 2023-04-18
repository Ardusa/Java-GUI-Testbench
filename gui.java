import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.PasswordAuthentication;

import javax.swing.*;

class GUI extends JFrame implements ActionListener {
    public static ActionListener actionListener;
    public static JFrame frame;
    public static GUI gui = new GUI();
    public static PasswordAuthentication passwordAuthentication;
    String passwordCheck = "";

    public static String userName;
    public static char password[];

    JButton button = new JButton("Show Picture");
    JMenuBar menuBar = new JMenuBar();

    JMenu menu1 = new JMenu("Options");
    JMenu menu2 = new JMenu("File");

    JMenuItem preferences = new JMenuItem("Preferences");
    JMenuItem quit = new JMenuItem("Quit");
    JMenuItem minimize = new JMenuItem("Minimize");
    JMenuItem maximize = new JMenuItem("Maximize");

    JMenuItem load = new JMenuItem("Load");
    JMenuItem save = new JMenuItem("Save");
    JMenuItem saveAs = new JMenuItem("Save As");
    JMenuItem saveAll = new JMenuItem("Save All");
    JPasswordField passwordField = new JPasswordField(null);

    public static void main(String args[]) {
        // gui = new GUI();
    }

    public GUI() {
        frame = this;
        this.setAlwaysOnTop(true);
        this.setName("Picture thing");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300, 300);
        this.setMaximumSize(new Dimension(1900, 1000));
        this.setMaximumSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));

        button.addActionListener(this);
        button.setActionCommand("showPic");


        preferences.addActionListener(this);
        preferences.setActionCommand("options.preferences");
        menu1.add(preferences);

        quit.addActionListener(this);
        quit.setActionCommand("options.quit");
        menu1.add(quit);

        minimize.addActionListener(this);
        minimize.setActionCommand("options.minimize");
        menu1.add(minimize);

        maximize.addActionListener(this);
        maximize.setActionCommand("options.maximize");
        menu1.add(maximize);

        load.addActionListener(this);
        load.setActionCommand("file.load");
        menu2.add(load);

        save.addActionListener(this);
        save.setActionCommand("file.save");
        menu2.add(save);

        saveAs.addActionListener(this);
        saveAs.setActionCommand("file.save_as");
        menu2.add(saveAs);

        saveAll.addActionListener(this);
        saveAll.setActionCommand("file.save_all");
        menu2.add(saveAll);

        passwordField.addActionListener(this);
        passwordField.setActionCommand("showPic");
        userName = "Ankur";
        password = "password".toCharArray();
        passwordAuthentication = new PasswordAuthentication(userName, password);

        for (int x = 0; x < passwordAuthentication.getPassword().length; x++) {
            passwordCheck += passwordAuthentication.getPassword()[x];
        }

        menuBar.add(menu1);
        menuBar.add(menu2);

        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(menuBar, BorderLayout.NORTH);
        this.getContentPane().add(button, BorderLayout.CENTER);
        this.getContentPane().add(passwordField, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // System.out.println(e.getActionCommand());

        switch (e.getActionCommand()) {
            case "showPic":
                String pass = "";

                for (int x = 0; x < passwordField.getPassword().length; x++) {
                    pass += passwordField.getPassword()[x];
                }

                if (pass.equals(passwordCheck)) {
                    System.out.println("showPic");
                }
                break;
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
