import org.junit.jupiter.api.Test;

public class ControlTest {

    @Test

    void check30()

    {

        //given
        int num = 31;
        //when
        String res = ControlFlow.numberProve(num);
        //then
        String expResult ="Maximale PersonenAnzahl nicht überschritten";
    }
}
