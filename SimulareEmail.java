package com.aciee.simulareemail;

class AdresaEmail {
    private String adresa;

    public AdresaEmail(String adresa) {
        this.adresa = adresa;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}

class Email {
    private AdresaEmail expeditor;
    private AdresaEmail destinatar;
    private String subiect;
    private String mesaj;

    public Email(AdresaEmail expeditor, AdresaEmail destinatar, String subiect, String mesaj) {
        this.expeditor = expeditor;
        this.destinatar = destinatar;
        this.subiect = subiect;
        this.mesaj = mesaj;
    }

    public Email() {
        this.expeditor = new AdresaEmail("cineva@example.com");
        this.destinatar = new AdresaEmail("nustiucum@example.com");
        this.subiect = "Fara subiect";
        this.mesaj = "Fara mesaj";
    }

    public void trimite() {
        System.out.println("Se trimite email...");
        System.out.println("De la: " + expeditor.getAdresa());
        System.out.println("Catre: " + destinatar.getAdresa());
        System.out.println("Subiect: " + subiect);
        System.out.println("Mesaj: " + mesaj);
        System.out.println("Email trimis cu succes!\n");
    }

    public void primeste() {
        System.out.println("A fost primit un email!");
        System.out.println("De la: " + expeditor.getAdresa());
        System.out.println("Catre: " + destinatar.getAdresa());
        System.out.println("Subiect: " + subiect);
        System.out.println("Mesaj: " + mesaj);
        System.out.println("Email primit cu succes!\n");
    }
}

public class SimulareEmail {
    public static void main(String[] args) {
        AdresaEmail expeditor = new AdresaEmail("expeditor@example.com");
        AdresaEmail destinatar = new AdresaEmail("destinatar@example.com");

        Email email = new Email(expeditor, destinatar, "Salut!", "Acesta este un email de test.");
        email.trimite();
        email.primeste();

        Email emailImplicit = new Email();
        emailImplicit.trimite();
        emailImplicit.primeste();
    }
}
