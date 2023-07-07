package typewriterPack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.nio.file.StandardOpenOption;

public class UI extends JFrame implements KeyListener {

    private String s = "";
    private Label l = new Label();
    private Label label = new Label("File not loaded");
    private Label score = new Label();
    private int lw = 0;
    private int pos =130;
    private int len= label.getText().length();

    private int ln = 0+len;

    UI(){

        setLayout(new FlowLayout());

        l.setFont(new Font("Arial", Font.PLAIN, 15));

        label.setFont(new Font("Arial", Font.PLAIN, 15));

        score.setFont(new Font("Arial", Font.PLAIN, 15));

        score.setBounds(320, 100, 260, 50);

        add(l);
        add(label);

        setSize(1000,600);
        addKeyListener(this);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    int i = 0;
    int inc;

    @Override
    public void keyPressed(KeyEvent e) throws StringIndexOutOfBoundsException {
        try{
            lw+=6;
            pos+=6;

            s += String.valueOf(e.getKeyChar());
            l.setText(s);

            String[] sArr = s.split("");
            String[] arr = label.getText().split("");

            if (sArr[i].equalsIgnoreCase(arr[0])) {
                l.setForeground(Color.black);
            }
            if (!sArr[i].equalsIgnoreCase(arr[0])) {
                l.setForeground(Color.red);
                System.out.println("Incorrect!");
                ++inc;
            }

            label.setText(label.getText().substring(1));

            i++;

            add(l);
            add(label);

            l.setBounds(120, 0, lw, 20);
            label.setBounds(pos, 0, 740, 20);

            if(sArr.length == 100){
                score.setText("Count of incorrect placed letters: "+inc);
                add(score);

            }
        } catch (StringIndexOutOfBoundsException exception){
            score.setText("StringIndexOutOfBoundsException!!!");
        }


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void setLabel(String text){
        label.setForeground(Color.GRAY);
        label.setText(text);
    }
}
