import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenster extends JFrame implements ActionListener {

    // ButtonActions
    @Override
    public void actionPerformed(ActionEvent e) {
        String Auslöser = e.getActionCommand();

        if (Auslöser == "Login") {
            System.out.println(Login);
            // Auf Authentifizierung warten
            // page ändern zu NachAnmelden
            instance1.dispose();
            nachAnmelden();

        }

        if (Auslöser == "pagewithauthguard") {
            // wenn Angemeldet --> return True
            // wenn nicht Angemeldet --> return False
        }

        if (Auslöser == "pagewithauthguard") {
            // wenn Angemeldet --> return True
            // wenn nicht Angemeldet --> Auf Authentifizierung warten

        }

        if (Auslöser == "Info") {
            // Alle Infos zur anmeldung anzeigen
        }
    }

    public static void VorAnmelden() {
        instance1.setSize(new Dimension(1280, 720));
        instance1.setTitle("ADFS?");
        Fenster1Layout.setLayout(new GridLayout(3, 1));
        // Login Button
        Login.addActionListener(instance1);
        Login.setBackground(new Color(80, 120, 255));
        Fenster1Layout.add(Login);
        // pagewithauthguard Button
        pagewithauthguard1.addActionListener(instance1);
        pagewithauthguard1.setBackground(new Color(125, 125, 125));
        Fenster1Layout.add(pagewithauthguard1);

        // pagewithauthwithforcedloginguard Button
        pagewithauthwithforcedloginguard1.addActionListener(instance1);
        pagewithauthwithforcedloginguard1.setBackground(new Color(80, 120, 255));
        Fenster1Layout.add(pagewithauthwithforcedloginguard1);

        instance1.add(Fenster1Layout, BorderLayout.CENTER);
        instance1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        instance1.setVisible(true);
    }

    public static void nachAnmelden() {
        instance2.setSize(new Dimension(1280, 720));
        instance2.setTitle("ADFS?");
        Fenster2Layout.setLayout(new GridLayout(3, 1));

        // pagewithauthguard Button
        pagewithauthguard2.addActionListener(instance2);
        pagewithauthguard2.setBackground(new Color(125, 125, 125));
        Fenster2Layout.add(pagewithauthguard2);

        // pagewithauthwithforcedloginguard Button
        pagewithauthwithforcedloginguard2.addActionListener(instance2);
        pagewithauthwithforcedloginguard2.setBackground(new Color(125, 125, 125));
        Fenster2Layout.add(pagewithauthwithforcedloginguard2);

        // Info Button
        Info.addActionListener(instance2);
        Info.setBackground(new Color(80, 120, 255));
        Fenster2Layout.add(Info);

        instance2.add(Fenster2Layout, BorderLayout.CENTER);
        instance2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        instance2.setVisible(true);
    }

    // VorAnmelden Inhalt
    private static Fenster instance1 = new Fenster();
    private static Container Fenster1Layout = new JPanel();
    private static JButton Login = new JButton("Login");
    private static JButton pagewithauthguard1 = new JButton("pagewithauthguard");
    private static JButton pagewithauthwithforcedloginguard1 = new JButton("pagewithauthwithforcedloginguard");

    // NachAnmelden Inhalt
    private static Fenster instance2 = new Fenster();
    private static Container Fenster2Layout = new JPanel();
    private static JButton pagewithauthguard2 = new JButton("pagewithauthguard");
    private static JButton pagewithauthwithforcedloginguard2 = new JButton("pagewithauthwithforcedloginguard");
    private static JButton Info = new JButton("Infos zur Anmeldung");

}
