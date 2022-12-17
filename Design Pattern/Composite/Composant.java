package Composite;

public abstract class Composant {

	protected String nom;
	protected int niveau;
	public abstract void operation();
	public Composant(String nom, int niveau) {
		super();
		this.nom = nom;
		this.niveau = niveau;
	}
	
}
