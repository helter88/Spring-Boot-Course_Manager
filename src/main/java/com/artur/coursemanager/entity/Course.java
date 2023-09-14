package com.artur.coursemanager.entity;

public class Course {
    
    private Long course_id;
    private String courseName;
    private String courseDuration;
    private String courseDescription;

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((course_id == null) ? 0 : course_id.hashCode());
        result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
        result = prime * result + ((courseDuration == null) ? 0 : courseDuration.hashCode());
        result = prime * result + ((courseDescription == null) ? 0 : courseDescription.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Course other = (Course) obj;
        if (course_id == null) {
            if (other.course_id != null)
                return false;
        } else if (!course_id.equals(other.course_id))
            return false;
        if (courseName == null) {
            if (other.courseName != null)
                return false;
        } else if (!courseName.equals(other.courseName))
            return false;
        if (courseDuration == null) {
            if (other.courseDuration != null)
                return false;
        } else if (!courseDuration.equals(other.courseDuration))
            return false;
        if (courseDescription == null) {
            if (other.courseDescription != null)
                return false;
        } else if (!courseDescription.equals(other.courseDescription))
            return false;
        return true;
    }
    
}
