public class PeopleBuilder implements Builder {
	private People people;

    public PeopleBuilder() {
        this.people = new People();
    }

    @Override
    public void name(String name) {
        people.setName(name);
    }
    
    @Override
    public void age(Integer age) {
        people.setAge(age);
    }

    @Override
    public People getResult() {
        if (people.getName() == null || people.getAge() == null) {
            throw new NullPointerException();
        }
        return this.people;
    }
}
