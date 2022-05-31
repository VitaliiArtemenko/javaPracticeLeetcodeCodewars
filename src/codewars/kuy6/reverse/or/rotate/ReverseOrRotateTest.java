package reverse.or.rotate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseOrRotateTest {

    @Test
    public void testReverseOrRotate() {
        assertEquals(ReverseOrRotate.reverseOrRotate("1234", 0), "");
        assertEquals(ReverseOrRotate.reverseOrRotate("", 0), "");
        assertEquals(ReverseOrRotate.reverseOrRotate("733049910872815764", 5), "330479108928157");
        assertEquals(ReverseOrRotate.reverseOrRotate("73304991087281576455176044327690580265896", 8),
                "1994033775182780067155464327690480265895");
        assertEquals(ReverseOrRotate.reverseOrRotate("73304991087281576455176044327690580265896896028", 8),
                "1994033775182780067155464327690480265895");
        assertEquals(ReverseOrRotate
                        .reverseOrRotate("73304991087281576455176044327690580265896896028126182265439", 11),
                "3304991087781576455172509672344060265896896862281621820");
        assertEquals(ReverseOrRotate
                        .reverseOrRotate("73304991087281576455176044327690580265896896028126182265439441215340989", 14),
                "1827801994033776455176044325690580265896875622816218206939441215340984");
        assertEquals(ReverseOrRotate.reverseOrRotate("563000655734469485", 4),
                "0365065073456944");
        assertEquals(ReverseOrRotate.reverseOrRotate("56300065573446948588855", 3),
                "365000556437694854888");
        assertEquals(ReverseOrRotate.reverseOrRotate("56300065573446948588855200928875449742090", 6),
                "000365437556584964255888092880794457");
        assertEquals(ReverseOrRotate
                        .reverseOrRotate("56300065573446948588855200928875449742090827299285754137212", 11),
                "3755600036546948588854457882900257280902479499285754132");
        assertEquals(ReverseOrRotate
                        .reverseOrRotate("56300065573446948588855200928875449742090827299285754137212673841954794395427",
                                10),
                "6300065575446948588355200928885449742097582992728062127314573841954797");
    }
}