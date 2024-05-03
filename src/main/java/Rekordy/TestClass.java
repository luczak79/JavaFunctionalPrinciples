package Rekordy;

import java.time.LocalDateTime;

public class TestClass {
    public static void main(String[] args) {
        var recordUser = new RecordUser(null, true, LocalDateTime.now());
        var username = recordUser.username();
        System.out.println(username);
    }
}
