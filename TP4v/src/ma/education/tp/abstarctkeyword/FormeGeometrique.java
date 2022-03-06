package ma.education.tp.abstarctkeyword;

public abstract class FormeGeometrique {
    double Surface;
    public abstract double calculerSurface() ;
    public void afficherSurface() {
        System.out.println(this.Surface);
    }
}
