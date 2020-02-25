import java.util.Date;

public class DataTypes {

    public enum Status {
        ON_VACATION,
        BUSINESS_TRIP,
        WORKING,
        ABSENT,
        USING_WEEKEND_DAYS
    }

    public enum WorkPosition {
        PROGRAMMER,
        MARKETER,
        CLEANING,
        SECURITY,
        SEO,
        ACCOUNTANT,
        SCRUM_MASTER,
        TEAMLEAD
    }

    public enum EducationLevel {
        BA,
        BSc,
        MA,
        MSc,
        LLM,
        PhD,
        DPhill
    }

    class Education {
        EducationLevel level;
        String institution;
        Date from;
        Date to;
    }
}
