package Navi;

abstract public class Barca{
	private String nomeBarca, nomeProprietario;
	private double stazza;

	public Barca(String nomeBarca, double stazza, String nomeProprietario)
	{
		this.nomeBarca = nomeBarca;
		this.stazza = stazza;
		this.nomeProprietario = nomeProprietario;
	}

	public String getNomeBarca() {return nomeBarca;}
	public double getStazza() {return stazza;}
	public String getNomeProprietario() {return nomeProprietario;}

	public String toString()
	{
		return nomeBarca +" - "+ nomeProprietario +"\nStazza: "+ stazza;
	}
}