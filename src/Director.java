public class Director {
	private Builder builder;

    Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.name("Tom");
        builder.age(12);
    }
}
