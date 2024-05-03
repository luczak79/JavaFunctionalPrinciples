package Rekordy;

import java.time.LocalDateTime;

public class TestClass {
    public static void main(String[] args) {
        var recordUser = new RecordUser(null, true, LocalDateTime.now());
        var username = recordUser.username();
        System.out.println(username);

        var recordUser2 = new RecordUser.Builder().withActive(true).withUsername("Marcin").withLastLogin(LocalDateTime.now()).build();
        System.out.println(recordUser2.username());
    }
}
