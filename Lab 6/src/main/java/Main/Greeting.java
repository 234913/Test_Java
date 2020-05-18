package Main;

public class Greeting {
    private final long id;
    private final String content;
    private final String age;
    private final String plec;



    public Greeting(long id, String content, String age, String plec) {
        this.id = id;
        this.content = content;
        this.age = age;
        this.plec = plec;


    }
    public long getId() {
        return id;
    }

    public String getAge() {
        return age;
    }

    public String getContent() {
        return content;
    }

    public String getPlec() {
        return plec;
    }
}