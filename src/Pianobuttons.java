import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class Pianobuttons {

    private JFrame frame;
    private ImageIcon speakerIcon;
    
    // Buttons for the piano keys
    private JButton[] pianoButtons = new JButton[7];
    private JButton[] soundButtons = new JButton[7];
    private String[] noteNames = {"C", "D", "E", "F", "G", "A", "B"};
    
    public Pianobuttons() {
        frame = new JFrame();
        speakerIcon = new ImageIcon("volume.png");

        // Set up piano keys and their actions
        setupPianoButtons();
        setupSoundButtons();
        setupFrame();
    }

    private void setupPianoButtons() {
        for (int i = 0; i < noteNames.length; i++) {
            pianoButtons[i] = new JButton(noteNames[i]);
            pianoButtons[i].setBounds(20 + (i * 60), 20, 50, 200);
            final String note = noteNames[i];

            // Add action listeners
            pianoButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(note + " clicked");
                }
            });
        }
    }

    private void setupSoundButtons() {
        for (int i = 0; i < noteNames.length; i++) {
            soundButtons[i] = new JButton();
            soundButtons[i].setIcon(speakerIcon);
            soundButtons[i].setBounds(20 + (i * 60), 240, 50, 50);
        }
    }

    private void setupFrame() {
        // Add buttons to the frame
        for (JButton button : pianoButtons) {
            frame.add(button);
        }

        for (JButton button : soundButtons) {
            frame.add(button);
        }

        // Frame settings
        frame.setSize(450, 310);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

