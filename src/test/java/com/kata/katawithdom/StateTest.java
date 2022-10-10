package com.kata.katawithdom;

import com.kata.katawithdom.state.states.LockedState;
import com.kata.katawithdom.state.states.OffState;
import com.kata.katawithdom.state.Phone;
import com.kata.katawithdom.state.states.ReadyState;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StateTest {
    Phone phone = new Phone();

    @Test
    public void phoneStateShouldChange() {

        phone.getState();

        Assertions.assertThat(phone.getState().getClass())
                .isEqualTo(OffState.class);

        phone.getState().onHomeButton();

        Assertions.assertThat(phone.getState().getClass())
                .isEqualTo(LockedState.class);

        phone.getState().onHomeButton();

        Assertions.assertThat(phone.getState().getClass())
                .isEqualTo(ReadyState.class);

        phone.getState().onPowerButton();

        Assertions.assertThat(phone.getState().getClass())
                .isEqualTo(OffState.class);
    }
}
