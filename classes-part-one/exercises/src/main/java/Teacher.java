public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private Integer yearsTeaching;

    public Teacher (String firstName, String lastName, String subject, Integer yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public String getFirstName () {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSubject() {
        return subject;
    }
    public Integer getYearsTeaching() {
        return yearsTeaching;
    }
    public void setFirstName(String afirstName) {
        firstName = afirstName;
    }
    public void setLastName(String aLastName) {
        firstName = aLastName;
    }
    public void setSubject(String aSubject) {
        subject = aSubject;
    }
    public void setYearsTeaching(Integer aYearsTeaching) {
        yearsTeaching = aYearsTeaching;
    }

}
