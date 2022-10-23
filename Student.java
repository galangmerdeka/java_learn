class Student extends Academician {

    Student(String name, int age) {
        super(name, age);
        //TODO Auto-generated constructor stub
    }

    @Override
    void studentSubject(String subject){
        System.out.println("I am a Student");
        System.out.print("Name: " + name +", Age : "+ age + ", Subject: "+ subject);
    }
    
}