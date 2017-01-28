import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
/**
 * Write a description of class Frame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frame extends JFrame implements ActionListener
{
    JLabel spieler1Wahl;
    JLabel spieler2Wahl;
    
  
     JComboBox player1;
     JComboBox player2;
     JComboBox player1sec;
     JComboBox player2sec;
     JComboBox player1third;
     JComboBox player2third;
    String spieler1Klasse=null;
    String spieler2Klasse=null;
    String spieler1KlasseSec=null;
    String spieler2KlasseSec=null;
    String spieler1KlasseThird=null;
    String spieler2KlasseThird=null;
    JButton start;
    public Frame(String titel) 
    {
        super(titel);
        setLayout( null );
        spieler1Wahl = new JLabel("Spieler 1 waehle deine Klasse");
        spieler2Wahl = new JLabel("Spieler 2 waehle deine Klasse");
        spieler1Wahl.setBounds(100,100,200,50);
        add(spieler1Wahl);
        spieler2Wahl.setBounds(500,100,200,50);
        add(spieler2Wahl);
        
       
        
        String[] auswahl = {"<Bitte einen Charakter wählen>","Tormarg, der Schlaechter","Freya, die Elementarbegeisterte","Legos, der stille Schleicher","Godrick, die eiserne Mauer","Benagon, der erleuchtete Paladin","Hava, die verlorene Priesterin","Billmarg, der cynische Hexenmeister","Alera, die tueckische Klinge","Jonathan, der blinde Vagabund","Ragorl, der fellige Wanderer", "Varus, der verfluchende Ritter","Leah, die trickreiche Bogenschuetzin","Dethrod, der alte Veteran"
        		,"Temora, der Runengelehrte","Zhor, der schnelle Blitz","Nuramon, der Elf der tausend Leben"};
        
        player1 = new JComboBox(auswahl);
        player1.addActionListener(this);
        player1.setBounds(100, 250, 250, 30);
        player1.setVisible(true);
        add(player1);
        
         player2 = new JComboBox(auswahl);
        player2.addActionListener(this);
        player2.setBounds(500, 250, 250, 30);
        player2.setVisible(true);
        add(player2);
        
        
        
        player1sec = new JComboBox(auswahl);
        player1sec.addActionListener(this);
        player1sec.setBounds(100, 300, 250, 30);
        player1sec.setVisible(true);
        add(player1sec);
        
         player2sec = new JComboBox(auswahl);
        player2sec.addActionListener(this);
        player2sec.setBounds(500, 300, 250, 30);
        player2sec.setVisible(true);
        add(player2sec);
        
        
        
        player1third = new JComboBox(auswahl);
        player1third.addActionListener(this);
        player1third.setBounds(100, 350, 250, 30);
        player1third.setVisible(true);
        add(player1third);
        
         player2third = new JComboBox(auswahl);
        player2third.addActionListener(this);
        player2third.setBounds(500, 350, 250, 30);
        player2third.setVisible(true);
        add(player2third);
        
        
        start = new JButton("Start");
        start.setBounds(350,500,100,50);
        start.addActionListener(this);
        start.setActionCommand("start");
        add(start);
        
}
    
    
    
    
    public void actionPerformed(ActionEvent evt) {
    Object source = evt.getSource();
        
        if(source == player1)
        {
            switch((String) player1.getSelectedItem())
            {
                case "Tormarg, der Schlaechter": spieler1Klasse = "Krieger";break;
                case "Freya, die Elementarbegeisterte": spieler1Klasse = "Magier"; break;
                case "Legos, der stille Schleicher": spieler1Klasse = "Assasine";break;
                case "Godrick, die eiserne Mauer": spieler1Klasse = "Ritter"; break;
                 case "Benagon, der erleuchtete Paladin": spieler1Klasse = "Benagon"; break;
                 case "Billmarg, der cynische Hexenmeister": spieler1Klasse = "Billmarg"; break;
                 case "Hava, die verlorene Priesterin": spieler1Klasse = "Hava"; break;
                 case "Alera, die tueckische Klinge": spieler1Klasse = "Alera"; break;
                 case "Jonathan, der blinde Vagabund": spieler1Klasse = "Jonathan"; break;
                 case "Ragorl, der fellige Wanderer": spieler1Klasse = "Ragorl"; break;
                 case "Varus, der verfluchende Ritter": spieler1Klasse = "Varus"; break;
                 case "Leah, die trickreiche Bogenschuetzin": spieler1Klasse = "Leah"; break;
                 case "Dethrod, der alte Veteran": spieler1Klasse = "Dethrod"; break;
                 case "Temora, der Runengelehrte": spieler1Klasse = "Temora"; break;
                 case "Zhor, der schnelle Blitz": spieler1Klasse = "Zhor"; break;
                 case "Nuramon, der Elf der tausend Leben": spieler1Klasse = "Nuramon"; break;
                 
            }
        }
         if(source == player2)
        {
            switch((String) player2.getSelectedItem())
            {
                case "Tormarg, der Schlaechter": spieler2Klasse = "Krieger";break;
                case "Freya, die Elementarbegeisterte": spieler2Klasse = "Magier"; break;
                case "Legos, der stille Schleicher": spieler2Klasse = "Assasine";break;
                case "Godrick, die eiserne Mauer": spieler2Klasse = "Ritter"; break;
                case "Benagon, der erleuchtete Paladin": spieler2Klasse = "Benagon"; break;
                 case "Billmarg, der cynische Hexenmeister": spieler2Klasse = "Billmarg"; break;
                 case "Hava, die verlorene Priesterin": spieler2Klasse = "Hava"; break;
                 case "Alera, die tueckische Klinge": spieler2Klasse = "Alera"; break;
                 case "Jonathan, der blinde Vagabund": spieler2Klasse = "Jonathan"; break;
                 case "Ragorl, der fellige Wanderer": spieler2Klasse = "Ragorl"; break;
                 case "Varus, der verfluchende Ritter": spieler2Klasse = "Varus"; break;
                 case "Leah, die trickreiche Bogenschuetzin": spieler2Klasse = "Leah"; break;
                 case "Dethrod, der alte Veteran": spieler2Klasse = "Dethrod"; break;
                 case "Temora, der Runengelehrte": spieler2Klasse = "Temora"; break;
                 case "Zhor, der schnelle Blitz": spieler2Klasse = "Zhor"; break;
                 case "Nuramon, der Elf der tausend Leben": spieler2Klasse = "Nuramon"; break;
            }
        }
        
        
        
         if(source == player1sec)
        {
            switch((String) player1sec.getSelectedItem())
            {
                case "Tormarg, der Schlaechter": spieler1KlasseSec = "Krieger";break;
                case "Freya, die Elementarbegeisterte": spieler1KlasseSec = "Magier"; break;
                case "Legos, der stille Schleicher": spieler1KlasseSec = "Assasine";break;
                case "Godrick, die eiserne Mauer": spieler1KlasseSec = "Ritter"; break;
                 case "Benagon, der erleuchtete Paladin": spieler1KlasseSec = "Benagon"; break;
                 case "Billmarg, der cynische Hexenmeister": spieler1KlasseSec = "Billmarg"; break;
                 case "Hava, die verlorene Priesterin": spieler1KlasseSec = "Hava"; break;
                 case "Alera, die tueckische Klinge": spieler1KlasseSec = "Alera"; break;
                 case "Jonathan, der blinde Vagabund": spieler1KlasseSec = "Jonathan"; break;
                 case "Ragorl, der fellige Wanderer": spieler1KlasseSec = "Ragorl"; break;
                 case "Varus, der verfluchende Ritter": spieler1KlasseSec = "Varus"; break;
                 case "Leah, die trickreiche Bogenschuetzin": spieler1KlasseSec = "Leah"; break;
                 case "Dethrod, der alte Veteran": spieler1KlasseSec = "Dethrod"; break;
                 case "Temora, der Runengelehrte": spieler1KlasseSec = "Temora"; break;
                 case "Zhor, der schnelle Blitz": spieler1KlasseSec = "Zhor"; break;
                 case "Nuramon, der Elf der tausend Leben": spieler1KlasseSec = "Nuramon"; break;
            }
        }
         if(source == player2sec)
        {
            switch((String) player2sec.getSelectedItem())
            {
                case "Tormarg, der Schlaechter": spieler2KlasseSec = "Krieger";break;
                case "Freya, die Elementarbegeisterte": spieler2KlasseSec = "Magier"; break;
                case "Legos, der stille Schleicher": spieler2KlasseSec = "Assasine";break;
                case "Godrick, die eiserne Mauer": spieler2KlasseSec = "Ritter"; break;
                case "Benagon, der erleuchtete Paladin": spieler2KlasseSec = "Benagon"; break;
                 case "Billmarg, der cynische Hexenmeister": spieler2KlasseSec = "Billmarg"; break;
                 case "Hava, die verlorene Priesterin": spieler2KlasseSec = "Hava"; break;
                 case "Alera, die tueckische Klinge": spieler2KlasseSec = "Alera"; break;
                 case "Jonathan, der blinde Vagabund": spieler2KlasseSec = "Jonathan"; break;
                 case "Ragorl, der fellige Wanderer": spieler2KlasseSec = "Ragorl"; break;
                 case "Varus, der verfluchende Ritter": spieler2KlasseSec = "Varus"; break;
                 case "Leah, die trickreiche Bogenschuetzin": spieler2KlasseSec = "Leah"; break;
                 case "Dethrod, der alte Veteran": spieler2KlasseSec = "Dethrod"; break;
                 case "Temora, der Runengelehrte": spieler2KlasseSec = "Temora"; break;
                 case "Zhor, der schnelle Blitz": spieler2KlasseSec = "Zhor"; break;
                 case "Nuramon, der Elf der tausend Leben": spieler2KlasseSec = "Nuramon"; break;
            }
        }
        
        
        
        if(source == player1third)
        {
            switch((String) player1third.getSelectedItem())
            {
                case "Tormarg, der Schlaechter": spieler1KlasseThird = "Krieger";break;
                case "Freya, die Elementarbegeisterte": spieler1KlasseThird = "Magier"; break;
                case "Legos, der stille Schleicher": spieler1KlasseThird = "Assasine";break;
                case "Godrick, die eiserne Mauer": spieler1KlasseThird = "Ritter"; break;
                 case "Benagon, der erleuchtete Paladin": spieler1KlasseThird = "Benagon"; break;
                 case "Billmarg, der cynische Hexenmeister": spieler1KlasseThird = "Billmarg"; break;
                 case "Hava, die verlorene Priesterin": spieler1KlasseThird = "Hava"; break;
                 case "Alera, die tueckische Klinge": spieler1KlasseThird = "Alera"; break;
                 case "Jonathan, der blinde Vagabund": spieler1KlasseThird = "Jonathan"; break;
                 case "Ragorl, der fellige Wanderer": spieler1KlasseThird = "Ragorl"; break;
                 case "Varus, der verfluchende Ritter": spieler1KlasseThird = "Varus"; break;
                 case "Leah, die trickreiche Bogenschuetzin": spieler1KlasseThird = "Leah"; break;
                 case "Dethrod, der alte Veteran": spieler1KlasseThird = "Dethrod"; break;
                 case "Temora, der Runengelehrte": spieler1KlasseThird = "Temora"; break;
                 case "Zhor, der schnelle Blitz": spieler1KlasseThird = "Zhor"; break;
                 case "Nuramon, der Elf der tausend Leben": spieler1KlasseThird = "Nuramon"; break;
            }
        }
         if(source == player2third)
        {
            switch((String) player2third.getSelectedItem())
            {
                case "Tormarg, der Schlaechter": spieler2KlasseThird = "Krieger";break;
                case "Freya, die Elementarbegeisterte": spieler2KlasseThird = "Magier"; break;
                case "Legos, der stille Schleicher": spieler2KlasseThird = "Assasine";break;
                case "Godrick, die eiserne Mauer": spieler2KlasseThird = "Ritter"; break;
                case "Benagon, der erleuchtete Paladin": spieler2KlasseThird = "Benagon"; break;
                 case "Billmarg, der cynische Hexenmeister": spieler2KlasseThird = "Billmarg"; break;
                 case "Hava, die verlorene Priesterin": spieler2KlasseThird = "Hava"; break;
                 case "Alera, die tueckische Klinge": spieler2KlasseThird = "Alera"; break;
                 case "Jonathan, der blinde Vagabund": spieler2KlasseThird = "Jonathan"; break;
                 case "Ragorl, der fellige Wanderer": spieler2KlasseThird = "Ragorl"; break;
                 case "Varus, der verfluchende Ritter": spieler2KlasseThird = "Varus"; break;
                 case "Leah, die trickreiche Bogenschuetzin": spieler2KlasseThird = "Leah"; break;
                 case "Dethrod, der alte Veteran": spieler2KlasseThird = "Dethrod"; break;
                 case "Temora, der Runengelehrte": spieler2KlasseThird = "Temora"; break;
                 case "Zhor, der schnelle Blitz": spieler2KlasseThird = "Zhor"; break;
                 case "Nuramon, der Elf der tausend Leben": spieler2KlasseThird = "Nuramon"; break;
            }
        }
        
        
        
        
        
        
        
        
        
        
     if(evt.getActionCommand().equals( "start" ))
    {
    if(!(spieler2Klasse==null&& spieler1Klasse==null))
    {
        RPGcontroller spieleManager = new RPGcontroller(spieler1Klasse,spieler2Klasse,spieler1KlasseSec,spieler1KlasseThird,spieler2KlasseSec,spieler2KlasseThird);
        GameFrame frame = new GameFrame("Spiel",spieleManager);
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setSize(800,750);
        frame.setVisible( true );
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.dispose();
        
    }
    }

}





}



class   GameFrame extends JFrame implements ActionListener
{
    RPGcontroller spieleManager;
    Spieler spieler1;
    Spieler spieler2;
    JButton spieler1Stats;
    JButton spieler2Stats;
    JButton Faehigkeit1spieler1;
    JButton Faehigkeit2spieler1;
    JButton Faehigkeit3spieler1;
    JButton Faehigkeit4spieler1;
    JButton Faehigkeit1spieler2;
    JButton Faehigkeit2spieler2;
    JButton Faehigkeit3spieler2;
    JButton Faehigkeit4spieler2;
    JLabel thingsHappend;
    JButton spieler2Wechsel;
    JButton spieler1Wechsel;
    JButton spieler2Wechsel2;
    JButton spieler1Wechsel2;
    public static JLabel Aktion;
    public static JLabel Aktion2;
    JLabel LebenSpieler1;
    JLabel LebenSpieler2;
    static GameFrame ichSelbst;
     GameFrame(String titel,RPGcontroller spieleManager) 
    {
        super(titel);
        setLayout( null );
       this.spieleManager = spieleManager;
       spieler1 = spieleManager.getSpieler1();
       spieler2 = spieleManager.getSpieler2();
       
       Faehigkeit1spieler1 = new JButton(spieler1.getFaehigkeit1());
       Faehigkeit1spieler1.setBounds(100,200,200,50);
       Faehigkeit1spieler1.addActionListener(this);
       Faehigkeit1spieler1.setActionCommand("Faehigkeit1spieler1");
       add(Faehigkeit1spieler1);
       
       Faehigkeit2spieler1 = new JButton(spieler1.getFaehigkeit2());
       Faehigkeit2spieler1.setBounds(100,250,200,50);
       Faehigkeit2spieler1.addActionListener(this);
       Faehigkeit2spieler1.setActionCommand("Faehigkeit2spieler1");
       add(Faehigkeit2spieler1);
       
       Faehigkeit3spieler1 = new JButton(spieler1.getFaehigkeit3());
       Faehigkeit3spieler1.setBounds(100,300,200,50);
       Faehigkeit3spieler1.addActionListener(this);
       Faehigkeit3spieler1.setActionCommand("Faehigkeit3spieler1");
       add(Faehigkeit3spieler1);
       
       Faehigkeit4spieler1 = new JButton(spieler1.getFaehigkeit4());
       Faehigkeit4spieler1.setBounds(100,350,200,50);
       Faehigkeit4spieler1.addActionListener(this);
       Faehigkeit4spieler1.setActionCommand("Faehigkeit4spieler1");
       add(Faehigkeit4spieler1);
       
       Faehigkeit1spieler2 = new JButton(spieler2.getFaehigkeit1());
       Faehigkeit1spieler2.setBounds(500,200,200,50);
       Faehigkeit1spieler2.addActionListener(this);
       Faehigkeit1spieler2.setActionCommand("Faehigkeit1spieler2");
       add(Faehigkeit1spieler2);
       
       Faehigkeit2spieler2 = new JButton(spieler2.getFaehigkeit2());
       Faehigkeit2spieler2.setBounds(500,250,200,50);
       Faehigkeit2spieler2.addActionListener(this);
       Faehigkeit2spieler2.setActionCommand("Faehigkeit2spieler2");
       add(Faehigkeit2spieler2);
       
       Faehigkeit3spieler2 = new JButton(spieler2.getFaehigkeit3());
       Faehigkeit3spieler2.setBounds(500,300,200,50);
       Faehigkeit3spieler2.addActionListener(this);
       Faehigkeit3spieler2.setActionCommand("Faehigkeit3spieler2");
       add(Faehigkeit3spieler2);
       
       Faehigkeit4spieler2 = new JButton(spieler2.getFaehigkeit4());
       Faehigkeit4spieler2.setBounds(500,350,200,50);
       Faehigkeit4spieler2.addActionListener(this);
       Faehigkeit4spieler2.setActionCommand("Faehigkeit4spieler2");
       add(Faehigkeit4spieler2);
       
       
       spieler2Wechsel = new JButton("Wechseln zu: "+this.spieleManager.getSpieler2sec().getName());
       spieler2Wechsel.setBounds(500,400,200,50);
       spieler2Wechsel.addActionListener(this);
       spieler2Wechsel.setActionCommand("spieler2Wechsel");
       add(spieler2Wechsel);
       
       spieler1Wechsel = new JButton("Wechseln zu: "+this.spieleManager.getSpieler1sec().getName());
       spieler1Wechsel.setBounds(100,400,200,50);
       spieler1Wechsel.addActionListener(this);
       spieler1Wechsel.setActionCommand("spieler1Wechsel");
       add(spieler1Wechsel);
       
       
       spieler2Wechsel2 = new JButton("Wechseln zu: "+this.spieleManager.getSpieler2third().getName());
       spieler2Wechsel2.setBounds(500,450,200,50);
       spieler2Wechsel2.addActionListener(this);
       spieler2Wechsel2.setActionCommand("spieler2Wechsel2");
       add(spieler2Wechsel2);
       
       spieler1Wechsel2 = new JButton("Wechseln zu: "+this.spieleManager.getSpieler1third().getName());
       spieler1Wechsel2.setBounds(100,450,200,50);
       spieler1Wechsel2.addActionListener(this);
       spieler1Wechsel2.setActionCommand("spieler1Wechsel2");
       add(spieler1Wechsel2);
       
        Aktion = new JLabel("");
       Aktion.setBounds(200,500,500,50);
       add(Aktion);
        Aktion2 = new JLabel("");
       Aktion2.setBounds(200,550,500,50);
       add(Aktion2);
       thingsHappend = new JLabel("");
       thingsHappend.setBounds(200,600,500,50);
       add(thingsHappend);
       
       
       
       
       
       spieler1Stats = new JButton("Spieler1 Stats");
       spieler1Stats.setBounds(25,350,60,50);
       spieler1Stats.addActionListener(this);
       spieler1Stats.setActionCommand("Spieler1 Stats");
       add(spieler1Stats);
       
       spieler2Stats = new JButton("Spieler2 Stats");
       spieler2Stats.setBounds(725,350,60,50);
       spieler2Stats.addActionListener(this);
       spieler2Stats.setActionCommand("Spieler2 Stats");
       add(spieler2Stats);
       
       LebenSpieler1 = new JLabel(spieler1.getShortName()+" Leben: "+spieler1.getLeben());
       LebenSpieler1.setBounds(100,100,200,50);
       add(LebenSpieler1);
       LebenSpieler2 = new JLabel(spieler2.getShortName()+" Leben: "+spieler2.getLeben());
        LebenSpieler2.setBounds(500,100,200,50);
       add(LebenSpieler2);
       ichSelbst = this;
       }
     public static void Hide1(boolean hide)
     {
    	 if(hide)
    	 {
     	ichSelbst.Faehigkeit1spieler1.setVisible(false);
     	ichSelbst.Faehigkeit2spieler1.setVisible(false);
     	ichSelbst.Faehigkeit3spieler1.setVisible(false);
     	ichSelbst.Faehigkeit4spieler1.setVisible(false);
     	ichSelbst.spieler1Wechsel.setVisible(false);
     	ichSelbst.spieler1Wechsel2.setVisible(false);
    	 }else{ichSelbst.Faehigkeit1spieler1.setVisible(!false);
    	 ichSelbst.Faehigkeit2spieler1.setVisible(!false);
    	 ichSelbst.Faehigkeit3spieler1.setVisible(!false);
    	 ichSelbst.Faehigkeit4spieler1.setVisible(!false);
    	 ichSelbst.spieler1Wechsel.setVisible(!false);
    	 ichSelbst.spieler1Wechsel2.setVisible(!false);}
     	
     }
     public static void Hide2(boolean hide)
     {
    	 if(hide)
    	 {
    		 ichSelbst.Faehigkeit1spieler2.setVisible(false);
    		 ichSelbst.Faehigkeit2spieler2.setVisible(false);
    		 ichSelbst.Faehigkeit3spieler2.setVisible(false);
    		 ichSelbst.Faehigkeit4spieler2.setVisible(false);
    		 ichSelbst.spieler2Wechsel.setVisible(false);
    		 ichSelbst.spieler2Wechsel2.setVisible(false);
    	 }else{
    		ichSelbst.Faehigkeit1spieler2.setVisible(!false);
    		 ichSelbst.Faehigkeit2spieler2.setVisible(!false);
    		 ichSelbst.Faehigkeit3spieler2.setVisible(!false);
    		 ichSelbst.Faehigkeit4spieler2.setVisible(!false);
    		 ichSelbst.spieler2Wechsel.setVisible(!false);
    		 ichSelbst.spieler2Wechsel2.setVisible(!false);}
     	
     }
     public static void Disable2()
     {	
    	 if(ichSelbst.Faehigkeit1spieler2.isVisible())
    	 {
    	 ichSelbst.Faehigkeit1spieler2.setVisible(false);
		 ichSelbst.Faehigkeit2spieler2.setVisible(false);
		 ichSelbst.Faehigkeit3spieler2.setVisible(false);
		 ichSelbst.Faehigkeit4spieler2.setVisible(false);
    	 }else
    	 {
    		 ichSelbst.Faehigkeit1spieler2.setVisible(true);
    		 ichSelbst.Faehigkeit2spieler2.setVisible(true);
    		 ichSelbst.Faehigkeit3spieler2.setVisible(true);
    		 ichSelbst.Faehigkeit4spieler2.setVisible(true);
    		 
    		 
    	 }
     }
    public static void Disable1()
         {	
        	 if(ichSelbst.Faehigkeit1spieler1.isVisible())
        	 {
        		 ichSelbst.Faehigkeit1spieler1.setVisible(false);
        	     	ichSelbst.Faehigkeit2spieler1.setVisible(false);
        	     	ichSelbst.Faehigkeit3spieler1.setVisible(false);
        	     	ichSelbst.Faehigkeit4spieler1.setVisible(false);
        	 }
        	 
        	 else
        	 {
        		 ichSelbst.Faehigkeit1spieler1.setVisible(true);
        	     	ichSelbst.Faehigkeit2spieler1.setVisible(true);
        	     	ichSelbst.Faehigkeit3spieler1.setVisible(true);
        	     	ichSelbst.Faehigkeit4spieler1.setVisible(true);
        		 
        		 
        	 }
    	 
    	 
     }
    public static void Status(String a)
    {
    	ichSelbst.thingsHappend.setText(a);
    	
    	
    }
    public void actionPerformed(ActionEvent evt) {
    	if(!(evt==null))
    	{
        if(evt.getActionCommand().equals( "Faehigkeit1spieler2" ))
        {
        	Hide2(true);	spieleManager.DeclareAbilities(RPGcontroller.usedSkill.FAEHIGKEIT1,2);
            
        }
        if(evt.getActionCommand().equals( "Faehigkeit2spieler2" ))
        {
        	 Hide2(true);  spieleManager.DeclareAbilities(RPGcontroller.usedSkill.FAEHIGKEIT2,2);
           
        }
        if(evt.getActionCommand().equals( "Faehigkeit3spieler2" ))
        {
        	  Hide2(true);spieleManager.DeclareAbilities(RPGcontroller.usedSkill.FAEHIGKEIT3,2);
         
        }
        if(evt.getActionCommand().equals( "Faehigkeit4spieler2" ))
        {
        	Hide2(true);spieleManager.DeclareAbilities(RPGcontroller.usedSkill.FAEHIGKEIT4,2);
            
        }
        
        if(evt.getActionCommand().equals( "Faehigkeit1spieler1" ))
        {
        	Hide1(true); spieleManager.DeclareAbilities(RPGcontroller.usedSkill.FAEHIGKEIT1,1);
            
    
        }
        if(evt.getActionCommand().equals( "Faehigkeit2spieler1" ))
        {
        	Hide1(true); spieleManager.DeclareAbilities(RPGcontroller.usedSkill.FAEHIGKEIT2,1);
            
        }
        if(evt.getActionCommand().equals( "Faehigkeit3spieler1" ))
        {
        	Hide1(true);spieleManager.DeclareAbilities(RPGcontroller.usedSkill.FAEHIGKEIT3,1);
            
    
        }
        if(evt.getActionCommand().equals( "Faehigkeit4spieler1" ))
        {
        	Hide1(true); spieleManager.DeclareAbilities(RPGcontroller.usedSkill.FAEHIGKEIT4,1);
            
    
        }
        
        
        
         if(evt.getActionCommand().equals( "spieler1Wechsel" ))
        {
        	 Hide1(true);
           spieleManager.DeclareAbilities(RPGcontroller.usedSkill.TAUSCH,1);
             spieler1 = spieleManager.getSpieler1();
       spieler2 = spieleManager.getSpieler2();
        }
        if(evt.getActionCommand().equals( "spieler2Wechsel" ))
        {
        	Hide2(true);
            spieleManager.DeclareAbilities(RPGcontroller.usedSkill.TAUSCH,2);
             spieler1 = spieleManager.getSpieler1();
       spieler2 = spieleManager.getSpieler2();
        }
        
        
          if(evt.getActionCommand().equals( "spieler1Wechsel2" ))
        {Hide1(true);
            spieleManager.DeclareAbilities(RPGcontroller.usedSkill.TAUSCH2,1);
             spieler1 = spieleManager.getSpieler1();
       spieler2 = spieleManager.getSpieler2();
        }
        if(evt.getActionCommand().equals( "spieler2Wechsel2" ))
        {
        	Hide2(true);
            spieleManager.DeclareAbilities(RPGcontroller.usedSkill.TAUSCH2,2);
             spieler1 = spieleManager.getSpieler1();
       spieler2 = spieleManager.getSpieler2();
        }
        
        
        
        
        
        
        
        
         if(evt.getActionCommand().equals( "Spieler1 Stats" ))
        {
           StatsFrame frame = new StatsFrame("Spieler 1 Stats",spieler1);
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setSize(800,900);
        frame.setVisible( true );
       
    
        }
        if(evt.getActionCommand().equals( "Spieler2 Stats" ))
        {
         StatsFrame frame = new StatsFrame("Spieler 2 Stats",spieler2);
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setSize(800,900);
        frame.setVisible( true );
      
            
    
        }
    	}
    	spieler1 = spieleManager.getSpieler1();
        spieler2 = spieleManager.getSpieler2();
        LebenSpieler2.setText(spieler2.getShortName()+" Leben: "+ spieler2.getLeben());
        LebenSpieler1.setText(spieler1.getShortName()+" Leben: "+ spieler1.getLeben());
        Faehigkeit1spieler1.setText(spieler1.getFaehigkeit1());
        Faehigkeit2spieler1.setText(spieler1.getFaehigkeit2());
        Faehigkeit3spieler1.setText(spieler1.getFaehigkeit3());
        Faehigkeit4spieler1.setText(spieler1.getFaehigkeit4());
        Faehigkeit1spieler2.setText(spieler2.getFaehigkeit1());
        Faehigkeit2spieler2.setText(spieler2.getFaehigkeit2());
        Faehigkeit3spieler2.setText(spieler2.getFaehigkeit3());
        Faehigkeit4spieler2.setText(spieler2.getFaehigkeit4());
        spieler2Wechsel2.setText("Wechseln zu: "+this.spieleManager.getSpieler2third().getName());
        spieler1Wechsel2.setText("Wechseln zu: "+this.spieleManager.getSpieler1third().getName());
        spieler2Wechsel.setText("Wechseln zu: "+this.spieleManager.getSpieler2sec().getName());
        spieler1Wechsel.setText("Wechseln zu: "+this.spieleManager.getSpieler1sec().getName());
        repaint();
        
        
    }
    
    public static void AktionDurchgefuehrt(String AktionUebergeben, int firstOrSecond)
    {
        if(firstOrSecond==1)
        {
        Aktion.setText("Spieler1: "+AktionUebergeben+".");
        
        }
        if(firstOrSecond==2)
        {
        Aktion2.setText("Spieler2: "+AktionUebergeben+".");
        
        }
        
        ichSelbst.actionPerformed(null );
        
    }
    
    
    
}



class StatsFrame extends JFrame implements ActionListener
{
    JLabel Name;
    JLabel Schaden;
    JLabel Ruestung;
    JLabel Schnelligkeit;
    JLabel Kampfbereit;
    JLabel Faehigkeit1;
    JLabel Faehigkeit2;
    JLabel Faehigkeit3;
    JLabel Faehigkeit4;
    JLabel Faehigkeit5;
    JLabel Faehigkeit5Wert;
    StatsFrame(String title,Spieler spieler)
    {
        super(title);
        setLayout(null);
        Name = new JLabel(spieler.getName());
        Name.setBounds(50,60,750,50);
        add(Name);
        Schaden = new JLabel("Schaden: "+spieler.getSchaden());
        Schaden.setBounds(50,120,750,50);
        add(Schaden);
        Ruestung = new JLabel("Ruestung: "+spieler.getRuestung());
        Ruestung.setBounds(50,180,750,50);
        add(Ruestung);
        Schnelligkeit = new JLabel("Schnelligkeit: "+spieler.getSchnelligkeit());
        Schnelligkeit.setBounds(50,240,750,50);
        add(Schnelligkeit);
        Kampfbereit = new JLabel("");
        if(spieler.getKampfbereit())
        {
        Kampfbereit.setText("Ich bin Kampfbereit");}else{Kampfbereit.setText("Ich bin nicht Kampfbereit");}
       Kampfbereit.setBounds(50,300,750,50);
        add(Kampfbereit);
        Faehigkeit1 = new JLabel(spieler.getFaehigkeit1()+": " + spieler.getFaehigkeit1besc());
        Faehigkeit1.setBounds(50,360,750,50);
        add(Faehigkeit1);
        Faehigkeit2 = new JLabel(spieler.getFaehigkeit2()+": " + spieler.getFaehigkeit2besc());
        Faehigkeit2.setBounds(50,420,750,50);
        add(Faehigkeit2);
        Faehigkeit3 = new JLabel(spieler.getFaehigkeit3()+": " + spieler.getFaehigkeit3besc());
        Faehigkeit3.setBounds(50,480,750,50);
        add(Faehigkeit3);
        Faehigkeit4 = new JLabel(spieler.getFaehigkeit4()+": " + spieler.getFaehigkeit4besc());
        Faehigkeit4.setBounds(50,540,750,50);
        add(Faehigkeit4);
        
        if(!(spieler.getExtraFaehigkeitbesc()==null))
        {
           Faehigkeit5 = new JLabel("Passive: "+ spieler.getExtraFaehigkeitbesc());
           Faehigkeit5.setBounds(50,600,750,50);
           add(Faehigkeit5);
           
           Faehigkeit5Wert = new JLabel(spieler.getExtraFaehigkeit()+": "+spieler.getSpezial());
           Faehigkeit5Wert.setBounds(50,660,750,50);
           add(Faehigkeit5Wert);
        }
        
       
    }
 public void actionPerformed(ActionEvent evt) {
     

}
}

