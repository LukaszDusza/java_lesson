package programs.dowod_osobisty;

import java.util.Scanner;

public class DocumentId {

    static char letterValues[] =
            {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                    'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                    'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                    'U', 'V', 'W', 'X', 'Y', 'Z'};

    private static int getLetterValue(char letter)
    {
        int i;
        for (i=0; i<letterValues.length; i++)
        {
            if (letter == letterValues[i])
            {
                return i;
            }
        }
        return -1;
    }

    public void checkDO() {
        String id;
        int checkSum;
        Scanner scanner = new Scanner(System.in);

        //pobierz numer dowodu osobistego
        System.out.println("Podaj numer dowodu osobistego (bez spacji, myslinkow, itp)");
        id = scanner.nextLine();

//sprawdz dlugosc podanego numeru
        if (id.length() != 9) {
            System.out.println("Nieprawidlowa dlugosc numeru");
            return;
        }
//sprawdz czy podano 3 litery a nastepnie 6 cyfr
        for (int i=0; i<3; i++)      {
            if (getLetterValue(id.charAt(i)) < 10)   {
                System.out.println("Nieprawidlowa seria dowodu");
                return;
            }
        }
        for (int i=3; i<9; i++) {
            if (getLetterValue(id.charAt(i)) < 0 || getLetterValue(id.charAt(i)) > 9) {
                System.out.println("Nieprawidlowy numer dowodu");
                return;
            }
        }

        //sprawdz cyfre controlna
        checkSum = 7 * getLetterValue(id.charAt(0));
        checkSum += 3 * getLetterValue(id.charAt(1));
        checkSum += 1 * getLetterValue(id.charAt(2));
        checkSum += 7 * getLetterValue(id.charAt(4));
        checkSum += 3 * getLetterValue(id.charAt(5));
        checkSum += 1 * getLetterValue(id.charAt(6));
        checkSum += 7 * getLetterValue(id.charAt(7));
        checkSum += 3 * getLetterValue(id.charAt(8));
        checkSum %= 10;
        if (checkSum != getLetterValue(id.charAt(3))) {
            System.out.println("Podany numer dowodu jest niepoprawny");
        }
        else {
            System.out.println("Podany numer dowodu jest poprawny");
        }


    }

}
