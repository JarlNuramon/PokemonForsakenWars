

import java.util.Random;
public class Billmorg extends Spieler
{
    
    
    RPGcontroller MeinController;
    public Billmorg(String name,int leben,int schaden,int schnelligkeit,int ruestung,Klasse meineKlasse,RPGcontroller MeinController)
    {
     super( name, leben, schaden, schnelligkeit, ruestung, meineKlasse);  
     this.MeinController =  MeinController;
      faehigkeit1 = "Hoellenfeuer";
       faehigkeit2 ="Mysterioese Ueberraschung";
       faehigkeit3 ="Pein";
       faehigkeit4 = "Unbendigbare Wut";
       faehigkeit1Beschreibung = "Du beschwoerst ein Hoellenfeuer, welches beiden Spieler schaden macht, dich jedoch auch wuetend";
       faehigkeit2Beschreibung =" Du trinkst ein Gebraeu mit einem unbekannten Geschmack";
       faehigkeit3Beschreibung ="Du fuegst deinem Feind schaden zu indem du dich leicht verletzt.Die Wut steigt in dir.Diese Attacke mach basierend auf Wut mehr Schaden";
       faehigkeit4Beschreibung = "Du erzuernst bis zum maximalen Grad.";
       extraFaehigkeitBeschreibung="Du wirst Wuetend wodurch du ab 10 Wutpunkte,all deine Wut buendelst um mehr Schaden zu machen.";
       extraFaehigkeit="Wut";
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
            if(spezial>9){schaden=+6;spezial=0;}
        spezial +=3;
        schaden+=2;
        leben-=2;
        kampfbereit = true;
        MeinController.Kampf();
        MeinController.UpdateGewinner();
    }
    }
    public void Faehigkeit2()
    {
        
        if(!kampfbereit)
        {
            if(spezial>9){schaden=+6;spezial=0;}
            Random rand = new Random();
        int randomNum =rand.nextInt(4);
        switch(randomNum)
        {
        case 0:leben+=2;alterSchaden+=2; break;
        case 1:ruestung+=4;leben=+3; break;
        case 2: spezial+=4; alterSchaden-=1;schaden+=2;leben-=4;break;
        case 3: schnelligkeit+=4;spezial+=3;break;
        case 4: schnelligkeit+=2;spezial+=3;alteRuestung+=3;break;
        }
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
            schaden+=spezial/2;
           if(spezial>9){schaden=+6;spezial=0;} 
           
           spezial +=4;
           leben-=1;
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
            if(spezial>9){schaden=+6;spezial=0;}
            
    spezial=10;
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
