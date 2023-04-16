package jeux.Race;

import jeux.Stat.StatistiqueBonus;

/**
 * Humain
 */
public class Humain extends Race {

	// Constructeur :

	public Humain(String nom, String description, StatistiqueBonus forceBonus, StatistiqueBonus intelligenceBonus,
	StatistiqueBonus agiliteBonus, StatistiqueBonus dexteriteBonus, StatistiqueBonus constitutionBonus) {

		super("Humain",

		"Un humain est un personnage classique, sans traits physiques particuliers. Ils se battent autant avec des armes blanches qu'avec des armes à distance ou encore avec la magie.",

		new StatistiqueBonus(5),

		new StatistiqueBonus(5),

		new StatistiqueBonus(5),

		new StatistiqueBonus(5),

		new StatistiqueBonus(5)

		);
	}
}