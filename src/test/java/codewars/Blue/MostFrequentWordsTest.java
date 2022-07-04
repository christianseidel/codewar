package codewars.Blue;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MostFrequentWordsTest {

    @Test
    public void shouldReturnKatzeHundVogel() {

        //given
        String s = "Katze Hund Vogel. Hans hat eine Katze. Franz besitzt keine Katze, auch keinen Hund, aber einen Vogel.";

        // when
        MostFrequentWords kata = new MostFrequentWords();
        List<String> actual = kata.topThreeKata(s);

        // then
        assertEquals(List.of("katze", "hund", "vogel"), actual);
    }

    @Test
    public void shouldReturnAOfOn() {

        //given
        String s = "In a village of La Mancha, the name of which I have no desire to call to mind, there lived not long since one of those gentlemen that keep a lance in the lance-rack, an old buckler, a lean hack, and a greyhound for coursing. An olla of rather more beef than mutton, a salad on most nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra on Sundays, made away with three-quarters of his income.";

        // when
        MostFrequentWords kata = new MostFrequentWords();
        List<String> actual = kata.topThreeKata(s);

        // then
        assertEquals(List.of("a", "of", "on"), actual);
    }

    @Test
    public void tmp() {

        //given
        String s = "with three-quarters of his income.";

        // when
        MostFrequentWords kata = new MostFrequentWords();
        List<String> actual = kata.topThreeKata(s);

        // then
        assertEquals(List.of("income", "with", "three-quarters"), actual);
    }

    @Test
    public void shouldReturnEmptyList1() {
        // given
        List<String> emptyList = List.of();

        // when
        MostFrequentWords kata = new MostFrequentWords();

        // then
        assertEquals(emptyList, kata.topThreeKata(""));
    }

    @Test
    public void shouldReturnEmptyList2() {
        // given
        List<String> emptyList = List.of();

        // when
        MostFrequentWords kata = new MostFrequentWords();

        // then
        assertEquals(emptyList, kata.topThreeKata("   "));
    }

    @Test
    public void shouldReturnEmptyList3() {

        // given
        MostFrequentWords kata = new MostFrequentWords();

        // then
        assertNull(kata.topThreeKata(" , + ; !!"));

    }

    @Test
    public void shouldReturnEDddA() {

        //given
        String s = "e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e";

        // when
        MostFrequentWords kata = new MostFrequentWords();
        List<String> actual = kata.topThreeKata(s);

        // then
        assertEquals(List.of("e", "ddd", "aa"), actual);
    }
}