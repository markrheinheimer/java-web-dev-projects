public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setStudentId(Integer studentId) {
                this.studentId = studentId;
        }

        public void setNumberOfCredits(Integer setNumberOfCredits) {
                this.numberOfCredits = setNumberOfCredits;
        }

        public void setGpa(Double gpa) {
                this.gpa = gpa;
        }

        public String getName() {
                return name;
        }

        public Integer getStudentId() {
                return studentId;
        }

        public Integer getNumberOfCredits() {
                return numberOfCredits;
        }

        public Double getGpa() {
                return gpa;
        }
}

