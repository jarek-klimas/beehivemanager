package milosz.spring01.model;

public enum BeehiveMark {

    EXCELENT("EXCELENT"),
    GOOD("GOOD"),
    BAD("BAD");

    private final String name;
    //private constructor not required for enum as they are private by default
    private BeehiveMark(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
