package jeux.Classe;

import jeux.Sort;
import jeux.Stat.StatistiqueBonus;

/**
 * Guerrier
 */
public class Guerrier extends Classe {

	public Guerrier(String nom, String description, StatistiqueBonus forceBonus, StatistiqueBonus intelligenceBonus, StatistiqueBonus agiliteBonus, StatistiqueBonus dexteriteBonus, StatistiqueBonus constitutionBonus, Sort sort) {

		super("Guerrier", "Le barbare est formé au maniement de toutes les armes courantes et de guerre, ainsi qu'au port des armures légères et intermédiaires, et à l'utilisation des boucliers (à l'exception des pavois).", forceBonus, intelligenceBonus, agiliteBonus, dexteriteBonus, constitutionBonus, sort);
	}
}