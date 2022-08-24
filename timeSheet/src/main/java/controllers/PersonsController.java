package controllers;

import dto.PersonDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/persons")
public class PersonsController {

    @GetMapping
    public  List<PersonDTO> persons() {
        List<PersonDTO> personsList = new ArrayList<>();

        return personsList;
    }
}
