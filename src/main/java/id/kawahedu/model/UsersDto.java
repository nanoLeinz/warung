package id.kawahedu.model;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

/**
 * A DTO for the {@link Users} entity
 */
@RegisterForReflection
public class UsersDto implements Serializable {
    private final UUID user_id;
    private final String name;
    private final String place_bd;
    private final String email;
    private final String role;
    private final Integer status;

    public UsersDto(UUID user_id, String name, String place_bd, String email, String role, Integer status) {
        this.user_id = user_id;
        this.name = name;
        this.place_bd = place_bd;
        this.email = email;
        this.role = role;
        this.status = status;
    }

    public UUID getUser_id() {
        return user_id;
    }

    public String getName() {
        return name;
    }

    public String getPlace_bd() {
        return place_bd;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public Integer getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersDto entity = (UsersDto) o;
        return Objects.equals(this.user_id, entity.user_id) &&
                Objects.equals(this.name, entity.name) &&
                Objects.equals(this.place_bd, entity.place_bd) &&
                Objects.equals(this.email, entity.email) &&
                Objects.equals(this.role, entity.role) &&
                Objects.equals(this.status, entity.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_id, name, place_bd, email, role, status);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "user_id = " + user_id + ", " +
                "name = " + name + ", " +
                "place_bd = " + place_bd + ", " +
                "email = " + email + ", " +
                "role = " + role + ", " +
                "status = " + status + ")";
    }
}