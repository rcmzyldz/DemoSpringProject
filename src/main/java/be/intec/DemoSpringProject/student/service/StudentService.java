package be.intec.DemoSpringProject.student.service;

import be.intec.DemoSpringProject.student.model.entity.StudentEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<StudentEntity> getStudents() {

        return List.of(
                new StudentEntity(
                        1L,
                        "Mariam",
                        "mariam@mail.be",
                        LocalDate.of(2000, Month.JANUARY,5),
                        21
                )
        );
    }
}
