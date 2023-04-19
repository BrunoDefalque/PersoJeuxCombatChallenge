package jeux.Classe;

import jeux.Sort;
import jeux.Stat.StatistiqueBonus;

/**
 * Classe
 */
public class Classe {

	// Propriétés :

	private String nom, description;

	private StatistiqueBonus forceBonus, intelligenceBonus, agiliteBonus, dexteriteBonus, constitutionBonus;

	private Sort sort;

	// Constructeur :

	public Classe(String nom, String description, StatistiqueBonus forceBonus, StatistiqueBonus intelligenceBonus, StatistiqueBonus agiliteBonus, StatistiqueBonus dexteriteBonus, StatistiqueBonus constitutionBonus, Sort sort) {
		this.nom = nom;
		this.description = description;
		this.forceBonus = forceBonus;
		this.intelligenceBonus = intelligenceBonus;
		this.agiliteBonus = agiliteBonus;
		this.dexteriteBonus = dexteriteBonus;
		this.constitutionBonus = constitutionBonus;
		this.sort = sort;
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

	public Sort getSort() {
		return sort;
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

	public void setSort(Sort sort) {
		this.sort = sort;
	}

	// Override

	@Override
	public java.lang.String toString() {
		return "Classe{" +
				"nom='" + nom + '\'' +
				", description='" + description + '\'' +
				", forceBonus=" + forceBonus +
				", intelligenceBonus=" + intelligenceBonus +
				", agiliteBonus=" + agiliteBonus +
				", dexteriteBonus=" + dexteriteBonus +
				", constitutionBonus=" + constitutionBonus +
				", sort=" + sort +
				'}';
	}

	// Equales :

	@Override

	public boolean equals(Object object) {
		if (this == object) return true;
		if (object == null || getClass() != object.getClass()) return false;
		if (!super.equals(object)) return false;
		Classe classe = (Classe) object;
		return java.util.Objects.equals(nom, classe.nom) && java.util.Objects.equals(description, classe.description) && java.util.Objects.equals(forceBonus, classe.forceBonus) && java.util.Objects.equals(intelligenceBonus, classe.intelligenceBonus) && java.util.Objects.equals(agiliteBonus, classe.agiliteBonus) && java.util.Objects.equals(dexteriteBonus, classe.dexteriteBonus) && java.util.Objects.equals(constitutionBonus, classe.constitutionBonus) && java.util.Objects.equals(sort, classe.sort);
	}
}