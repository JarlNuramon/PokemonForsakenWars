

import java.util.Random;
public class Leah extends Spieler
{
   
    int Spieler;
    RPGcontroller MeinController;
    public Leah(String name,int leben,int schaden,int schnelligkeit,int ruestung,Klasse meineKlasse,RPGcontroller MeinController,int Spieler)
    {
     super( name, leben, schaden, schnelligkeit, ruestung, meineKlasse);  
     this.MeinController =  MeinController;
      faehigkeit1 = "Beschichteter Pfeil";
       faehigkeit2 ="Natuerliche Kraeuter";
       faehigkeit3 ="Physiches Training";
       faehigkeit4 = "Schneller Schuss";
       faehigkeit1Beschreibung = "Du schießt ein Pfeil mit einer Beschichtung.";
       faehigkeit2Beschreibung ="Du heilst dich und deine Beschichtung wird Gift.";
       faehigkeit3Beschreibung ="Dein Angriff erhöht sich und deine Beschichtung wird Laehmung";
       faehigkeit4Beschreibung = "Sehr viele kleine Schuesse, welche die Wahrscheinlichkeit haben den Gegner zu laehmen.Dies geschieht jedoch nicht wenn Beschichtung Gift ist.";
       extraFaehigkeitBeschreibung="Du kannst Statuswerte verteilen.Die Beschichtung 1 ist Gift.Pass auf es kann nur 1 Statuswert aktiv sein.";
       extraFaehigkeit="Beschichtung";
       spezial =0;
       kampfbereit=false;
       
     alterSchaden=this.schaden-3;
      alteGeschw=this.schnelligkeit-1;
      this.Spieler = Spieler;
       alteRuestung=this.ruestung;
    }
    
    @Override
    public void Faehigkeit1()
    {
        
        if(!kampfbereit)
        {
            if(spezial==1)
            {
         if(Spieler==1)
         {MeinController.getSpieler2().setStatus("Gift");}else{MeinController.getSpieler1().setStatus("Gift");}
        }
        schaden+=1;
        kampfbereit = true;
        MeinController.Kampf();
        MeinController.UpdateGewinner();
    }
    }
    public void Faehigkeit2()
    {
        
        if(!kampfbereit)
        {
           spezial=1;
           leben+=1;
           schaden=1;
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
           
           schaden=1;
           alterSchaden+=2;
           spezial=0;
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
         if(spezial==0)
            {
         if(Spieler==1)
         {MeinController.getSpieler2().setStatus("Laehmung");}else{MeinController.getSpieler1().setStatus("Laehmung");}
        }
            schnelligkeit+=3;
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
