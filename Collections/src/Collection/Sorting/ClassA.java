package Collection.Sorting;

import java.util.Comparator;

public class ClassA implements Comparator<Employee4>
{


    @Override
    public int compare(Employee4 o1, Employee4 o2)
    {
        return o1.getEmailId().compareTo(o2.getEmailId());
    }
}
