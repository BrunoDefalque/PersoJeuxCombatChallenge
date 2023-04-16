package jeux.Race;

import jeux.Stat.StatistiqueBonus;

/**

* ToutesRacesSingle
 */
public final class ToutesRacesSingle {

	private static ToutesRacesSingle instance;

	// Constructeur privé :

	private ToutesRacesSingle() {

	}

	// Constructeur :

	public static ToutesRacesSingle getInstance() {

		if (instance == null) {

			instance = new ToutesRacesSingle();
		}
		return instance;
	}

	// Déclaration des différentes Races :

	// 1) Elfe :

	private Race elfe = new Race("Elfe",

	"L'elfe est longiligne avec des oreilles pointues. ses principals atouts sont l'agilité et la furtivité. Il a une bonne capacité de visée qui permet une attaque à distance efficace.",

	new StatistiqueBonus(-2),

	new StatistiqueBonus(0),

	new StatistiqueBonus(1),

	new StatistiqueBonus(2),

	new StatistiqueBonus(-1)

	);

	// 2) Gobelin :

	private Race gobelin = new Race("Gobelin",

	"Les gobelins sont de petite taille, similaire à celle des nains mais plus maigres. Ils sont vicieux et se battent avec de petites armes comme le poignard.",

	new StatistiqueBonus(-2),

	new StatistiqueBonus(0),

	new StatistiqueBonus(2),

	new StatistiqueBonus(2),

	new StatistiqueBonus(-2)

	);

	// 3) Humain :

	private  Race humain = new Race("Humain",

	"Un humain est un personnage classique, sans traits physiques particuliers. Ils se battent autant avec des armes blanches qu'avec des armes à distance ou encore avec la magie.",

	new StatistiqueBonus(0),

	new StatistiqueBonus(0),

	new StatistiqueBonus(0),

	new StatistiqueBonus(0),

	new StatistiqueBonus(0)

	);

	// 4) Nain :

	private Race nain = new Race("Nain",

	"Les nains sont de petite taille mais ils sont plus trapus que les gobelins. Leur atouts sont la force physique et leur intelligence. Ils combattent généralement à la hache ou au marteau.",

	new StatistiqueBonus(2),

	new StatistiqueBonus(1),

	new StatistiqueBonus(-2),

	new StatistiqueBonus(-1),

	new StatistiqueBonus(0)

	);

	// 5) Troll :

	private Race troll = new Race("Troll",

	"Le troll est de très grande taille. Grâce à sa constitution robuste, il peut encaisser de fortes attaques. Il n'a pas besoin d'armes pour se battre car il possède aussi de grandes griffes.",

	new StatistiqueBonus(1),

	new StatistiqueBonus(-2),

	new StatistiqueBonus(-1),

	new StatistiqueBonus(-0),

	new StatistiqueBonus(2)

	);

	// Getters :

	public Race getElfe() {
		return elfe;
	}

	public Race getGobelin() {
		return gobelin;
	}

	public Race getHumain() {
		return humain;
	}

	public Race getNain() {
		return nain;
	}

	public Race getTroll() {
		return troll;
	}

	// Setters :

	public static void setInstance(ToutesRacesSingle instance) {
		ToutesRacesSingle.instance = instance;
	}

	public void setElfe(Race elfe) {
		this.elfe = elfe;
	}

	public void setGobelin(Race gobelin) {
		this.gobelin = gobelin;
	}

	public void setHumain(Race humain) {
		this.humain = humain;
	}

	public void setNain(Race nain) {
		this.nain = nain;
	}

	public void setTroll(Race troll) {
		this.troll = troll;
	}
}