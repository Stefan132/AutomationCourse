package ro.sit.course;

public class Course02 {

    public static void main(String[] args){
        System.out.println("Hello World!");
        int number;
        number = 5;
        int secondNumber = 2;
        System.out.println(number);
        System.out.println(secondNumber);

        int suma = number + secondNumber;
        System.out.println(suma);
        System.out.println(number + "," + secondNumber);

        String name;
        name = "Darth Vader";
        name = "Sirius";
        System.out.println(number + name + secondNumber);

        int produs = number * secondNumber;
        final String FIRST_NAME = "Luca Modrici";
        System.out.println();
        System.out.println(number + "+" + secondNumber + "=" + suma);
        System.out.println(number + "+" + secondNumber + "=" + produs);

        boolean isNegative = number < 0;
        System.out.println(isNegative);

        char caracter = 'a';
        System.out.println("Caracterul este: " + caracter);

        byte a = 127;
        byte b = 10;

        short suma2 = (short) (a+b);
        System.out.println(suma2);
        String numeComplet = FIRST_NAME + " " + name;
        System.out.println(numeComplet);

        int impartire = number / secondNumber;
        System.out.println("Rezultatul impartirii este: " + impartire);

        float impartire2 = (float) number / secondNumber;
        System.out.println("Rezultatul impartirii este: " + impartire2);

        int modul = number % secondNumber;
        System.out.println("Rezultatul impartirii este: " + modul);
        modul = modul + 5;
        modul += 5;
        modul = modul + 1;
        modul += 1;
        modul++;
        modul--;
        System.out.println("Restul dupa adaugarea 5 este: " + modul);

        boolean areEqual = number == secondNumber;
        boolean notEqual = number != secondNumber;

        System.out.println("The numbers are equal " + areEqual);
        System.out.println("The numbers are not equal " + notEqual);
        boolean areBothPositive =  number >= 0 && secondNumber >= 0;
        System.out.println("Both numbers are positive " + areBothPositive);
        boolean eitherIsPositive = number >= 0 || secondNumber >= 0;
        System.out.println("Either number is positive " + eitherIsPositive);
        boolean reversedEitherIsPositive = !eitherIsPositive;
        System.out.println("Reversed Either number is positive " + reversedEitherIsPositive);

        secondNumber = 3;
        boolean xorOperator = number >= 0 ^ secondNumber >= 0;
        System.out.println("XOR Operator " + xorOperator);
    }
}
