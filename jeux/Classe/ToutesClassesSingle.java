package jeux.Classe;

import jeux.Sort;
import jeux.Stat.StatistiqueBonus;

/**
 * ToutesClassesSingle
 */
public final class ToutesClassesSingle {

	private static ToutesClassesSingle instance;

	// Constructeur privé :

	private ToutesClassesSingle() {
	}

	// Constructeur :

    public static jeux.Classe.ToutesClassesSingle getInstance() {

        if (instance == null) {

            instance = new ToutesClassesSingle();
        }
        return instance;
    }

	// Déclaration des différentes classes

	// 1) Archer :

	private Classe archer = new Classe"Archer",
	"Comme le dit son nom, l'archer utilise un arc. Il peut également utiliser une arbalète. Il a une vision très puissante pour viser de petites cibles. Sa force réside dans son agilité, mais sa constitution est plus faible.",
	new StatistiqueBonus(-2),
	new StatistiqueBonus(0),
	new StatistiqueBonus(3),
	new StatistiqueBonus(2),
	new StatistiqueBonus(1),
	new Sort(null, null, 0, 0, 0, 0, false)

	);

	// 2) Guerrier :

private Classe guerrier = new Classe("Guerrier",
	"Le guerrier est fort dans les attaques de mêlées. Il utilise le plus souvent une épée. Ses atouts sont principalement sa force pour soulever des armes lourdes et sa constitution pour encaisser les coups et porter de l'équipement.",
	new StatistiqueBonus(2),
	new StatistiqueBonus(0),
	new StatistiqueBonus(-2),
	new StatistiqueBonus(1),
	new StatistiqueBonus(3),
	new Sort(null, null, 0, 0, 0, 0, false)

	);

	// 3) Mage :

private Classe mage = new Classe("Mage",
	"Le mage utilise principalement la magie. Il peut néanmoins utiliser une dague ou un poignard si le mana est épuisé. Il lance ses sorts le plus souvent à distance, c'est pourquoi il aura de l'intelligence mais peu de force.",
	new StatistiqueBonus(-2),
	new StatistiqueBonus(3),
	new StatistiqueBonus(0),
	new StatistiqueBonus(1),
	new StatistiqueBonus(2),
	new Sort(null, null, 0, 0, 0, 0, false)

	);

	// 4) Voleur :

private Classe voleur = new Classe("Voleur",
	"Le voleur est souvent utilisé pour sa furetivité. Il peut s'approcher très près de l'ennemi mais restera toujours dans l'ombre pour être le moins visible possible. Son arme de prédilection est le poignard mais il peut aussi utiliser une dague. Ils sont aussi doués pour détecter et désamorcer les pièges, sauf les pièges magiques, ils ont peur de finir en tas de cendres.",
	new StatistiqueBonus(-2),
	new StatistiqueBonus(1),
	new StatistiqueBonus(2),
	new StatistiqueBonus(3),
	new StatistiqueBonus(0),
	new Sort(null, null, 0, 0, 0, 0, false)

	);
}