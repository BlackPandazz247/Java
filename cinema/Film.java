package cinema;

public class Film{
    //attributi
    private String titolo, regista, genere;
    private int sala;  

    //costruttore
    public Film(String titolo, String regista, String genere, int sala)
    {
        setTitolo(titolo);
        setRegista(regista);
        setGenere(genere);
        setSala(sala);
    }

    //costruttore di copia
    public Film(Film f)
    {
        setTitolo(f.getTitolo());
        setRegista(f.getRegista());
        setGenere(f.getGenere());
        setSala(f.getSala());
    }

    //set
    private void setTitolo(String titolo) {this.titolo = titolo;}
    private void setRegista(String regista) {this.regista = regista;}
    private void setGenere(String genere) {this.genere = genere;}
    private void setSala(int sala) {this.sala = sala;}
    //get
    public String getTitolo() {return titolo;}
    public String getRegista() {return regista;}
    public String getGenere() {return genere;}
    public int getSala() {return sala;}

    //metodo che restituisce una stringa che descrive tutti gli attributi dell'oggetto
    public String toString()
    {
        return "\n'"+ titolo +"' di "+ regista +"\nGenere: "+ genere +"\nSala: "+ sala;
    }

    public void cambiaSala(int sala)
    {
        setSala(sala);
    }
}