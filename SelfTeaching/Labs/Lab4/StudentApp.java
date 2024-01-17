public class StudentApp {
    public static void main(String[] args) {
        // Create Undergraduate objects
        // Undergraduate u1 = new Undergraduate();
        // u1.setName("Barry Allen");
        // u1.setFees(30.00);
        // u1.setMajor("Forensics");
        // u1.setMinor("Athletics");
        // u1.setCredits(25);

        // Undergraduate u2 = new Undergraduate();
        // u2.setName("John Rambo");
        // u2.setFees(40.00);
        // u2.setMajor("Conflict Analysis");
        // u2.setMinor("International Affairs");
        // u2.setCredits(20);

        // Undergraduate u3 = new Undergraduate();
        // u3.setName("Ellen Ripley");
        // u3.setFees(50.00);
        // u3.setMajor("Astrobiology");
        // u3.setMinor("Conflict Analysis");
        // u3.setCredits(15);

        // System.out.println(u1.toString());
        // System.out.println(u2.toString());
        // System.out.println(u3.toString());

        Postgraduate p1 = new Postgraduate("John McClain", "Prof. Asp Pirin", "How to Die Hard");
        p1.setStatus("Part-time");

        Postgraduate p2 = new Postgraduate("Brian Mills", "Dr. No Kia", "Mobile Usage Patterns in Hostage Situations");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
