
public class Main {

    public static void main(String[] args) {

        Renk secilRenkK = new Kirmizi();
        Boyut secilenBoyutK = new A5();

        Renk secilRenkD = new Kirmizi();
        Boyut secilenBoyutD = new A4();

        Mecmua k = new Kitap(secilRenkK, secilenBoyutK);
        k.uret();
        System.out.println("Kitap : " + k.uret());

        Mecmua d = new Dergi(secilRenkD, secilenBoyutD);
        d.uret();
        System.out.println("Dergi : " + k.uret());
    }

}
