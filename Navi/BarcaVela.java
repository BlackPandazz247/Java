package Navi;

public class BarcaVela extends Barca{
	private double superficieVelica;

	public BarcaVela(String nomeBarca, double stazza, String nomeProprietario, double superficieVelica)
	{
		super(nomeBarca, stazza, nomeProprietario);
		this.superficieVelica = superficieVelica;
	}

	public double getSuperficieVelica() {return superficieVelica;}

	public String toString()
	{
		return super.toString() +"\nSuperficie velica: "+ superficieVelica;
	}
}