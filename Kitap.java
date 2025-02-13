
public class Kitap extends Mecmua {

    private Renk renk;
    private Boyut boyut;

    public Kitap(Renk renk, Boyut boyut) {
        this.renk = renk;
        this.boyut = boyut;
    }

    @Override
    public String uret() {

        return renk.boya() + " rengi boyutu : " + boyut.boyutlandir();

    }

}
