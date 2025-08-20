/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author sbusi
 */
public class TicketsFrame extends JFrame {

    //DECLARE PANELS
    private JPanel headingPNI;
    private JPanel namePNI;
    private JPanel surnamePNI;
    private JPanel cellphonePNI;
    private JPanel customerPNI;
    
    private JPanel hometeamPNI;
    private JPanel awayteamPNI;
    private JPanel costPricePNI;
    private JPanel noOfTicketsPNI;
    private JPanel totalPNI;
    private JPanel ticketDetailsPNI;
    
    private JPanel btnPNI;
    private JPanel btnTicketsPNI;
    private JPanel mainPNI;
    
    //LABELS
    private JLabel headingLB;
    private JLabel nameLB;
    private JLabel surnameLB;
    private JLabel cellLB;
    
    private JLabel hometeamLB;
    private JLabel awayteamLB;
    private JLabel costPriceLB;
    private JLabel noOfTicketsLB;
    private JLabel totalLB;
    
    //text Fields
    private JTextField nameTF;
    private JTextField surnameTF;
    private JTextField cellTF;
    
    private JTextField hometeamTF;
    private JTextField awayteamTF;
    private JTextField costPriceTF;
    private JTextField totalTF;
    
    //JSlider
    private JSlider noOfTicketsJSlider;
    
    //Buttons
    private JButton buyBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
   //configue ui
    
    public TicketsFrame() {
        setTitle("Ticket Sales");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,650);
        setDefaultLookAndFeelDecorated(true);
        
        //create panels
        headingPNI = new JPanel(new FlowLayout(FlowLayout.CENTER));
        namePNI = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePNI = new JPanel(new FlowLayout(FlowLayout.LEFT));
        cellphonePNI = new JPanel(new FlowLayout(FlowLayout.LEFT));
        customerPNI = new JPanel(new GridLayout(3,1));
        customerPNI.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2),"Customer Details"));
        
        hometeamPNI = new JPanel(new FlowLayout(FlowLayout.LEFT));
        awayteamPNI = new JPanel(new FlowLayout(FlowLayout.LEFT));
        costPricePNI = new JPanel(new FlowLayout(FlowLayout.LEFT));
        noOfTicketsPNI = new JPanel(new FlowLayout(FlowLayout.LEFT));
        totalPNI =  new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        ticketDetailsPNI = new JPanel(new GridLayout(5,1));
        ticketDetailsPNI.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2),"Ticket Details"));
        
        btnPNI = new JPanel(new FlowLayout(FlowLayout.CENTER));
        btnTicketsPNI = new JPanel(new BorderLayout());
        mainPNI = new JPanel(new BorderLayout());
        
        //create labels
        headingLB = new JLabel("SOCCER MATCH TICKETS");
        headingLB.setFont(new Font(Font.SERIF,Font.BOLD+Font.ITALIC,40));
        headingLB.setForeground(Color.GRAY);
        
        nameLB = new JLabel("Name:     ");
        surnameLB = new JLabel("Surname:     ");
        cellLB = new JLabel("Cellphone:      ");
        
        hometeamLB = new JLabel("Home Team :    ");
        awayteamLB = new JLabel("Away Team :    ");
        costPriceLB = new JLabel("Cost Price: R     ");
        noOfTicketsLB = new JLabel("Number of Tickets:   ");
        totalLB = new JLabel("Total Amount Due: R");
        
        //text fields
        nameTF = new JTextField(10);
        nameTF.setFocusable(true);
        
        surnameTF = new JTextField(10);
        cellTF = new JTextField(10);
        hometeamTF = new JTextField(10);
        awayteamTF = new JTextField(10);
        costPriceTF = new JTextField(10);
        
        totalTF = new JTextField(10);
        totalTF.setText("To be calculated");
        totalTF.setEditable(false);
        
        //Jslider
        noOfTicketsJSlider = new JSlider(1,20);
        
        //buttons
        buyBtn = new JButton("BUY");
        clearBtn = new JButton("CLEAR");
        exitBtn = new JButton("EXIT");
        
        //add componets to panels
        headingPNI.add(headingLB);
        
        namePNI.add(nameLB);
        namePNI.add(nameTF);
        
        surnamePNI.add(surnameLB);
        surnamePNI.add(surnameTF);
        
        cellphonePNI.add(cellLB);
        cellphonePNI.add(cellTF);
        
        customerPNI.add(namePNI);
        customerPNI.add(surnamePNI);
        customerPNI.add(cellphonePNI);
        
        hometeamPNI.add(hometeamLB);
        hometeamPNI.add(hometeamTF);
        
        awayteamPNI.add(awayteamLB);
        awayteamPNI.add(awayteamTF);
        
        costPricePNI.add(costPriceLB);
        costPricePNI.add(costPriceTF);
        
        noOfTicketsPNI.add(noOfTicketsLB);
        noOfTicketsPNI.add(noOfTicketsJSlider);
        
        totalPNI.add(totalLB);
        totalPNI.add(totalTF);
        
        ticketDetailsPNI.add(hometeamPNI);
        ticketDetailsPNI.add(awayteamPNI);
        ticketDetailsPNI.add(costPricePNI);
        ticketDetailsPNI.add(noOfTicketsPNI);
        ticketDetailsPNI.add(totalPNI);
        
        btnPNI.add(buyBtn);
        btnPNI.add(clearBtn);
        btnPNI.add(exitBtn);
        
        btnTicketsPNI.add(ticketDetailsPNI,BorderLayout.CENTER);
        btnTicketsPNI.add(btnPNI,BorderLayout.SOUTH);
        
        mainPNI.add(headingPNI,BorderLayout.NORTH);
        mainPNI.add(customerPNI,BorderLayout.CENTER);
        mainPNI.add(btnTicketsPNI,BorderLayout.SOUTH);
        
        add(mainPNI);
        
        pack();
        
        setVisible(true);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
}
