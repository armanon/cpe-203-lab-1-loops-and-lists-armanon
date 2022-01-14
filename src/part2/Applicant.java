package part2;
import part1.CourseGrade;
import java.util.List;

public class Applicant
{
    private String name;
    private List<CourseGrade> grades;
    private boolean ifFail;

    public Applicant(String name, List<CourseGrade> grades, boolean ifFail)
    {
        this.name = name;
        this.grades = grades;
        this.ifFail = ifFail;
    }

    public String getName()
    {
        return this.name;
    }

    public List<CourseGrade> getGrades()
    {
        return this.grades;
    }

    public boolean ifFail()
    {
        return this.ifFail;
    }

    public CourseGrade getGradeFor(String course)
    {
        for(int i = 0; i < grades.size(); i++)
        {
            grades.get(i);
            if(grades.get(i).getCourseName() == course)
            {
                return grades.get(i);
            }
        }
        return null;
    }

}
