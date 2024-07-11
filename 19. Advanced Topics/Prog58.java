//Sealed Class:

sealed class A permits B, C {

}
final class B extends A{

}
non-sealed class C extends A{

}
class D extends C{

}
public class Prog58{
    
}
