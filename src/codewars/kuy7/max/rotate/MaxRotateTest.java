package max.rotate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxRotateTest {

    @Test
    public void maxRotTests() {
        assertEquals(68957, MaxRotate.maxRot(56789));
        assertEquals(85821534, MaxRotate.maxRot(38458215));
        assertEquals(988103115, MaxRotate.maxRot(195881031));
        assertEquals(962193428, MaxRotate.maxRot(896219342));
        assertEquals(94183076, MaxRotate.maxRot(69418307));
        assertEquals(507992495, MaxRotate.maxRot(507992495));
        assertEquals(7685653432L, MaxRotate.maxRot(7685653432L));
    }
}