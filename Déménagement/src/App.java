import java.util.HashMap;
import java.util.Scanner;

public class App {
    static HashMap<Integer, Carton> cartons = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public  void creatCarton(){
        System.out.println("Donner id de carton");
        int idCarton = sc.nextInt();
        System.out.println("Donner largeur de carton");
        float largeurCarton = sc.nextFloat();
        System.out.println("Donner longeur de carton");
        float longeurCarton = sc.nextFloat();
        System.out.println("Donner category de carton");
        String categoryCarton = sc.next();
        System.out.println("Donner type de Category de carton");
        String typeCategory = sc.next();
        Carton carton = new Carton(idCarton,longeurCarton,largeurCarton,typeCategory,categoryCarton);
        cartons.put(idCarton,carton);
}
}
