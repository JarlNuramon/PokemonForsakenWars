

import java.util.Random;
public class Dethrod extends Spieler
{
   
    int Spieler;
    RPGcontroller MeinController;
    public Dethrod(String name,int leben,int schaden,int schnelligkeit,int ruestung,Klasse meineKlasse,RPGcontroller MeinController,int Spieler)
    {
     super( name, leben, schaden, schnelligkeit, ruestung, meineKlasse);  
     this.MeinController =  MeinController;
      faehigkeit1 = "Zerschmettern";
       faehigkeit2 ="Hammerschlag";
       faehigkeit3 ="Seismische Ruestung";
       faehigkeit4 = "Verschwinde!";
       faehigkeit1Beschreibung = "Du schmetterst den Hammer ueber deinen Feind wodurch er Blutungen erfaehrt.Dieser Effekt trifft nur ein bei einer Erschöpfung unter 6";
       faehigkeit2Beschreibung =" Du schlaegst deinem Feind auf den Kopf wodurch sein Angriff sinkt.";
       faehigkeit3Beschreibung ="Du legst deine Ruestung ab wodurch sie sich erholen, jedoch auch schwaecher werden fuer diesen Zug.";
       faehigkeit4Beschreibung = "Du zwingst dein Gegner seinen Charakter gegen den naechsten einzutauschen.";
       extraFaehigkeitBeschreibung="Du wirst durch das benutzten deiner Attacken schwaecher...";
       extraFaehigkeit="Erschöpfung";
       spezial =0;
       kampfbereit=false;
       this.schaden=2;
     alterSchaden=this.schaden;
      alteGeschw=this.schnelligkeit;
      this.Spieler = Spieler;
       alteRuestung=this.ruestung+1;
    }
    
    @Override
    public void Faehigkeit1()
    {
        
        if(!kampfbereit)
        {
         if(Spieler==1&&spezial<6)
         {MeinController.getSpieler2().setStatus("Blutung");}else if(spezial<6){MeinController.getSpieler1().setStatus("Blutung");}
        schaden+=3;
        spezial+=1;
        kampfbereit = true;
        MeinController.Kampf();
        MeinController.UpdateGewinner();
    }
    }
    public void Faehigkeit2()
    {
        
        if(!kampfbereit)
        {
             if(Spieler==1)
         {MeinController.getSpieler2().setSchaden(MeinController.getSpieler2().getSchaden()-(4-spezial));}else{MeinController.getSpieler2().setSchaden(MeinController.getSpieler2().getSchaden()-(4-spezial));}
          
           spezial+=2;
           
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
           
           spezial=0;
           ruestung=2;
           schaden=1;
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
            if(Spieler==1)
         {MeinController.Player2ChangeCharTo2();}else{MeinController.Player1ChangeCharTo2();}
        schaden=1;
        spezial+=3;
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
