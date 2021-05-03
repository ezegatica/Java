package Desafio;

public class Main {

    public static void main(String[] args) {
 
        Teacher Natu = new Teacher(22222,1,"Natu",120,"programación");
 
        Doctor doc1 = new Doctor(123,2,"Lucas",200,"cirugía");
 
        Doctor doc2 = new Doctor(122,3,"Nina");
 
        System.out.println(Natu.getStudent());//120
 
        System.out.println(Natu.getSubject());//programación
 
        System.out.println(doc1.getSpecialty());//cirugía
 
        System.out.println(doc2.getSpecialty());//general
 
    }
 
 }