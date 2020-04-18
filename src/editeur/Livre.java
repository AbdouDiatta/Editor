package editeur;

import java.io.*;
import java.util.ArrayList;

public class Livre implements Serializable{
  protected ArrayList<Paragraphe> mesParagraphe;

  public Livre(){
    this.mesParagraphe = new ArrayList<>();
    
    Paragraphe p1 = new Paragraphe("blabla1", "Ou voulez vous aller1", false, false);
    Paragraphe p2 = new Paragraphe("blabla2", "Ou voulez vous aller2", false, false);
    Paragraphe p3 = new Paragraphe("blabla3", "Ou voulez vous aller3", false, false);
    this.addParagraphe(p1);
    this.addParagraphe(p2);
    this.addParagraphe(p3);

    //this.fauxText();
  }

  public void addParagraphe(Paragraphe p) {
    this.mesParagraphe.add(p);//github.com/Djibaaaaa/Book-Editor(p);
  }


  public ArrayList<Paragraphe> getListeParagraphe(){

    return this.mesParagraphe;
  }
  public void fauxText(){

    for(int i =0; i<4;i++){
      this.mesParagraphe.add(new Paragraphe("txt"+i));
    }
  }
// POUR SERALISER LE LIVRE
  public void save(String fileName){

    ObjectOutputStream oos = null;




    try {
      final FileOutputStream fichier = new FileOutputStream(fileName);
      oos = new ObjectOutputStream(fichier);
      oos.writeObject(this);
      oos.flush();
    } catch (final IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (oos != null) {
          oos.flush();



          oos.close();
        }
      } catch (final IOException ex) {
        ex.printStackTrace();
      }
    }
  }
//POUR CHARGER LE LIVRE
  public Livre load(String fileName) {
    ObjectInputStream ois = null;
      try {
        final FileInputStream fichier =  new FileInputStream(fileName);
        ois = new ObjectInputStream(fichier);
        final Livre livre = (Livre) ois.readObject();
        return livre;
      } catch (final IOException e) {
        e.printStackTrace();
      } catch (final ClassNotFoundException e) {
        e.printStackTrace();
      }
      return new Livre();
  }

}
