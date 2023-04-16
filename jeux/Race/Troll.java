package jeux.Race;

import jeux.Stat.StatistiqueBonus;

/**
 * Troll
 */
public class Troll extends Race {

	// Constructeur :

	public Troll(String nom, String description, StatistiqueBonus forceBonus, StatistiqueBonus intelligenceBonus,
	StatistiqueBonus agiliteBonus, StatistiqueBonus dexteriteBonus, StatistiqueBonus constitutionBonus) {

		super("Troll",

		"Le troll est de très grande taille. Grâce à sa constitution robuste, il peut encaisser de fortes attaques. Il n'a pas besoin d'armes pour se batre car il possède aussi de grandes griffes.",

		new StatistiqueBonus(0),

		new StatistiqueBonus(0),

		new StatistiqueBonus(0),

		new StatistiqueBonus(0),

		new StatistiqueBonus(0)

		);
	}
}