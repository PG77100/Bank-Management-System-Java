

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class LoginPage extends JFrame implements ActionListener {

    JFrame frame;
    JLabel userLabel, passLabel, messageLabel;
    JTextField userText;
    JPasswordField passText;
    JButton loginButton, resetButton;

    LoginPage() {

        frame = new JFrame("Login first");
        
        userLabel = new JLabel("Username:");
        userLabel.setBounds(650, 350, 100, 25);
        userLabel.setFont(new Font("Arial", Font.BOLD, 18));
        
        passLabel = new JLabel("Password:");
        passLabel.setBounds(650, 410, 100, 25);
        passLabel.setFont(new Font("Arial", Font.BOLD, 18));
      

        userText = new JTextField();
        userText.setBounds(760, 340, 250, 50);
        userText.setFont(new Font("Arial",Font.ITALIC,18));
        

        passText = new JPasswordField();
        passText.setBounds(760, 400, 250, 50);
        passText.setFont(new Font("Arial",Font.ITALIC,18));


        loginButton = new JButton("Login");
        loginButton.setBounds(680, 490, 120, 50);
        loginButton.addActionListener(this);

        resetButton = new JButton("Reset");
        resetButton.setBounds(900, 490, 120, 50);
        resetButton.addActionListener(this);

        messageLabel = new JLabel();
        messageLabel.setBounds(800, 580, 200, 25);
        messageLabel.setFont(new Font("Arial",Font.ITALIC,18));
        
        
        frame.add(userLabel);
        frame.add(passLabel);
        frame.add(userText);
        frame.add(passText);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(messageLabel);

        frame.setSize(1920, 1080);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loginButton) {

            String username = userText.getText();
            String password = passText.getText();

            if (username.equals("Pawan") && password.equals("1234")) {

                HomePage homePage = new HomePage(); // Open Home Page
                frame.dispose(); // Close Login Page

            } else {

               JOptionPane.showMessageDialog(messageLabel,"Invalid Login Please check your details");

            }
        }

        if (e.getSource() == resetButton) {

            userText.setText("");
            passText.setText("");
            messageLabel.setText("");

        }
    }

     public static void main(String[] args) {

        LoginPage loginPage = new LoginPage();
        

     }
}

class HomePage implements ActionListener {

    JFrame frame;
    JLabel welcomeLabel,Message;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    

    HomePage() {

        frame = new JFrame("Home page");
        frame.getContentPane().setBackground(Color.BLACK);

        welcomeLabel = new JLabel("Welcome To My Page");
        welcomeLabel.setBounds(700, 40, 500, 100);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 40));
        welcomeLabel.setBackground(Color.WHITE);
        welcomeLabel.setForeground(Color.WHITE);
        
        b1=new JButton("Bank Management System");
        b1.setBounds(1300,200,300,150);
        b1.setFont(new Font("Arial", Font.BOLD, 18));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBorderPainted(false);

        b2=new JButton("Resume Builder");
        b2.setBounds(1300,430,300,150);
        b2.setFont(new Font("Arial", Font.BOLD, 18));
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBorderPainted(false);


        b3=new JButton("Online Survey System");
        b3.setBounds(1300,660,300,150);
        b3.setFont(new Font("Arial", Font.BOLD, 18));
        b3.addActionListener(this);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBorderPainted(false);


        b4=new JButton("Electricity Bill System");
        b4.setBounds(800,200,300,150);
        b4.setFont(new Font("Arial", Font.BOLD, 18));
        b4.addActionListener(this);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBorderPainted(false);

        b5=new JButton("Medical Management System");
        b5.setBounds(800,430,300,150);
        b5.setFont(new Font("Arial", Font.BOLD, 18));
        b5.addActionListener(this);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setBorderPainted(false);

        b6=new JButton("Text Editor");
        b6.setBounds(800,660,300,150);
        b6.setFont(new Font("Arial", Font.BOLD, 18));
        b6.addActionListener(this);
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.setBorderPainted(false);


        b7=new JButton("Music Management System");
        b7.setBounds(300,200,300,150);
        b7.setFont(new Font("Arial", Font.BOLD, 18));
        b7.addActionListener(this);
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        b7.setBorderPainted(false);

        b8=new JButton("Library Management System");
        b8.setBounds(300,430,300,150);
        b8.setFont(new Font("Arial", Font.BOLD, 18));
        b8.addActionListener(this);
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);
        b8.setBorderPainted(false);

        b9=new JButton("Student Management System");
        b9.setBounds(300,660,300,150);
        b9.setFont(new Font("Arial", Font.BOLD, 18));
        b9.addActionListener(this);
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);
        b9.setBorderPainted(false);

        
        Message=new JLabel();
        
        frame.add(welcomeLabel);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(Message);
        
        frame.setSize(1920, 1080);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
         if(e.getSource()==b1){
 
    BankPage bankpage = new BankPage();
        }
        else{
        Message.setText("Please Clicked Again");
        }
    }
}
   
class BankPage  {
    JFrame frame;
    JLabel welcomeLabel,crdno,pinno,messageLabel;
    JPasswordField pin;
    JTextField t1;
    JButton b1,b3;
    String registeredcrdno,passno;
    
      BankPage() {
      
       frame = new JFrame("SBI");
       frame.getContentPane().setBackground(Color.BLACK);
       
    
        ImageIcon img=new ImageIcon("D:\\Pawan Gupta\\javascript\\java\\test\\src\\images\\loginpage.jpg");
       Image image=img.getImage().getScaledInstance(1920, 1080, Image.SCALE_SMOOTH);
       ImageIcon scale=new ImageIcon(image);

       JLabel bg=new JLabel(scale);
       bg.setBounds(0,0,1920,1080);
      
        welcomeLabel= new JLabel("WELCOME TO SBI BANK");
        welcomeLabel.setBounds(680, 20, 500, 100);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 40));
        welcomeLabel.setForeground(Color.WHITE);
        
       
        
         JSeparator line1=new JSeparator();
        line1.setBounds(0, 40, 1920, 20 );
        line1.setFont(new Font("Arial", Font.BOLD, 40));

        JSeparator line2=new JSeparator();
        line2.setBounds(0, 100, 1920, 20 );
        line2.setFont(new Font("Arial", Font.BOLD, 40));
        
        JPanel color=new JPanel();
        color.setBounds(0,40,1920,60);
        color.setBackground(Color.BLACK);

      

         

        crdno = new JLabel("Username:");
        crdno.setBounds(1250, 400, 200, 30);
        crdno.setFont(new Font("Segoe UI", Font.BOLD, 22));
        crdno.setForeground(Color.WHITE);
        
        pinno= new JLabel("Password:");
        pinno.setBounds(1250, 500, 200, 30);
        pinno.setFont(new Font("Arial", Font.BOLD, 22));
        pinno.setForeground(Color.WHITE);

        t1 = new JTextField();
        t1.setBounds(1250, 430, 400, 40);
        t1.setFont(new Font("Arial",Font.ITALIC,25));
        

        pin = new JPasswordField();
        pin.setBounds(1250, 530, 400, 40);
        pin.setFont(new Font("Arial",Font.ITALIC,25));
        

      
        b1= new JButton("Login");
        b1.setBounds(1230, 610, 450, 50);
        b1.setBackground(new Color(173,216,230)); 
        b1.setFont(new Font("Arial",Font.BOLD,25));
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String cardno = t1.getText();
                String password = pin.getText();
    
                b1.addMouseListener(new MouseAdapter() {
                    public void mouseEntered(MouseEvent e){

                        b1.setBackground(Color.WHITE);
                    }
                    public void mouseExited(MouseEvent e){
                        b1.setBackground(new Color(173,216,230));
                    }
                });

                if(e.getSource()==b1){

    
    if(cardno.equals("Pawan") && password.equals("1234")) {
        Mainpage mainpage=new Mainpage() ; 
        frame.dispose();
    }
    else {
        JOptionPane.showMessageDialog(frame,"Invalid Input");
                       
                
      
    }
}
            }

        });


      
        

        b3= new JButton("Doesn't have Account? Signup?");
        b3.setBounds(1230, 690, 450, 50);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE); 
        b3.setOpaque(false);
        b3.setContentAreaFilled(false);
        b3.setFont(new Font("Arial",Font.BOLD,25));
        b3.setBorderPainted(false);  
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
               
                 if(e.getSource()==b3) {
            Signup s=new Signup();
            frame.dispose();
    }
            }
        });
           
      
        messageLabel = new JLabel("Login as a User");
        messageLabel.setBounds(1300, 280, 500, 50);
        messageLabel.setFont(new Font("Arial",Font.BOLD,35));
        messageLabel.setBackground(Color.BLACK);
        messageLabel.setForeground(Color.WHITE);
        
       frame.add(line1);
       
       
         frame.add(line2);
        frame.add(crdno);
        frame.add(t1);
        frame.add(pinno);
        frame.add(pin);
        frame.add(b1);
        frame.add(b3);
        
        frame.add(messageLabel);


      
        
         
       
         
         frame.add(welcomeLabel);    
        frame.add(bg);
         
        frame.setSize(1920, 1080);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }




public static void main(String[] args) {
    BankPage bn=new BankPage();
}
    }

    class Roundedpanel extends JPanel{
      protected  void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D g2=(Graphics2D) g;
            g2.setColor(getBackground());
            g2.fillRoundRect(0,0,getWidth(),getHeight(),30,30);
        }
    }

class BalanceGraphPanel extends JPanel {
    private final int[] monthlyTrend = {78, 74, 82, 80, 86, 91, 88, 95};

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int w = getWidth();
        int h = getHeight();
        int left = 45;
        int right = 20;
        int top = 20;
        int bottom = 35;

        g2.setColor(new Color(20, 20, 20, 210));
        g2.fillRoundRect(0, 0, w, h, 20, 20);

        int plotW = w - left - right;
        int plotH = h - top - bottom;

