public class Person {

    int id;
    String name;
    String homeAddress;
    String email;

    Person(PersonBuilder builder)
    {
        this.id  = builder.id;
        this.name = builder.name;
        this.homeAddress = builder.homeAddress;
        this.email = builder.email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getEmail() {
        return email;
    }

    static class PersonBuilder
    {
        int id;
        String name;
        String homeAddress;
        String email;


        public PersonBuilder(int id, String name)
        {
            this.id = id;
            this.name = name;
        }

        public PersonBuilder setHomeAddress(String address)
        {
            this.homeAddress = address;
            return this;
        }

        public PersonBuilder setEmail(String email)
        {
            this.email = email;
            return this;
        }

        public Person build()
        {
            return new Person(this);
        }
    }

    public static void main(String[] args) {
        Person person = new PersonBuilder(1, "vinay").setEmail("abc@gmail.com").build();

        System.out.println(person.getEmail());
        System.out.println(person.getName());
    }
}
