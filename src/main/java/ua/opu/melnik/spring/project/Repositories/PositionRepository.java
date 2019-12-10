package ua.opu.melnik.spring.project.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.opu.melnik.spring.project.Entities.Position;

public interface PositionRepository extends JpaRepository<Position, Integer> {

}
