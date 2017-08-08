package test.company;

abstract public class Worker {
    private static int count = 0;
    private int id = 0;
    private String name;
    private String post;

    Worker(String name, String post) {
        this.name = name;
        this.post = post;
        this.id = count;
        this.count++;
    }

    public String getName() {
        return name;
    }
    public String getPost() {
        return post;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPost(String post) {
        this.post = post;
    }

}
