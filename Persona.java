public class Persona{
    //attributi
    private int eta;
    private String sesso, professione, nome;

    //costruttore
    public Persona(int eta, String nome, String sesso, String professione)
    {
        setNome(nome);
        setEta(eta);
        setSesso(sesso);
        setProfessione(professione);
    }

    //costruttore di copia
    public Persona(Persona p)
    {
        setEta(p.getEta());
        setNome(p.getNome());
        setSesso(p.getSesso());
        setProfessione(p.getProfessione());
    }

    //set
    public void setEta(int eta) {this.eta = eta;}
    public void setProfessione(String professione) {this.professione = professione;}
    private void setNome(String nome) {this.nome = nome;}
    private void setSesso(String sesso) {this.sesso = sesso;}
    //get
    public int getEta() {return eta;}
    public String getNome() {return nome;}
    public String getProfessione() {return professione;}
    public String getSesso() {return sesso;}

    public String toString()
    {
        return "Sono una persona di nome:"+ nome +", sesso:"+ sesso +", età:"+ eta +", professione:"+ professione;
    }
}