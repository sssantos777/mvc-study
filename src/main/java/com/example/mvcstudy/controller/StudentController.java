package com.example.mvcstudy.controller;

import com.example.mvcstudy.student.Student;
import com.example.mvcstudy.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/testes")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewStudent (@RequestParam String matricula, @RequestParam String nome) {

        Student s = new Student();
        s.setMatricula(matricula);
        s.setNome(nome);
        studentRepository.save(s);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Student> getAllStudent() {
        // This returns a JSON or XML with the users
        return studentRepository.findAll();
    }

}
