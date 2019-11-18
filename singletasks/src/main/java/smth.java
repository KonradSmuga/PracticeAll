import java.util.ArrayList;
import java.util.Random;

class ArrayTester{

    //method prints out only the even elements of an ArrayList
    public void printEven(ArrayList<Integer> theList){

        for (int n=0; n < theList.size(); n++){

            //checking if an element is even or odd
            if ( theList.get(n) % 2 == 0){
                //if reminder of dividing the element by two equals 0,
                //the element is even, so we can print out it.
                System.out.println(theList.get(n));
            }
        }
    }
}

/* Name of the class has to be "Main" only if the class is public. */
class CollectionAsParameter
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //initialising the collection
        ArrayList<Integer> theBigList = new ArrayList<Integer>();
        Random theGenerator = new Random();
        for(int n=0; n < 200; n++){
            //inserting a random number of range 0-99 into the list
            theBigList.add(theGenerator.nextInt(100));
        };
        ArrayTester tester = new ArrayTester();
        tester.printEven(theBigList);
    }
}
