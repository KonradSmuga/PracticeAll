import java.util.Random;

public class LoginSymulator {

    public static void main(String[] args) {
        boolean logged = false;

        int tryCounter = 0;
        Random random = new Random();


        while (!logged) {
            tryCounter++;

            System.out.println("Waiting for the User to sign in : [attempt # " + tryCounter + "]");

            if (random.nextInt(100) > 90) {
                logged = true;
            }
        }


        System.out.println("user logged in");
    }

}

