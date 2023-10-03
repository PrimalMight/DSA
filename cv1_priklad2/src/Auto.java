public class Auto {
    public String nazev;
    public String znacka;
    public int cena;
    public Auto vlevo;
    
    private final String win;
    

    public Auto(String nazev, String win, String znacka, int cena, Auto vlevo) {
        this.nazev = nazev;
        this.win = win;
        this.znacka = znacka;
        this.cena = cena;
        this.vlevo = vlevo;
    }

}
