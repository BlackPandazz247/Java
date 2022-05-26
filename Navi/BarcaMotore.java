package Navi;

public class BarcaMotore extends Barca{
	private int cvNominali;

	public BarcaMotore(String nomeBarca, double stazza, String nomeProprietario, int cvNominali)
	{
		super(nomeBarca, stazza, nomeProprietario);
		this.cvNominali = cvNominali;
	}

	public int getPotenza() {return cvNominali;}

	public String toString()
	{
		return super.toString() +"\nCavalli: "+ cvNominali;
	}
}