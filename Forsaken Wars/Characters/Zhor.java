

import java.util.Random;
public class Zhor extends Spieler
{
   
    int Spieler;
    RPGcontroller MeinController;
    public Zhor(String name,int leben,int schaden,int schnelligkeit,int ruestung,Klasse meineKlasse,RPGcontroller MeinController,int Spieler)
    {
     super( name, leben, schaden, schnelligkeit, ruestung, meineKlasse);  
     this.MeinController =  MeinController;
      faehigkeit1 = "Schneller Sprint";
       faehigkeit2 ="Himmelsfeger";
       faehigkeit3 ="Schneller Schlag";
       faehigkeit4 = "Aufwaermuebung";
       faehigkeit1Beschreibung = "Du tauschst dich schnell mit deinem nächsten Helden aus, wodurch dein nächster Held beim Austausch kein Schaden bekommt.Fokus wird auf 1 gesetzt.";
       faehigkeit2Beschreibung ="Du führst ein schnellen Tritt mit viel Kraft aus, dieser fügt dir selbst Schaden zu.";
       faehigkeit3Beschreibung ="Du schlägst blitzschnell zu.";
       faehigkeit4Beschreibung = "Du wärmst dich auf wodurch Schnelligkeit und Angriffstärke steigen.";
       extraFaehigkeitBeschreibung="Du erhältst jedes mal durch deine Fähigkeiten mehr und mehr Fokus. Dieser Fokus macht 	dich schneller";
       extraFaehigkeit="Fokus";
       spezial =2;
       kampfbereit=false;
       
     alterSchaden=this.schaden;
      alteGeschw=this.schnelligkeit+1;
      this.Spieler = Spieler;
       alteRuestung=this.ruestung+1;
    }
    
    @Override
    public void Faehigkeit1()
    {
        
        if(!kampfbereit)
        {
         if(Spieler==1)
         {MeinController.getSpieler1sec().setRuestung(100);MeinController.Player1ChangeCharTo2();}else{MeinController.getSpieler2sec().setRuestung(100);MeinController.Player2ChangeCharTo2();}
        schaden=1;
        spezial=1;
        kampfbereit = true;
        MeinController.Kampf();
        MeinController.UpdateGewinner();
    }
    }
    public void Faehigkeit2()
    {
        
        if(!kampfbereit)
        {
        	schnelligkeit +=spezial/2;
           schaden+=4;
           schnelligkeit+=1;
           leben-=2;
           spezial+=1;
        kampfbereit = true;
        MeinController.Kampf();
        MeinController.UpdateGewinner();
    }
    }
    @Override
    public void Faehigkeit3()
    {
        
        if(!kampfbereit)
        {
        	schnelligkeit +=spezial/2;
           schnelligkeit+=5;
           spezial+=1;
           kampfbereit = true;
        MeinController.Kampf();
        MeinController.UpdateGewinner();
    }
    
    }
    @Override
    public void Faehigkeit4()
    {
        if(!kampfbereit)
        {
        	schnelligkeit +=spezial/2;
        	alteGeschw+=1;
        	alterSchaden+=1;
        	spezial+=1;
		schaden=1;
          
            kampfbereit = true;
            MeinController.Kampf();
            MeinController.UpdateGewinner();
    
    }
    }
    
    
    
    @Override
    public void Reset()
    {
    schaden=alterSchaden;
    schnelligkeit=alteGeschw;
    ruestung=alteRuestung;
    
    }
    
}
