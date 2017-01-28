
/**
 * Write a description of class RPGcontroller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RPGcontroller
{
    Spieler spieler1;
    Spieler spieler2;
    Spieler spieler2second;
    Spieler spieler2third;
    Spieler spieler1second;
    Spieler spieler1third;
    public enum usedSkill
    {
    FAEHIGKEIT1,
    FAEHIGKEIT2,
    FAEHIGKEIT3,
    FAEHIGKEIT4,
    TAUSCH,
    NULL,
    TAUSCH2,
    NOTHING
    }
    
     usedSkill spieler1Faehigkeit=usedSkill.NULL;
     usedSkill spieler2Faehigkeit=usedSkill.NULL;
    boolean change1=false;
    boolean change2=false;
    public RPGcontroller(String spieler1Klasse,String spieler2Klasse,String spieler1KlasseSec,String spieler1KlasseThird, String spieler2KlasseSec, String spieler2KlasseThird)
    {
        switch(spieler2Klasse)
        {
        case "Magier":spieler2 = new Magier("Freya, die Elementarbegeisterte",12,3,2,2,Spieler.Klasse.MAGIER,this);break;
        case "Krieger":spieler2 = new Krieger("Tormarg, der Schlaechter",12,3,2,2,Spieler.Klasse.KRIEGER,this);break;
        case "Ritter":spieler2 = new Ritter("Godrick, die eiserne Mauer",12,3,2,2,Spieler.Klasse.RITTER,this);break;
        case "Assasine":spieler2 = new Assasine("Legos, der stille Schleicher",12,3,2,2,Spieler.Klasse.ASSASINE,this);break;
        case "Benagon":spieler2 = new Benagon("Benagon, der erleuchtete Paladin",12,3,2,2,Spieler.Klasse.KRIEGER,this);break;
        case "Billmarg":spieler2 = new Billmorg("Billmarg, der cynische Hexenmeister",12,3,2,2,Spieler.Klasse.MAGIER,this);break;
        case "Hava":spieler2 = new Hava("Hava, die verlorene Priesterin",12,3,2,2,Spieler.Klasse.MAGIER,this);break;
        case "Alera":spieler2 = new Alera("Alera, die tueckische Klinge",12,3,2,2,Spieler.Klasse.ASSASINE,this);break;
        case "Jonathan":spieler2 = new Jonathan("Jonathan, der blinde Vagabund",12,3,2,2,Spieler.Klasse.RITTER,this);break;
        case "Ragorl":spieler2 = new Ragorl("Ragorl, der fellige Wanderer",12,3,2,2,Spieler.Klasse.KRIEGER,this);break;
        case "Varus":spieler2 = new Varus("Varus, der verfluchende Ritter",12,3,2,2,Spieler.Klasse.RITTER,this,2);break;
        case "Leah":spieler2 = new Leah("Leah, die trickreiche Bogenschuetzin",12,3,2,2,Spieler.Klasse.ASSASINE,this,2);break;
        case "Dethrod":spieler2 = new Dethrod("Dethrod, der alte Veteran",12,3,2,2,Spieler.Klasse.RITTER,this,2);break;
        case "Temora":spieler2 = new Temora("Temora, der Runengelehrte",12,5,1,1,Spieler.Klasse.MAGIER,this);break;
        case "Zhor":spieler2 = new Zhor("Zhor, der schnelle Blitz",12,3,2,2,Spieler.Klasse.ASSASINE,this,2);break;
        case "Nuramon":spieler2 = new Nuramon("Nuramon, der Elf der tausend Leben",12,3,2,2,Spieler.Klasse.KRIEGER,this,2);break;
        }
        switch(spieler2KlasseSec)
        {
        case "Magier":spieler2second = new Magier("Freya, die Elementarbegeisterte",12,3,2,2,Spieler.Klasse.MAGIER,this);break;
        case "Krieger":spieler2second = new Krieger("Tormarg, der Schlaechter",12,3,2,2,Spieler.Klasse.KRIEGER,this);break;
        case "Ritter":spieler2second = new Ritter("Godrick, die eiserne Mauer",12,3,2,2,Spieler.Klasse.RITTER,this);break;
        case "Assasine":spieler2second = new Assasine("Legos, der stille Schleicher",12,3,2,2,Spieler.Klasse.ASSASINE,this);break;
        case "Benagon":spieler2second = new Benagon("Benagon, der erleuchtete Paladin",12,3,2,2,Spieler.Klasse.KRIEGER,this);break;
        case "Billmarg":spieler2second = new Billmorg("Billmarg, der cynische Hexenmeister",12,3,2,2,Spieler.Klasse.MAGIER,this);break;
        case "Hava":spieler2second = new Hava("Hava, die verlorene Priesterin",12,3,2,2,Spieler.Klasse.MAGIER,this);break;
        case "Alera":spieler2second = new Alera("Alera, die tueckische Klinge",12,3,2,2,Spieler.Klasse.ASSASINE,this);break;
        case "Jonathan":spieler2second = new Jonathan("Jonathan, der blinde Vagabund",12,3,2,2,Spieler.Klasse.RITTER,this);break;
        case "Ragorl":spieler2second = new Ragorl("Ragorl, der fellige Wanderer",12,3,2,2,Spieler.Klasse.KRIEGER,this);break;
        case "Varus":spieler2second = new Varus("Varus, der verfluchende Ritter",12,3,2,2,Spieler.Klasse.RITTER,this,2);break;
        case "Leah":spieler2second = new Leah("Leah, die trickreiche Bogenschuetzin",12,3,2,2,Spieler.Klasse.ASSASINE,this,2);break;
        case "Dethrod":spieler2second = new Dethrod("Dethrod, der alte Veteran",12,3,2,2,Spieler.Klasse.RITTER,this,2);break;
        case "Temora":spieler2second = new Temora("Temora, der Runengelehrte",12,5,1,1,Spieler.Klasse.MAGIER,this);break;
        case "Zhor":spieler2second = new Zhor("Zhor, der schnelle Blitz",12,3,2,2,Spieler.Klasse.ASSASINE,this,2);break;
        case "Nuramon":spieler2second = new Nuramon("Nuramon, der Elf der tausend Leben",12,3,2,2,Spieler.Klasse.KRIEGER,this,2);break;
        }
        switch(spieler2KlasseThird)
        {
        case "Magier":spieler2third = new Magier("Freya, die Elementarbegeisterte",12,3,2,2,Spieler.Klasse.MAGIER,this);break;
        case "Krieger":spieler2third = new Krieger("Tormarg, der Schlaechter",12,3,2,2,Spieler.Klasse.KRIEGER,this);break;
        case "Ritter":spieler2third = new Ritter("Godrick, die eiserne Mauer",12,3,2,2,Spieler.Klasse.RITTER,this);break;
        case "Assasine":spieler2third = new Assasine("Legos, der stille Schleicher",12,3,2,2,Spieler.Klasse.ASSASINE,this);break;
        case "Benagon":spieler2third = new Benagon("Benagon, der erleuchtete Paladin",12,3,2,2,Spieler.Klasse.KRIEGER,this);break;
        case "Billmarg":spieler2third = new Billmorg("Billmarg, der cynische Hexenmeister",12,3,2,2,Spieler.Klasse.MAGIER,this);break;
        case "Hava":spieler2third = new Hava("Hava, die verlorene Priesterin",12,3,2,2,Spieler.Klasse.MAGIER,this);break;
        case "Alera":spieler2third = new Alera("Alera, die tueckische Klinge",12,3,2,2,Spieler.Klasse.ASSASINE,this);break;
        case "Jonathan":spieler2third = new Jonathan("Jonathan, der blinde Vagabund",12,3,2,2,Spieler.Klasse.RITTER,this);break;
        case "Ragorl":spieler2third = new Ragorl("Ragorl, der fellige Wanderer",12,3,2,2,Spieler.Klasse.KRIEGER,this);break;
        case "Varus":spieler2third = new Varus("Varus, der verfluchende Ritter",12,3,2,2,Spieler.Klasse.RITTER,this,2);break;
        case "Leah":spieler2third = new Leah("Leah, die trickreiche Bogenschuetzin",12,3,2,2,Spieler.Klasse.ASSASINE,this,2);break;
        case "Dethrod":spieler2third = new Dethrod("Dethrod, der alte Veteran",12,3,2,2,Spieler.Klasse.RITTER,this,2);break;
        case "Temora":spieler2third = new Temora("Temora, der Runengelehrte",12,5,1,1,Spieler.Klasse.MAGIER,this);break;
        case "Zhor":spieler2third = new Zhor("Zhor, der schnelle Blitz",12,3,2,2,Spieler.Klasse.ASSASINE,this,2);break;
        case "Nuramon":spieler2third = new Nuramon("Nuramon, der Elf der tausend Leben",12,3,2,2,Spieler.Klasse.KRIEGER,this,2);break;
        }
    
        
        
         switch(spieler1KlasseSec)
        {
        case "Magier":spieler1second = new Magier("Freya, die Elementarbegeisterte",12,3,2,2,Spieler.Klasse.MAGIER,this);break;
        case "Krieger":spieler1second = new Krieger("Tormarg, der Schlaechter",12,3,2,2,Spieler.Klasse.KRIEGER,this);break;
        case "Ritter":spieler1second = new Ritter("Godrick, die eiserne Mauer",12,3,2,2,Spieler.Klasse.RITTER,this);break;
        case "Assasine":spieler1second = new Assasine("Legos, der stille Schleicher",12,3,2,2,Spieler.Klasse.ASSASINE,this);break;
        case "Benagon":spieler1second = new Benagon("Benagon, der erleuchtete Paladin",12,3,2,2,Spieler.Klasse.KRIEGER,this);break;
        case "Billmarg":spieler1second = new Billmorg("Billmarg, der cynische Hexenmeister",12,3,2,2,Spieler.Klasse.MAGIER,this);break;
        case "Hava":spieler1second = new Hava("Hava, die verlorene Priesterin",12,3,2,2,Spieler.Klasse.MAGIER,this);break;
        case "Alera":spieler1second = new Alera("Alera, die tueckische Klinge",12,3,2,2,Spieler.Klasse.ASSASINE,this);break;
        case "Jonathan":spieler1second = new Jonathan("Jonathan, der blinde Vagabund",12,3,2,2,Spieler.Klasse.RITTER,this);break;
        case "Ragorl":spieler1second = new Ragorl("Ragorl, der fellige Wanderer",12,3,2,2,Spieler.Klasse.KRIEGER,this);break;
        case "Varus":spieler1second = new Varus("Varus, der verfluchende Ritter",12,3,2,2,Spieler.Klasse.RITTER,this,1);break;
        case "Leah":spieler1second = new Leah("Leah, die trickreiche Bogenschuetzin",12,3,2,2,Spieler.Klasse.ASSASINE,this,1);break;
        case "Dethrod":spieler1second = new Dethrod("Dethrod, der alte Veteran",12,3,2,2,Spieler.Klasse.RITTER,this,1);break;
        case "Temora":spieler1second = new Temora("Temora, der Runengelehrte",12,5,1,1,Spieler.Klasse.MAGIER,this);break;
        case "Zhor":spieler1second = new Zhor("Zhor, der schnelle Blitz",12,3,2,2,Spieler.Klasse.ASSASINE,this,1);break;
        case "Nuramon":spieler1second = new Nuramon("Nuramon, der Elf der tausend Leben",12,3,2,2,Spieler.Klasse.KRIEGER,this,1);break;
        }
        switch(spieler1KlasseThird)
        {
        case "Magier":spieler1third = new Magier("Freya, die Elementarbegeisterte",12,3,2,2,Spieler.Klasse.MAGIER,this);break;
        case "Krieger":spieler1third = new Krieger("Tormarg, der Schlaechter",12,3,2,2,Spieler.Klasse.KRIEGER,this);break;
        case "Ritter":spieler1third = new Ritter("Godrick, die eiserne Mauer",12,3,2,2,Spieler.Klasse.RITTER,this);break;
        case "Assasine":spieler1third = new Assasine("Legos, der stille Schleicher",12,3,2,2,Spieler.Klasse.ASSASINE,this);break;
        case "Benagon":spieler1third = new Benagon("Benagon, der erleuchtete Paladin",12,3,2,2,Spieler.Klasse.KRIEGER,this);break;
        case "Billmarg":spieler1third = new Billmorg("Billmarg, der cynische Hexenmeister",12,3,2,2,Spieler.Klasse.MAGIER,this);break;
        case "Hava":spieler1third = new Hava("Hava, die verlorene Priesterin",12,3,2,2,Spieler.Klasse.MAGIER,this);break;
        case "Alera":spieler1third = new Alera("Alera, die tueckische Klinge",12,3,2,2,Spieler.Klasse.ASSASINE,this);break;
        case "Jonathan":spieler1third = new Jonathan("Jonathan, der blinde Vagabund",12,3,2,2,Spieler.Klasse.RITTER,this);break;
        case "Ragorl":spieler1third = new Ragorl("Ragorl, der fellige Wanderer",12,3,2,2,Spieler.Klasse.KRIEGER,this);break;
        case "Varus":spieler1third = new Varus("Varus, der verfluchende Ritter",12,3,2,2,Spieler.Klasse.RITTER,this,1);break;
        case "Leah":spieler1third = new Leah("Leah, die trickreiche Bogenschuetzin",12,3,2,2,Spieler.Klasse.ASSASINE,this,1);break;
        case "Dethrod":spieler1third = new Dethrod("Dethrod, der alte Veteran",12,3,2,2,Spieler.Klasse.RITTER,this,1);break;
        case "Temora":spieler1third = new Temora("Temora, der Runengelehrte",12,5,1,1,Spieler.Klasse.MAGIER,this);break;
        case "Zhor":spieler1third = new Zhor("Zhor, der schnelle Blitz",12,3,2,2,Spieler.Klasse.ASSASINE,this,1);break;
        case "Nuramon":spieler1third = new Nuramon("Nuramon, der Elf der tausend Leben",12,3,2,2,Spieler.Klasse.KRIEGER,this,1);break;
        }
         switch(spieler1Klasse)
        {
        case "Magier":spieler1 = new Magier("Freya, die Elementarbegeisterte",12,3,2,2,Spieler.Klasse.MAGIER,this);break;
        case "Krieger":spieler1 = new Krieger("Tormarg, der Schlaechter",12,3,2,2,Spieler.Klasse.KRIEGER,this);break;
        case "Ritter":spieler1 = new Ritter("Godrick, die eiserne Mauer",12,3,2,2,Spieler.Klasse.RITTER,this);break;
        case "Assasine":spieler1 = new Assasine("Legos, der stille Schleicher",12,3,2,2,Spieler.Klasse.ASSASINE,this);break;
        case "Benagon":spieler1 = new Benagon("Benagon, der erleuchtete Paladin",12,3,2,2,Spieler.Klasse.KRIEGER,this);break;
        case "Billmarg":spieler1 = new Billmorg("Billmarg, der cynische Hexenmeister",12,3,2,2,Spieler.Klasse.MAGIER,this);break;
        case "Hava":spieler1 = new Hava("Hava, die verlorene Priesterin",12,3,2,2,Spieler.Klasse.MAGIER,this);break;
        case "Alera":spieler1 = new Alera("Alera, die tueckische Klinge",12,3,2,2,Spieler.Klasse.ASSASINE,this);break;
        case "Jonathan":spieler1 = new Jonathan("Jonathan, der blinde Vagabund",12,3,2,2,Spieler.Klasse.RITTER,this);break;
        case "Ragorl":spieler1 = new Ragorl("Ragorl, der fellige Wanderer",12,3,2,2,Spieler.Klasse.KRIEGER,this);break;
        case "Varus":spieler1 = new Varus("Varus, der verfluchende Ritter",12,3,2,2,Spieler.Klasse.RITTER,this,1);break;
        case "Leah":spieler1 = new Leah("Leah, die trickreiche Bogenschuetzin",12,3,2,2,Spieler.Klasse.ASSASINE,this,1);break;
        case "Dethrod":spieler1 = new Dethrod("Dethrod, der alte Veteran",12,3,2,2,Spieler.Klasse.RITTER,this,1);break;
        case "Temora":spieler1 = new Temora("Temora, der Runengelehrte",12,5,1,1,Spieler.Klasse.MAGIER,this);break;
        case "Zhor":spieler1 = new Zhor("Zhor, der schnelle Blitz",12,3,2,2,Spieler.Klasse.ASSASINE,this,1);break;
        case "Nuramon":spieler1 = new Nuramon("Nuramon, der Elf der tausend Leben",12,3,2,2,Spieler.Klasse.KRIEGER,this,1);break;
        }
    }
    
    public void UpdateGewinner()
    {
    if(spieler1.getLeben()<=0)
     System.out.println(spieler1.getName() + " hat verloren^^"); //Hier soll der Spieler seinen Namen eingesetzt bekommen, weil es schöner ist.Probier es.
     
    if(spieler2.getLeben()<=0)
     System.out.println(spieler2.getName()+" hat verloren^^");//Hier soll der Spieler seinen Namen eingesetzt bekommen, weil es schöner ist.Probier es.
    
    }
    public void DeclareAbilities(usedSkill skillUsedByPlayer, int player)
    {
    	
        if(player==1)
        {
        spieler1Faehigkeit =skillUsedByPlayer;
        }else if(player==2){
        spieler2Faehigkeit=skillUsedByPlayer;
        }
        if(spieler2.leben<1)
        {
        	System.out.println("spieler 2 Tod");
        	if(spieler2Faehigkeit==usedSkill.TAUSCH){
        		Player2ChangeCharTo2();
        		spieler1Faehigkeit= usedSkill.NULL;
        	}else if(spieler2Faehigkeit==usedSkill.TAUSCH2){Player2ChangeCharTo3();
    		spieler1Faehigkeit= usedSkill.NULL;}else{GameFrame.Hide1(false);
            GameFrame.Hide2(false);return;}
        	GameFrame.AktionDurchgefuehrt("",1 );
        	GameFrame.Hide1(false);
            GameFrame.Hide2(false);
            
        	
        	
        }
        if(spieler1.leben<1)
        {
        	System.out.println("spieler1 Tod");
        	if(spieler1Faehigkeit==usedSkill.TAUSCH){
        		Player1ChangeCharTo2();
        		spieler2Faehigkeit= usedSkill.NULL;
        	}else if(spieler1Faehigkeit==usedSkill.TAUSCH2){Player1ChangeCharTo3();
    		spieler2Faehigkeit= usedSkill.NULL;}else{GameFrame.Hide1(false);
            GameFrame.Hide2(false);return;}
        	GameFrame.AktionDurchgefuehrt("",2 );
        	
        	
        	GameFrame.Hide1(false);
            GameFrame.Hide2(false);

            
           
        }
        
        
        if(!(spieler1Faehigkeit==usedSkill.NULL || spieler2Faehigkeit==usedSkill.NULL)){
          GameFrame.Hide1(false);
          GameFrame.Hide2(false); 
        switch(spieler1Faehigkeit)
        {
        case FAEHIGKEIT1: switch(spieler2Faehigkeit){case TAUSCH:Player2ChangeCharTo2();spieler2Faehigkeit=usedSkill.NOTHING;break;case TAUSCH2:Player2ChangeCharTo3();spieler2Faehigkeit=usedSkill.NOTHING;break;};
        if(spieler2Faehigkeit==usedSkill.FAEHIGKEIT4&&spieler2.getFaehigkeit3()=="Verschwinde!"){Player1ChangeCharTo2();break;}
        spieler1.Faehigkeit1();
        GameFrame.AktionDurchgefuehrt("Der Charakter nutzt "+ spieler1.getFaehigkeit1(), 1);
        break;
        case FAEHIGKEIT2:switch(spieler2Faehigkeit){case TAUSCH:Player2ChangeCharTo2();spieler2Faehigkeit=usedSkill.NOTHING;break;case TAUSCH2:Player2ChangeCharTo3();spieler2Faehigkeit=usedSkill.NOTHING;break;};
        if(spieler2Faehigkeit==usedSkill.FAEHIGKEIT4&&spieler2.getFaehigkeit3()=="Verschwinde!"){Player1ChangeCharTo2();break;}
        spieler1.Faehigkeit2();
        GameFrame.AktionDurchgefuehrt("Der Charakter nutzt "+ spieler1.getFaehigkeit2(), 1);
        break;
        case FAEHIGKEIT3:switch(spieler2Faehigkeit){case TAUSCH:Player2ChangeCharTo2();spieler2Faehigkeit=usedSkill.NOTHING;break;case TAUSCH2:Player2ChangeCharTo3();spieler2Faehigkeit=usedSkill.NOTHING;break;};
        if(spieler2Faehigkeit==usedSkill.FAEHIGKEIT4&&spieler2.getFaehigkeit3()=="Verschwinde!"){Player1ChangeCharTo2();break;}
        spieler1.Faehigkeit3();
        GameFrame.AktionDurchgefuehrt("Der Charakter nutzt "+ spieler1.getFaehigkeit3(), 1);
        break;
        case FAEHIGKEIT4:switch(spieler2Faehigkeit){case TAUSCH:Player2ChangeCharTo2();spieler2Faehigkeit=usedSkill.NOTHING;break;case TAUSCH2:Player2ChangeCharTo3();spieler2Faehigkeit=usedSkill.NOTHING;break;};
        if(spieler2Faehigkeit==usedSkill.FAEHIGKEIT4&&spieler2.getFaehigkeit3()=="Verschwinde!"){Player1ChangeCharTo2();break;}
        spieler1.Faehigkeit4();
        GameFrame.AktionDurchgefuehrt("Der Charakter nutzt "+ spieler1.getFaehigkeit4(), 1);
        break;
        case TAUSCH:Player1ChangeCharTo2();break;
        case TAUSCH2:Player1ChangeCharTo3();break;
        }
        
        
         switch(spieler2Faehigkeit)
        {
        case FAEHIGKEIT1:spieler2.Faehigkeit1();
        GameFrame.AktionDurchgefuehrt("Der Charakter nutzt "+ spieler2.getFaehigkeit1(), 2);
        break;
        case FAEHIGKEIT2:spieler2.Faehigkeit2();
        GameFrame.AktionDurchgefuehrt("Der Charakter nutzt "+ spieler2.getFaehigkeit2(), 2);
        break;
        case FAEHIGKEIT3:spieler2.Faehigkeit3();
        GameFrame.AktionDurchgefuehrt("Der Charakter nutzt "+ spieler2.getFaehigkeit3(), 2);
        break;
        case FAEHIGKEIT4:spieler2.Faehigkeit4();
        GameFrame.AktionDurchgefuehrt("Der Charakter nutzt "+ spieler2.getFaehigkeit4(), 2);
        break;
        case TAUSCH:Player2ChangeCharTo2();break;
        case TAUSCH2:Player2ChangeCharTo3();break;
        case NOTHING:break;
        }
        }
        
        
        
    
    }
    
    public void Kampf()//Das Kampfsystem funktioniert seltsame^^.Der Spieler soll so oft Schaden zufuegen wie die Differenz zwischen beiden Spielern.Der langsamere jedoch nur 1 mal ^^.Man kriegt Schaden geteilt durch die Ruestungen/2.
    {
        if(spieler1.getKampfbereit())
        System.out.println(spieler1.getName()+" hat seine Bereitheit deklariert.");
        if(spieler2.getKampfbereit())
        System.out.println(spieler2.getName()+" hat seine Bereitheit deklariert.");
        if(spieler1.getKampfbereit()&&spieler2.getKampfbereit())
        {
    
        	
        	
     if(spieler1.getSchnelligkeit()>spieler2.getSchnelligkeit())
    {
    for(int i = 1;i<spieler1.getSchnelligkeit()-spieler2.getSchnelligkeit();i++)
    {   
        if(spieler1.getSchaden()-spieler2.getRuestung()/2>0)
        spieler2.setLeben(spieler1.getSchaden()-spieler2.getRuestung()/2);   System.out.println("Spieler 1 schlaegt.");
    }
    
    if(spieler2.getSchaden()-spieler1.getRuestung()/2>0&&spieler1.getLeben()>0)
    spieler1.setLeben(spieler2.getSchaden()-spieler1.getRuestung()/2); System.out.println("Spieler 2 schlaegt.");
    }
    
    
    
    
    
    
    if(spieler2.getSchnelligkeit()>spieler1.getSchnelligkeit())
    {
    for(int i = 0;i<spieler2.getSchnelligkeit()-spieler1.getSchnelligkeit();i++)
    {
        if(spieler2.getSchaden()-spieler1.getRuestung()/2>0)
        spieler1.setLeben(spieler2.getSchaden()-spieler1.getRuestung()/2);   System.out.println("Spieler 2 schlaegt.");
    }
    if(spieler1.getSchaden()-spieler2.getRuestung()/2>0&& spieler2.getLeben()>0)
    spieler2.setLeben(spieler1.getSchaden()-spieler2.getRuestung()/2); System.out.println("Spieler 1 schlaegt.");
    }
    
    
    
    
    
    
    if(spieler1.getSchnelligkeit()==spieler2.getSchnelligkeit())
     {
         if(spieler2.getSchaden()-spieler1.getRuestung()/2>0)
        spieler2.setLeben(spieler1.getSchaden()-(spieler2.getRuestung()/2));
         System.out.println("Spieler 1 schlaegt.");
         if(spieler1.getSchaden()-spieler2.getRuestung()/2>0)
        spieler1.setLeben(spieler2.getSchaden()-(spieler1.getRuestung()/2));
         System.out.println("Spieler 2 schlaegt.");
     }
    
    
    
    
    
    System.out.println(spieler1.getName()+" hat noch "+spieler1.getLeben()+"Leben");
    System.out.println(spieler2.getName()+" hat noch "+spieler2.getLeben()+"Leben");
     spieler1.setKampfbereit(false);
     spieler2.setKampfbereit(false);
     
    spieler1.Reset();
    spieler2.Reset();
    if(!(spieler1.getStatus()==null))
    {
    System.out.println(spieler1.getShortName()+" hat den Status "+spieler1.getStatus());
    GameFrame.Status(spieler1.getShortName()+" hat den Status "+spieler1.getStatus());
    }
    if(!(spieler2.getStatus()==null))
    {
    System.out.println(spieler2.getName()+" hat den Status "+spieler2.getStatus());
    GameFrame.Status(spieler2.getShortName()+" hat den Status "+spieler2.getStatus());
    }
    spieler1.StatusReaktion();
    spieler2.StatusReaktion();
    change1=false;
    change2=false;
    spieler2Faehigkeit = usedSkill.NULL;
    spieler1Faehigkeit = usedSkill.NULL;
    if(spieler1.getLeben()<1)
    {
    	GameFrame.Disable1();
    }
    if(spieler2.getLeben()<1)
    {
    	GameFrame.Disable2();
    }
    
    }
    }
    
    public Spieler getSpieler1()
    {
    return spieler1;
    
    }
    public Spieler getSpieler2()
    {
    return spieler2;
    
    }
    
    
     public Spieler getSpieler1sec()
    {
    return spieler1second;
    
    }
    public Spieler getSpieler2sec()
    {
    return spieler2second;
    
    }
    
    
     public Spieler getSpieler1third()
    {
       
        
    return spieler1third;
    
    }
    public Spieler getSpieler2third()
    {
    return spieler2third;
    
    }
    
    
    
    public void Player1ChangeCharTo2()
    {
         if(change1)return;
         
    Spieler spielerHilfe = spieler1;
    if(spielerHilfe.getLeben()>0)
    System.out.println(spieler1.getName()+" hat seine Bereitheit deklariert.");
    spieler1 = spieler1second;
    spieler1second=spielerHilfe;
     if(spielerHilfe.getLeben()>0)
    spieler1.setKampfbereit(true);spieler1.setSchaden(1);
    change1=true;
    GameFrame.AktionDurchgefuehrt("Der Charakter wurde zu "+ spieler1.getName()+" getauscht", 1);
    Kampf();
    
    }
    public void Player1ChangeCharTo3()
    {
         if(change1)return;
    Spieler spielerHilfe = spieler1;
    if(spielerHilfe.getLeben()>0)
    System.out.println(spieler1.getName()+" hat seine Bereitheit deklariert.");
    spieler1 = spieler1third;
    spieler1third=spielerHilfe;
     if(spielerHilfe.getLeben()>0)
    spieler1.setKampfbereit(true);spieler1.setSchaden(1);
    change1=true;
    GameFrame.AktionDurchgefuehrt("Der Charakter wurde zu "+ spieler1.getName()+" getauscht", 1);
    Kampf();
    
    }
    
    public void Player2ChangeCharTo2()
    {
        if(change2)return;
    Spieler spielerHilfe = spieler2;
    if(spielerHilfe.getLeben()>0)
    System.out.println(spieler2.getName()+" hat seine Bereitheit deklariert.");
    spieler2 = spieler2second;
    spieler2second=spielerHilfe;
     if(spielerHilfe.getLeben()>0)
    spieler2.setKampfbereit(true);spieler2.setSchaden(1);
    change2=true;
    GameFrame.AktionDurchgefuehrt("Der Charakter wurde zu "+ spieler2.getName()+" getauscht", 2);
    Kampf();
    
    }
    public void Player2ChangeCharTo3()
    {
    Spieler spielerHilfe = spieler2;
    if(spielerHilfe.getLeben()>0)
    System.out.println(spieler2.getName()+" hat seine Bereitheit deklariert.");
    spieler2 = spieler2third;
    spieler2third=spielerHilfe;
    if(spielerHilfe.getLeben()>0)
    spieler2.setKampfbereit(true);spieler2.setSchaden(1);
    change2=true;
    GameFrame.AktionDurchgefuehrt("Der Charakter wurde zu "+ spieler2.getName()+" getauscht", 2);
    Kampf();
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
