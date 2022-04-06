package com.example.demo.dao;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    private static List<StudentDTO> students = new ArrayList<StudentDTO>();
    private static int id = 0;

    //static ctor
    static {
        students.add(new StudentDTO(getId(), 3, 88, "hodi", "java"));
        students.add(new StudentDTO(getId(), 2, 90, "rami", "c#"));
        students.add(new StudentDTO(getId(), 1, 99, "liora", "c++"));
        students.add(new StudentDTO(getId(), 8, 65, "alex", "c"));
        students.add(new StudentDTO(getId(), 4, 83, "bar", "js"));
        students.add(new StudentDTO(getId(), 1, 100, "shiri", "html"));
    }

    public static int getId() {
        return id++;
    }

    @GetMapping("/")
    public List<StudentDTO> getStudents() {
        return students;
    }

    @GetMapping("/{id}")
    public StudentDTO getStudents(@PathVariable("id") int id) {
        return students.stream().filter(s -> s.getId() == id).findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/")
    public void addStudent(@RequestBody StudentDTO student) {
        //if(student==null)
        //    throw  new ResponseStatusException(HttpStatus.BAD_REQUEST);
        student.setId(getId());
        students.add(student);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id) {
        students.remove(getStudents(id));
    }

    @PutMapping("/{id}")
    public void update(@RequestBody StudentDTO student, @PathVariable("id") int id) {
        students.remove(id);
        students.add(student);

    }
    @GetMapping("/hothaifa")
    public String htmk() {

        return"<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "\n" +
                "<h2 style=\"color:blue;\"\n>this is the heading</h2>\n" +
                "<p style=\"color:red;\"\n >this is the paragraph</p>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
    }


}
