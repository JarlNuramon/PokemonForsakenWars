import java.util.Random;

public class Nuramon extends Spieler{
	  int Spieler;
	    RPGcontroller MeinController;
	public Nuramon(String name,int leben,int schaden,int schnelligkeit,int ruestung,Klasse meineKlasse,RPGcontroller MeinController,int Spieler)
    {
     super( name, leben, schaden, schnelligkeit, ruestung, meineKlasse);  
     this.MeinController =  MeinController;
      faehigkeit1 = "Wirbelwind";
       faehigkeit2 ="Überspannter Schuss";
       faehigkeit3 ="Hilfe der Ahnen";
       faehigkeit4 = "Unreiner Schnitt";
       faehigkeit1Beschreibung = "Eine Reihe an fließende Schnitte.Erhöht deinen Kampffluss";
       faehigkeit2Beschreibung ="Ein Schuss mit sehr viel Schaden, jedoch verfehlt er manchmal.";
       faehigkeit3Beschreibung ="Du holst die Ahnen zur Hilfe. Sie erhöhen eine deiner Werte immens.";
       faehigkeit4Beschreibung = "Ein Schnitt von keinem guten Einschnittswinkel, welcher den Gegner zum Bluten bringen kann.";
       extraFaehigkeitBeschreibung="Du kommst in einen Fluss, welcher dazu führt, dass deine Attacken effektiver werden. Jede Attacke erhöhen dein FLuss";
       extraFaehigkeit="Fluss";
       spezial =4;
       kampfbereit=false;
       this.schaden=2;
     alterSchaden=this.schaden;
      alteGeschw=this.schnelligkeit;
      this.Spieler = Spieler;
       alteRuestung=this.ruestung+1;
    }
    public boolean Good()
    {
        Random rand = new Random();
        int randomNum =rand.nextInt(10);
        if(randomNum<spezial)
        {
        return true;
        }
        
        
        
        
    	
    	
    	
    	return false;
    }
    @Override
    public void Faehigkeit1()
    {
        
        if(!kampfbereit)
        {
            
        	if(Good())
        	{
        		spezial +=3;
        		schaden+=3;
	
        	}
        	else{
        		spezial+=2;
        		schaden+=1;
        	}
        	
        	
        	
         
        kampfbereit = true;
        MeinController.Kampf();
        MeinController.UpdateGewinner();
    }
    }
    public void Faehigkeit2()
    {
        
        if(!kampfbereit)
        {
        	if(Good())
        	{
        		schaden+=5;
        		
        	}else{
        		
        		schaden=1;
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
    		 Random rand = new Random();
    	        int randomNum =rand.nextInt(10);
    	        switch(randomNum)
    	        {
    	        
    	        case 0: leben+=4;break;
    	        case 1: alterSchaden+= 4;break;
    	        case 2: alteRuestung+=3;break;
    	        case 3: alteGeschw+=2; break;
    	        case 4: alteRuestung+=3;break;
    	        case 5: leben+=4;break;
    	        case 6: leben+=7;break;
    	        case 7: alteRuestung+=2; spezial++;break;
    	        case 8: alteRuestung+=1;leben+=3;break;
    	        case 9: leben+=2; alterSchaden+=2;break;
    	        case 10: alteRuestung +=4;break;
    	        }
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
        	if(Good())
        	{
        		if(Spieler==1)
                {MeinController.getSpieler2().setStatus("Blutung");}else{MeinController.getSpieler1().setStatus("Blutung");}	
        	}
         
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
