package Exception_Handling.Object_clonning;

public class ClassB implements Cloneable
{
    int x =555;
    int y =666;
    // Creating object cloning
    ClassB clonning() throws Exception
    {
        return (ClassB)super.clone();
    }
}
