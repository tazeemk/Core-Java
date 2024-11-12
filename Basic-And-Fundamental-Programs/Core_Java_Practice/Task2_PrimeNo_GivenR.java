package Core_Java_Practice;

public class Task2_PrimeNo_GivenR {
    void prime() {
        int x = 2;
        int y=1;
        for (int i = 2; i <= 100; i++)
        {
          if ((x%i)==0)
          {
              System.out.println(" Prime numbers Beteen 1 to 100 is"+x);

          }
          x++;
        }
    }

    public static void main(String[] args) {
        new Task2_PrimeNo_GivenR().prime();
    }
}