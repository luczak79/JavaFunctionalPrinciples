package Rekordy;

import java.time.LocalDateTime;

public record RecordUser(String username, boolean active, LocalDateTime lastLogin) {

//    // Canonical constructor converted to compact form
//    public RecordUser {
//        Objects.requireNonNull(username);
//        Objects.requireNonNull(lastLogin);
//
//        username = username.toLowerCase();
//    }

    @Override
    public String username() {
        if (this.username == null) {
            return "n/a";
        }
        return this.username;
    }


    // Static inner class for a Builder
    public static class Builder {
        private String username;
        private boolean active;
        private LocalDateTime lastLogin;

        public Builder withUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder withActive(boolean active) {
            this.active = active;
            return this;
        }

        public Builder withLastLogin(LocalDateTime lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }

        public RecordUser build() {
            return new RecordUser(username, active, lastLogin);
        }
    }
}