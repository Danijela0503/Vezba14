public class Main {
    public static void main(String[] args) {


        int x = 523134;
        int y = 325423;

        int z = x%y;

        if (z==0){
            System.out.println("Ne postoji ostatak.");
        }
        else if (z<1000){
            System.out.println("Ostatak je manji od hiljadu.");
        }
        else if (z>1000){
            System.out.println("Ostatak je veci od hiljadu.");
        }

    }
}