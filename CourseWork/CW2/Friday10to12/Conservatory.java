package CourseWork.CW2.Friday10to12;

import java.util.ArrayList;

public class Conservatory {
    private ArrayList<Solarium> sections;

    public Conservatory() {
        this.sections = new ArrayList<Solarium>();
    }

    public void add(Solarium solarium) {
        this.sections.add(solarium);
    }

}
