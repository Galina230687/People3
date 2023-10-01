public class PersonBuilder {
    //...

    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalStateException("Не верно задано имя");
        } else this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (surname == null || surname.isEmpty()) {
            throw new IllegalStateException("Не верно задана фамилия");
        } else {
            this.surname = surname;
        }
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        if (age < 0) {  //установить возраст
            throw new IllegalStateException("Неправильно задан возраст");
        } else {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        Person person;
        this.address = address;
        return this;
    }

    public Person build() {
        Person person;
        person = new Person(name, surname, age, address);
        return person;
    }
}