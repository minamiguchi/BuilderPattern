public class Main {
	public static void main(String[] args) {
		 Builder builder = new PeopleBuilder();
		 Director director = new Director(builder);
		 director.construct();
		 builder.getResult().sayGoodbye();
	}
}