import model.*;

public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter","(Гриффиндор)",2,3,3,4,5);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger","(Гриффиндор)",1,2,4,4,5);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley","(Гриффиндор)",3,2,2,1, 4);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy","(Слизерин)",2,3,4, 5, 6,7,1);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle","(Слизерин)",0,1,2,3, 4, 5,6);
        Slytherin grahamMontague = new Slytherin("Graham Montague","(Слизерин)",7,2,4,3, 4, 3,3);

        Hufflepuff zachariahSmith = new Hufflepuff("Zachariah Smith","(Пуффендуй)",5,5,5,5,5);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory","(Пуффендуй)",5,9,5,7,5);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch Fletchley","(Пуффендуй)",6,2,6,9,2);

        Ravenclaw zhouChang = new Ravenclaw("Zhou Chang","(Когтевран)",7,8,3,5,6);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil","(Когтевран)",7,6,3,5,2);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby","(Когтевран)",5,7,7,3,6);

        System.out.println("\nСравнение студентов одного факультета между собой по свойствам, присущим данному факультету: \n");
        harryPotter.likenStudentsGryf(hermioneGranger);
        dracoMalfoy.likenStudentsSlyth(gregoryGoyle);
        cedricDiggory.likenStudentsHuff(zachariahSmith);
        padmaPatil.likenStudentsRaven(zhouChang);

        System.out.println("\nСравнение студентов из разных факультетов по силе магии и расстоянию трансгрессии: \n");
        Hogwarts.likenStudentsHogw(harryPotter,dracoMalfoy);
        Hogwarts.likenStudentsHogw(justinFinchFletchley,grahamMontague);
        Hogwarts.likenStudentsHogw(ronWeasley,marcusBelby);
    }
}