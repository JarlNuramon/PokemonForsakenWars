

import java.util.Random;
public class Temora extends Spieler
{
  
    
    RPGcontroller MeinController;
    int spezialGenerierung=1;
    public Temora(String name,int leben,int schaden,int schnelligkeit,int ruestung,Klasse meineKlasse,RPGcontroller MeinController)
    {
     super( name, leben, schaden, schnelligkeit, ruestung, meineKlasse);  
     this.MeinController =  MeinController;
      faehigkeit1 = "Totale Konzentration";
       faehigkeit2 ="Psychotischer Blitz";
       faehigkeit3 ="Grandiöses Experiment";
       faehigkeit4 = "Erholen";
       faehigkeit1Beschreibung = "Du konzentrierst dich wodurch deine magische Kraft und deine spirituelle Energie steigt.Es kostet keine Energie";
       faehigkeit2Beschreibung ="Du schießt ein mächtigen Blitz ab, welcher 20 spirituelle Energie kostet.";
       faehigkeit3Beschreibung ="Du hebst eine Rune, welche deine ganze Energie und dein Leben kostet, und diesen als Schaden macht";
       faehigkeit4Beschreibung = "Du erholtst dich wodurch du dich heilst und dein spirituelle Enegerie generierst.";
       extraFaehigkeitBeschreibung="Du besitzt spirituelle Energie, welche verbraucht wird.";
       extraFaehigkeit="spirituelle Energie";
       spezial =50;
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
        	spezialGenerierung +=1;
        	alterSchaden+=2;
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
           if(spezial>19)
           {
               schaden+=6;spezial-=20;
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
            schaden+=(leben/2)+(spezial/4);
            spezial=0;
            leben=1;
           kampfbereit = true;
        MeinController.Kampf();
        MeinController.UpdateGewinner();
    }
    
    }
    @Override
    public void Faehigkeit4()
    {
    	schaden=1;
        if(!kampfbereit)
        {
            spezial+=30*spezialGenerierung;
            leben+=1*spezialGenerierung;
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