        g2.setColor(new Color(90, 90, 90));
        for (int i = 0; i <= 4; i++) {
            int y = top + (plotH * i / 4);
            g2.drawLine(left, y, left + plotW, y);
        }

        g2.setColor(Color.LIGHT_GRAY);
        g2.drawLine(left, top, left, top + plotH);
        g2.drawLine(left, top + plotH, left + plotW, top + plotH);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int value : monthlyTrend) {
            min = Math.min(min, value);
            max = Math.max(max, value);
        }
        int range = Math.max(1, max - min);

        int[] xPoints = new int[monthlyTrend.length];
        int[] yPoints = new int[monthlyTrend.length];
        for (int i = 0; i < monthlyTrend.length; i++) {
            xPoints[i] = left + (plotW * i / (monthlyTrend.length - 1));
            double normalized = (monthlyTrend[i] - min) / (double) range;
            yPoints[i] = top + plotH - (int) (normalized * plotH);
        }

        g2.setColor(new Color(0, 180, 255));
        for (int i = 0; i < xPoints.length - 1; i++) {
            g2.drawLine(xPoints[i], yPoints[i], xPoints[i + 1], yPoints[i + 1]);
        }

        g2.setColor(new Color(255, 220, 0));
        for (int i = 0; i < xPoints.length; i++) {
            g2.fillOval(xPoints[i] - 4, yPoints[i] - 4, 8, 8);
        }

        g2.setColor(Color.WHITE);
        g2.setFont(new Font("Arial", Font.BOLD, 14));
        g2.drawString("Monthly Balance Trend", left, 15);

        g2.dispose();
        }
    }

    class Signup {
        JFrame frame;
    JLabel welcomeLabel,usern,pinno,messageLabel,email;
    JPasswordField pin;
    JTextField t1;
    JButton b1,b3;
    Signup() {
        frame = new JFrame("SBI");
       frame.getContentPane().setBackground(Color.BLACK);

       
        ImageIcon img=new ImageIcon("D:\\Pawan Gupta\\java\\test\\src/images/signupbg.jpeg");
       Image image=img.getImage().getScaledInstance(1920, 1080, Image.SCALE_SMOOTH);
       ImageIcon scale=new ImageIcon(image);

       JLabel bg=new JLabel(scale);
       bg.setBounds(0,0,1920,1080);
       
      
       
        welcomeLabel = new JLabel("WELCOME TO SBI BANK");
        welcomeLabel.setBounds(680, 20, 500, 100);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 40));
        welcomeLabel.setForeground(Color.WHITE);
        
         JSeparator line1=new JSeparator();
        line1.setBounds(0, 40, 1920, 20 );
        line1.setFont(new Font("Arial", Font.BOLD, 40));

        JSeparator line2=new JSeparator();
        line2.setBounds(0, 100, 1920, 20 );
        line2.setFont(new Font("Arial", Font.BOLD, 40));
        
        JPanel color=new JPanel();
        color.setBounds(0,40,1920,60);
        color.setBackground(Color.BLACK);

        JPanel loginpanel=new Roundedpanel();
        loginpanel.setBounds(600,220,610,510);
        loginpanel.setBackground(Color.WHITE);
        loginpanel.setLayout(null);

        
        
        usern = new JLabel("Username:");
        usern.setBounds(680, 310, 200, 25);
        usern.setFont(new Font("Arial", Font.BOLD, 25));
        
        
        email = new JLabel("Email Address:");
        email.setBounds(630, 420, 300, 25);
        email.setFont(new Font("Arial", Font.BOLD, 25));
       


        JLabel confirmp=new JLabel("Confirm Password:");
        confirmp.setBounds(630, 640, 300, 25);
        confirmp.setFont(new Font("Arial", Font.BOLD, 25));
        

        pinno= new JLabel("Password:");
        pinno.setBounds(680, 530, 200, 25);
        pinno.setFont(new Font("Arial", Font.BOLD, 25));
        

        t1 = new JTextField();
        t1.setBounds(860, 290, 250, 70);
        t1.setFont(new Font("Arial",Font.ITALIC,25));
       
        JTextField t2 = new JTextField();
        t2.setBounds(860, 400, 250, 70);
        t2.setFont(new Font("Arial",Font.ITALIC,25));
        
         JPasswordField t3= new JPasswordField();
        t3.setBounds(860, 620, 250, 70);
        t3.setFont(new Font("Arial",Font.ITALIC,25));
        

        pin = new JPasswordField();
        pin.setBounds(860, 510, 250, 70);
        pin.setFont(new Font("Arial",Font.ITALIC,30));

        messageLabel = new JLabel("Signup as a User");
        messageLabel.setBounds(740, 170, 500, 50);
        messageLabel.setFont(new Font("Arial",Font.BOLD,40));
        messageLabel.setBackground(Color.BLACK);
        messageLabel.setForeground(Color.WHITE);

        b1= new JButton("Signup");
        b1.setBounds(600, 740, 610, 70);
        b1.setBackground(new Color(173,216,230)); 
        b1.setFont(new Font("Arial",Font.BOLD,25));
         b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==b1){
                    BankPage b=new BankPage();
                }
            }
        });


         JButton b2= new JButton("Already have an Account? Login?");
        b2.setBounds(600, 830, 610, 70);
        b2.setBackground(Color.BLACK); 
        b2.setFont(new Font("Arial",Font.BOLD,25));
        b2.setForeground(Color.WHITE);
        b2.setBorderPainted(false);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==b2){
                    BankPage b=new BankPage();
                }
            }
        });


        frame.add(usern);
        frame.add(t1);
        frame.add(email);
        frame.add(t2);
        frame.add(pinno);
        frame.add(pin);
        frame.add(confirmp);
        frame.add(t3);
        frame.add(welcomeLabel);
        frame.add(line1);
        frame.add(line2);
        frame.add(color);
        frame.add(loginpanel);  
        frame.add(messageLabel);
        frame.add(b1);
        frame.add(b2);
        frame.add(bg);
        
        

        frame.setSize(1920, 1080);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
      
       public static void main(String[] args) {
        Signup s=new Signup();
       }
    }

 class createacc extends JFrame implements ActionListener {
    
    JTextField tfName, tfFather, tfDOB, tfPhone, tfEmail, tfDeposit;
    JTextArea taAddress;
    JRadioButton rbMale, rbFemale;
    JComboBox<String> cbAccountType;
    JButton btnSubmit, btnClear;
    JLabel messagLabel;
    createacc() {

        setTitle("Bank Account Signup Form");
        setSize(600,600);
        setLocation(400,100);
        setLayout(null);
        
        JLabel heading = new JLabel("New Bank Account Application Form");
        heading.setFont(new Font("Arial", Font.BOLD, 18));
        heading.setBounds(120,20,400,30);
        add(heading);

        // Name
        addLabel("Full Name:", 80);
        tfName = addTextField(80);

        // Father Name
        addLabel("Father Name:", 120);
        tfFather = addTextField(120);

        // DOB
        addLabel("Date of Birth:", 160);
        tfDOB = addTextField(160);

        // Gender
        addLabel("Gender:", 200);
        rbMale = new JRadioButton("Male");
        rbFemale = new JRadioButton("Female");
        rbMale.setBounds(200,200,80,25);
        rbFemale.setBounds(300,200,100,25);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbMale);
        bg.add(rbFemale);
        add(rbMale);
        add(rbFemale);

        // Address
        addLabel("Address:", 240);
        taAddress = new JTextArea();
        taAddress.setBounds(200,240,200,60);
        add(taAddress);

        // Phone
        addLabel("Phone:", 320);
        tfPhone = addTextField(320);

        // Email
        addLabel("Email:", 360);
        tfEmail = addTextField(360);

        // Account Type
        addLabel("Account Type:", 400);
        String accTypes[] = {"Savings", "Current", "Fixed Deposit"};
        cbAccountType = new JComboBox<>(accTypes);
        cbAccountType.setBounds(200,400,200,25);
        add(cbAccountType);

        // Initial Deposit
        addLabel("Initial Deposit:", 440);
        tfDeposit = addTextField(440);

        messagLabel = new JLabel();
        messagLabel.setBounds(800, 580, 200, 25);
        messagLabel.setFont(new Font("Arial",Font.ITALIC,18));
        
        // Buttons
        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(150,500,100,30);
        add(btnSubmit);

        btnClear = new JButton("Clear");
        btnClear.setBounds(300,500,100,30);
        add(btnClear);

        btnSubmit.addActionListener(this);
        btnClear.addActionListener(this);

        setVisible(true);
    }

    private void addLabel(String text, int y) {
        JLabel label = new JLabel(text);
        label.setBounds(80,y,120,25);
        add(label);
    }

    private JTextField addTextField(int y) {
        JTextField tf = new JTextField();
        tf.setBounds(200,y,200,25);
        add(tf);
        return tf;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btnSubmit) {

            String name = tfName.getText();
            String father = tfFather.getText();
            String dob = tfDOB.getText();
            String phone = tfPhone.getText();
            String email = tfEmail.getText();
            String deposit = tfDeposit.getText();
            String address = taAddress.getText();
            String gender = rbMale.isSelected() ? "Male" :
                            rbFemale.isSelected() ? "Female" : "";
            String accountType = (String) cbAccountType.getSelectedItem();

            if(name.equals("") || phone.equals("") || deposit.equals("")) {
                JOptionPane.showMessageDialog(this,
                        "Please fill required fields!");
            } else {
                JOptionPane.showMessageDialog(this,
                        "Account Created Successfully!");
                int accno=(int)(Math.random()*1000000);
                String crdString=String.valueOf(accno);
                int pssno=(int)(Math.random()*10000);
                String pssstring=String.valueOf(pssno);
                JOptionPane.showMessageDialog(this,"Your Card No :"+crdString+ " Your Pin :"+pssstring);      
               
                
                this.dispose();         
            }
            
            
            
        }

        if(e.getSource() == btnClear) {
            tfName.setText("");
            tfFather.setText("");
            tfDOB.setText("");
            tfPhone.setText("");
            tfEmail.setText("");
            tfDeposit.setText("");
            taAddress.setText("");
        }
    }
    public static void main(String[] args) {
        createacc ca=new createacc();

    }
    
}



