import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        int apples = 5;
    byte pears = 15;
    short apricots = 22;
    long kiwi = 25L;
    float waterWeight = 2.5f;
    double vegetablesWeight = 3.6;
    char box =4;
    boolean isAdult = apples > 3;
    System.out.println(isAdult);

    //Задание 2
        double firsBoxer = 78.2;
        double secondBoxer = 82.7;
double result = firsBoxer + secondBoxer;
System.out.println("Общий вес боксеров " + result + " кг");
double result2 = secondBoxer - firsBoxer;
System.out.println("Разница в весе боксеров составляет " + result2 + " кг");


     //Задание 3
var bananas = 5;
var oneBananaWeightInGrams = 80;
var bananasWeightInGrams = bananas * oneBananaWeightInGrams;

var milkInMl = 200;
var in100MlOfMilkWeight = 105;
var milkWeightInGrams = milkInMl/100 * in100MlOfMilkWeight;

var iceCreamInBriquettes = 2;
var oneBriquettesInGrams = 100;
var iceCreamWeightInGrams = iceCreamInBriquettes * oneBriquettesInGrams;

var eggs = 4;
var oneEggInGrams = 70;
var eggsWeightInGrams = eggs * oneEggInGrams;

var gramInBreakfast = oneBananaWeightInGrams + milkWeightInGrams + iceCreamWeightInGrams + eggsWeightInGrams;
System.out.println("Общий вес завтрака в граммах " + gramInBreakfast);
double inOneKilogramGram = 1000;
double breakfastInKg = gramInBreakfast/inOneKilogramGram;
System.out.println("Общий вес завтрака " + breakfastInKg + " кг");

      //Задание 4
        var needToLoseKilo = 7;
        var loseAGramInOneDay = 250;
        var oneKgInGram = needToLoseKilo * 1000;
        var daysForWeightLoss1 = oneKgInGram/loseAGramInOneDay;
        System.out.println("Чтобы похудеть на 7 кг. по 250 грамм в день, нужно " + daysForWeightLoss1 + " дней");
        var loseAGramIn1Day = 500;
        var daysForWeightLoss2 = oneKgInGram/loseAGramIn1Day;
        System.out.println("Чтобы похудеть на 7 кг., по 500 грамм в день, нужно " + daysForWeightLoss2 + " дней");

        //Задание 5
var salaryMasha = 67760;
var salaryDenis = 83690;
var salaryKristina = 76230;
var salaryMashaIncreased = (salaryMasha * 0.1) + salaryMasha;
System.out.println("Зарплата Маши в месяц после повышения на 10% " + salaryMashaIncreased + "0 рублей");

var salaryDenisIncreased = (salaryDenis * 0.1) + salaryDenis;
System.out.println("Зарплата Дениса в месяц после повышения на 10% " + salaryDenisIncreased + "0 рублей");

var salaryKristinaIncreased = (salaryKristina * 0.1) + salaryKristina;
System.out.println("Зарплата Кристины  в месяц после повышения на 10% " + salaryKristinaIncreased + "0 рублей");

var salaryMashaInYearBefore = salaryMasha * 12;
var salaryMashaInYearAfter = salaryMashaIncreased * 12;
var salaryDifferenceMasha = salaryMashaInYearAfter - salaryMashaInYearBefore;
System.out.println("Годовой доход Маши вырос на " + salaryDifferenceMasha + "0 рублей ");
System.out.println("Разница между доходом до и после повышения зарплаты Маши составила " + salaryDifferenceMasha + "0 рублей");

var salaryDenisInYearBefore = salaryDenis * 12;
var salaryDenisInYearAfter = salaryDenisIncreased * 12;
var salaryDifferenceDenis = salaryDenisInYearAfter - salaryDenisInYearBefore;
System.out.println("Годовой доход Дениса вырос на " + salaryDifferenceDenis + "0 рублей");
System.out.println("Разница между доходом до и после повышения зарплаты Дениса составила " + salaryDifferenceDenis + "0 рублей");

var salaryKristinaInYearBefore = salaryKristina * 12;
var salaryKristinaInYearAfter = salaryKristinaIncreased * 12;
var salaryDifferenceKristina = salaryKristinaInYearAfter - salaryKristinaInYearBefore;
System.out.println("Годовой доход Кристины вырос на " + salaryDifferenceKristina + "0 рублей");
System.out.println("Разница между доходом до и после повышения зарплаты Кристыны составила " + salaryDifferenceKristina + "0 рублей");

    }
}