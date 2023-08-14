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
}
