package jeux.Stat;

/**
 * Constitution
 */
public class Constitution extends Statistique {

	// Constructeur :

	public Constitution(int valeur) {

		super("Constitution", "Statistiques prise en compte pour les actions qui demande de la resistance physique (ne pas se blesser quand il se prend un piège, ne pas se faire empoisonner, resister aux maladies,...). Augmente le nombre total de point de vie, la qualité des armures qu'il peut porter et la resistance aux dégâts.", valeur);
	}
}