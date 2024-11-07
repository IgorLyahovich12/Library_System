package ua.edu.kneu.library_system.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import ua.edu.kneu.library_system.entity.RolesHasUsers;

@Repository
    public interface RolesHasUsersRepository extends ReactiveCrudRepository<RolesHasUsers, Long> {

        @Query("SELECT role_id FROM roles_has_users WHERE user_id = :userId")
        Flux<Long> findRoleIdsByUserId(Long userId);

    }
