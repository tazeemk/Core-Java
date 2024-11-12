package OOPS.Abstraction.Abstract.Interface.Task;

import OOPS.Abstraction.Abstract.Interface.ClassB;
import OOPS.Abstraction.Abstract.Interface.InterfaceC;
import OOPS.Abstraction.Abstract.Interface.InterfaceD;

public abstract class ClassC implements InterfaceC
{
InterfaceC con = ClassB.getReturn();
    InterfaceD st = con.meth();
}
