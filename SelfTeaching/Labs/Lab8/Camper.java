public class Camper {
    private String firstName;
    private String lastName;
    private String campType;
    private String ageGroup;
    private java.util.ArrayList<String> activities;
    private java.util.ArrayList<String> mentors;

    public Camper(String firstName, String lastName, String campType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.campType = campType;
        this.activities = new java.util.ArrayList<>();
        this.mentors = new java.util.ArrayList<>();
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public void setActivities(java.util.List<String> activities) {
        if (activities == null)
            return;
        this.activities = new java.util.ArrayList<String>(activities);
    }

    public void setMentors(java.util.List<String> mentors) {
        if (mentors == null)
            return;
        this.mentors = new java.util.ArrayList<String>(mentors);
    }

    public String toString() {
        return "firstName: " + firstName + "\n" +
                "lastName: " + lastName + "\n" +
                "camp type: " + campType + "\n" +
                "age group: " + ageGroup + "\n" +
                "activities: " + activities + "\n" +
                "mentors: " + mentors;
    }
}