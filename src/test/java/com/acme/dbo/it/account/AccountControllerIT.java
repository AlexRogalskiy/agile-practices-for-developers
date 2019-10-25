package com.acme.dbo.it.account;

import com.acme.dbo.account.controller.AccountController;
import com.acme.dbo.account.domain.Account;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.DisabledIf;

import static lombok.AccessLevel.PRIVATE;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisabledIf(expression = "#{environment['features.account'] == 'false'}", loadContext = true)
@ExtendWith(MockitoExtension.class)
@SpringBootTest
@Slf4j
@ActiveProfiles("it")
@FieldDefaults(level = PRIVATE)
@NoArgsConstructor
public class AccountControllerIT {
    @Autowired AccountController sut;

    @Test
    public void shouldGetAllAccountsWhenPrepopulatedDbHasSome() {
        assertThat(sut.getAccounts()
                .stream()
                .map(Account::getId)
                .toArray()
        ).containsOnly(1L,2L,3L);
    }
}