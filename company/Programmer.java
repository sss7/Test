package test.company;

import java.util.ArrayList;
import java.util.List;

public class Programmer extends Worker {

    public Programmer(String name, String post) {
        super(name, post);
    }

    public static void main(String[] args) {
        List<Programmer> programmers = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            programmers.add(new Programmer("name" + i, "post" + i));
        }
        System.out.println(programmers.get(3).getId() + " " + programmers.get(3).getName() + " " + programmers.get(3).getPost());

    }


}
