

/**
 * Write a description of class Krieger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Benagon extends Spieler
{
    
    
    RPGcontroller MeinController;
    public Benagon(String name,int leben,int schaden,int schnelligkeit,int ruestung,Klasse meineKlasse,RPGcontroller MeinController)
    {
     super( name, leben, schaden, schnelligkeit, ruestung, meineKlasse);  
     this.MeinController =  MeinController;
      faehigkeit1 = "Heiliges Gebet";
       faehigkeit2 =" Rechtschafenheit";
       faehigkeit3 ="Heiliges Gericht";
       faehigkeit4 = "Merzt die Unglaeubigen aus";
       faehigkeit1Beschreibung = "Du betest wodurch du dich heilst und dein Gewissen beruehigst.";
       faehigkeit2Beschreibung =" Du bestrafst dein Feind wodurch dir keine negativen Effekte zu teil werden.";
       faehigkeit3Beschreibung ="Du bestrafst dein Feind mit seinem letzten Gericht.Dein Gewissen haelt es nicht lange aus";
       faehigkeit4Beschreibung = "Du gibst dir den Befehl deine Feinde auszulöschen, wodurch dein Gewissen stark leidet.";
       extraFaehigkeitBeschreibung="Du wirst verrueckt, wenn dieser Wert 5 uebersteigt.Waehrrend du verrueckt bist machst du dir selbst schadenbist aber Schneller.";
       extraFaehigkeit="Gewissen";
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
        spezial =2;
        ruestung -=1;
        leben+=1;
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
            if(spezial>4){leben-=2;schnelligkeit+=1;}
    
        
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
            if(spezial>4){leben-=2;schnelligkeit+=1;}
   schaden+=2;
   spezial +=2;
   ruestung+=1;
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
            if(spezial>4){leben-=2;schnelligkeit+=1;}
    schaden+=4;
    ruestung+=3;
    spezial+=5;
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
