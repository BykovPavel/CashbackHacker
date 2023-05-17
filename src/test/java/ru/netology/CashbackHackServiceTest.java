package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {
    @Test
    public void shouldReturn999If1() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1If999() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0If1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn999If1001() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0If2000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
}
