package Rekordy;

import java.time.LocalDateTime;
import java.util.Objects;

//Simple POJO
public final class User {
    private String username;
    private boolean active;
    private LocalDateTime lastLogin;

    public User() {}

    public User(String username, boolean active, LocalDateTime lastLogin) {
        this.username = username;
        this.active = active;
        this.lastLogin = lastLogin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return active == user.active && Objects.equals(username, user.username) && Objects.equals(lastLogin, user.lastLogin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, active, lastLogin);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", active=" + active +
                ", lastLogin=" + lastLogin +
                '}';
    }
}
