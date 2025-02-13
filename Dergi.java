
public class Dergi extends Mecmua {

    private Renk renk;
    private Boyut boyut;

    public Dergi(Renk renk, Boyut boyut) {
        this.renk = renk;
        this.boyut = boyut;
    }

    @Override
    public String uret() {

        return renk.boya() + " rengi boyutu : " + boyut.boyutlandir();

    }

}
