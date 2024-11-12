package Exception_Handling.User_Define_Exception;

public class MinimumAccountBalance extends Exception
{
    String message;
    public MinimumAccountBalance(String message){
        this.message =message;
    }

    public String toString(){
        return message;
    }
}
