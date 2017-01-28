

import java.util.Random;
public class Hava extends Spieler
{
    
    RPGcontroller MeinController;
    public Hava(String name,int leben,int schaden,int schnelligkeit,int ruestung,Klasse meineKlasse,RPGcontroller MeinController)
    {
     super( name, leben, schaden, schnelligkeit, ruestung, meineKlasse);  
     this.MeinController =  MeinController;
      faehigkeit1 = "Schattenschlag";
       faehigkeit2 ="Segen";
       faehigkeit3 ="Daemonische Gier";
       faehigkeit4 = "Strafende Dunkelheit";
       faehigkeit1Beschreibung = "Du benutzt die dunklen Kuenste um deinen Feind zu erschlagen";
       faehigkeit2Beschreibung =" Du segnest dich wodurch du all deine dunkle Macht verlierst, jedoch dein Leben leicht erhoehst.";
       faehigkeit3Beschreibung ="Du begierst nach der Macht der Dunkelheit.";
       faehigkeit4Beschreibung = "Du fuegst einem Gegner basierend auf deiner Dunkeln Macht schaden zu";
       extraFaehigkeitBeschreibung="Du bist dem dunkeln zugewandt und nutzte die Macht fuer dich";
       extraFaehigkeit="Dunkle Hingabe";
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
            
        spezial +=2;
       schnelligkeit+=1;
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
           leben+=3;
           spezial=0;
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
           
           ruestung+=3;
           spezial +=4;
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
            schaden+=spezial;
            
    
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
