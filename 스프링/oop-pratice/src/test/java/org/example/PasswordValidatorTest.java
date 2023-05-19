package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

/*
    비밀번호는 최소 8자 이상 12자 이하
    비밀번호가 만족하지 못할 경우 IllegalArgumentException 예외 발생
    경계조건에 대해 테스트 코드를 작성
 */
public class PasswordValidatorTest {
    @DisplayName("비밀번호가 최소 8자 이상 12자 이하면 예외 발생X")
    @Test
    void validatePasswordTest(){
        assertThatCode(()->PasswordValidator.validate("serverwizard"))
                .doesNotThrowAnyException();
    }

    @ParameterizedTest
    @DisplayName("비밀번호가 8자 미만 또는 12자 초과하는 경우 IllegalArgumentException 예외가 발생한다")
    @ValueSource(strings = {"aabbcce","aabbccddeeffg"})
    void validatePasswordTest2(String password) {
        assertThatCode(()->PasswordValidator.validate(password))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
