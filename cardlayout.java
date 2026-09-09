/*import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Dashboard {
    JFrame frame;
    JPanel mainPanel;
    CardLayout cardLayout;

    Dashboard() {
        frame = new JFrame("Dashboard");
        frame.setSize(800, 500);
        frame.setLayout(null);

        // Sidebar
        JPanel sidebar = new JPanel();
        sidebar.setBounds(0, 0, 150, 500);
        sidebar.setBackground(Color.DARK_GRAY);
        sidebar.setLayout(null);

        JButton profileBtn = new JButton("Profile");
        profileBtn.setBounds(20, 50, 100, 30);
        sidebar.add(profileBtn);

        frame.add(sidebar);

        // Center Panel (CardLayout)
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        mainPanel.setBounds(150, 0, 650, 500);

        // Home Panel
        JPanel homePanel = new JPanel();
        homePanel.setBackground(Color.WHITE);
        homePanel.add(new JLabel("Home Page"));

        // Profile Panel
        JPanel profilePanel = new JPanel();
        profilePanel.setBackground(Color.LIGHT_GRAY);
        profilePanel.add(new JLabel("Profile Page"));

        // Add panels
        mainPanel.add(homePanel, "HOME");
        mainPanel.add(profilePanel, "PROFILE");

        frame.add(mainPanel);

        // Button click action
        profileBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "PROFILE");
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Dashboard d=new Dashboard();
    }
}*/