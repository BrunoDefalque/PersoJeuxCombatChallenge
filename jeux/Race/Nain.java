package jeux.Race;

import jeux.Stat.StatistiqueBonus;

/**
 * Nain
 */
public class Nain extends Race {

	// Constructeur :

	public Nain(String nom, String description, StatistiqueBonus forceBonus, StatistiqueBonus intelligenceBonus,
	StatistiqueBonus agiliteBonus, StatistiqueBonus dexteriteBonus, StatistiqueBonus constitutionBonus){

		super("Nain,",

		"Les nains sont de petite taille mais ils sont plus trapus que les gobelins. Leur atouts sont la force physique et leur intelligence. Ils combattent généralement à la hache ou au marteau.",

		new StatistiqueBonus(0),

		new StatistiqueBonus(0),

		new StatistiqueBonus(0),

		new StatistiqueBonus(0),

		new StatistiqueBonus(0)

		);
	}
}