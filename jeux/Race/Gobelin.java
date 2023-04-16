package jeux.Race;

import jeux.Stat.StatistiqueBonus;

/**
 * Gobelin
 */
public class Gobelin extends Race {

	// Constructeur :

	public Gobelin(String nom, String description, StatistiqueBonus forceBonus, StatistiqueBonus intelligenceBonus,
	StatistiqueBonus agiliteBonus, StatistiqueBonus dexteriteBonus, StatistiqueBonus constitutionBonus) {

		super("Gobelin",

		"Les gobelins sont de petite taille, similaire à celle des nains mais plus maigres. Ils sont vicieux et sebattent avec de petites armes comme le poignard.",

		new StatistiqueBonus(0),

		new StatistiqueBonus(0),

		new StatistiqueBonus(0),

		new StatistiqueBonus(0),

		new StatistiqueBonus(5)

		);
	}
}