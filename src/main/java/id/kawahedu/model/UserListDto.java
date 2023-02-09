package id.kawahedu.model;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.time.LocalDate;
import java.util.UUID;

@RegisterForReflection
public class UserListDto {
    public UUID user_id;
    public String name;
    public String email;
    public LocalDate date_bd;
    public String role;

    public UserListDto(UUID user_id, String name, String email, LocalDate date_bd, String role) {
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.date_bd = date_bd;
        this.role = role;
    }
}
