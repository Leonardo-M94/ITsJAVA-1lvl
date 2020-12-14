package ru.itsjava.oop;

public class Lion extends Cat {
    // FIELDS
    // Use <final> for unchanged completed variable
    private String name;


    // CONSTRUCTORS
    public Lion(){  // Default constructor is object creating method.
    }

    public Lion(String lionName){   // Constructor with parameter.
        if ((lionName != null) && (!lionName.isEmpty())){
            this.name = lionName;
        }
    }


    // METHODS
    public void sayR(){
        System.out.println(name + " RRRRRR");
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }
}
