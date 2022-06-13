package classroomPractice;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public class Author {

   public String name;
    @Setter
    public String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

}
