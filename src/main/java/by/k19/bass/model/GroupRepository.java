package by.k19.bass.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupRepository extends JpaRepository<User, Long> {
    Group findByName(String name);
}