package dates;

import enums.StudentStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class StudentRecord {
    private String studentName;
    private LocalDate birthDate, enrollmentDate;
    private LocalDateTime nextExamDateTime;
    private StudentStatus status;

    public StudentRecord(){
        studentName="test";
        birthDate=LocalDate.of(1999,9,3);
        enrollmentDate=LocalDate.of(2017,9,15);
        nextExamDateTime=LocalDateTime.of(2026,3,25,10,30);
        status=StudentStatus.ACTIVE;
    }
    public StudentRecord(String name,
                         LocalDate birthDate,
                         LocalDate enrollmentDate,
                         LocalDateTime nextExamDateTime,
                         StudentStatus status){
        this.studentName=name;
        this.birthDate=birthDate;
        this.enrollmentDate=enrollmentDate;
        this.nextExamDateTime=nextExamDateTime;
        this.status=status;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setBirthDate(LocalDate birthDate){
        this.birthDate=birthDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public void setNextExamDateTime(LocalDateTime nextExamDateTime) {
        this.nextExamDateTime = nextExamDateTime;
    }

    public void setStatus(StudentStatus status) {
        this.status = status;
    }

    public StudentStatus getStatus() {
        return status;
    }

    public String getStudentName() {
        return studentName;
    }

    public LocalDateTime getNextExamDateTime() {
        return nextExamDateTime;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAgeInYears(){
        return Period.between(birthDate, LocalDate.now()).getYears();

    }
    public long gettDaysSinceEnrollment(){
        return ChronoUnit.DAYS.between(enrollmentDate, LocalDate.now());
    }
    public boolean hasUpcomingExam(){
        return nextExamDateTime.isAfter(LocalDateTime.now());
    }
    public String getFormattedEnrollmentDate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return enrollmentDate.format(formatter);
    }

    @Override
    public String toString(){
        return "Student name:"+studentName+", birth date:"+birthDate;
    }

    public static void main() {
        StudentRecord s1 = new StudentRecord();
        StudentRecord s2 = new StudentRecord(
                "Test",
                LocalDate.of(2002,4,15),
                LocalDate.of(2025,9,1),
                LocalDateTime.of(2026,3,25,10,30),
                StudentStatus.GRADUATED);
        StudentRecord student3 = new StudentRecord(
                "Maria",
                LocalDate.of(2003, 7, 21),
                LocalDate.of(2025, 1, 20),
                LocalDateTime.of(2026, 5, 5, 14, 45),
                StudentStatus.INACTIVE
        );

        System.out.println(s1.toString());
        System.out.println(s1.getBirthDate());
        System.out.println(s1.getStatus());
        System.out.println(s1.toString());
        System.out.println(s2);


    }
}
