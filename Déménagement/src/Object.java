public class Object {
    private int id;
    private String nom;
    private String category;
    public float largeur;
    public float longeur;

    public Object(int id, String nom, String category, float largeur,float longeur) {
        this.id = id;
        this.nom = nom;
        this.category = category;
        this.largeur = largeur;
        this.longeur = longeur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getLargeur() {
        return largeur;
    }

    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    public float getLongeur() {
        return longeur;
    }

    public void setLongeur(float longeur) {
        this.longeur = longeur;
    }

    @Override
    public String toString() {
        return "Object{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", category='" + category + '\'' +
                ", largeur=" + largeur +
                ", longeur=" + longeur +
                '}';
    }
}

