package mahogany_exam;

public static String printFullName(String firstName,String lastName){
    return firstName + " " + lastName;
}

public static int getPrice(int min, int max){
   int randomNum = min +(int)(Math.random()*(max-min)+1);
return randomNum;
}

public static char[] printSizes(char[]sizes){
    System.out.println(sizes);
    return sizes;
}

public class exam {//create methods below

    public static void main(String[] args) {//start of main method
        String firstName = "Mahogany";
        String lastName = "Gant";
char[] sizes = {'S','M','L'};
final double EXPIRATIONDATE = 9.12;
        System.out.println(printFullName(firstName,lastName));
        System.out.println(getPrice(5,15));
    }
}
