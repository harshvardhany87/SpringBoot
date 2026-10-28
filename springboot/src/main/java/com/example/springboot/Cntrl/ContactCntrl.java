package com.example.springboot.Cntrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.Entity.Contact;
import com.example.springboot.Repo.contactrepo;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ContactCntrl {

    @Autowired
    private contactrepo cnrepo;

    @GetMapping("getContact")
    List<Contact> getContact() {
        List<Contact> lst = cnrepo.findAll();
        return lst;
    }

    @PostMapping("createContact")
    public Contact create(@RequestBody Contact c) {
        return cnrepo.save(c);
    }

    @PutMapping("updateContact")
    public Contact update(@RequestBody Contact c) {
        return cnrepo.save(c);
    }

    @DeleteMapping("/deleteContact/{id}")
    public String deleteContact(@PathVariable("id") int id) {
        cnrepo.deleteById(id);
        return "Successfully Deleted......";
    }
}
