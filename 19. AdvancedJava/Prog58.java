/*Record class:
        Record is represent a class which contains only datas also it has some inbuild method,
    which are, 
    -constructor with parameters,
    -toString method
    -compare method
    -getter(by using variableName() instead of getVariableName()) 
*/

class Alian1{
    int id;
    String name;
    public Alian1(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Alian1 [id=" + id + ", name=" + name + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alian1 other = (Alian1) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    
}
record Alian(int id, String name){} //instread of above lines of code, we can creat in that in a single line which is it.

public class Prog58 {
    public static void main(String[] args) {
        Alian1 a1=new Alian1(1, "Dheen");
        Alian1 a2=new Alian1(1, "Dheen");
        System.out.println(a1);
        System.out.println(a1.equals(a2));
        System.out.println(a2.getName());
    }
}
