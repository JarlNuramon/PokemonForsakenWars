

/**
 * Write a description of class Krieger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Krieger extends Spieler
{
    
    
    RPGcontroller MeinController;
    public Krieger(String name,int leben,int schaden,int schnelligkeit,int ruestung,Klasse meineKlasse,RPGcontroller MeinController)
    {
     super( name, leben, schaden, schnelligkeit, ruestung, meineKlasse);  
     this.MeinController =  MeinController;
      faehigkeit1 = "Wilder Hieb";
       faehigkeit2 =" Raserei";
       faehigkeit3 ="Hinrichten";
       faehigkeit4 = "Kriegsgeschrei";
       faehigkeit1Beschreibung = "Du schlaegst wild um dich, dabei verletzt du dich selber, aber hast eine große Mordlust.";
       faehigkeit2Beschreibung =" Du verfaellst in eine Raserei, wobei du dir selbst Schaden zufuegst doch viel mehr Schaden und Schnelligkeit erhaeltst.";
       faehigkeit3Beschreibung ="Du hebst deine Axt und gibst deinen Gegner ein vollen Schwung";
       faehigkeit4Beschreibung = " Du wirst von großer Kraft durchströmt, welche dir die Kraft wieder zum kaempfen gibt.";
       
       extraFaehigkeit =null;
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
        schaden += 6;
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
    leben-=4;
    alterSchaden +=4;
    alteGeschw+=2;
    schaden=2;
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
    schaden +=1;
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
    leben +=2;
    ruestung +=4;
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
