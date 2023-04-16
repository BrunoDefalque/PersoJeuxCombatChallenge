package jeux.Race;

import jeux.Stat.StatistiqueBonus;

/**
 * Elfe
 */
public class Elfe extends Race {

	// Constructeur :

	public Elfe(String nom, String description, StatistiqueBonus forceBonus, StatistiqueBonus intelligenceBonus,
			StatistiqueBonus agiliteBonus, StatistiqueBonus dexteriteBonus, StatistiqueBonus constitutionBonus) {

				super("Elfe",

				"L'elfe est longiligne avec des oreilles pointues. ses principals atous sont l'agilité et la furtivité. Il a une bonne capacité de visée qui permet une attaque à distance efficace.",

				new StatistiqueBonus(0),

				new StatistiqueBonus(0),

				new StatistiqueBonus(5),

				new StatistiqueBonus(0),

				new StatistiqueBonus(0)

				);
			}
}