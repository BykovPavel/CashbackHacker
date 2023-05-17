package ru.netology;



import org.junit.jupiter.api.Test;
import ru.netology.service.CashbackHackService;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest2 {

    @Test
    public void shouldReturn999If1() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1If999() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0If1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn999If1001() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0If2000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2000);
        int expected = 0;
        assertEquals(expected, actual);
    }

}
