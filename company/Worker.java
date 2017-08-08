package test.company;

abstract public class Worker {
    private String name;
    private String post;

    Worker(String name, String post) {
        this.name = name;
        this.post = post;
    }

    public String getName() {
        return name;
    }
    public String getPost() {
        return post;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPost(String post) {
        this.post = post;
    }

}
