package dmit2015.views;

import dmit2015.model.StudentInfo;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped

public class StudentListSession implements Serializable {
    private List<StudentInfo> students = new ArrayList<>();

    public List<StudentInfo> getStudents() {
        return students;
    }
}
