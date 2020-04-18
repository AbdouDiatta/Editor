package editeur;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bouton0 extends JButton implements ActionListener{

  public Bouton0(){
    this.addActionListener(this);
    this.setText("Button2");

  }
  public void actionPerformed(ActionEvent e){
    
  }


}
