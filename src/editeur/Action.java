package editeur;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Action extends AbstractAction{

  public Action(String s){
    super(s);

  }
  public void actionPerformed(ActionEvent e){
      System.exit(0);
  }
}
