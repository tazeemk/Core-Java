package Collection.Set.TreeSet;

public class Comparator implements java.util.Comparator<Employee2>
{

    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return o1.empSal- o2.empSal;
    }
}
