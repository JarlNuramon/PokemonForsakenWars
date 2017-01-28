

import java.util.Random;
public class Ragorl extends Spieler
{
    
    boolean Werwolf;
    RPGcontroller MeinController;
	private String altfaehigkeit1;
	private String altfaehigkeit2;
	private String altfaehigkeit3;
	private String altfaehigkeit4;
    public Ragorl(String name,int leben,int schaden,int schnelligkeit,int ruestung,Klasse meineKlasse,RPGcontroller MeinController)
    {
     super( name, leben, schaden, schnelligkeit, ruestung, meineKlasse);  
     this.MeinController =  MeinController;
      faehigkeit1 = "Rostige Klinge";
       faehigkeit2 ="Scharfe Sinne";
       faehigkeit3 ="Artgenossen versammeln";
       faehigkeit4 = "Macht der Heugabel";
       faehigkeit1Beschreibung = "Du schwingst eine geröstete Klinge um dich.";
       faehigkeit2Beschreibung =" Du spuerst die Angst deines Feindes wodurch deine Schnelligkeit dich erhöht.";
       faehigkeit3Beschreibung ="Deine Verbuendete helfen dir, wodurch du staerker bist.";
       faehigkeit4Beschreibung = "Du erstichst jemanden mit der Gabel.";
       altfaehigkeit1 = "Blutige Pranke";
       altfaehigkeit2 ="Geschaerfter Blutdurst";
       altfaehigkeit3 ="Deine Verbuendete helfen dir, wodurch du staerker bist.";
       altfaehigkeit4 = "Zerfleischen";
       extraFaehigkeitBeschreibung="Jede 2te Runde ist es Nacht und verwandelst dich.";
       extraFaehigkeit="Werewolf";
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
        if(spezial==1)
        {
            faehigkeit1Beschreibung = "Du schwingst eine geröstete Klinge um dich.";
          faehigkeit2Beschreibung =" Du spuerst die Angst deines Feindes wodurch deine Schnelligkeit dich erhoeht.";
             faehigkeit4Beschreibung = "Du erstichst jemanden mit der Gabel.";
            schaden+=4;
            schnelligkeit+=1;
        }else if(spezial==0)
        {
             faehigkeit4Beschreibung = "Du springst dein Gegner an und fuegst ihm  Schaden zu.";spezial=1;
           faehigkeit2Beschreibung = "Du riechst nach dem Blut deiner Feinde.Wodurch dein Schaden steigt.";
           faehigkeit1Beschreibung = "Du zerreißt mit deinen Klauen dein Feind.";
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
           if(spezial==1)
        {
            faehigkeit1Beschreibung = "Du schwingst eine gerostete Klinge um dich.";
            faehigkeit2Beschreibung =" Du spuerst die Angst deines Feindes wodurch deine Schnelligkeit dich erhöht.";
             faehigkeit4Beschreibung = "Du erstichst jemanden mit der Gabel.";
            schaden=1;
            spezial=0;
            alteGeschw+=3;
        }else if(spezial==0)
        {
             faehigkeit4Beschreibung = "Du springst dein Gegner an und fuegst ihm  Schaden zu.";spezial=1;
           faehigkeit2Beschreibung = "Du riechst nach dem Blut deiner Feinde.Wodurch dein Schaden steigt.";
           faehigkeit1Beschreibung = "Du zerreißt mit deinen Klauen dein Feind.";
            alterSchaden+=4;
            schaden=1;
            spezial=0;
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
            if(spezial==1)
        {
            alterSchaden+=2;
            alteRuestung+=2;
            faehigkeit1Beschreibung = "Du schwingst eine geröstete Klinge um dich.";
           faehigkeit2Beschreibung =" Du spuerst die Angst deines Feindes wodurch deine Schnelligkeit dich erhöht.";
             faehigkeit4Beschreibung = "Du erstichst jemanden mit der Gabel.";spezial=0;
        }else if(spezial==0)
        {
           alterSchaden+=1;
            alteRuestung+=1;
           faehigkeit4Beschreibung = "Du springst dein Gegner an und fuegst ihm  Schaden zu.";spezial=1;
           faehigkeit2Beschreibung = "Du riechst nach dem Blut deiner Feinde.Wodurch dein Schaden steigt.";
           faehigkeit1Beschreibung = "Du zerreißt mit deinen Klauen dein Feind.";spezial=1;
    }
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
              if(spezial==1)
        {
            faehigkeit1Beschreibung = "Du schwingst eine geröstete Klinge um dich.";
           faehigkeit2Beschreibung =" Du spuerst die Angst deines Feindes wodurch deine Schnelligkeit dich erhöht.";
             faehigkeit4Beschreibung = "Du erstichst jemanden mit der Gabel.";
            spezial=0;
        
        }else if(spezial==0)
        {
           faehigkeit4Beschreibung = "Du springst dein Gegner an und fuegst ihm  Schaden zu.";spezial=1;
           faehigkeit2Beschreibung = "Du riechst nach dem Blut deiner Feinde.Wodurch dein Schaden steigt.";
           faehigkeit1Beschreibung = "Du zerreißt mit deinen Klauen dein Feind.";
            Random rand = new Random();
            int randomNum =rand.nextInt(4);
            schaden+=4+randomNum;
          
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
    @Override
    public String getFaehigkeit1()//Finde den Fehler und vervollstaendige
    {
    	if(spezial==1 && !kampfbereit)return altfaehigkeit1;
    	if(spezial==2 && !kampfbereit)return faehigkeit1;
    	if(spezial==2&&kampfbereit)return altfaehigkeit1;
    	if(spezial==1&&kampfbereit)return faehigkeit1;
    return faehigkeit1;
    }
    @Override
    public String getFaehigkeit2()//Finde den Fehler und vervollstaendige
    {
    	if(spezial==1 && !kampfbereit)return altfaehigkeit2;
    	if(spezial==2 && !kampfbereit)return faehigkeit2;
    	if(spezial==2&&kampfbereit)return altfaehigkeit2;
    	if(spezial==1&&kampfbereit)return faehigkeit2;
    return faehigkeit2;
    }
    @Override
    public String getFaehigkeit3()//Finde den Fehler und vervollstaendige
    {
    	
    return faehigkeit3;
    }
    @Override
    public String getFaehigkeit4()//Finde den Fehler und vervollstaendige
    {
    	if(spezial==1 && !kampfbereit)return altfaehigkeit4;
    	if(spezial==2 && !kampfbereit)return faehigkeit4;
    	if(spezial==2&&kampfbereit)return altfaehigkeit4;
    	if(spezial==1&&kampfbereit)return faehigkeit4;
    return faehigkeit4;
    }
    
}
