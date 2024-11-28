import java.util.ArrayList;

abstract class Cosmetice {
    protected String brand;
    protected double pret;
    protected String tip;

    public Cosmetice() {
        this.brand = "Necunoscut";
        this.pret = 0.0;
        this.tip = "Necunoscut";
    }

    public Cosmetice(String brand, double pret, String tip) {
        this.brand = brand;
        this.pret = pret;
        this.tip = tip;
    }

    public Cosmetice(Cosmetice alt) {
        this.brand = alt.brand;
        this.pret = alt.pret;
        this.tip = alt.tip;
    }

    public abstract void afisare();
}

class Sampon extends Cosmetice {
    private String tipPar;

    public Sampon() {
        super();
        this.tipPar = "Necunoscut";
    }

    public Sampon(String brand, double pret, String tipPar) {
        super(brand, pret, "Sampon");
        this.tipPar = tipPar;
    }

    public Sampon(Sampon alt) {
        super(alt);
        this.tipPar = alt.tipPar;
    }

    @Override
    public void afisare() {
        System.out.println("Brand: " + brand + ", Pret: " + pret + ", Tip: " + tip + ", Tip Par: " + tipPar);
    }
}

class CremaFata extends Cosmetice {
    private String tipPiele;

    public CremaFata() {
        super();
        this.tipPiele = "Necunoscut";
    }

    public CremaFata(String brand, double pret, String tipPiele) {
        super(brand, pret, "Crema Fata");
        this.tipPiele = tipPiele;
    }

    public CremaFata(CremaFata alt) {
        super(alt);
        this.tipPiele = alt.tipPiele;
    }

    @Override
    public void afisare() {
        System.out.println("Brand: " + brand + ", Pret: " + pret + ", Tip: " + tip + ", Tip Piele: " + tipPiele);
    }
}

class CremaCorp extends Cosmetice {
    private boolean areParfum;

    public CremaCorp() {
        super();
        this.areParfum = false;
    }

    public CremaCorp(String brand, double pret, boolean areParfum) {
        super(brand, pret, "Crema Corp");
        this.areParfum = areParfum;
    }

    public CremaCorp(CremaCorp alt) {
        super(alt);
        this.areParfum = alt.areParfum;
    }

    @Override
    public void afisare() {
        System.out.println("Brand: " + brand + ", Pret: " + pret + ", Tip: " + tip + ", Are Parfum: " + (areParfum ? "Da" : "Nu"));
    }
}

class AfterShave extends Cosmetice {
    private String miros;

    public AfterShave() {
        super();
        this.miros = "Necunoscut";
    }

    public AfterShave(String brand, double pret, String miros) {
        super(brand, pret, "After Shave");
        this.miros = miros;
    }

    public AfterShave(AfterShave alt) {
        super(alt);
        this.miros = alt.miros;
    }

    @Override
    public void afisare() {
        System.out.println("Brand: " + brand + ", Pret: " + pret + ", Tip: " + tip + ", Miros: " + miros);
    }
}

class GelDeDus extends Cosmetice {
    private boolean exfoliant;

    public GelDeDus() {
        super();
        this.exfoliant = false;
    }

    public GelDeDus(String brand, double pret, boolean exfoliant) {
        super(brand, pret, "Gel de Dus");
        this.exfoliant = exfoliant;
    }

    public GelDeDus(GelDeDus alt) {
        super(alt);
        this.exfoliant = alt.exfoliant;
    }

    @Override
    public void afisare() {
        System.out.println("Brand: " + brand + ", Pret: " + pret + ", Tip: " + tip + ", Exfoliant: " + (exfoliant ? "Da" : "Nu"));
    }
}

public class CosmeticeTest {
    public static void main(String[] args) {
        ArrayList<Cosmetice> produse = new ArrayList<>();

        produse.add(new Sampon("L'Oreal", 25.5, "Gras"));
        produse.add(new Sampon(new Sampon("Nivea", 30.0, "Uscat")));
        produse.add(new Sampon());

        produse.add(new CremaFata("Garnier", 40.0, "Sensibila"));
        produse.add(new CremaFata(new CremaFata("Nivea", 35.5, "Normala")));
        produse.add(new CremaFata());

        produse.add(new CremaCorp("Dove", 20.0, true));
        produse.add(new CremaCorp(new CremaCorp("Palmolive", 25.0, false)));
        produse.add(new CremaCorp());

        produse.add(new AfterShave("Old Spice", 18.0, "Lemnos"));
        produse.add(new AfterShave(new AfterShave("Gillette", 22.5, "Fresh")));
        produse.add(new AfterShave());

        produse.add(new GelDeDus("Palmolive", 15.5, true));
        produse.add(new GelDeDus(new GelDeDus("Dove", 18.0, false)));
        produse.add(new GelDeDus());

        for (Cosmetice produs : produse) {
            produs.afisare();
            System.out.println("-----------------------------");
        }
    }
}
