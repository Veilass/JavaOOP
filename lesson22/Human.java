package com.company.lesson22;

public class Human {
    final String sex;
   public Human(String sex){
        this.sex = sex;
    }

    private boolean clever;

    public boolean isClever(){
        return clever;
    }


    private StringBuilder name;


    public StringBuilder getName(){
        StringBuilder sb =new StringBuilder(name);
        return sb;
    }
    public void setName(StringBuilder s){
        name = s;
    }

    private int age;

    public int getAge(){
        return age;
    }

        public void setAge(int i){
        if(i>0){
            age = i;
        }
    }
    private int weight;

    public int getWeight(){
        return weight;
    }

    public void setWeight(int i){
        if(i>0){
            weight = i;
        }
    }

}

class Test{
    public static void main(String[] args) {
        Human c = new Human("male");
        c.setName(new StringBuilder("Kolya"));
        c.getName().append("!!!!!");
        System.out.println(c.getName());
    }
}
