package dto;

import dao.PersonDAO;
import lombok.Data;

@Data
public class PersonDTO {
    String fullName;
    String jobTitle;

    public static PersonDTO from(PersonDAO person) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setFullName(person.getFullName());
        personDTO.setJobTitle(person.getJobTitle());
        return personDTO;
    }
}
