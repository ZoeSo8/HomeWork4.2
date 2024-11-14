//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        //С помощью условного оператора напишите программу, которая выводит в консоль:
        // сообщение о том, что человеку 18 или больше лет;
        // сообщение, что возраст совершеннолетия еще не наступил, нужно немного подождать.
        //При выполнении каждого условия программа должна выводить в консоль сообщение в формате:
        // «Если возраст человека равен …, то (вывести в зависимости от результата) он совершеннолетний / он не достиг совершеннолетия, нужно немного подождать».

        byte age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершенолетний");
        }
        else  {
            System.out.println("Если возраст человека равен " +age+ " то он не достиг совершеннолетия, нужно немного подождать");
        }

        //Задача 2
        //Человек одевается в зависимости от температуры воздуха.
        //Напишите программу, которая выводит сообщение:
        //«На улице холодно, нужно надеть шапку» — если температура ниже 5 градусов.
        //«Сегодня тепло, можно идти без шапки» — если температура воздуха выше 5 градусов.
        //При выполнении каждого условия выведите в консоль:
        //«На улице … градусов, (вывести в зависимости от результата) нужно надеть шапку / можно идти без шапки».

        short temp = 20;
        if (temp <5) {
            System.out.println("На улице " +temp+ " градусов, нужно надеть шапку");
        }
        else  {
            System.out.println("Сегодня " +temp+ " градусов, можно идти без шапки");
        }

        //Задача 3
        //За превышение скорости водителю могут выписать штраф.
        //Напишите программу, которая сообщает водителю о том, что:
        // скорость превышена, если она больше 60 км/ч;
        // превышения скорости нет, если она меньше 60 км/ч.
        //При выполнении каждого условия программа должна выводить такое сообщение:
        //«Если скорость …, то (вывести в зависимости от результата) придется заплатить штраф / можно ездить спокойно».

        short speed = 80;
        if (speed >60) {
            System.out.println("Если скорость " +speed+ " км/ч, то придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость " +speed+ " км/ч, можно ездить спокойно");
        }

        //Задача 4
        //Напишите программу, которая помогает определить, в какое учреждение нужно отправить человека в зависимости от его возраста:
        // Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад.
        // Если человеку от 7 до 17 лет, то ему нужно ходить в школу.
        // Если человеку больше или равно 18 лет, но меньше или равно 24, то его место в университете.
        // А если человеку больше 24, то ему пора ходить на работу.
        //При выполнении каждого условия программа должна выводить в консоль сообщение в формате:
        //«Если возраст человека равен …, то ему нужно ходить … (в зависимости от возраста дописать нужное)».

        byte agePeople = 10;
        if (agePeople>=2 && agePeople<=6) {
            System.out.println("Если возраст человека равен " +agePeople+ " лет, то ему нужно ходить в детский сад");
        }
        if (agePeople>=7 && agePeople<=17) {
            System.out.println("Если возраст человека равен " +agePeople+ " лет, то ему нужно ходить в школу");
        }
        if (agePeople>=18 && agePeople<=24) {
            System.out.println("Если возраст человека равен " +agePeople+ " лет, то ему нужно ходить в университет");
        }
        if (agePeople>24) {
            System.out.println("Если возраст человека равен " +agePeople+ " лет, то ему пора ходить на работу");
        }


        //Задача 5
        //Как правило, на аттракционах действуют ограничения для детей по возрасту:
        // Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
        // Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.
        // Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.
        //Напишите программу, которая выводит в консоль сообщение в формате:
        //«Если возраст ребенка равен …, то ему … (в зависимости от возраста дописать нужное: нельзя кататься на аттракционе, можно кататься на аттракционе в сопровождении / без сопровождения взрослого)».

        byte ageKid = 14;
        if (ageKid <5) {
            System.out.println("Если возраст ребенка равен " +ageKid+ " лет, то ему нельзя кататься на аттракционе");
        }
        if (ageKid>=5 && ageKid<14) {
            System.out.println("Если возраст ребенка равен " +ageKid+ " лет, то ему можно кататься только в сопровождении взрослого" );
        }
        if (ageKid>=14) {
            System.out.println("Если возраст ребенка равен " +ageKid+ " лет, то он может кататься без сопровождения взрослого");
        }


        //Задача 6
        //Вместимость одного вагона поезда — 102 человека.
        //Вагон рассчитан на 60 сидячих мест, все остальные — стоячие.
        //С помощью условного оператора и конструкции else напишите программу, которая выводит в консоль
        //сообщение о том, есть ли место в вагоне, сидячее или стоячее, или вагон уже полностью забит.

        int peopleInTrain = 110;
        int seatPlaces = 60;
        int maxPlaces = 102;
        if (peopleInTrain>=1 && peopleInTrain<seatPlaces) {
            System.out.println("В вагоне есть места для проезда сидя");
        }
        else if (peopleInTrain>=seatPlaces && peopleInTrain<maxPlaces) {
            System.out.println("В вагоне остались только места для проезда стоя");
        }
        else {
            System.out.println("В вагоне мест нет");
        }

        //Задача 7
        //Даны три числа:
        //int one;
        //int two;
        //int three;
        //С помощью условного оператора и конструкции else напишите программу,
        //которая вычисляет, какое из трех чисел бо́льшее, и выводит результат в консоль.

        int one = 1;
        int two = 7;
        int three = 30;
        if (one>two && one>three){
            System.out.println("Число one самое большое");
        }
        else if (two>one && two>three){
            System.out.println("Число two самое большое");
        }
        else {
            System.out.println("Число three самое большое");
        }

    }
}