class Mainpage{
    private static final int BASE_WIDTH = 1920;
    private static final int BASE_HEIGHT = 1080;
    private static final double MIN_SCALE = 0.75;
    private static final double MAX_SCALE = 1.35;
    JFrame frame;
    JLabel wlc,balanceLabel;
    JSeparator line1,line2;
    JButton m,caButton;
    JPanel sidebar,mainpanel,homecontainer,home,homemain,aboutus,contact,historyPanel,profile,lang,sec,setting;
    JLabel homeBgLabel,profileBgLabel;
    JTextField profileNameField, profilePhoneField, profileEmailField;
    JLabel profilePercentLabel, profileCompletedLabel, profileItemNameLabel, profileItemPhoneLabel, profileItemEmailLabel, profileItemKycLabel, profileItemPhotoLabel, profilePhotoHolder;
    JProgressBar profileCompletionBar;
    JTextArea historyArea;
    boolean profilePhotoUploaded = false;
    boolean darkMode = true;
    ArrayList<JButton> sidebarButtons = new ArrayList<>();
    ArrayList<JButton> topPanelButtons = new ArrayList<>();
    int x=0;
    boolean isOpen=true;
    CardLayout card,homecard;
     static double balance = 695743.74;
    static ArrayList<String> history = new ArrayList<>();

