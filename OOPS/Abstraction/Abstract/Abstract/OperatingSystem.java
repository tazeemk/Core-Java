package OOPS.Abstraction.Abstract.Abstract;

public class OperatingSystem extends Boot
{
    OperatingSystem(){
        System.out.println("Select Your Preffered Operating System ::");
    }
    @Override
     String osName(String name){
        return name;
    }
}
