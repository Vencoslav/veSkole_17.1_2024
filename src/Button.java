import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Button {
    private List<String> seznam =  new ArrayList<>();
    private JButton tlacitkoButton;
    private JCheckBox checkBox1;

    public Button(){

        tlacitkoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField.setText(seznam.get(e));
            }
        });
        checkBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jePravdaCheckBox.setSeletcted(
                jePravadaCheckBox.isSeletcted());
            }
        });
    }
}