    Mainpage() {
        // Keep Mainpage balance in sync whenever page is created/reopened
        Mainpage.balance = BankSystem.balance;
        darkMode = BankSystem.isDarkModeEnabled();
        frame=new JFrame("Main Page");
        frame.getContentPane().setBackground(Color.BLACK);
        

        wlc=new JLabel("SBI Bank");
        wlc.setBounds(870, 21, 500, 100);
        wlc.setFont(new Font("Segoe UI", Font.BOLD, 30));
        wlc.setForeground(Color.WHITE);
        
        line1=new JSeparator();
        line1.setBounds(0, 40, 1920, 20 );
        line1.setFont(new Font("Arial", Font.BOLD, 40));

        line2=new JSeparator();
        line2.setBounds(0, 100, 1920, 20 );
        line2.setFont(new Font("Arial", Font.BOLD, 40));

        
        
        

        m=new JButton("☰ Menu");
        m.setBounds(0,55,250,30);
        m.setFont(new Font("Segoe UI Emoji", Font.BOLD, 20));
        m.setBackground(new Color(220,220,220));
        m.setForeground(Color.BLACK);
        m.setBorderPainted(false);
       
        caButton=new JButton("+ Create Account");
        caButton.setBounds(1650,55,250,30);
        caButton.setFont(new Font("Arial", Font.BOLD, 20));
        caButton.setBackground(new Color(220,220,220));
        caButton.setForeground(Color.BLACK);
       caButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==caButton){
                createacc ac=new createacc();
            }
        }
       });      
        
        card=new CardLayout();
        mainpanel=new JPanel(card);
        // Keep content panels clearly below header separator lines
        mainpanel.setBounds(350,130,1560,900);
        mainpanel.setBackground(Color.WHITE);

       home=new JPanel();
       home.setBackground(Color.BLACK);

       homecard=new CardLayout();
       homecontainer=new JPanel(homecard);
       homecontainer.setBounds(20,80,1600,950);
      

       homemain =new JPanel();
       homemain.setLayout(null);
        homemain.setBackground(Color.BLACK);
      
        
         ImageIcon img=new ImageIcon("D:\\Pawan Gupta\\java\\test\\src/images/homepage.jpg");
       Image image=img.getImage().getScaledInstance(1600, 1000, Image.SCALE_SMOOTH);
       ImageIcon scale=new ImageIcon(image);

       homeBgLabel=new JLabel(scale);
       homeBgLabel.setBounds(0,0,1600,1000);
       
       
      

        roundedfield search=new roundedfield(20);
        search.setBounds(240,20,1000,50);
        search.setFont(new Font("Arial",Font.ROMAN_BASELINE,18));
         search.setBorder(BorderFactory.createLineBorder(new Color(200,200,200),1,true));
        homemain.add(search);
        
        search.addActionListener(e->{
            String text=search.getText();
            System.out.println("Searching:"+text);
        });

        roundedbutton sButton=new roundedbutton("Search");
        sButton.setBounds(1240,20,100,50);
        sButton.setBackground(Color.BLACK);
        sButton.setBorderPainted(false);
        sButton.setFont(new Font("Arial",Font.ROMAN_BASELINE,18));
        sButton.setForeground(Color.WHITE);
        homemain.add(sButton);
        sButton.addActionListener(e->{
            String text=search.getText();
            System.out.println("Searching for:"+text);
        });

       JLabel TotalBalance= new JLabel("Total Balance:");
        TotalBalance.setBounds(100,150,100,50);
        TotalBalance.setForeground(Color.LIGHT_GRAY);
        TotalBalance.setFont(new Font("Eurostile",Font.ITALIC,12));
        homemain.add(TotalBalance);

      
       /*  ImageIcon balimg=new ImageIcon("D:\\Pawan Gupta\\java\\test\\src/images/Balance.jpeg");
       Image balimage=balimg.getImage().getScaledInstance(330, 300, Image.SCALE_SMOOTH);
       ImageIcon bal1scale=new ImageIcon(balimage);
       */

        balanceLabel=new JLabel("₹"+Mainpage.balance);
        balanceLabel.setBounds(120,170,500,100);
        balanceLabel.setForeground(Color.WHITE);
        balanceLabel.setFont(new Font("Arial",Font.BOLD,50));
        
       balanceLabel.setBackground(new Color(13,27,42));;
       
        
        homemain.add(balanceLabel);

        JLabel profitMonth=new JLabel("+₹ 1,285.93 this month");
        profitMonth.setBounds(120,230,500,50);
        profitMonth.setForeground(Color.GREEN);
        profitMonth.setFont(new Font("Arial",Font.ROMAN_BASELINE,13));
        
       profitMonth.setBackground(new Color(13,27,42));;
       
        
        homemain.add(profitMonth);

        roundedbutton fundButton=new roundedbutton("+Add Funds");
        fundButton.setBounds(100,350,150,50);
        fundButton.setBackground(Color.BLUE);
        fundButton.setBorderPainted(false);
        fundButton.setFont(new Font("Arial",Font.ROMAN_BASELINE,18));
        fundButton.setForeground(Color.WHITE);
        homemain.add(fundButton);

       
        fundButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                   if (e.getSource() == fundButton) {
          boolean depositDone = Dashboard.openDepositDialog(homemain);
          if (depositDone) {
            balanceLabel.setText("₹" + Mainpage.balance);
            updateHistoryPanel();
          }
        }
            }
        });

        roundedbutton WidthdrawnButton=new roundedbutton("Widthdrawn Money");
        WidthdrawnButton.setBounds(350,350,180,50);
        WidthdrawnButton.setBackground(Color.BLUE);
        WidthdrawnButton.setBorderPainted(false);
        WidthdrawnButton.setFont(new Font("Arial",Font.ROMAN_BASELINE,18));
        WidthdrawnButton.setForeground(Color.WHITE);
        homemain.add(WidthdrawnButton);
        WidthdrawnButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                  if (e.getSource() == WidthdrawnButton) {
          boolean withdrawDone = Dashboard.openWithdrawDialog(homemain);
          if (withdrawDone) {
            balanceLabel.setText("₹" + Mainpage.balance);
            updateHistoryPanel();
          }
       }
            }
        });

        ModernPanel portfolio=new ModernPanel();
        portfolio.setBounds(600,140,300,250);
        portfolio.setLayout(null);
        portfolio.setBackground(Color.BLACK);

        //Current account panel

        GlassPanel currentacc=new GlassPanel();
        currentacc.setBounds(120,500,400,200);
        currentacc.setLayout(null);
        homemain.add(currentacc);

         JLabel currBalance= new JLabel("Current Account:");
        currBalance.setBounds(20,5,150,50);
        currBalance.setForeground(Color.WHITE);
        currBalance.setFont(new Font("Eurostile",Font.ITALIC,18));
        currentacc.add(currBalance);

        JLabel currno = new JLabel("•••4892657");
        currno.setBounds(30,35,200,30);
        currno.setForeground(Color.WHITE);
        currno.setFont(new Font("Eurostile",Font.ITALIC,14));
        currentacc.add(currno);

         JLabel curramt= new JLabel("₹12,847.32");
        curramt.setBounds(20,30,300,150);
        curramt.setForeground(Color.WHITE);
        curramt.setFont(new Font("Eurostile",Font.ITALIC,30));
        currentacc.add(curramt);

        JLabel currpm= new JLabel("+₹423.18 this month");  //Current profit per month
        currpm.setBounds(30,85,600,100);
        currpm.setForeground(Color.GREEN);
        currpm.setFont(new Font("Eurostile",Font.ITALIC,14));
        currentacc.add(currpm);

        JLabel currpr= new JLabel("3.41%");      //Current profit rate
        currpr.setBounds(330,5,100,50);
        currpr.setForeground(Color.GREEN);
        currpr.setFont(new Font("Eurostile",Font.ITALIC,14));
        currentacc.add(currpr);

        //Saving account panel

          GlassPanel savingacc=new GlassPanel();
        savingacc.setBounds(600,500,400,200);
        savingacc.setLayout(null);
        homemain.add(savingacc);

        JLabel savBalance= new JLabel("Saving Account:");
        savBalance.setBounds(20,5,150,50);
        savBalance.setForeground(Color.WHITE);
        savBalance.setFont(new Font("Eurostile",Font.ITALIC,18));
        savingacc.add(savBalance);
    
        JLabel savno = new JLabel("•••5769098");
        savno.setBounds(30,35,200,30);
        savno.setForeground(Color.WHITE);
        savno.setFont(new Font("Eurostile",Font.ITALIC,14));
        savingacc.add(savno);

         JLabel savamt= new JLabel("₹13,675.74");
        savamt.setBounds(20,30,300,150);
        savamt.setForeground(Color.WHITE);
        savamt.setFont(new Font("Eurostile",Font.ITALIC,30));
        savingacc.add(savamt);

          JLabel savpm= new JLabel("+₹1,205.50 this month");  //Saving profit per month
        savpm.setBounds(30,85,600,100);
        savpm.setForeground(Color.GREEN);
        savpm.setFont(new Font("Eurostile",Font.ITALIC,14));
        savingacc.add(savpm);

        JLabel savpr= new JLabel("2.74%");      //Saving profit rate
        savpr.setBounds(330,5,100,50);
        savpr.setForeground(Color.GREEN);
        savpr.setFont(new Font("Eurostile",Font.ITALIC,14));
        savingacc.add(savpr);

                         
       // investment account panel

          GlassPanel invsetmentacc=new GlassPanel();
        invsetmentacc.setBounds(1080,500,400,200);
        invsetmentacc.setLayout(null);
        homemain.add(invsetmentacc);

        JLabel invBalance= new JLabel("Investment Account:");
        invBalance.setBounds(20,5,200,50);
        invBalance.setForeground(Color.WHITE);
        invBalance.setFont(new Font("Eurostile",Font.ITALIC,18));
        invsetmentacc.add(invBalance);

          JLabel invno = new JLabel("•••4535569");
        invno.setBounds(30,35,200,30);
        invno.setForeground(Color.WHITE);
        invno.setFont(new Font("Eurostile",Font.ITALIC,14));
        invsetmentacc.add(invno);

         JLabel invamt= new JLabel("₹11,343.23");
        invamt.setBounds(20,30,300,150);
        invamt.setForeground(Color.WHITE);
        invamt.setFont(new Font("Eurostile",Font.ITALIC,30));
        invsetmentacc.add(invamt);

          JLabel invpm= new JLabel("-₹342.75 this month");  //Investment profit per month
        invpm.setBounds(30,85,600,100);
        invpm.setForeground(Color.RED);
        invpm.setFont(new Font("Eurostile",Font.ITALIC,14));
        invsetmentacc.add(invpm);

        JLabel invpr= new JLabel("-0.38%");      //Investment profit rate
        invpr.setBounds(330,5,100,50);
        invpr.setForeground(Color.RED);
        invpr.setFont(new Font("Eurostile",Font.ITALIC,14));
        invsetmentacc.add(invpr);

        JLabel profileCompleteTitle = new JLabel("Profile Completion");
        profileCompleteTitle.setBounds(45, 18, 230, 30);
        profileCompleteTitle.setForeground(Color.WHITE);
        profileCompleteTitle.setFont(new Font("Arial", Font.BOLD, 22));
        portfolio.add(profileCompleteTitle);

        int completedItems = 4;
        int totalItems = 5;
        int completionPercent = (completedItems * 100) / totalItems;

        profilePercentLabel = new JLabel(completionPercent + "%");
        profilePercentLabel.setBounds(120, 55, 80, 40);
        profilePercentLabel.setForeground(new Color(0, 220, 140));
        profilePercentLabel.setFont(new Font("Arial", Font.BOLD, 34));
        portfolio.add(profilePercentLabel);

        profileCompletionBar = new JProgressBar(0, 100);
        profileCompletionBar.setBounds(35, 105, 230, 20);
        profileCompletionBar.setValue(completionPercent);
        profileCompletionBar.setStringPainted(true);
        profileCompletionBar.setForeground(new Color(0, 180, 120));
        profileCompletionBar.setBackground(new Color(40, 40, 40));
        portfolio.add(profileCompletionBar);

        profileCompletedLabel = new JLabel("Completed: 4/5");
        profileCompletedLabel.setBounds(80, 130, 150, 25);
        profileCompletedLabel.setForeground(Color.GREEN);
        profileCompletedLabel.setFont(new Font("Arial", Font.BOLD, 14));
        portfolio.add(profileCompletedLabel);

        profileItemNameLabel = new JLabel("✔ Name");
        profileItemNameLabel.setBounds(35, 160, 120, 20);
        profileItemNameLabel.setForeground(Color.WHITE);
        profileItemNameLabel.setFont(new Font("Arial", Font.PLAIN, 13));
        portfolio.add(profileItemNameLabel);

        profileItemPhoneLabel = new JLabel("✔ Phone");
        profileItemPhoneLabel.setBounds(35, 182, 120, 20);
        profileItemPhoneLabel.setForeground(Color.WHITE);
        profileItemPhoneLabel.setFont(new Font("Arial", Font.PLAIN, 13));
        portfolio.add(profileItemPhoneLabel);

        profileItemEmailLabel = new JLabel("✔ Email");
        profileItemEmailLabel.setBounds(160, 160, 120, 20);
        profileItemEmailLabel.setForeground(Color.WHITE);
        profileItemEmailLabel.setFont(new Font("Arial", Font.PLAIN, 13));
        portfolio.add(profileItemEmailLabel);

        profileItemKycLabel = new JLabel("✔ KYC");
        profileItemKycLabel.setBounds(160, 182, 120, 20);
        profileItemKycLabel.setForeground(Color.WHITE);
        profileItemKycLabel.setFont(new Font("Arial", Font.PLAIN, 13));
        portfolio.add(profileItemKycLabel);

        profileItemPhotoLabel = new JLabel("○ Photo Pending");
        profileItemPhotoLabel.setBounds(75, 208, 170, 20);
        profileItemPhotoLabel.setForeground(new Color(255, 220, 120));
        profileItemPhotoLabel.setFont(new Font("Arial", Font.PLAIN, 13));
        portfolio.add(profileItemPhotoLabel);
        
        homemain.add(portfolio);

        BalanceGraphPanel graphPanel = new BalanceGraphPanel();
        graphPanel.setBounds(950,140,500,250);
        graphPanel.setOpaque(false);
        homemain.add(graphPanel);
        homemain.add(homeBgLabel,Integer.valueOf(-1));
         
        
        
      
       aboutus=new JPanel();
       aboutus.setLayout(null);
      
        JTextArea info=new JTextArea(" our Bank Management System is a modern solution designed to simplify and secure banking operations."
            +" This system is developed to provide efficient management of customer accounts, transactions, and banking services through a user-friendly interface."
            +"Our Bank Management System is designed to deliver a seamless, secure, and efficient"
            +" banking experience by integrating advanced technology with user-centric functionality."
            +" Built to support the dynamic needs of modern financial institutions,"
            +" the system streamlines core banking operations such as"
            +" account management, transaction processing, loan handling, and customer relationship management"
            +" into a unified digital platform. It ensures high levels of data security through"
            +" robust encryption and authentication protocols, safeguarding sensitive financial"
            +" information while maintaining compliance with industry regulations. With an intuitive"
            +" interface and scalable architecture, the system empowers bank staff"
            + "to perform tasks quickly and accurately, reducing operational overhead and minimizing errors."
            +" Customers benefit from real-time access to their accounts, easy fund transfers, detailed "
            +"transaction histories, and responsive service, enhancing overall satisfaction and trust."
            +" The platform also incorporates analytics and reporting tools that help management make informed"
            +" decisions, identify trends, and optimize performance. By combining reliability, speed,"
            +" and innovation, our Bank Management System plays a vital role in "
            +"transforming traditional banking into a more agile, transparent, and customer-focused service environment.Our Bank Management System is a comprehensive and future-ready solution developed to simplify, automate, and enhance the overall functioning of modern banking institutions. It integrates all essential banking services into a single, cohesive platform, enabling efficient handling of operations such as customer account creation, deposits, withdrawals, fund transfers, loan processing, interest calculations, and financial reporting. Designed with a strong emphasis on security and reliability, the system employs advanced encryption standards, multi-factor authentication, and continuous monitoring to ensure that all transactions and customer data remain protected at every level. The user-friendly interface allows both bank staff and customers to navigate the system effortlessly, reducing complexity and improving productivity. Additionally, the system supports real-time transaction processing, ensuring instant updates and accurate financial records, which are crucial in today’s fast-paced digital economy. Its scalable architecture makes it suitable for banks of all sizes, allowing easy customization and expansion as business needs evolve. The inclusion of intelligent analytics and reporting features provides valuable insights into customer behavior, operational efficiency, and financial performance, enabling better strategic decision-making. By minimizing manual intervention and reducing the chances of human error, the system increases accuracy and operational efficiency while lowering costs. Furthermore, it enhances customer satisfaction by offering convenient, transparent, and accessible banking services anytime and anywhere. Overall, our Bank Management System represents a powerful blend of innovation, security, and efficiency, aimed at transforming traditional banking processes into a smart, agile, and customer-focused digital experience.");
            info.setBounds(10,10,1500,700);
            info.setForeground(Color.BLACK);
            info.setBackground(Color.BLACK);
            info.setWrapStyleWord(true);
            info.setLineWrap(true);
            info.setEditable(false);
            info.setOpaque(false);
            info.setFocusable(false);
           info.setFont(new Font("Arial",Font.ITALIC,23));
           aboutus.add(info);

       contact=new JPanel();
       contact.setLayout(null);
       JTextArea inf=new JTextArea("Developed by:Pawan Gupta "
            +"Email:pawangupta7718891100@gmail.com "
            +"Contact no:1234567890");
            inf.setBounds(500,300,460,150);
            inf.setForeground(Color.BLACK);
            inf.setBackground(Color.BLACK);
            inf.setWrapStyleWord(true);
            inf.setLineWrap(true);
            inf.setEditable(false);
            inf.setOpaque(false);
            inf.setFocusable(false);
           inf.setFont(new Font("Arial",Font.ITALIC,22));
       contact.add(inf);
        

       historyPanel= new JPanel();
       historyPanel.setLayout(null);
       JLabel historyTitle = new JLabel("Transaction History");
       historyTitle.setBounds(40, 20, 400, 40);
       historyTitle.setFont(new Font("Arial", Font.BOLD, 30));
       historyPanel.add(historyTitle);

       historyArea = new JTextArea();
       historyArea.setEditable(false);
       historyArea.setLineWrap(true);
       historyArea.setWrapStyleWord(true);
       historyArea.setFont(new Font("Consolas", Font.PLAIN, 16));
       JScrollPane historyScroll = new JScrollPane(historyArea);
       historyScroll.setBounds(40, 80, 1450, 760);
       historyPanel.add(historyScroll);
       updateHistoryPanel();
        

        homecontainer.add(homemain,"Home");
        homecontainer.add(aboutus,"About us");
        homecontainer.add(contact,"Contact");
        homecontainer.add(historyPanel,"History");

        home.add(homecontainer);
       home.setLayout(null);

        addButtontoPanel(home,"Home",0);
        addButtontoPanel(home,"About us", 370);
        addButtontoPanel(home,"Contact",740);
        addButtontoPanel(home,"History", 1110);
      
        //--------------xxxxxxxxxx-----------------------

        profile=new JPanel();
       profile.setLayout(null);

        ImageIcon profilebgimg=new ImageIcon("D:\\Pawan Gupta\\java\\test\\src/images/profilebg.png");
       Image profilebgs=profilebgimg.getImage().getScaledInstance(1600, 1000, Image.SCALE_SMOOTH);
       ImageIcon profilebgscale=new ImageIcon(profilebgs);

       profileBgLabel=new JLabel(profilebgscale);
       profileBgLabel.setBounds(0,0,1600,1000);
       
       GlassPanel profilepanel=new GlassPanel();
        profilepanel.setBounds(200,300,400,500);
        profilepanel.setLayout(null);
        profile.add(profilepanel);
      
        JLabel profileCardTitle = new JLabel("User Profile");
        profileCardTitle.setBounds(120, 20, 200, 40);
        profileCardTitle.setFont(new Font("Arial", Font.BOLD, 28));
        profileCardTitle.setForeground(Color.WHITE);
        profilepanel.add(profileCardTitle);

        profilePhotoHolder = new JLabel();
        profilePhotoHolder.setBounds(120, 80, 160, 160);
        profilePhotoHolder.setOpaque(true);
        profilePhotoHolder.setBackground(new Color(230, 230, 230));
        profilePhotoHolder.setHorizontalAlignment(SwingConstants.CENTER);
        profilePhotoHolder.setVerticalAlignment(SwingConstants.CENTER);
        profilePhotoHolder.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 58));
        profilePhotoHolder.setText("👤");
        profilepanel.add(profilePhotoHolder);

        JButton addPhotoButton = new JButton("Add Photo");
        addPhotoButton.setBounds(130, 255, 140, 35);
        addPhotoButton.setBackground(new Color(70, 130, 200));
        addPhotoButton.setForeground(Color.WHITE);
        addPhotoButton.setFocusPainted(false);
        profilepanel.add(addPhotoButton);

        addPhotoButton.addActionListener(e -> {
            JFileChooser chooser = new JFileChooser();
            int option = chooser.showOpenDialog(frame);
            if (option == JFileChooser.APPROVE_OPTION) {
                ImageIcon selected = new ImageIcon(chooser.getSelectedFile().getAbsolutePath());
                Image scaled = selected.getImage().getScaledInstance(
                        profilePhotoHolder.getWidth(),
                        profilePhotoHolder.getHeight(),
                        Image.SCALE_SMOOTH
                );
                profilePhotoHolder.setText("");
                profilePhotoHolder.setIcon(new ImageIcon(scaled));
                profilePhotoUploaded = true;
                updateProfileCompletionCard();
            }
        });

        JLabel customerType = new JLabel("Premium Savings User");
        customerType.setBounds(100, 315, 220, 25);
        customerType.setForeground(Color.GREEN);
        customerType.setFont(new Font("Arial", Font.BOLD, 16));
        profilepanel.add(customerType);

        JLabel kycStatus = new JLabel("KYC Verified");
        kycStatus.setBounds(140, 345, 160, 25);
        kycStatus.setForeground(Color.GREEN);
        kycStatus.setFont(new Font("Arial", Font.BOLD, 16));
        profilepanel.add(kycStatus);

          GlassPanel profilepanel2=new GlassPanel();
        profilepanel2.setBounds(900,50,400,700);
        profilepanel2.setLayout(null);
        profile.add(profilepanel2);

        JLabel detailsTitle = new JLabel("Account Details");
        detailsTitle.setBounds(110, 20, 220, 40);
        detailsTitle.setForeground(Color.WHITE);
        detailsTitle.setFont(new Font("Arial", Font.BOLD, 26));
        profilepanel2.add(detailsTitle);

        JLabel nameTitle = new JLabel("Name:");
        nameTitle.setBounds(40, 90, 150, 30);
        nameTitle.setForeground(Color.WHITE);
        nameTitle.setFont(new Font("Arial", Font.BOLD, 18));
        profilepanel2.add(nameTitle);
        profileNameField = new JTextField("Pawan Gupta");
        profileNameField.setBounds(190, 90, 180, 30);
        profileNameField.setFont(new Font("Arial", Font.PLAIN, 17));
        profilepanel2.add(profileNameField);

        JLabel accountTitle = new JLabel("Account No:");
        accountTitle.setBounds(40, 145, 150, 30);
        accountTitle.setForeground(Color.WHITE);
        accountTitle.setFont(new Font("Arial", Font.BOLD, 18));
        profilepanel2.add(accountTitle);
        JLabel accountValue = new JLabel("4892657123456789");
        accountValue.setBounds(190, 145, 200, 30);
        accountValue.setForeground(Color.WHITE);
        accountValue.setFont(new Font("Arial", Font.PLAIN, 16));
        profilepanel2.add(accountValue);

        JLabel phoneTitle = new JLabel("Phone:");
        phoneTitle.setBounds(40, 200, 150, 30);
        phoneTitle.setForeground(Color.WHITE);
        phoneTitle.setFont(new Font("Arial", Font.BOLD, 18));
        profilepanel2.add(phoneTitle);
        profilePhoneField = new JTextField("+91 98765 43210");
        profilePhoneField.setBounds(190, 200, 180, 30);
        profilePhoneField.setFont(new Font("Arial", Font.PLAIN, 16));
        profilepanel2.add(profilePhoneField);

        JLabel emailTitle = new JLabel("Email:");
        emailTitle.setBounds(40, 255, 150, 30);
        emailTitle.setForeground(Color.WHITE);
        emailTitle.setFont(new Font("Arial", Font.BOLD, 18));
        profilepanel2.add(emailTitle);
        profileEmailField = new JTextField("pawan@example.com");
        profileEmailField.setBounds(190, 255, 200, 30);
        profileEmailField.setFont(new Font("Arial", Font.PLAIN, 16));
        profilepanel2.add(profileEmailField);

        JLabel branchTitle = new JLabel("Branch:");
        branchTitle.setBounds(40, 310, 150, 30);
        branchTitle.setForeground(Color.WHITE);
        branchTitle.setFont(new Font("Arial", Font.BOLD, 18));
        profilepanel2.add(branchTitle);
        JLabel branchValue = new JLabel("SBI Mumbai Main");
        branchValue.setBounds(190, 310, 200, 30);
        branchValue.setForeground(Color.WHITE);
        branchValue.setFont(new Font("Arial", Font.PLAIN, 16));
        profilepanel2.add(branchValue);

        JLabel ifscTitle = new JLabel("IFSC:");
        ifscTitle.setBounds(40, 365, 150, 30);
        ifscTitle.setForeground(Color.WHITE);
        ifscTitle.setFont(new Font("Arial", Font.BOLD, 18));
        profilepanel2.add(ifscTitle);
        JLabel ifscValue = new JLabel("SBIN0001234");
        ifscValue.setBounds(190, 365, 180, 30);
        ifscValue.setForeground(Color.WHITE);
        ifscValue.setFont(new Font("Arial", Font.PLAIN, 16));
        profilepanel2.add(ifscValue);

        JLabel statusTitle = new JLabel("Status:");
        statusTitle.setBounds(40, 420, 150, 30);
        statusTitle.setForeground(Color.WHITE);
        statusTitle.setFont(new Font("Arial", Font.BOLD, 18));
        profilepanel2.add(statusTitle);
        JLabel statusValue = new JLabel("Active");
        statusValue.setBounds(190, 420, 180, 30);
        statusValue.setForeground(Color.GREEN);
        statusValue.setFont(new Font("Arial", Font.BOLD, 16));
        profilepanel2.add(statusValue);

        KeyAdapter profileFieldListener = new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                updateProfileCompletionCard();
            }
        };
        profileNameField.addKeyListener(profileFieldListener);
        profilePhoneField.addKeyListener(profileFieldListener);
        profileEmailField.addKeyListener(profileFieldListener);
        updateProfileCompletionCard();

        profile.add(profileBgLabel, Integer.valueOf(-1));

        //------------------xxxxxxxxxxxx--------------------

        lang=new JPanel();
        lang.add(new JLabel("Language page"));

        sec=new JPanel();
        sec.add(new JLabel("Security page"));

       setting=new JPanel();
       setting.setLayout(null);
       JLabel settingTitle = new JLabel("Settings");
       settingTitle.setBounds(60, 20, 300, 40);
       settingTitle.setFont(new Font("Arial", Font.BOLD, 34));
       setting.add(settingTitle);

       JTabbedPane settingsTabs = new JTabbedPane();
       settingsTabs.setBounds(40, 80, 1500, 840);
       settingsTabs.setFont(new Font("Arial", Font.BOLD, 16));

       JPanel accountSettings = new JPanel(null);
       JLabel editNameLabel = new JLabel("Full Name:");
       editNameLabel.setBounds(40, 40, 150, 30);
       JTextField editNameField = new JTextField("Pawan Gupta");
       editNameField.setBounds(200, 40, 280, 32);
       JLabel editPhoneLabel = new JLabel("Phone:");
       editPhoneLabel.setBounds(40, 90, 150, 30);
       JTextField editPhoneField = new JTextField("+91 98765 43210");
       editPhoneField.setBounds(200, 90, 280, 32);
       JLabel editEmailLabel = new JLabel("Email:");
       editEmailLabel.setBounds(40, 140, 150, 30);
       JTextField editEmailField = new JTextField("pawan@example.com");
       editEmailField.setBounds(200, 140, 280, 32);
       JButton saveProfileBtn = new JButton("Save Profile");
       saveProfileBtn.setBounds(200, 200, 180, 36);
       saveProfileBtn.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Profile details updated"));
       accountSettings.add(editNameLabel);
       accountSettings.add(editNameField);
       accountSettings.add(editPhoneLabel);
       accountSettings.add(editPhoneField);
       accountSettings.add(editEmailLabel);
       accountSettings.add(editEmailField);
       accountSettings.add(saveProfileBtn);

       JPanel securitySettings = new JPanel(null);
       JCheckBox biometricToggle = new JCheckBox("Enable Biometric Login");
       biometricToggle.setBounds(40, 40, 260, 30);
       biometricToggle.setSelected(true);
       JCheckBox twoFactorToggle = new JCheckBox("Enable 2-Factor Authentication");
       twoFactorToggle.setBounds(40, 80, 320, 30);
       twoFactorToggle.setSelected(true);
       JLabel oldPinLabel = new JLabel("Old PIN:");
       oldPinLabel.setBounds(40, 140, 120, 30);
       JPasswordField oldPinField = new JPasswordField();
       oldPinField.setBounds(180, 140, 180, 32);
       JLabel newPinLabel = new JLabel("New PIN:");
       newPinLabel.setBounds(40, 185, 120, 30);
       JPasswordField newPinField = new JPasswordField();
       newPinField.setBounds(180, 185, 180, 32);
       JButton updatePinBtn = new JButton("Update PIN");
       updatePinBtn.setBounds(180, 240, 150, 36);
       updatePinBtn.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Security settings updated"));
       securitySettings.add(biometricToggle);
       securitySettings.add(twoFactorToggle);
       securitySettings.add(oldPinLabel);
       securitySettings.add(oldPinField);
       securitySettings.add(newPinLabel);
       securitySettings.add(newPinField);
       securitySettings.add(updatePinBtn);

       JPanel notificationSettings = new JPanel(null);
       JCheckBox smsAlerts = new JCheckBox("SMS Transaction Alerts");
       smsAlerts.setBounds(40, 40, 250, 30);
       smsAlerts.setSelected(true);
       JCheckBox emailAlerts = new JCheckBox("Email Alerts");
       emailAlerts.setBounds(40, 80, 250, 30);
       emailAlerts.setSelected(true);
       JCheckBox promoAlerts = new JCheckBox("Promotional Notifications");
       promoAlerts.setBounds(40, 120, 250, 30);
       promoAlerts.setSelected(false);
       JCheckBox monthlyStatement = new JCheckBox("Monthly Statement Notifications");
       monthlyStatement.setBounds(40, 160, 300, 30);
       monthlyStatement.setSelected(true);
       JButton saveNotifications = new JButton("Save Notification Settings");
       saveNotifications.setBounds(40, 220, 260, 36);
       saveNotifications.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Notification settings saved"));
       notificationSettings.add(smsAlerts);
       notificationSettings.add(emailAlerts);
       notificationSettings.add(promoAlerts);
       notificationSettings.add(monthlyStatement);
       notificationSettings.add(saveNotifications);

       JPanel appearanceSettings = new JPanel(null);
       JLabel modeLabel = new JLabel("Dark Mode");
       modeLabel.setBounds(40, 40, 220, 32);
       modeLabel.setFont(new Font("Arial", Font.BOLD, 22));
       JToggleButton themeToggle = new JToggleButton("ON");
       themeToggle.setBounds(280, 40, 100, 34);
       themeToggle.setSelected(darkMode);
       themeToggle.setText(darkMode ? "ON" : "OFF");
       modeLabel.setText(darkMode ? "Dark Mode" : "Light Mode");
      
       JLabel languageLabel = new JLabel("Language:");
       languageLabel.setBounds(40, 100, 150, 30);
       String[] langOptions = {"English", "Hindi", "Marathi"};
       JComboBox<String> languageSelect = new JComboBox<>(langOptions);
       languageSelect.setBounds(200, 100, 180, 32);
       JLabel fontSizeLabel = new JLabel("App Font Size:");
       fontSizeLabel.setBounds(40, 150, 150, 30);
       Integer[] fontSizes = {14, 16, 18, 20};
       JComboBox<Integer> fontSizeSelect = new JComboBox<>(fontSizes);
       fontSizeSelect.setSelectedItem(16);
       fontSizeSelect.setBounds(200, 150, 180, 32);
       JCheckBox highContrast = new JCheckBox("High Contrast Mode");
       highContrast.setBounds(40, 200, 220, 30);
       JButton applyAppearanceBtn = new JButton("Apply Appearance");
       applyAppearanceBtn.setBounds(40, 250, 200, 36);
       applyAppearanceBtn.addActionListener(e -> {
           int selectedSize = (int) fontSizeSelect.getSelectedItem();
           wlc.setFont(new Font("Segoe UI", Font.BOLD, selectedSize + 12));
           JOptionPane.showMessageDialog(frame, "Appearance preferences applied");
       });
       themeToggle.addActionListener(e -> {
           darkMode = themeToggle.isSelected();
           themeToggle.setText(darkMode ? "ON" : "OFF");
           modeLabel.setText(darkMode ? "Dark Mode" : "Light Mode");
           BankSystem.saveThemeMode(darkMode);
           applyTheme(darkMode);
       });
       appearanceSettings.add(modeLabel);
       appearanceSettings.add(themeToggle);
       appearanceSettings.add(languageLabel);
       appearanceSettings.add(languageSelect);
       appearanceSettings.add(fontSizeLabel);
       appearanceSettings.add(fontSizeSelect);
       appearanceSettings.add(highContrast);
       appearanceSettings.add(applyAppearanceBtn);

       JPanel privacySettings = new JPanel(null);
       JCheckBox showBalanceToggle = new JCheckBox("Show Balance On Home Screen");
       showBalanceToggle.setBounds(40, 40, 280, 30);
       showBalanceToggle.setSelected(true);
       showBalanceToggle.addActionListener(e -> balanceLabel.setVisible(showBalanceToggle.isSelected()));
       JCheckBox deviceHistory = new JCheckBox("Allow Device Login History");
       deviceHistory.setBounds(40, 80, 280, 30);
       deviceHistory.setSelected(true);
       JCheckBox dataSharing = new JCheckBox("Allow Data Sharing For Offers");
       dataSharing.setBounds(40, 120, 300, 30);
       JLabel sessionLabel = new JLabel("Auto Logout:");
       sessionLabel.setBounds(40, 170, 130, 30);
       String[] sessionOptions = {"5 min", "10 min", "20 min", "Never"};
       JComboBox<String> sessionTimeout = new JComboBox<>(sessionOptions);
       sessionTimeout.setBounds(180, 170, 140, 32);
       JButton savePrivacy = new JButton("Save Privacy Settings");
       savePrivacy.setBounds(40, 230, 220, 36);
       savePrivacy.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Privacy settings updated"));
       privacySettings.add(showBalanceToggle);
       privacySettings.add(deviceHistory);
       privacySettings.add(dataSharing);
       privacySettings.add(sessionLabel);
       privacySettings.add(sessionTimeout);
       privacySettings.add(savePrivacy);

       JPanel bankingControls = new JPanel(null);
       JLabel upiLabel = new JLabel("UPI ID:");
       upiLabel.setBounds(40, 40, 120, 30);
       JTextField upiField = new JTextField("pawan@sbi");
       upiField.setBounds(180, 40, 220, 32);
       JCheckBox cardControl = new JCheckBox("Temporarily Block Debit Card");
       cardControl.setBounds(40, 90, 280, 30);
       JCheckBox internationalTx = new JCheckBox("Enable International Transactions");
       internationalTx.setBounds(40, 130, 320, 30);
       JButton saveBanking = new JButton("Save Banking Controls");
       saveBanking.setBounds(40, 190, 220, 36);
       saveBanking.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Banking controls saved"));
       JButton resetAppBtn = new JButton("Reset App Preferences");
       resetAppBtn.setBounds(40, 250, 220, 36);
       resetAppBtn.addActionListener(e -> {
           languageSelect.setSelectedItem("English");
           fontSizeSelect.setSelectedItem(16);
           highContrast.setSelected(false);
           smsAlerts.setSelected(true);
           emailAlerts.setSelected(true);
           promoAlerts.setSelected(false);
           monthlyStatement.setSelected(true);
           JOptionPane.showMessageDialog(frame, "Preferences reset to default");
       });
       bankingControls.add(upiLabel);
       bankingControls.add(upiField);
       bankingControls.add(cardControl);
       bankingControls.add(internationalTx);
       bankingControls.add(saveBanking);
       bankingControls.add(resetAppBtn);

       settingsTabs.addTab("Account", accountSettings);
       settingsTabs.addTab("Security", securitySettings);
       settingsTabs.addTab("Notifications", notificationSettings);
       settingsTabs.addTab("Appearance", appearanceSettings);
       settingsTabs.addTab("Privacy", privacySettings);
       settingsTabs.addTab("Banking", bankingControls);
       setting.add(settingsTabs);

       mainpanel.add(home,"Home");
        mainpanel.add(profile,"Profile");
        mainpanel.add(lang,"Language");
        mainpanel.add(sec,"Security");
        mainpanel.add(setting,"Setting");
        

        sidebar=new JPanel();
        sidebar.setBackground(Color.BLACK);
        sidebar.setBounds(x,130,320,900);
        sidebar.setLayout(null);

        addSidebarButton("Home🏡",50);
        addSidebarButton("Profile 🙎‍♂️",200);
        addSidebarButton("Language 💬",350);
        addSidebarButton("Security 👁️‍🗨️",500);
        addSidebarButton("Setting ⚙️",650);
        addSidebarButton("Logout🚪 ",800);
       
       
        
        
        

       
        frame.add(wlc);
        frame.add(line1);
        frame.add(line2);
        frame.add(caButton);
        frame.add(m);
        frame.add(sidebar);
        frame.add(mainpanel);
       
        
       
        frame.setSize(1920, 1080);
        frame.setLayout(null);
        applyTheme(darkMode);
        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                applyResponsiveScale();
            }
        });
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        SwingUtilities.invokeLater(this::applyResponsiveScale);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    
     void addSidebarButton(String text,int y){
        
            JButton menu=new JButton(text);
            menu.setBounds(10,y,350,100);
            menu.setFocusPainted(false);
            menu.setBorderPainted(false);
            menu.setBackground(Color.BLACK);
            menu.setForeground(Color.WHITE);
           menu.setFont(new Font("Segoe UI Emoji",Font.BOLD,20));
            menu.setBorderPainted(false);
            sidebarButtons.add(menu);

          
            menu.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e){
                    menu.setBackground(darkMode ? Color.BLUE : new Color(178, 202, 235));
                }
                public void mouseExited(MouseEvent e){
                    menu.setBackground(darkMode ? Color.BLACK : new Color(224, 232, 242));
                }
            });
            sidebar.add(menu);

            menu.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    if(text.contains("Home")){
                       card.show(mainpanel,"Home"); 
                    }

                    if(text.contains("Profile")){
                        card.show(mainpanel,"Profile");
                    }
                    else if(text.contains("Language")){
                        card.show(mainpanel,"Language");
                    }   
                    else if(text.contains("Security")){
                        card.show(mainpanel, "Security");
                    }

                    else if(text.contains("Setting")){
                        card.show(mainpanel, "Setting");
                    }
                    else if(text.contains("Logout")){
                        new BankPage();
                        frame.dispose();
                    }
               }
            });
            
        }

        void addButtontoPanel(JPanel panel,String text,int x){
    
            

        JButton hac=new JButton(text);
        hac.setBounds(x,20,150,40);
        hac.setFont(new Font("Segoe UI Emoji", Font.BOLD, 20));
        hac.setForeground(Color.WHITE);
        hac.setBackground(Color.BLACK);
        hac.setBorderPainted(false);
        topPanelButtons.add(hac);

       panel.add(hac);
       hac.addActionListener(e->{

       
            if(text.equals("Home")){
                homecard.show(homecontainer,"Home");
            }
        
        else if(text.equals("About us")){
        homecard.show(homecontainer,"About us");
        }    
          /*   JPanel aboutp=new JPanel();
            aboutp.setBounds(x,60,500,170);
            aboutp.setBackground(Color.LIGHT_GRAY);
            aboutp.setLayout(null);
            aboutp.setVisible(false);
            aboutp.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));

            JTextArea info=new JTextArea("Welcome to our Bank Management System, a modern solution designed to simplify and secure banking operations."
            +" This system is developed to provide efficient management of customer accounts, transactions, and banking services through a user-friendly interface.See more....");
            info.setBounds(10,10,460,150);
            info.setForeground(Color.BLACK);
            info.setBackground(Color.BLACK);
            info.setWrapStyleWord(true);
            info.setLineWrap(true);
            info.setEditable(false);
            info.setOpaque(false);
            info.setFocusable(false);
           info.setFont(new Font("Arial",Font.ITALIC,20));
           
            aboutp.add(info);
            panel.add(aboutp);

            hac.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e){
                    aboutp.setVisible(true);
                }
                public void mouseExited(MouseEvent e){
                    aboutp.setVisible(false);
                }
            
        
        */
          

           else if(text.equals("Contact")){
                 homecard.show(homecontainer,"Contact");

                  }      /*  
            JPanel aboutp=new JPanel();
            aboutp.setBounds(x,60,450,120);
            aboutp.setBackground(Color.LIGHT_GRAY);
            aboutp.setLayout(null);
            aboutp.setVisible(false);
            aboutp.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));

            JTextArea info=new JTextArea("Developed by:Pawan Gupta "
            +"Email:pawangupta7718891100@gmail.com "
            +"Contact no:1234567890");
            info.setBounds(10,10,460,150);
            info.setForeground(Color.BLACK);
            info.setBackground(Color.BLACK);
            info.setWrapStyleWord(true);
            info.setLineWrap(true);
            info.setEditable(false);
            info.setOpaque(false);
            info.setFocusable(false);
           info.setFont(new Font("Arial",Font.ITALIC,22));
           
            aboutp.add(info);
            panel.add(aboutp);

            hac.addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e){
                    aboutp.setVisible(true);
                }
                public void mouseExited(MouseEvent e){
                    aboutp.setVisible(false);
                }
            });
        }
    //main bracket
        */

                  else if(text.equals("History")){
                    homecard.show(homecontainer,"History");
                  }
                });        
}

    void applyTheme(boolean useDarkTheme) {
        Color frameBg = useDarkTheme ? Color.BLACK : new Color(242, 245, 250);
        Color panelBg = useDarkTheme ? Color.BLACK : Color.WHITE;
        Color textColor = useDarkTheme ? Color.WHITE : new Color(30, 30, 30);
        Color subTextColor = useDarkTheme ? Color.LIGHT_GRAY : new Color(90, 90, 90);
        Color buttonBg = useDarkTheme ? Color.BLACK : new Color(224, 232, 242);
        Color buttonText = useDarkTheme ? Color.WHITE : new Color(35, 45, 60);

        frame.getContentPane().setBackground(frameBg);
        wlc.setForeground(textColor);
        sidebar.setBackground(panelBg);
        mainpanel.setBackground(panelBg);
        home.setBackground(panelBg);
        homemain.setBackground(panelBg);
        aboutus.setBackground(panelBg);
        contact.setBackground(panelBg);
        historyPanel.setBackground(panelBg);
        profile.setBackground(panelBg);
        lang.setBackground(panelBg);
        sec.setBackground(panelBg);
        setting.setBackground(panelBg);

        for (JButton menuBtn : sidebarButtons) {
            menuBtn.setBackground(buttonBg);
            menuBtn.setForeground(buttonText);
        }
        for (JButton navBtn : topPanelButtons) {
            navBtn.setBackground(buttonBg);
            navBtn.setForeground(buttonText);
        }

        m.setBackground(useDarkTheme ? new Color(220, 220, 220) : new Color(210, 220, 235));
        m.setForeground(Color.BLACK);
        caButton.setBackground(useDarkTheme ? new Color(220, 220, 220) : new Color(210, 220, 235));
        caButton.setForeground(Color.BLACK);

        applyThemeToComponents(homecontainer, panelBg, textColor, subTextColor, useDarkTheme);
        applyThemeToComponents(profile, panelBg, textColor, subTextColor, useDarkTheme);
        applyThemeToComponents(lang, panelBg, textColor, subTextColor, useDarkTheme);
        applyThemeToComponents(sec, panelBg, textColor, subTextColor, useDarkTheme);
        applyThemeToComponents(setting, panelBg, textColor, subTextColor, useDarkTheme);

        if (homeBgLabel != null) {
            homeBgLabel.setVisible(useDarkTheme);
        }
        if (profileBgLabel != null) {
            profileBgLabel.setVisible(useDarkTheme);
        }
    }

    void applyThemeToComponents(Container root, Color panelBg, Color textColor, Color subTextColor, boolean useDarkTheme) {
        for (Component component : root.getComponents()) {
            if (component instanceof JPanel) {
                component.setBackground(panelBg);
            } else if (component instanceof JButton) {
                JButton btn = (JButton) component;
                btn.setForeground(useDarkTheme ? textColor : Color.BLACK);
            } else if (component instanceof JLabel) {
                JLabel label = (JLabel) component;
                Color current = label.getForeground();
                if (Color.GREEN.equals(current)) {
                    continue;
                }
                if (useDarkTheme) {
                    if (Color.RED.equals(current) || Color.PINK.equals(current)) {
                        continue;
                    }
                    if (Color.LIGHT_GRAY.equals(current)) {
                        label.setForeground(subTextColor);
                    } else {
                        label.setForeground(textColor);
                    }
                } else {
                    label.setForeground(Color.BLACK);
                }
            } else if (component instanceof JTextArea) {
                JTextArea area = (JTextArea) component;
                area.setForeground(useDarkTheme ? textColor : Color.BLACK);
            } else if (component instanceof JTextField) {
                JTextField field = (JTextField) component;
                field.setBackground(Color.WHITE);
                field.setForeground(Color.BLACK);
            } else if (component instanceof JCheckBox) {
                JCheckBox box = (JCheckBox) component;
                box.setForeground(useDarkTheme ? textColor : Color.BLACK);
                box.setBackground(panelBg);
            } else if (component instanceof JToggleButton) {
                JToggleButton toggle = (JToggleButton) component;
                toggle.setForeground(useDarkTheme ? textColor : Color.BLACK);
            } else if (component instanceof JComboBox) {
                JComboBox<?> combo = (JComboBox<?>) component;
                combo.setForeground(Color.BLACK);
                combo.setBackground(Color.WHITE);
            } else if (component instanceof JPasswordField) {
                JPasswordField passwordField = (JPasswordField) component;
                passwordField.setBackground(Color.WHITE);
                passwordField.setForeground(Color.BLACK);
            }

            if (component instanceof Container) {
                applyThemeToComponents((Container) component, panelBg, textColor, subTextColor, useDarkTheme);
            }
        }
    }

    void applyResponsiveScale() {
        double rawScaleX = frame.getWidth() / (double) BASE_WIDTH;
        double rawScaleY = frame.getHeight() / (double) BASE_HEIGHT;
        double scaleX = Math.max(MIN_SCALE, Math.min(MAX_SCALE, rawScaleX));
        double scaleY = Math.max(MIN_SCALE, Math.min(MAX_SCALE, rawScaleY));
        scaleContainer(frame.getContentPane(), scaleX, scaleY);
        frame.revalidate();
        frame.repaint();
    }

    void scaleContainer(Container root, double scaleX, double scaleY) {
        for (Component component : root.getComponents()) {
            if (component instanceof JComponent) {
                JComponent jc = (JComponent) component;
                Rectangle baseBounds = (Rectangle) jc.getClientProperty("baseBounds");
                if (baseBounds == null) {
                    baseBounds = component.getBounds();
                    jc.putClientProperty("baseBounds", new Rectangle(baseBounds));
                }

                int newX = (int) Math.round(baseBounds.x * scaleX);
                int newY = (int) Math.round(baseBounds.y * scaleY);
                int newW = Math.max(1, (int) Math.round(baseBounds.width * scaleX));
                int newH = Math.max(1, (int) Math.round(baseBounds.height * scaleY));
                component.setBounds(newX, newY, newW, newH);

                Font baseFont = (Font) jc.getClientProperty("baseFont");
                if (baseFont == null && component.getFont() != null) {
                    baseFont = component.getFont();
                    jc.putClientProperty("baseFont", baseFont);
                }
                if (baseFont != null) {
                    float scaledSize = (float) Math.max(10, Math.min(48, baseFont.getSize2D() * Math.min(scaleX, scaleY)));
                    component.setFont(baseFont.deriveFont(scaledSize));
                }
            }

            if (component instanceof Container) {
                scaleContainer((Container) component, scaleX, scaleY);
            }
        }
    }

    void updateProfileCompletionCard() {
        if (profileCompletionBar == null || profilePercentLabel == null || profileCompletedLabel == null) {
            return;
        }

        boolean nameDone = profileNameField != null && !profileNameField.getText().trim().isEmpty();
        boolean phoneDone = profilePhoneField != null && !profilePhoneField.getText().trim().isEmpty();
        boolean emailDone = profileEmailField != null && !profileEmailField.getText().trim().isEmpty();
        boolean kycDone = true;
        boolean photoDone = profilePhotoUploaded;

        int completed = 0;
        if (nameDone) completed++;
        if (phoneDone) completed++;
        if (emailDone) completed++;
        if (kycDone) completed++;
        if (photoDone) completed++;

        int total = 5;
        int percent = (completed * 100) / total;

        profileCompletionBar.setValue(percent);
        profilePercentLabel.setText(percent + "%");
        profileCompletedLabel.setText("Completed: " + completed + "/" + total);

        profileItemNameLabel.setText((nameDone ? "✔ " : "○ ") + "Name");
        profileItemPhoneLabel.setText((phoneDone ? "✔ " : "○ ") + "Phone");
        profileItemEmailLabel.setText((emailDone ? "✔ " : "○ ") + "Email");
        profileItemKycLabel.setText((kycDone ? "✔ " : "○ ") + "KYC");
        profileItemPhotoLabel.setText((photoDone ? "✔ " : "○ ") + "Photo");
        profileItemPhotoLabel.setForeground(photoDone ? Color.GREEN : new Color(255, 220, 120));
    }

    void updateHistoryPanel() {
        if (historyArea == null) {
            return;
        }
        if (BankSystem.history.isEmpty()) {
            historyArea.setText("No transactions yet.");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = BankSystem.history.size() - 1; i >= 0; i--) {
            sb.append("• ").append(BankSystem.history.get(i)).append("\n");
        }
        historyArea.setText(sb.toString());
        historyArea.setCaretPosition(0);
}

           /*
         */

    public static void main(String[] args) {
        Mainpage mn=new Mainpage();
    }
    
}

