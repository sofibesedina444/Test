public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ 3 - задача 6:");
        var fighter1Weight=78.2;
        var fighter2Weight=82.7;
        var totalWeight=fighter1Weight+fighter2Weight;
        System.out.println("Общий вес двух бойцов: "+totalWeight);
        var differenceWeight=fighter2Weight-fighter1Weight;
        System.out.println("Разница между весами двух бойцов: "+differenceWeight);
        System.out.println("ДЗ 3 - задача 7:");
        System.out.println("1.Разница между весами двух бойцов: "+(fighter2Weight-fighter1Weight));
        System.out.println("2.Разница между весами двух бойцов: "+(fighter2Weight%fighter1Weight));
        System.out.println("ДЗ 3 - задача 8:");
        var generalWorkingTime=640;
        var workingTimePerPerson=8;
        var totalNymberOfPeople=generalWorkingTime/workingTimePerPerson;
        System.out.println("1.Всего работников в компании - "+totalNymberOfPeople+" человек");
        totalNymberOfPeople+=94;
        var newGeneralWorkingTime=totalNymberOfPeople*workingTimePerPerson;
        System.out.println("2.Если в компании работает "+totalNymberOfPeople+" человека, то всего "+newGeneralWorkingTime+" часа работы может быть поделено между сотрудниками");
    }
}