package Rekordy;

import java.time.LocalDateTime;
import java.util.Objects;

public final class ImmutableUser {

    private String username;
    private boolean active;
    private LocalDateTime lastLogin;

    public ImmutableUser(String username, boolean active, LocalDateTime lastLogin) {
        this.username = username;
        this.active = active;
        this.lastLogin = lastLogin;
    }

    public String getUsername() {
        return username;
    }

    public boolean isActive() {
        return active;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableUser that = (ImmutableUser) o;
        return active == that.active && Objects.equals(username, that.username) && Objects.equals(lastLogin, that.lastLogin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, active, lastLogin);
    }

    @Override
    public String toString() {
        return "ImmutableUser{" +
                "username='" + username + '\'' +
                ", active=" + active +
                ", lastLogin=" + lastLogin +
                '}';
    }
}
