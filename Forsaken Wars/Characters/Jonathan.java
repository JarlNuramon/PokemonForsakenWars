

import java.util.Random;
public class Jonathan extends Spieler
{
    
    
    RPGcontroller MeinController;
    public Jonathan(String name,int leben,int schaden,int schnelligkeit,int ruestung,Klasse meineKlasse,RPGcontroller MeinController)
    {
     super( name, leben, schaden, schnelligkeit, ruestung, meineKlasse);  
     this.MeinController =  MeinController;
      faehigkeit1 = "Sinne schaerfen";
       faehigkeit2 ="Meditation";
       faehigkeit3 ="Geisterfaust";
       faehigkeit4 = "Geistersturm";
       faehigkeit1Beschreibung = "Du schaerfst deine Sinne um die Umgebung um dir besser wahrzunehmen.";
       faehigkeit2Beschreibung =" Du meditierst wodurch dein Leben und deine Schnelligkeit sich erhöhen.";
       faehigkeit3Beschreibung ="Du erkennst den Gegner und fuegst ihn schnell Schaden zu, wobei deine Schnelligkeit dem Schaden entspricht.Diese Attacke trifft nicht haeufiger";
       faehigkeit4Beschreibung = "Du fuegst deinem Gegner eine schnelle Salve an Schlaegen zu.Dabei erhöht sich deine Schnelligkeit.";
       extraFaehigkeitBeschreibung="Du musst deine Sinne schaerfen.Ein geschaerfte Sinn nutzt naemlich seine Geschwindigkeit,um so manchen Schaden zu umgehen.So staerker dein Sinn so leichter geht es.";
       extraFaehigkeit="geschaerfter Sinn";
       spezial =0;
       kampfbereit=false;
       this.schnelligkeit+=2;
     alterSchaden=this.schaden;
      alteGeschw=this.schnelligkeit;
       alteRuestung=this.ruestung-2;
    }
    
    @Override
    public void Faehigkeit1()
    {
        
        if(!kampfbereit)
        {
            
        spezial +=4;
        schnelligkeit+=1;
        ruestung += schnelligkeit-(5-(spezial/2));
        schaden=1;
        kampfbereit = true;
        MeinController.Kampf();
        MeinController.UpdateGewinner();
    }
    }
    public void Faehigkeit2()
    {
        
        if(!kampfbereit)
        {
           leben+=2;
           
           ruestung += schnelligkeit-(5-(spezial/2));
           alteGeschw+=1;
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
           
           schaden = schnelligkeit+spezial/2;
           ruestung += schnelligkeit-(5-(spezial/2));
           schnelligkeit=1;
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
            schaden=schaden;
            schnelligkeit+=2;
            ruestung += schnelligkeit-(5-spezial);
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
