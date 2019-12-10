package ua.opu.melnik.spring.project.Services;

import org.springframework.beans.factory.annotation.Autowired;
import ua.opu.melnik.spring.project.Entities.Position;
import ua.opu.melnik.spring.project.Repositories.PositionRepository;

import java.util.List;

@org.springframework.stereotype.Service
public class PositionService {

    @Autowired
    private PositionRepository positionRepo;

    public void addPosition(Position position) {

        positionRepo.saveAndFlush(position);
    }

    public List<Position> getAllPositions() {

        return positionRepo.findAll();
    }
}