class BankSystem {
    private static final Path BALANCE_FILE = Paths.get("bank_balance.txt");
    private static final Path THEME_FILE = Paths.get("theme_mode.txt");
    private static final Path HISTORY_FILE = Paths.get("bank_history.txt");
    static double balance = 695743.74;
    static boolean darkModeEnabled = true;
    static ArrayList<String> history = new ArrayList<>();

    static {
        loadBalance();
        loadThemeMode();
        loadHistory();
    }

    static void loadBalance() {
        try {
            if (Files.exists(BALANCE_FILE)) {
                String saved = Files.readString(BALANCE_FILE).trim();
                if (!saved.isEmpty()) {
                    balance = Double.parseDouble(saved);
                }
            }
        } catch (Exception ex) {
            System.out.println("Could not load saved balance, using default.");
        }
    }

    static void saveBalance() {
        try {
            Files.writeString(BALANCE_FILE, String.valueOf(balance));
        } catch (Exception ex) {
            System.out.println("Could not save balance.");
        }
    }

    static void loadThemeMode() {
        try {
            if (Files.exists(THEME_FILE)) {
                String saved = Files.readString(THEME_FILE).trim();
                if (!saved.isEmpty()) {
                    darkModeEnabled = Boolean.parseBoolean(saved);
                }
            }
        } catch (Exception ex) {
            System.out.println("Could not load theme mode, using default.");
        }
    }

