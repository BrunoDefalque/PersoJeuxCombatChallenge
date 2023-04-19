package jeux.Classe;

import jeux.Sort;
import jeux.Stat.StatistiqueBonus;

/**
 * Archer
 */
public class Archer extends Classe {

	public Archer(String nom, String description, StatistiqueBonus forceBonus, StatistiqueBonus intelligenceBonus, StatistiqueBonus agiliteBonus, StatistiqueBonus dexteriteBonus, StatistiqueBonus constitutionBonus, Sort sort) {

		super("Archer", "C'est un archer", forceBonus, intelligenceBonus, agiliteBonus, dexteriteBonus, constitutionBonus, sort);
	}
}