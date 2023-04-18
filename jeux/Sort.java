package jeux;

/**
 * Sort
 */
public class Sort {

	/ /Propriétés :

	private String nom, description;

	private int niveauObtention, degatMin, degatMax, coutMana;

	private boolean isDegat;

	private Element element;

	// Constructeur :

	public Sort(String nom, String description, int niveauObtention, int degatMin, int degatMax, int coutMana, boolean isDegat, Element element) {
		this.nom = nom;
		this.description = description;
		this.niveauObtention = niveauObtention;
		this.degatMin = degatMin;
		this.degatMax = degatMax;
		this.coutMana = coutMana;
		this.isDegat = isDegat;
		this.element = element;
	}

	// Getters :

	public String getNom() {
		return nom;
	}

	public String getDescription() {
		return description;
	}

	public int getNiveauObtention() {
		return niveauObtention;
	}

	public int getDegatMin() {
		return degatMin;
	}

	public int getDegatMax() {
		return degatMax;
	}

	public int getCoutMana() {
		return coutMana;
	}

	public boolean isDegat() {
		return isDegat;
	}

	public Element getElement() {
		return element;
	}

	//Setters :

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setNiveauObtention(int niveauObtention) {
		this.niveauObtention = niveauObtention;
	}

	public void setDegatMin(int degatMin) {
		this.degatMin = degatMin;
	}

	public void setDegatMax(int degatMax) {
		this.degatMax = degatMax;
	}

	public void setCoutMana(int coutMana) {
		this.coutMana = coutMana;
	}

	public void setDegat(boolean degat) {
		isDegat = degat;
	}

	public void setElement(Element element) {
		this.element = element;
	}

	// Override.
	// toString :

	@Override

	public String toString() {

		String returnString = "Nom : " + nom +

		"\nDéscription : " + description +

		"\nNiveau pour le débloquer : " + niveauObtention +

		"\nDégat minimum causé : " + degatMin +

		"\nDégat Maximum causé : " + degatMax +

		"\nLa magie a causé " + coutMana + " vies." +

		"Dégat ? " + isDegat;

		return returnString;
	}

	// Equales :


	public boolean equals(Object object) {
		if (this == object) return true;
		if (object == null || getClass() != object.getClass()) return false;
		if (!super.equals(object)) return false;
		Sort sort = (Sort) object;
		return niveauObtention == sort.niveauObtention && degatMin == sort.degatMin && degatMax == sort.degatMax && coutMana == sort.coutMana && isDegat == sort.isDegat && java.util.Objects.equals(nom, sort.nom) && java.util.Objects.equals(description, sort.description) && java.util.Objects.equals(element, sort.element);
	}

	public int hashCode() {
		return java.util.Objects.hash(super.hashCode(), nom, description, niveauObtention, degatMin, degatMax, coutMana, isDegat, element);
	}
}