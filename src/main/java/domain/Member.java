package domain;

import lombok.Data;
import lombok.Setter;

@Data
public class Member {
    private String id;
    private int passwd;
    private String city;
    private String sex;
    private String[] hobby;
    private String greetings;
}
