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
}
