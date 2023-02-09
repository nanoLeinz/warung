package id.kawahedu.controller;

import id.kawahedu.model.UserListDto;
import id.kawahedu.model.Users;
import id.kawahedu.model.UsersDto;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.panache.common.Page;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class UserController {
    @Inject
    EntityManager entityManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Users>  getList() {
        PanacheQuery<Users> query = Users.find("status = 1");
        query.range(0, 24);
        List<Users> firstRange = query.list();
        return firstRange;
    }

    @GET
    @Path("/1")
    @Produces(MediaType.APPLICATION_JSON)
    public List<UsersDto>  getList1() {
        PanacheQuery<UsersDto> result = Users.find("SELECT a.user_id, a.name, a.place_bd, a.email, a.role, a.status FROM Users a where status = 1").project(UsersDto.class);
        result.page(Page.of(0,1000));
        return result.list();
    }
}
