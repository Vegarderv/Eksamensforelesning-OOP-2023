package abakus.app.modifikatorer;

public class StaticKlasse {

    static int commonId = 1;
    public int ownId;

    public StaticKlasse() {
        ownId = commonId;
        System.out.println(ownId);
        commonId += 1;
    }

    public static int getId() {
        return commonId;
    }

    public static void main(String[] args) {
        StaticKlasse klasse1 = new StaticKlasse();        
        StaticKlasse klasse2 = new StaticKlasse();        
        StaticKlasse klasse3 = new StaticKlasse();        
        StaticKlasse klasse4 = new StaticKlasse();
        StaticKlasse.getId();        
    }
    
}
