package com.example;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTests {

    @Mock
    Feline feline;

    @Test
    public void getKittensIsAlwaysZeroTest() throws Exception{
        MatcherAssert.assertThat("У льва Алекса не может быть львят",
                new LionAlex(feline).getKittens(),
                equalTo(0)
        );
    }

    @Test
    public void getPlaceOfLivingIsCorrectTest() throws Exception {
        MatcherAssert.assertThat("Лев Алекс живёт не там",
                new LionAlex(feline).getPlaceOfLiving(),
                equalTo("Нью-Йоркский зоопарк")
        );
    }

    @Test
    public void getFriendsIsCorrectTest() throws Exception {
        List<String> expectedList = List.of(
                "Марти - зебра",
                "Глория - бегемот",
                "Мелман - жираф"
        );
        MatcherAssert.assertThat("Неправильный список друзей",
                new LionAlex(feline).getFriends(),
                equalTo(expectedList)
        );
    }
}