    static void saveThemeMode(boolean isDarkMode) {
        darkModeEnabled = isDarkMode;
        try {
            Files.writeString(THEME_FILE, String.valueOf(isDarkMode));
        } catch (Exception ex) {
            System.out.println("Could not save theme mode.");
        }
    }

    static boolean isDarkModeEnabled() {
        return darkModeEnabled;
    }

    static void loadHistory() {
        history.clear();
        try {
            if (Files.exists(HISTORY_FILE)) {
                List<String> lines = Files.readAllLines(HISTORY_FILE);
                for (String line : lines) {
                    if (!line.trim().isEmpty()) {
                        history.add(line);
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Could not load transaction history.");
        }
    }

    static void saveHistory() {
        try {
            Files.write(HISTORY_FILE, history);
        } catch (Exception ex) {
            System.out.println("Could not save transaction history.");
        }
    }

    static void addHistoryRecord(String record) {
        history.add(record);
        saveHistory();
    }
}

// 🔐 Login Frame
/*class LoginFrame extends JFrame implements ActionListener {
    JTextField user;
    JPasswordField pass;
    JButton login;

    LoginFrame() {
        setTitle("Bank Login");
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Username:"));
        user = new JTextField();
        add(user);

        add(new JLabel("Password:"));
        pass = new JPasswordField();
        add(pass);

        login = new JButton("Login");
        login.addActionListener(this);
        add(login);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (user.getText().equals("admin") && String.valueOf(pass.getPassword()).equals("1234")) {
            new Dashboard();
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Login");
        }
    }
}*/

// 🏠 Dashboard
class Dashboard extends JFrame implements ActionListener {
    JButton balanceBtn, depositBtn, withdrawBtn, historyBtn, logoutBtn;

    public static boolean openDepositDialog(Component parent) {
        String input = JOptionPane.showInputDialog(parent, "Enter amount:");
        if (input == null || input.trim().isEmpty()) {
            return false;
        }

        try {
            double amt = Double.parseDouble(input.trim());
            if (amt <= 0) {
                JOptionPane.showMessageDialog(parent, "Enter a valid positive amount");
                return false;
            }
            BankSystem.balance += amt;
            Mainpage.balance += amt;
            BankSystem.addHistoryRecord("Deposited: ₹" + amt);
            BankSystem.saveBalance();
            JOptionPane.showMessageDialog(parent, "Deposited successfully: ₹" + amt);
            return true;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(parent, "Invalid amount");
            return false;
        }
    }

    public static boolean openWithdrawDialog(Component parent) {
        String input = JOptionPane.showInputDialog(parent, "Enter amount:");
        if (input == null || input.trim().isEmpty()) {
            return false;
        }

        try {
            double amt = Double.parseDouble(input.trim());
            if (amt <= 0) {
                JOptionPane.showMessageDialog(parent, "Enter a valid positive amount");
                return false;
            }
            if (amt > BankSystem.balance || amt > Mainpage.balance) {
                JOptionPane.showMessageDialog(parent, "Insufficient Balance");
                return false;
            }

            BankSystem.balance -= amt;
            Mainpage.balance -= amt;
            BankSystem.addHistoryRecord("Withdrawn: ₹" + amt);
            BankSystem.saveBalance();
            JOptionPane.showMessageDialog(parent, "Withdraw successful: ₹" + amt);
            return true;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(parent, "Invalid amount");
            return false;
        }
    }

    Dashboard() {
        setTitle("Dashboard");
        setSize(400, 300);
        setLayout(new GridLayout(5, 1));

        balanceBtn = new JButton("Check Balance");
        depositBtn = new JButton("Deposit");
        withdrawBtn = new JButton("Withdraw");
        historyBtn = new JButton("Transaction History");
        logoutBtn = new JButton("Logout");

        add(balanceBtn);
        add(depositBtn);
        add(withdrawBtn);
        add(historyBtn);
        add(logoutBtn);

        balanceBtn.addActionListener(this);
        depositBtn.addActionListener(this);
        withdrawBtn.addActionListener(this);
        historyBtn.addActionListener(this);
        logoutBtn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == balanceBtn) {
            JOptionPane.showMessageDialog(this, "Balance: ₹" + BankSystem.balance);
        }

        if (e.getSource() == depositBtn) {
            openDepositDialog(this);
        }

        if (e.getSource() == withdrawBtn) {
            openWithdrawDialog(this);
        }

        if (e.getSource() == historyBtn) {
            StringBuilder sb = new StringBuilder();
            for (String h : BankSystem.history) {
                sb.append(h + "\n");
            }
            JOptionPane.showMessageDialog(this, sb.toString());
        }

        
    }
    public static void main(String[] args) {
        Dashboard D=new Dashboard();
    }
}
    

