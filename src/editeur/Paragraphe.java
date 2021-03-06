package editeur;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Paragraphe implements Serializable{

  private String texte;
  private String question;
  private List<Reponse> reponses;
  private boolean gagnant;
  private boolean fin;

  public Paragraphe(String texte,String question,boolean gagnant,boolean fin){

  this.texte=texte;
  this.question=question;
  this.gagnant=gagnant;
	this.reponses = new ArrayList<>();
  this.fin=fin;
  }

  public Paragraphe(String s){
    this.question="";
    this.texte=s;
    this.fin=false;
  }
  public Paragraphe(){
    this.question="";
    this.texte="";
    this.fin=false;
  }

  public List<Reponse> getReponses(){
    return reponses;
  }

  public List<Reponse> add(Reponse r){

    this.reponses.add(r);
    return this.reponses;
  }

  public String getQuestion(){
    return this.question;
  }

  public String getText(){
    return this.texte;
  }

  public void setText(String txt){
    this.texte = txt;
  }

  public boolean getFin(){
    return this.fin;
  }


}
