

/**
 * Write a description of class Ritter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ritter extends Spieler
{
    
    RPGcontroller MeinController;
    /**
     * Constructor for objects of class Magier
     */
    public Ritter(String name,int leben,int schaden,int schnelligkeit,int ruestung,Klasse meineKlasse,RPGcontroller MeinController)//Gamemanger hinzufuegen und bei allen Angriffen kaempfen ausfuehren.
    {
       super( name, leben, schaden, schnelligkeit, ruestung, meineKlasse);
       faehigkeit1 = "Schildstoss";
       faehigkeit2 =" Stabile Haltung";
       faehigkeit3 ="Volle Konzentration";
       faehigkeit4 = " Speerstoss";
       faehigkeit1Beschreibung = "Du schlaegst mit deinem Schild zu, wobei du Schaden erhoeht durch deine Ruestung machst, jedoch auch deine Ruestung beschaedigt wird.";
       faehigkeit2Beschreibung =" Du gehst in eine defensive Haltung, wodurch du weniger Schaden in diesem Zug erhaeltst.";
       faehigkeit3Beschreibung ="Du konzentrierst dich wodurch du dich heilst und deine Ruestung erhöhst.";
       faehigkeit4Beschreibung = " Ein schneller Stoß mit dem Speer, welcher ein bisschen Schaden blockt.";
       extraFaehigkeit =null;
       kampfbereit=false;
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
        schaden=ruestung+schaden+2;
        alteRuestung-=1;
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
        ruestung+=8;
        schaden-=2;
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
        leben+=2;
        alteRuestung+=2;
        
        schaden=1;
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
        schnelligkeit +=1;
        
        ruestung +=2;
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
