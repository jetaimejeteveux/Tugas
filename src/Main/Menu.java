package Main;

import Operator.LuasBalok;
import Operator.VolumeBalok;
import Operator.VolumeTabung;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    JLabel lJudul;
    JButton btnLuasBalok, btnVolBalok, btnVolTabung;



    public Menu(){
        lJudul = new JLabel("MENU");
        lJudul.setFont(new Font("Serif", Font.PLAIN, 18));
        btnVolTabung = new JButton("1. Volume Tabung");
        btnVolBalok = new JButton("2. Volume Balok");
        btnLuasBalok = new JButton("3. Luas Permukaan Balok");


        btnLuasBalok.addActionListener(this);
        btnVolBalok.addActionListener(this);
        btnVolTabung.addActionListener(this);

        setLayout(null);
        add(lJudul);
        add(btnLuasBalok);
        add(btnVolBalok);
        add(btnVolTabung);

        lJudul.setBounds(0,10,180,25);
        lJudul.setHorizontalAlignment(SwingConstants.CENTER);
        btnVolTabung.setBounds(0,50,150,100);
        btnVolBalok.setBounds(150,50,150,100);
        btnLuasBalok.setBounds(0,150,300,100);


        setSize(400,325);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnVolTabung) {
            new VolumeTabung();
            setVisible(false);

        } else if (e.getSource() == btnVolBalok) {

            setVisible(false);
            new VolumeBalok();
        } else if (e.getSource() == btnLuasBalok) {
            new LuasBalok();
            setVisible(false);
        }
    }
}
