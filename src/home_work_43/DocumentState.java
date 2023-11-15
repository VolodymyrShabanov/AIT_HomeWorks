package home_work_43;

public enum DocumentState {
    DRAFT("В разработке"),
    PUBLISHED("Опубликованный"),
    DELETED("Удаленный");

    private final String russian;

    DocumentState(String russian){
        this.russian = russian;
    }

    public String getRussian(){
        return russian;
    }

}
