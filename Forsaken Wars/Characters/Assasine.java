

/**
 * Write a description of class Assasine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Assasine extends Spieler
{
   
    RPGcontroller MeinController;
    /**
     * Constructor for objects of class Magier
     */
    public Assasine(String name,int leben,int schaden,int schnelligkeit,int ruestung,Klasse meineKlasse,RPGcontroller MeinController)//Gamemanger hinzufuegen und bei allen Angriffen kaempfen ausfuehren.
    {
       super( name, leben, schaden, schnelligkeit, ruestung, meineKlasse);
       faehigkeit1 = "Gift vorbereiten";
       faehigkeit2 ="Schnelle Angriffsfurie";
       faehigkeit3 ="Schattenstosse";
       faehigkeit4 = " SchnelleRolle";
       faehigkeit1Beschreibung = "Du bereitest das Gift vor und schmierst es auf deine Waffe.Wodurch sie mehr Schaden verursacht.";
       faehigkeit2Beschreibung =" Eine schnelle Kombo leichter Dolchstoessee.";
       faehigkeit3Beschreibung ="Du schreitest in den Schatten und versuchst das Herz deines Gegners zu treffen.";
       faehigkeit4Beschreibung = " Du rollst um den Angriffen deiner Feinde zu entgehen";
       kampfbereit=false;
       extraFaehigkeit =null;
       alterSchaden=this.schaden;
       alteGeschw=this.schnelligkeit;
       alteRuestung=this.ruestung;
       this.MeinController =  MeinController;
    }
     @Override
    public void Faehigkeit1()
    {
        if(!kampfbereit)
        {
        schaden=1;
        alterSchaden +=3;
        kampfbereit=true;
        MeinController.Kampf();
        MeinController.UpdateGewinner();
    }
    }
     @Override
    public void Faehigkeit2()
    {
        if(!kampfbereit)
        {
        schnelligkeit +=2;
        schaden -=2;
        kampfbereit=true;
        MeinController.Kampf();
        MeinController.UpdateGewinner();
    }
    }
     @Override
    public void Faehigkeit3()
    {
        if(!kampfbereit)
        {
        schaden +=8;
        ruestung -=1;
        kampfbereit=true;
        MeinController.Kampf();
        MeinController.UpdateGewinner();
    }
    }
    
     @Override
    public void Faehigkeit4()
    {
        if(!kampfbereit)
        {
        schaden =1;
        ruestung =100;
        kampfbereit=true;
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
