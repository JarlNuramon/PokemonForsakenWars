

/**
 * Write a description of class Spieler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spieler
{
    String name;
     int leben;
     int alterSchaden;
    int alteGeschw;
    int alteRuestung;
     int schaden;
     int schnelligkeit;
     int ruestung;
     int spezial;
     String faehigkeit1Beschreibung;
     String faehigkeit2Beschreibung;
     String faehigkeit3Beschreibung;
     String faehigkeit4Beschreibung;
     String extraFaehigkeit;
     String extraFaehigkeitBeschreibung;
     String faehigkeit1;
     String faehigkeit2;
     String faehigkeit3;
     String faehigkeit4;
     String Status;
     String[] shortName;
     boolean kampfbereit=false;
    Klasse meineKlasse;
    public enum Klasse
    {
    MAGIER,
    KRIEGER,
    ASSASINE,
    RITTER
    
    }
    public Spieler(String name,int leben,int schaden,int schnelligkeit,int ruestung,Klasse meineKlasse)//Dies ist der Konstruktor.Mit ihm kannst du bei erstellen eines Objekt der Klasse, dem Objekt Werte zuweisen.
    {
        this.leben = leben;
        this.schaden = schaden;
        this.schnelligkeit = schnelligkeit;
        this.ruestung = ruestung;
        this.name = name;
        this.meineKlasse = meineKlasse;
        this.shortName = name.split(",",2);
        switch(this.meineKlasse)
        {
        case MAGIER: 
        this.leben -=1;
        this.schaden +=2;
        this.schnelligkeit +=0;
        this.ruestung+=2;
        
        break;
        case KRIEGER: 
        this.leben +=3;
        this.schaden +=1;
        this.schnelligkeit +=0;
        this.ruestung+=2;
        break;
        case ASSASINE: 
        this.leben -=2;
        this.schaden +=2;
        this.schnelligkeit +=3;
        this.ruestung+=2;
        break;
        case RITTER: 
        this.leben +=4;
        this.schaden +=0;
        this.schnelligkeit +=0;
        this.ruestung+=3;
        break;
    }
    }
    
    public int getLeben()//Bei einer Rueckgabe muss der Datentyp des Zurueckgegeben Wertes in der Methode stehen
    { 
    return leben;// Eine Funktion die ein Wert zurueckgeben soll, muss immer ein Return besitzten, welches zu jederzeit erreichbar ist und ein Datentyp der Methode zurueckgeben
    }
    
    public String getFaehigkeit1()//Finde den Fehler und vervollstaendige
    {
    return faehigkeit1;
    }
    public String getFaehigkeit2()//Finde den Fehler und vervollstaendige
    {
    return faehigkeit2;
    }
    public String getFaehigkeit3()//Finde den Fehler und vervollstaendige
    {
    return faehigkeit3;
    }
    public String getFaehigkeit4()//Finde den Fehler und vervollstaendige
    {
    return faehigkeit4;
    }
    public String getName()//Finde den Fehler und vervollstaendige
    {
    return name;
    }
    public String getShortName()//Finde den Fehler und vervollstaendige
    {
    return shortName[0];
    }
    public String getExtraFaehigkeit()
    {
    return extraFaehigkeit;
    }
     public String getExtraFaehigkeitbesc()
    {
    return extraFaehigkeitBeschreibung;
    }
    public String getFaehigkeit1besc()//Finde den Fehler und vervollstaendige
    {
    return faehigkeit1Beschreibung;
    }
    public String getFaehigkeit2besc()//Finde den Fehler und vervollstaendige
    {
    return faehigkeit2Beschreibung;
    }
    public String getFaehigkeit3besc()//Finde den Fehler und vervollstaendige
    {
    return faehigkeit3Beschreibung;
    }
    public String getFaehigkeit4besc()//Finde den Fehler und vervollstaendige
    {
    return faehigkeit4Beschreibung;
    }
   
  public int getSpezial()
   {
    return spezial;
    }
    public int getSchaden()
   {
    return schaden;
    }
   
    public int getSchnelligkeit()
     {
        return schnelligkeit;
     }
      
     public int getRuestung ()
      {
        return ruestung;
        }
        
        public boolean getKampfbereit()
        {
             return kampfbereit;
        }
        
        public int getAlterSchaden()
        {return alterSchaden;}
        public int getAlteRuestung()
        {return alteRuestung;}
        public int getAlteGeschw()
        {return alteGeschw;}
        public void setAlterSchaden(int value)
        { alterSchaden=value;}
        public void setAlteRuestung(int value)
        { alteRuestung=value;}
        public void setAlteGeschw(int value)
        { alteGeschw=value;}
    public void setMeineKlasse(Klasse neuMeineKlasse)
    {
    meineKlasse = neuMeineKlasse;
    
    
    }
    //Erstlle set Befehle^^.
    public void setLeben(int neuesLeben)
    {
    leben -= neuesLeben;
    }
    
    public void setSchnelligkeit (int neueSchnelligkeit)
    {
        schnelligkeit = neueSchnelligkeit;
    }
    
    public void setSchaden (int neuerSchaden)
    {
       schaden = neuerSchaden;
    }
    
    public void setRuestung (int neuerRuestung)
    {
       ruestung = neuerRuestung;
    }
    
    public void setKampfbereit (boolean neueKampfbereitschaft)
    {
      kampfbereit = neueKampfbereitschaft;
    }
    
    //Die Subklassen benutzten das
    public void Reset()
    {}
    public void Faehigkeit1()
    {}
    public void Faehigkeit2()
    {}
     public void Faehigkeit3()
    {}
    public void Faehigkeit4()
    {}
    public void setStatus(String neuerStatus)
    {
    Status = neuerStatus;
    }
     public String getStatus()
    {
    return Status;
    }
    public void StatusReaktion()
    {
    if(Status=="Gift")
    {
    leben-=1;
    }
    if(Status=="Laehmung")
    {
    schnelligkeit-=2;
    }
    if(Status=="Blutung")
    {
    schnelligkeit-=1;
    leben-=1;
    ruestung-=1;
    }
    }
    
    
        
}
