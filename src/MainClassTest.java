import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        int a1 = this.getLocalNumber();
                if (a1 == 14) {
                    System.out.println("True");
                }
                else{
                    System.out.println("False");
                }
    }
    @Test
    public void testGetClassNumber()
    {
     int a2 = this.getClassNumber();
     if (a2>45){
         System.out.println(a2);
         }
     else {
         System.out.println("not equal to 45");
     }
    }
    @Test
    public void testGetClassString() {
        String a44 = "Hello";
        String a45 = "hello";
        String a46 = this.getClassString();
        boolean res1 = a46.contains(a44);
        boolean res2 = a46.contains(a45);
        //System.out.println(res1);
        if (res1 == true || res2 == true){
            System.out.println(getClassString());
        }
        else {
            System.out.println("no search words");
        }
    }
}
