class Academician {
    String name;
    int age;

    Academician(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void studentSubject(String subject){
        System.out.print("Name: " + name +", Age : "+ age + ", Subject: "+ subject);
    }
}