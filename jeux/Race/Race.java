package jeux.Race;

import jeux.Stat.StatistiqueBonus;

/**
 * Race
 */
public class Race {

	// Propriétés :

	private String nom, description;

	private StatistiqueBonus forceBonus, intelligenceBonus, agiliteBonus, dexteriteBonus, constitutionBonus;

	// Constructeur :

	public Race(String nom, String description, StatistiqueBonus forceBonus, StatistiqueBonus intelligenceBonus,
			StatistiqueBonus agiliteBonus, StatistiqueBonus dexteriteBonus, StatistiqueBonus constitutionBonus) {
		this.nom = nom;
		this.description = description;
		this.forceBonus = forceBonus;
		this.intelligenceBonus = intelligenceBonus;
		this.agiliteBonus = agiliteBonus;
		this.dexteriteBonus = dexteriteBonus;
		this.constitutionBonus = constitutionBonus;
	}

	// Getters :

	public String getNom() {
		return nom;
	}

	public String getDescription() {
		return description;
	}

	public StatistiqueBonus getForceBonus() {
		return forceBonus;
	}

	public StatistiqueBonus getIntelligenceBonus() {
		return intelligenceBonus;
	}

	public StatistiqueBonus getAgiliteBonus() {
		return agiliteBonus;
	}

	public StatistiqueBonus getDexteriteBonus() {
		return dexteriteBonus;
	}

	public StatistiqueBonus getConstitutionBonus() {
		return constitutionBonus;
	}

	// Setters :

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setForceBonus(StatistiqueBonus forceBonus) {
		this.forceBonus = forceBonus;
	}

	public void setIntelligenceBonus(StatistiqueBonus intelligenceBonus) {
		this.intelligenceBonus = intelligenceBonus;
	}

	public void setAgiliteBonus(StatistiqueBonus agiliteBonus) {
		this.agiliteBonus = agiliteBonus;
	}

	public void setDexteriteBonus(StatistiqueBonus dexteriteBonus) {
		this.dexteriteBonus = dexteriteBonus;
	}

	public void setConstitutionBonus(StatistiqueBonus constitutionBonus) {
		this.constitutionBonus = constitutionBonus;
	}

	// Override
	// toString :

	@Override
	public String toString() {
		return "Race [nom=" + nom + ", description=" + description + ", forceBonus=" + forceBonus
				+ ", intelligenceBonus=" + intelligenceBonus + ", agiliteBonus=" + agiliteBonus + ", dexteriteBonus="
				+ dexteriteBonus + ", constitutionBonus=" + constitutionBonus + "]";
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
		Race other = (Race) obj;
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
		if (forceBonus == null) {
			if (other.forceBonus != null)
				return false;
		} else if (!forceBonus.equals(other.forceBonus))
			return false;
		if (intelligenceBonus == null) {
			if (other.intelligenceBonus != null)
				return false;
		} else if (!intelligenceBonus.equals(other.intelligenceBonus))
			return false;
		if (agiliteBonus == null) {
			if (other.agiliteBonus != null)
				return false;
		} else if (!agiliteBonus.equals(other.agiliteBonus))
			return false;
		if (dexteriteBonus == null) {
			if (other.dexteriteBonus != null)
				return false;
		} else if (!dexteriteBonus.equals(other.dexteriteBonus))
			return false;
		if (constitutionBonus == null) {
			if (other.constitutionBonus != null)
				return false;
		} else if (!constitutionBonus.equals(other.constitutionBonus))
			return false;
		return true;
	}

	

}