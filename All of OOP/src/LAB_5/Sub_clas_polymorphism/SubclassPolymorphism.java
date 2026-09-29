package LAB_5.Sub_clas_polymorphism;

public class SubclassPolymorphism {
    public static void main(String[] args) {
//        // subclass polymorphism refers to
//        // child object unsing parent class reference
//        Animal ref= new Tiger(5,"blackYellow","Royal Bengal");
//        ref.makesound();
//       // ref.Eat();// Animal ref does not know anything about eat mehtod
//
//        //casting Animal ref Tiger
//       // ((Tiger)ref).Eat(); // Compiler Doesn't Know About this if this ref is A object of the Tiger.
//        // I am sure of it that's why I am giving it here;
//        //or I can simply just check about it
//        if(ref instanceof Tiger) ((Tiger)ref).Eat();
//
//
//        Animal ref2=new Dog(3,"Red","Mike");
//        ref2.makesound();
        // Usage 1: Store objects of different class in a single Array;

        Animal[] animals=new Animal[5];// One single array can Store multiple Different class Objects
        animals[0]=new Animal(2,"White");
        animals[1]=new Tiger(2,"Black","Blacky");
        animals[2]=new Tiger(5,"Yello","Royal Bengal");
        animals[3]=new Dog(4,"Golden","Happy");
        animals[4]=new Dog(5,"Brown","Bulldog");

        // Usage: Loop thorough the Objects;
        for(Animal A:animals)
        {
            A.makesound();
            A.Print_all();
            if(A instanceof Tiger)
            {
                ((Tiger)A).Eat();
            }
            System.out.println("----------------");
        }
    }
}
