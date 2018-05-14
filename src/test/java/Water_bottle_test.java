import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Water_bottle_test {

    @Test
    public void volume() {
        Water_bottle volume = new Water_bottle();
        assertEquals(100, volume.getVolume());
    }

    @Test
    public void drink() {
        Water_bottle volume = new Water_bottle();
        volume.drink();
        assertEquals(90, volume.getVolume());
    }

    @Test
    public void fill() {
        Water_bottle volume = new Water_bottle();
        volume.fill();
        assertEquals(100, volume.getVolume());
    }

    @Test
    public void empty() {
        Water_bottle volume = new Water_bottle();
        volume.empty();
        assertEquals(0, volume.getVolume());
    }
}