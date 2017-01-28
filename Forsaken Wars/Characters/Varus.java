

import java.util.Random;
public class Varus extends Spieler
{
   
    int Spieler;
    RPGcontroller MeinController;
    public Varus(String name,int leben,int schaden,int schnelligkeit,int ruestung,Klasse meineKlasse,RPGcontroller MeinController,int Spieler)
    {
     super( name, leben, schaden, schnelligkeit, ruestung, meineKlasse);  
     this.MeinController =  MeinController;
      faehigkeit1 = "Fluch des Notleidens";
       faehigkeit2 ="Kraft der Dunkelheit";
       faehigkeit3 ="Brennender Schlag";
       faehigkeit4 = "Fluch des Verderbens";
       faehigkeit1Beschreibung = "Verringer den feindlichen Angriff, jedoch erhöht es seine Ruestung.Diese Attacke erhöht deine Fluchstaerke";
       faehigkeit2Beschreibung =" Du erhaeltst Ruestung, sowie Leben basierend auf deiner Fluchstaerke.Deine Fluchstaerke erhöht sich";
       faehigkeit3Beschreibung ="Du fuegst deinem Feind Schaden zu wobei deine Fluchstaerke ihn erhöht.";
       faehigkeit4Beschreibung = "Das Fleisch deiner Feinde verdirbt wodurch sie langsamer werden.So staerker deine Fluchstaerke, so langsamer wird er.";
       extraFaehigkeitBeschreibung="Du wirst erfahrener in Flueche und Verzauberungen wodurch deine Kraft zunimmt.";
       extraFaehigkeit="Fluchstaerke";
       spezial =0;
       kampfbereit=false;
       
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
         if(Spieler==1)
         {MeinController.getSpieler2().setAlterSchaden(MeinController.getSpieler2().getAlterSchaden()-spezial);MeinController.getSpieler2().setAlteRuestung(MeinController.getSpieler2().getAlteRuestung()+1);}else{MeinController.getSpieler1().setAlteRuestung(MeinController.getSpieler1().getAlteRuestung()+1);MeinController.getSpieler1().setAlterSchaden(MeinController.getSpieler1().getAlterSchaden()-spezial);}
        schaden=1;
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
           leben+=2+spezial;
           ruestung+=spezial;
           spezial+=1;
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
           
           schaden+=spezial;
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
         {MeinController.getSpieler2().setAlteGeschw(MeinController.getSpieler2().getAlteGeschw()-spezial);}else{MeinController.getSpieler1().setAlteGeschw(MeinController.getSpieler1().getAlteGeschw()-spezial);}
        schaden=1;
        spezial+=1;
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
