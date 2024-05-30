package modell;

public class Csigusz {
    
  
    
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String BLUE = "\u001B[34m";
    private String nev;
    private Szinek szinNev;
    private String szinKod; 
    public Csigusz(String nev, Szinek szinNev)throws Exception{
        //this.nev = nev;
        setNev(nev);
        this.szinNev = szinNev;
        setSzin();
    }
    public enum Szinek{PIROS, ZOLD, KEK};

    private void setNev(String nev) throws Exception{
        if (nev.length() >= 3) {
            char nevElso = nev.charAt(0);
            if (Character.isLowerCase(nevElso)) {
                nevElso = Character.toUpperCase(nevElso);
                nev = nevElso + nev.substring(1);
            }
            this.nev = nev;
        } else {
            throw new Exception("A név túl rövid!");
        }
        
    }
    public String getNev() {
        return nev;
    }

    public Szinek getSzin() {
        return szinNev;
    }
    public Csigusz(String nev) throws Exception{
        this(nev,Szinek.PIROS);
        setSzin();
//        this.nev = nev;
//        this.szin = "fekete";
    }
    public Csigusz() throws Exception{ 
        this("Csigusz tho", Szinek.PIROS);
        setSzin();

    }

    @Override
    public String toString() {
        setSzin();
        return szinKod + "Csigusz{" + "nev=" + nev + ", szin=" + szinNev + '}' + RESET;
    }

    private void setSzin() {
        switch(szinNev){
            case PIROS:
                szinKod = Csigusz.RED;
            case KEK:
                szinKod = Csigusz.BLUE;
            case ZOLD:
                szinKod = Csigusz.GREEN;
        }
    }
    
    
}
