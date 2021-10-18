package TP1;

public class App {
    public static void main(String[] args) {
        Student hermione = new Student(4444, "Hermione", 10);
        Student harry = new Student(4445, "Harry", 7);
        Student ron = new Student(4446, "Ron", 8);
        Student draco = new Student(4447, "Draco", 7);
        Student luna = new Student(4448, "Luna", 10);
        Teacher severus = new Teacher(2345, "Severus");
        Subject DADA = new Subject(severus, 0, "Defence  Against the  Dark  Arts");
        severus.addSubject(DADA);
        Subject PotionsMaster = new Subject(severus, 1, "Potions Master");
        severus.addSubject(PotionsMaster);
        DADA.addStudent(hermione);
        DADA.addStudent(harry);
        DADA.addStudent(ron);
        DADA.addStudent(draco);
        TP tpDadaHarry1 = new TP(DADA, harry, 0, "First  TP");
        TP tpDadaHarry2 = new TP(DADA, harry, 1, "Second  TP");
        TP tpDadaHermione1 = new TP(DADA, hermione, 2, "First TP");
        TP tpDadaHermione2 = new TP(DADA, hermione, 3, "Second TP");
        TP tpDadaRon1 = new TP(DADA, ron, 4, "First  TP");
        TP tpDadaRon2 = new TP(DADA, ron, 5, "Second  TP");
        TP tpDadaDraco1 = new TP(DADA, draco, 6, "First  TP");
        TP tpDadaDraco2 = new TP(DADA, draco, 7, "Second  TP");
        DADA.getTpManagment().deliver(tpDadaHarry1);
        DADA.getTpManagment().deliver(tpDadaHermione1);
        DADA.getTpManagment().deliver(tpDadaRon2);
        DADA.getTpManagment().deliver(tpDadaDraco1);
        try {
            PotionsMaster.getTpManagment().correct();
        } catch (EmptyTPsException e) {
            System.out.println(e.getMessage());
        }
        while (!DADA.getTpManagment().isEmpty()) {
            try {
                System.out.println(DADA.getTpManagment().correct());
            } catch (EmptyTPsException e) {
                System.out.println(e.getMessage());
                ;
            }
        }
        TP tpDadaDraco3 = new TP(DADA, draco, 8, "third  TP");
        DADA.getTpManagment().deliver(tpDadaDraco2);
        DADA.getTpManagment().deliver(tpDadaHarry2);
        DADA.getTpManagment().deliver(tpDadaHermione2);
        DADA.getTpManagment().deliver(tpDadaRon1);
        DADA.getTpManagment().deliver(tpDadaDraco3);
        System.out.println(DADA.getTpManagment().studentsTps());
        PotionsMaster.addStudent(luna);
        System.out.println(severus.studentsInOrder());
    }
}
//Output: 
//You  have  already  corrected  all  the  tps 
//TP  from:  Hermione  Name:  First  TP 
//TP  from:  Ron  Name:  Second  TP 
//TP  from:  Draco  Name:  First  TP 
//TP  from:  Harry  Name:  First  TP 

//{Draco=[TP from: Draco Name: Second TP, TP from: Draco Name: third TP], Ron=[TP from: Ron Name: First  TP],  Hermione=[TP  from:  Hermione  Name:  Second  TP],  Harry=[TP  from:  Harry  Name:  Second  TP]} 
//[Draco,  Harry,  Hermione,  Luna,  Ron]