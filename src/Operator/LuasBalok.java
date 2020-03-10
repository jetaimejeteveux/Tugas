package Operator;

import Main.Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class LuasBalok extends JFrame  {
    JLabel lPanjang,lLebar,lTinggi,lJudul,lHasil,tfHasil;
    JTextField tfPanjang,tfLebar,tfTinggi;
    JButton btnHasil,btnKembali,btnReset;
    public LuasBalok(){
        lJudul = new JLabel("Operator Luas Balok");
        lPanjang = new JLabel("Panjang ");
        lLebar = new JLabel("Lebar ");
        lTinggi = new JLabel("Tinggi ");
        lHasil = new JLabel("Luas Permukaan Balok = ");
        tfHasil = new JLabel();


        tfPanjang = new JTextField();
        tfLebar = new JTextField();
        tfTinggi = new JTextField();

        btnHasil = new JButton("Hasil");
        btnKembali = new JButton("Kembali");
        btnReset = new JButton("Reset");

        setSize(300,400);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        setLayout(null);
        add(lJudul);
        add(lPanjang);
        add(lLebar);
        add(lTinggi);
        add(lJudul);
        add(tfPanjang);
        add(tfLebar);
        add(tfTinggi);
        add(btnHasil);
        add(btnKembali);
        add(btnReset);
        add(lHasil);
        add(tfHasil);

        lJudul.setBounds(0,20,160,20);
        lPanjang.setBounds(10,50,100,25);
        tfPanjang.setBounds(100,50,150,25);
        lLebar.setBounds(10,90,100,25);
        tfLebar.setBounds(100,90,150,25);
        lTinggi.setBounds(10,130,100,25);
        tfTinggi.setBounds(100,130,150,25);
        lHasil.setBounds(10,180,160,25);
        tfHasil.setBounds(165,180,100,25);
        btnReset.setBounds(100,200,100,25);
        btnHasil.setBounds(100,250,100,25);
        btnKembali.setBounds(100,300,100,25);


        btnHasil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnHasilactionListener();
            }
        });

        btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Menu();
            }
        });

        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final String NULL="";
                tfPanjang.setText(NULL);
                tfLebar.setText(NULL);
                tfTinggi.setText(NULL);
                tfHasil.setText(NULL);
            }
        });

    }

    private void btnHasilactionListener(){
        String panjang = tfPanjang.getText();
        String lebar = tfLebar.getText();
        String tinggi = tfTinggi.getText();

        // string to double
        double p = Double.valueOf(panjang);
        double l = Double.valueOf(lebar);
        double t = Double.valueOf(tinggi);

        double hasilDouble = (p*l+p*t+l*t)*2;

        String hasilString = String.valueOf(hasilDouble);
        tfHasil.setText(hasilString);
    }

}