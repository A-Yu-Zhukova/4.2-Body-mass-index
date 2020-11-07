public class Main {
    public static void main (String[] args) {
        BmiService service = new BmiService();

        int BodymassindexFatLow = service.calculate(105.4, 155);
        System.out.println(BodymassindexFatLow);

        int BodymassindexSkinnyLow = service.calculate(61.6, 161);
        System.out.println(BodymassindexSkinnyLow);

        int BodymassindexFatTall = service.calculate(100.0, 190);
        System.out.println(BodymassindexFatTall);

        int BodymassindexSkinnyTall = service.calculate(54.9, 183);
        System.out.println(BodymassindexSkinnyTall);
    }
}
