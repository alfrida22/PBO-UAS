// Class Animal sebagai superclass
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Class Cat sebagai subclass dari Animal
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Meow");
    }
}

// Class Dog sebagai subclass dari Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Woof");
    }
}

// Class Main sebagai entry point program
public class Main {
    public static void main(String[] args) {
        // Membuat objek Cat dengan nama "Kitty"
        Animal animal1 = new Cat("Kitty");

        // Membuat objek Dog dengan nama "Buddy"
        Animal animal2 = new Dog("Buddy");

        try {
            // Memanggil metode makeSound() pada objek animal1
            animal1.makeSound();

            // Memanggil metode makeSound() pada objek animal2
            animal2.makeSound();
        } catch (Exception e) {
            // Menangkap exception yang terjadi dan menampilkan pesan error
            System.out.println("Error: " + e.getMessage());
        }
    }
}
