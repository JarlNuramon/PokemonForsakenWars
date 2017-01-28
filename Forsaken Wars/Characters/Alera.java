

import java.util.Random;
public class Alera extends Spieler
{
  
    
    RPGcontroller MeinController;
    public Alera(String name,int leben,int schaden,int schnelligkeit,int ruestung,Klasse meineKlasse,RPGcontroller MeinController)
    {
     super( name, leben, schaden, schnelligkeit, ruestung, meineKlasse);  
     this.MeinController =  MeinController;
      faehigkeit1 = "Auflauern";
       faehigkeit2 ="Unerwartete Überraschung";
       faehigkeit3 ="Kraehenfueße werfen";
       faehigkeit4 = "Schwarzer Mantel";
       faehigkeit1Beschreibung = "Du versteckst dich um einen kleinen Überfall zu starten.Worauf dein Feind nicht gut reagieren kann.";
       faehigkeit2Beschreibung ="Du versuchst ein Überraschungsangriff.Dieser Angriff ist effektiv beim getarnten Zustand.";
       faehigkeit3Beschreibung ="Du wirfst Kraehenfueße wodurch du mit deinem naechsten Angriff mehr Schaden machst..";
       faehigkeit4Beschreibung = "Du ziehst dir deinen schwarzen Mantel in der Dunkelheit an.Dies löst die Tarnung nicht auf.";
       extraFaehigkeitBeschreibung="Du bist ab 4 Tarnungspunkte fuer deinen Feind nicht stark treffbar.Nachdem eine Faehigkeit benutzt wurde verschwindet es.";
       extraFaehigkeit="Tarnung";
       spezial =0;
       kampfbereit=false;
       
     alterSchaden=this.schaden;
       alteGeschw=this.schnelligkeit;
       alteRuestung=this.ruestung;
    }
    
    @Override
    public void Faehigkeit1()
    {
        
        if(!kampfbereit)
        {
           if(spezial>4)
           {
               ruestung++;;schnelligkeit+=3;spezial=0;
            }  
        spezial +=1;
        ruestung+=8;
        schaden-=2;
        kampfbereit = true;
        MeinController.Kampf();
        MeinController.UpdateGewinner();
    }
    }
    public void Faehigkeit2()
    {
        
        if(!kampfbereit)
        {
           if(spezial>4)
           {
               schaden+=5;schnelligkeit+=3;spezial=0;
            }
            schaden-=3;
            schnelligkeit+=1;
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
            if(spezial>4)
           {
               ruestung+=3;spezial=0;
            }
           spezial+=1;
           alterSchaden+=2;
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
             if(spezial>4)
           {
               ruestung+=8;spezial+=4;
            }
            spezial+=3;
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
