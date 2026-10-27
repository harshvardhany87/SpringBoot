package com.example.springboot.Cntrl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public Emp saves(@Validated @RequestBody Emp p) {
        return repo.save(p);
    }

    @PutMapping("updateemp")
    public Emp update(@RequestBody Emp p) {
        return repo.save(p);
    }

    @DeleteMapping("/deleterecords/{id}")
    public String delrec(@PathVariable("id") int id) {
        repo.deleteById(id);
        return "Successfully Deleted......";
    }

    @GetMapping("/firstn/{name}")
    public List<Emp> getByFirstName(@PathVariable("name") String name) {
        return repo.findByEmployeeName(name);
    }

    @GetMapping("count")
    public Map<String, Object> getSummmary() {
        Long total = repo.getTotalEMP();
        Map<String, Object> result = new HashMap<>();
        result.put("total", total);
        return result;
    }

    @GetMapping("MaxSalary")
    public Map<String, Object> getMax() {
        Long mxsal = repo.getMaxSalary();
        Map<String, Object> result = new HashMap<>();
        result.put("Maimum salary is: ", mxsal);
        return result;
    }
}