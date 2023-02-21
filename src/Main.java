//1'den 30'a kadar olan sayıların mükemmel sayı olup olmadığını ekrana yazdıran program.
public class Main {
    public static void main(String[] args) {

        int number, j;

        for(number=1;number<=30;number++){
            int counter=0;
            for(j=1;j<number;j++){
                if(number%j==0){
                    counter += j;
                }
            }
            if(counter == number){
                System.out.println(number+" mükemmel sayıdır.");
            }
            else{
                System.out.println(number+" mükemmel sayı değildir.");
            }

        }
    }
}