package pack1;

public interface Animal {
	
	default public String identifyMyself() {
        return "I am an animal.";
    }

}
