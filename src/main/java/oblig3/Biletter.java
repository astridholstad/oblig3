package oblig3;

public class Biletter {

    private int id;
    private String film;
    private int antall;
    private String forNavn;
    private String etterNavn;
    private String telefonNr;
    private String email;

    public Biletter(int id, String film, int antall, String forNavn, String etterNavn, String telefonNr, String email){
        this.id = id;
        this.film = film;
        this.antall = antall;
        this.forNavn = forNavn;
        this.etterNavn = etterNavn;
        this.telefonNr = telefonNr;
        this.email = email;
    }
    public Biletter(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public String getForNavn() {
        return forNavn;
    }

    public void setForNavn(String forNavn) {
        this.forNavn = forNavn;
    }

    public String getEtterNavn() {
        return etterNavn;
    }

    public void setEtterNavn(String etterNavn) {
        this.etterNavn = etterNavn;
    }

    public String getTelefonNr() {
        return telefonNr;
    }

    public void setTelefonNr(String telefonNr) {
        this.telefonNr = telefonNr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
