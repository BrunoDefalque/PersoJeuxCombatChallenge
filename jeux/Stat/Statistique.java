package jeux.Stat;

/**
 * Statistique
 */
public class Statistique {

	// Propriétés :

	private String nom, description;

	private int valeur;

	// Constructeur :

	public Statistique(String nom, String description, int valeur) {
		this.nom = nom;
		this.description = description;
		this.valeur = valeur;
	}

	// Getters :

	public String getNom() {
		return nom;
	}

	public String getDescription() {
		return description;
	}

	public int getValeur() {
		return valeur;
	}

	// Setters :

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	// Override
	// toString :

	@Override
	public String toString() {
		return "Statistique [nom=" + nom + ", description=" + description + ", valeur=" + valeur + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + valeur;
		return result;
	}

	// Equales :

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Statistique other = (Statistique) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (valeur != other.valeur)
			return false;
		return true;
	}
}