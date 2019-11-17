/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientchatudp;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author ferro.fabio
 */


public class InterfacciaGUI extends JFrame implements Runnable {

    JPanel ContenutoInvio = new JPanel();

    JMenuBar menu = new JMenuBar();
    JMenu GestisciChat = new JMenu("Opzioni della Chat");
    JMenuItem InserisciIPServer = new JMenuItem("Inserisci l'indirizzo IP del Server");
    JMenuItem AddUsername = new JMenuItem("Aggiungi l'username che vuoi utilizzare");

    private static JTextArea areaChat = new JTextArea();
    JScrollPane scroll = new JScrollPane(areaChat);

    JTextField messaggioField = new JTextField("Scrivi il tuo messaggio qui");
    JButton invia = new JButton("Invia");

    public InterfacciaGUI() throws InterruptedException {

        this.setTitle("Chat di gruppo");
        this.setSize(600, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(new GridLayout(2, 1));

        menu.add(GestisciChat);
        GestisciChat.add(InserisciIPServer);
        GestisciChat.add(AddUsername);
        this.setJMenuBar(menu);

        ContenutoInvio.setLayout(new GridLayout(1, 2));
        ContenutoInvio.setBorder(new EmptyBorder(60, 20, 60, 20));
        messaggioField.setBorder(new EmptyBorder(10, 10, 10, 10));
        ContenutoInvio.add(messaggioField);
        ContenutoInvio.add(invia);
        areaChat.setEditable(false);
        areaChat.setBorder(new EmptyBorder(20, 20, 20, 20));
        Font fontArea = null;
        areaChat.setFont(fontArea);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        this.add(ContenutoInvio);

        messaggioField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                messaggioField.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });

    }

    public void actionPerformed(ActionEvent e) {
    }

//Questo metodo non ci serve quindi non l'ho utilizziamo
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
