package jeux.Classe;

import jeux.Sort;
import jeux.Stat.StatistiqueBonus;

/**
 * Mage
 */
public class Mage extends Classe {

	public Mage(String nom, String description, StatistiqueBonus forceBonus, StatistiqueBonus intelligenceBonus, StatistiqueBonus agiliteBonus, StatistiqueBonus dexteriteBonus, StatistiqueBonus constitutionBonus, Sort sort) {

		super("mage", "Le mage n'a pas beaucoup d'aptitudes physiques, son domaine de prédilection est la magie sous toutes ses formes. Ses connaissances s'approfondissent dans un ou plusieurs domaine en fonction de l'aventure.", forceBonus, intelligenceBonus, agiliteBonus, dexteriteBonus, constitutionBonus, sort);
	}
}