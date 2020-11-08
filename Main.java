public class Main {
    public static void main (String[] args) {
        BmiService service = new BmiService();

        int bodyMassIndexFatLow = service.calculate(105.4, 155);
        System.out.println(bodyMassIndexFatLow);

        int bodyMassIndexSkinnyLow = service.calculate(61.6, 161);
        System.out.println(bodyMassIndexSkinnyLow);

        int bodyMassIndexFatTall = service.calculate(100.0, 190);
        System.out.println(bodyMassIndexFatTall);

        int bodyMassIndexSkinnyTall = service.calculate(54.9, 183);
        System.out.println(bodyMassIndexSkinnyTall);
    }
}
