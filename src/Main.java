public class Main {
    public static void main(String[] args){
        //задача 1
        int Age = 22;
        if (Age >= 18) {
            System.out.println("Поздравляем с совершенолетием");
        }
        if (Age < 18) {
            System.out.println("Возраст совершенолетия еще не наступил");
        }
        //задача 2
        if (Age >= 7 && Age < 18) {
            System.out.println("Ребенок может посещать школу");
        }
        if (Age >= 18 && Age < 24) {
            System.out.println("Человек может учиться в университете");
        }
        if (Age >= 24) {
            System.out.println("Человеку пора идти на работу");
        }
        //задача 3
        byte seatsInWagon = 102;
        byte seat = 60;
        int standing = seatsInWagon - seat;
        byte standingPlace =21;
        byte seatPlace = 33;
        if (seatPlace <60) {
            System.out.println("В вагоне осталось " + (seat - seatPlace) + " сидячих мест");
            if (seatPlace >=60) {
                System.out.println("В вагоне не осталось сидячих мест");
            }
            if (standingPlace <standing) {
                System.out.println("В вагоне осталось " + (standing - standingPlace) + " стоячих мест");
            }
            if (standingPlace >=standing) {
                System.out.println("В вагоне не осталось стоячих мест");
            }
        }
        //Задача 4
        int Age1 = 22;
        if (Age1 >=18) {
            System.out.println("Поздравляем с совершенолетием");
        } else if (Age1 < 18) {
            System.out.println("Возраст совершенолетия еще не наступил");
        }
        //Задача 5
        if (Age1 >= 7 && Age1 < 18) {
            System.out.println("Ребенок может посещать школу");
        } else if (Age1 >= 18 && Age1 < 24) {
            System.out.println("Человек может учиться в университете");
        } else if (Age1 >= 24) {
            System.out.println("Человеку пора идти на работу");
        }
        //Задача 6
        int wagonOccupied = 102;
        int SeatPlace = 60;
        int StandingPlace = wagonOccupied - SeatPlace;
        System.out.println("Колличество стоячих мест в вагоне равно " + StandingPlace +"");
        int Seat = 21;
        int Stand = 33;
            if (Seat < SeatPlace) {
            System.out.println("В вагоне есть " + (SeatPlace - Seat) + " сидячих мест"); }
            else {
                System.out.println("Сидячих мест нету"); }
            if (Stand < StandingPlace) {
                System.out.println("В вагоне есть " + (StandingPlace - Stand) + " Стоячих мест"); }
            else {
                System.out.println("Стоячих мест нет");
        }
        //Задача 7
        int personAge = 15;
            if (personAge >= 2 && personAge <=6) {
                System.out.println("Если возраст человека равен " + personAge + " то ему надо ходить в детский сад");
            } else if (personAge >= 7 && personAge <=18) {
                System.out.println("Если возраст человека равен " + personAge + " то он должен ходить в школу");
            } else if (personAge > 18 && personAge <24) {
                System.out.println("Если возраст человека равен " + personAge + " то он должен ходить в университет");
            } else {
                System.out.println("Если возраст человека равен " + personAge + " то он должен ходить на работу"); }

            //Задача 8
        if (personAge <15) {
            System.out.println("Если возраст человека равен " + personAge + " то он не может кататься на атракционе");
        } else  if (personAge >=5 && personAge <14) {
            System.out.println("Если возраст человека равен " + personAge + " то он может кататься на атракционе в соправождении взрослых");
        } else {
            System.out.println("Если возраст человека равен " + personAge + " то он может кататься на атракционе самостоятельно");
        }
        //Задача 9
        int one = 4;
        int two = 56;
        int three = 60;
        if (one > two) {
            System.out.println("Большее число " + one + ""); }
        else if (two > one) {
            System.out.println("Большее число " + two + ""); }
        else {
            System.out.println("Большее число " + three + "");
        }
    }
}