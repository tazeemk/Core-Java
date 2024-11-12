package Collection.List.ArrayList;

import java.util.ArrayList;

public class UserDefineObjArray
{
    public void Uderdefineoperation(){
        ArrayList<UserDefineObj>al1 = new ArrayList<UserDefineObj>();
    UserDefineObj udo = new UserDefineObj("Devang",3000,"java");
        UserDefineObj udo1 = new UserDefineObj("Sanu",3000,"AWS");
        UserDefineObj udo2 = new UserDefineObj("Sahid",2000,"ORACLE");
    al1.add(udo);
    al1.add(udo1);
    al1.add(udo2);
    al1.add(new UserDefineObj("sahil",3400,"Spring"));
    for (Object o:al1){
        System.out.println(o +" ");
    }

    }

    public static void main(String[] args) {
        UserDefineObjArray udoa = new UserDefineObjArray();
        udoa.Uderdefineoperation();
    }
}
