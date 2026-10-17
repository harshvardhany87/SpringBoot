package com.example.springboot.Cntrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.Entity.Emp;
import com.example.springboot.Repo.Emprepo;

@RestController
public class Empcntrl {

    @Autowired
    private Emprepo repo;

    @GetMapping("emp")
    List<Emp> getEmp() {
        List<Emp> lst = repo.findAll();
        return lst;
    }

    @PostMapping("savemp")
    public Emp saves(@RequestBody Emp p) {
        return repo.save(p);
    }

    @PutMapping("updateemp")
    public Emp update(@RequestBody Emp p) {
        return repo.save(p);
    }

}