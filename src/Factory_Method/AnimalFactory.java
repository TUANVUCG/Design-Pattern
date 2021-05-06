package Factory_Method;

public class AnimalFactory {
    public Animal getAnimal(String type){
        if(type.equals("Blue")){
            return new Dog();
        }
        else {
            return new Cat();
        }
    }
}
