public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1.");
        int a = -2037583;
        byte b = 127;
        short c = 30000;
        long d = 3857573893L;
        float e = 3.9383F;
        double f = -24.37363;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        System.out.println("Задача 2.");
        float ab = 27.12F;
        long bb = 987678965549L;
        float cb = 2.786F;
        boolean ice = false;
        short db = 569;
        short eb = -159;
        int fb = 27897;
        byte gb = 67;

        System.out.println("Задача 3.");
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short totalPaper = 480;
        int personalPaper = totalPaper / (teacher1 + teacher2 + teacher3);
        System.out.println("На каждого ученика рассчитано " + (personalPaper) + " листов бумаги.");

        System.out.println("Задача 4.");
        byte oneBottle = 16 / 2;
        int mashine1Power = oneBottle * 20;
        int mashine2Power = oneBottle * 24 * 60;
        int mashine3Power = mashine2Power * 3;
        int mashine4Power = mashine2Power * 30;
        System.out.println("За 20 минут работы машина произвела бутылок " + mashine1Power + " штук.");
        System.out.println("За сутки машина произвела бутылок " + mashine2Power + " штук.");
        System.out.println("За 3 дня работы машина произвела бутылок " + mashine3Power + " штук.");
        System.out.println("За 1 месяц работы машина произвела бутылок " + mashine4Power + " штук.");

        System.out.println("Задача 5.");
        byte totalColors = 120;
        byte whiteColor = 2;
        byte brownColor = 4;
        int oneClass = whiteColor + brownColor;
        int totalClasses = totalColors / oneClass;
        int totalBrownColor = totalColors - (whiteColor * totalClasses);
        int totalWhiteColor = totalColors - (brownColor * totalClasses);
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteColor + " банок белой краски и " + totalBrownColor + " банок коричневой краски.");

        System.out.println("Задача 6.");
        short bananaWeight = 5 * 80;
        short milkWeight = 2 * 105;
        short iceWeight = 2 * 100;
        short eggWeight = 4 * 70;
        float totalWeightGr = bananaWeight + milkWeight + iceWeight + eggWeight;
        System.out.println("Общий вес спорт-завтрака в граммах: " + (totalWeightGr));
        System.out.println("Общий вес спорт-завтрака в килограммах: " + (totalWeightGr / 1000));

        System.out.println("Задача 7.");
        byte goalWeight = 7;
        float perDay1Weight = 0.25F;
        float perDay2Weight = 0.5F;
        float goal1Days = goalWeight / perDay1Weight;
        float goal2Days = goalWeight / perDay2Weight;
        float perDay3Weight = (perDay1Weight + perDay2Weight) / 2;
        float goal3Days = goalWeight / perDay3Weight;
        System.out.println("При потере веса в 250 грамм в день, спортсмену необходимо дней " + goal1Days + " на похудение.");
        System.out.println("При потере веса в 500 грамм в день, спортсмену необходимо дней " + goal2Days + " на похудение.");
        System.out.println("При потере веса в " + (perDay1Weight + perDay2Weight) / 2 + " грамм в день, спортсмену необходимо дней " + goal3Days + " на похудение.");















    }
}