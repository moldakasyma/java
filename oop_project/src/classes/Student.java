package OOP;

import java.util.Set;
import java.util.HashSet;

/**
* @generated
*/
public class Student extends User implements Attendance, Comparable, Serializable {
    
    /**
    * @generated
    */
    private String name;
    
    /**
    * @generated
    */
    private Integer id;
    
    /**
    * @generated
    */
    private Degree degree;
    
    /**
    * @generated
    */
    private Faculty faculty;
    
    /**
    * @generated
    */
    private HashMap<Course,point> marks;
    
    /**
    * @generated
    */
    private Transcript transcript;
    
    /**
    * @generated
    */
    private Schedule schedule;
    
    /**
    * @generated
    */
    private invalid organization;
    
    /**
    * @generated
    */
    private invalid supervisor;
    
    /**
    * @generated
    */
    private Integer credit;
    
    /**
    * @generated
    */
    private String name;
    
    /**
    * @generated
    */
    private Integer id;
    
    /**
    * @generated
    */
    private Degree degree;
    
    /**
    * @generated
    */
    private Faculty faculty;
    
    /**
    * @generated
    */
    private HashMap<Course,mark> marks;
    
    /**
    * @generated
    */
    private Transcript transcript;
    
    /**
    * @generated
    */
    private Schedule schedule;
    
    /**
    * @generated
    */
    private Organizations organization;
    
    /**
    * @generated
    */
    private invalid supervisor;
    
    /**
    * @generated
    */
    private Integer credit;
    
    
    /**
    * @generated
    */
    private GraduateStudent graduateStudent;
    
    /**
    * @generated
    */
    private Teacher teacher;
    
    /**
    * @generated
    */
    private Set<Lesson> lesson;
    
    /**
    * @generated
    */
    private Set<Course> course;
    
    /**
    * @generated
    */
    private Transcript transcript2;
    
    /**
    * @generated
    */
    private markReport markReport;
    
    /**
    * @generated
    */
    private Schedule schedule2;
    
    /**
    * @generated
    */
    private Mark mark;
    
    /**
    * @generated
    */
    private Organizations organizations;
    
    /**
    * @generated
    */
    private Organizations organizations;
    
    
    /**
    * @generated
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * @generated
    */
    public String setName(String name) {
        this.name = name;
    }
    
    /**
    * @generated
    */
    public Integer getId() {
        return this.id;
    }
    
    /**
    * @generated
    */
    public Integer setId(Integer id) {
        this.id = id;
    }
    
    /**
    * @generated
    */
    public Degree getDegree() {
        return this.degree;
    }
    
    /**
    * @generated
    */
    public Degree setDegree(Degree degree) {
        this.degree = degree;
    }
    
    /**
    * @generated
    */
    public Faculty getFaculty() {
        return this.faculty;
    }
    
    /**
    * @generated
    */
    public Faculty setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
    
    /**
    * @generated
    */
    public HashMap<Course,point> getMarks() {
        return this.marks;
    }
    
    /**
    * @generated
    */
    public HashMap<Course,point> setMarks(HashMap<Course,point> marks) {
        this.marks = marks;
    }
    
    /**
    * @generated
    */
    public Transcript getTranscript() {
        return this.transcript;
    }
    
    /**
    * @generated
    */
    public Transcript setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }
    
    /**
    * @generated
    */
    public Schedule getSchedule() {
        return this.schedule;
    }
    
    /**
    * @generated
    */
    public Schedule setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
    
    /**
    * @generated
    */
    public invalid getOrganization() {
        return this.organization;
    }
    
    /**
    * @generated
    */
    public invalid setOrganization(invalid organization) {
        this.organization = organization;
    }
    
    /**
    * @generated
    */
    public invalid getSupervisor() {
        return this.supervisor;
    }
    
    /**
    * @generated
    */
    public invalid setSupervisor(invalid supervisor) {
        this.supervisor = supervisor;
    }
    
    /**
    * @generated
    */
    public Integer getCredit() {
        return this.credit;
    }
    
    /**
    * @generated
    */
    public Integer setCredit(Integer credit) {
        this.credit = credit;
    }
    
    /**
    * @generated
    */
    private String getName() {
        return this.name;
    }
    
    /**
    * @generated
    */
    private String setName(String name) {
        this.name = name;
    }
    
    /**
    * @generated
    */
    private Integer getId() {
        return this.id;
    }
    
    /**
    * @generated
    */
    private Integer setId(Integer id) {
        this.id = id;
    }
    
    /**
    * @generated
    */
    private Degree getDegree() {
        return this.degree;
    }
    
    /**
    * @generated
    */
    private Degree setDegree(Degree degree) {
        this.degree = degree;
    }
    
    /**
    * @generated
    */
    private Faculty getFaculty() {
        return this.faculty;
    }
    
    /**
    * @generated
    */
    private Faculty setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
    
    /**
    * @generated
    */
    private HashMap<Course,mark> getMarks() {
        return this.marks;
    }
    
    /**
    * @generated
    */
    private HashMap<Course,mark> setMarks(HashMap<Course,mark> marks) {
        this.marks = marks;
    }
    
    /**
    * @generated
    */
    private Transcript getTranscript() {
        return this.transcript;
    }
    
    /**
    * @generated
    */
    private Transcript setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }
    
    /**
    * @generated
    */
    private Schedule getSchedule() {
        return this.schedule;
    }
    
    /**
    * @generated
    */
    private Schedule setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
    
    /**
    * @generated
    */
    private Organizations getOrganization() {
        return this.organization;
    }
    
    /**
    * @generated
    */
    private Organizations setOrganization(Organizations organization) {
        this.organization = organization;
    }
    
    /**
    * @generated
    */
    private invalid getSupervisor() {
        return this.supervisor;
    }
    
    /**
    * @generated
    */
    private invalid setSupervisor(invalid supervisor) {
        this.supervisor = supervisor;
    }
    
    /**
    * @generated
    */
    private Integer getCredit() {
        return this.credit;
    }
    
    /**
    * @generated
    */
    private Integer setCredit(Integer credit) {
        this.credit = credit;
    }
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public void viewSchedule() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public void viewCourses(course:Course)() {
        //TODO
        return null;
    }
    
    /**
    * @param courseName 
     * @generated
    */
    public void registerToCourse(String courseNamecourse:Course)() {
        //TODO
        return null;
    }
    
    /**
    * @param courseName 
     * @generated
    */
    public boolean dropCourse(String courseNamecourse:Course)() {
        //TODO
        return false;
    }
    
    /**
    * @generated
    */
    public String addCourse(course:Course)() {
        //TODO
        return "";
    }
    
    /**
    * @generated
    */
    public void viewInfoTeacher(login:String)() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public double viewMark() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public String viewTranscript() {
        //TODO
        return "";
    }
    
    /**
    * @generated
    */
    public void rateTeacher(login:String, point:double)() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public void putAttendance() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public void makeRequest() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public Faculty changeFaculty() {
        //TODO
        return OOP.Faculty.SITE;
    }
    
    /**
    * @generated
    */
    public void viewAttestation() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public void viewTacherList() {
        //TODO
        return null;
    }
    
    /**
    * @generated
    */
    public void viewGradeBook() {
        //TODO
        return null;
    }
    
    
}
