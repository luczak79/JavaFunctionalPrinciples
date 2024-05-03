package Rekordy;

import java.time.LocalDateTime;
import java.util.Objects;

public record RecordUser(String username, boolean active, LocalDateTime lastLogin) {

    //Canonical constructor converted to compact form
    public RecordUser {
        Objects.requireNonNull(username);
        Objects.requireNonNull(lastLogin);

        username = username.toLowerCase();
    }

    @Override
    public String username() {
        if (this.username == null) {
            return "n/a";
        }
        return this.username;
    }

}
