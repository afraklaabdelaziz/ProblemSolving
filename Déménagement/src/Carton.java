import java.util.HashMap;

public class Carton {
    private  int id ;
    public float largeur;
    public float longeur;
    private String type ;
    private String gategory;

    private HashMap<Integer, Object> objects = new HashMap<>();

    public Carton(){}
    public Carton(int id, float longeur,float largeur, String type, String gategory) {
        this.id = id;
        this.longeur = longeur;
        this.largeur = largeur;
        this.type = type;
        this.gategory = gategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGategory() {
        return gategory;
    }

    public void setGategory(String gategory) {
        this.gategory = gategory;
    }

    public HashMap<Integer, Object> getObjects() {
        return objects;
    }

    public void setObjects(HashMap<Integer, Object> objects) {
        this.objects = objects;
    }

    @Override
    public String toString() {
        return "Carton{" +
                "id=" + id +
                ", largeur=" + largeur +
                ", longeur=" + longeur +
                ", type='" + type + '\'' +
                ", gategory='" + gategory + '\'' +
                ", objects=" + objects +
                '}';
    }
}
