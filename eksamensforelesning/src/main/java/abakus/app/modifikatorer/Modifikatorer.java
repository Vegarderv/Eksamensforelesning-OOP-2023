package abakus.app.modifikatorer;

public class Modifikatorer {
    public int publicTall = 5;
    private int privateTall = 5;
    public final int finalTall = 5;
    public static int staticTall = 5;

    public static void main(String[] args) {
        Modifikatorer modifikator1 = new Modifikatorer();
        Modifikatorer modifikator2 = new Modifikatorer();
    
        System.out.println(modifikator1.publicTall);
        modifikator1.publicTall = 3;
        System.out.println(modifikator1.publicTall);

        // modifikator1.finalTall = 3;

        modifikator1.staticTall = 21;
        System.out.println(modifikator2.staticTall);

    }
    
    
}


