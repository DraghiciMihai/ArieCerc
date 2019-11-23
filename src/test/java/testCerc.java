import com.sda.cerc.Cerc;
import org.junit.Test;

public class testCerc {

    @Test
    public void testCerc() {
        Cerc cerc = new Cerc(5);
        System.out.print("Aria cercului este = ");
        System.out.println(cerc.calculArie());
    }
}