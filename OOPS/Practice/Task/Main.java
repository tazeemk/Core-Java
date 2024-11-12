package OOPS.Practice.Task;
//here we cannot extends employees class because constructor can't participate in inheritance
public class Main
{
    public static void main(String[] args) throws InterruptedException {
        //creating objects for employees class initialize the value through constructor
        Employees em = new Employees("Musa Kareem","General coomander",56665);
        System.out.println("Name "+em.getName() +" job Title "+em.getJobTitle()+" salray "+em.getSalary());
        Employees em2 = new Employees(" Mohd Mushtaq "," General Commander ",5666666);
        System.out.println("Name "+em2.getName()+" Job Title "+em2.getJobTitle()+" salary "+em2.getSalary());//retriving value through getter methods
          em.setSalary(55556666);//updating the value through setter method
          em.setName("Tazeem Khan");
          em.setJobTitle(" President");
        System.out.println("...........Loading your Boss Name..........");
          Thread.sleep(5000);//it will stop execution for few sec
        System.out.println("........wait......");
        Thread.sleep(5000);
        System.out.println("Name ::"+em.getName() +"====> "+em.getJobTitle()+" ..... "+em.getSalary());

    }
}
