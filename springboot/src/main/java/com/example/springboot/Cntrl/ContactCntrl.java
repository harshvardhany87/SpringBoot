package com.example.springboot.Cntrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.Repo.contactrepo;

@RestController
public class ContactCntrl {

    @Autowired
    private contactrepo cnrepo;

}
