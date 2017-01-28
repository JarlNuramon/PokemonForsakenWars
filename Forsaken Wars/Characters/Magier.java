

/**
 * Write a description of class Magier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Magier extends Spieler
{
    
    RPGcontroller MeinController;
    /**
     * Constructor for objects of class Magier
     */
    public Magier(String name,int leben,int schaden,int schnelligkeit,int ruestung,Klasse meineKlasse,RPGcontroller MeinController)//Gamemanger hinzufuegen und bei allen Angriffen kaempfen ausfuehren.
    {
       super( name, leben, schaden, schnelligkeit, ruestung, meineKlasse);
       kampfbereit=false;
       alterSchaden=this.schaden;
       alteGeschw=this.schnelligkeit;
       alteRuestung=this.ruestung;
       this.MeinController =  MeinController;
       faehigkeit1 = "Feuerball";
       faehigkeit2 =" Gefrierender Schlag";
       faehigkeit3 ="Flamme des Hasses";
       faehigkeit4 = " RapiderFlammenstoss";
        faehigkeit1Beschreibung = "Ein maechtiger Feuerball, welcher einen hohen Schaden besitzt.";
       faehigkeit2Beschreibung =" Du verzauberst deinen Koerper mit Eis, wodurch du dich stabiler fuehlst.";
       faehigkeit3Beschreibung ="Du erzuernst eine Flamme der Wut, welche deinen Angriff dauerhaft erhaelt.";
       faehigkeit4Beschreibung = " Du schiesst schnell mehrere kleine Flammen aus deinen Fingern.";
       extraFaehigkeit =null;
    }
     @Override
    public void Faehigkeit1()
    {
        if(!kampfbereit)
        {
        schaden+=3;
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
        ruestung+=4;
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
        alterSchaden +=2;
        schaden -=1;
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
        schnelligkeit +=4;
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
