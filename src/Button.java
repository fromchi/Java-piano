// Java program using label (swing)
// to display the message “GFG WEB Site Click”
import java.io.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.awt.Toolkit.*;

// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating instance of JFrame
        JFrame frame = new JFrame();
        ImageIcon speaker_icon = new ImageIcon("volume.png");

        // Creating instance of JButton
        JButton c_button = new JButton("C");
        JButton d_button = new JButton("D");
        JButton e_button = new JButton("E");
        JButton f_button = new JButton("F");
        JButton g_button = new JButton("G");
        JButton a_button = new JButton("A");
        JButton b_button = new JButton("B");

        //sound buttons
        JButton c_sound_button = new JButton();
        c_sound_button.setIcon(speaker_icon);
        JButton d_sound_button = new JButton(speaker_icon);
        JButton e_sound_button = new JButton(speaker_icon);
        JButton f_sound_button = new JButton(speaker_icon);
        JButton g_sound_button = new JButton(speaker_icon);
        JButton a_sound_button = new JButton(speaker_icon);
        JButton b_sound_button = new JButton(speaker_icon);

        //size of sound buttons
        // x axis, y axis, width, height
        c_sound_button.setBounds(20, 240, 50, 50);
        d_sound_button.setBounds(80, 240, 50, 50);
        e_sound_button.setBounds(140, 240, 50, 50);
        f_sound_button.setBounds(200, 240, 50, 50);
        g_sound_button.setBounds(260, 240, 50, 50);
        a_sound_button.setBounds(320, 240, 50, 50);
        b_sound_button.setBounds(380, 240, 50, 50);

        // x axis, y axis, width, height
        c_button.setBounds(20, 20, 50, 200);
        d_button.setBounds(80, 20, 50, 200);
        e_button.setBounds(140, 20, 50, 200);
        f_button.setBounds(200, 20, 50, 200);
        g_button.setBounds(260, 20, 50, 200);
        a_button.setBounds(320, 20, 50, 200);
        b_button.setBounds(380, 20, 50, 200);

        //add listeners to buttons
        c_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("c clicked");
            }
        });
        d_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("d clicked");
            }
        });

        e_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("e clicked");
            }
        });
        f_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("f clicked");
            }
        });
        g_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("g clicked");
            }
        });
        a_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("a clicked");
            }
        });
        b_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("b clicked");
            }
        });



        // adding button in JFrame
        frame.add(c_button);
        frame.add(d_button);
        frame.add(e_button);
        frame.add(f_button);
        frame.add(g_button);
        frame.add(a_button);
        frame.add(b_button);

        // adding button in JFrame
        frame.add(c_sound_button);
        frame.add(d_sound_button);
        frame.add(e_sound_button);
        frame.add(f_sound_button);
        frame.add(g_sound_button);
        frame.add(a_sound_button);
        frame.add(b_sound_button);


        // 400 width and 500 height
        frame.setSize(450, 310);

        // using no layout managers
        frame.setLayout(null);
        //frame.pack();
        // making the frame visible
        frame.setVisible(true);
    }
}