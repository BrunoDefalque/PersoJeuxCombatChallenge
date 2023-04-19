package jeux.Classe;

import jeux.Sort;
import jeux.Stat.StatistiqueBonus;

/**
 * Voleur
 */
public class Voleur extends Classe {

	public Voleur(String nom, String description, StatistiqueBonus forceBonus, StatistiqueBonus intelligenceBonus, StatistiqueBonus agiliteBonus, StatistiqueBonus dexteriteBonus, StatistiqueBonus constitutionBonus, Sort sort) {

		super("Voleur", "Malgré son nom, ce n'est pas qu'un simple voleur. Grâce à leur furetivité, ils sont doués en espionnage et en assassinat mais ils ont beaucoup d'habileté pour détecter et désamorcer les pièges", forceBonus, intelligenceBonus, agiliteBonus, dexteriteBonus, constitutionBonus, sort);
	}
}