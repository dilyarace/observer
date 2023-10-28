public class Student implements Observer {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(Message m) {
        System.out.println(name + " received message: " + m.getMessageContent());
    }
}
