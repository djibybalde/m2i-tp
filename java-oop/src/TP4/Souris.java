package TP4;

class Souris {
    private final int POIDS;
    private String couleur;
    private int age;
    private final int ESPERANCE_VIE;
    private boolean clonee;

    public Souris(int poids, String couleur) {
        this.POIDS = poids;
        this.couleur = couleur;
        final int ESPERANCE_VIE_DEFAUT = 36;
        this.age = 0;
        this.ESPERANCE_VIE = ESPERANCE_VIE_DEFAUT;
        System.out.println("Une nouvelle souris !");
    }

    public Souris(Souris Souris) {
        System.out.println("Clonage d’une souris ! ");
        this.POIDS = Souris.POIDS;
        this.couleur = Souris.couleur;
        this.age = Souris.age;
        this.ESPERANCE_VIE = 4 * Souris.ESPERANCE_VIE / 5;
        this.clonee = true;
    }

    @Override
    public String toString() {
        return String.format(
                "Une souris %s%s de %d mois et pesant %d grammes",
                couleur, clonee ? ", clonée," : "", age, POIDS
        );
    }

    public void vieillir() {
        this.age += 1;
        this.couleur = this.clonee && this.age > this.ESPERANCE_VIE / 2 ? "verte" : this.couleur;
    }

    public void evolue() {
        while (age < ESPERANCE_VIE) this.vieillir();
    }
}
