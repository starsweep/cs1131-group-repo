import java.util.Random;

public class Week4Program {
    public static void main(String[] args) {
        String[] noun = {
            "you",
            "your mother",
            "your father",
            "that mouse over there",
            "everything you cherish",
            "Keanu Reeves",
            "Gordon Ramsay",
            "Blizzard T. Husky",
            "Chuck Norris",
            "a greasy rat",
            "an assortment of strange creatures",
            "a giant bear",
            "Hatsune Miku",
            "the president of The United States of America",
            "an awesome lesbian couple",
            "Samuel Mitchell",
            "Charles Ceccardi",
            "Mitchell Oneka",
            "Arthur Socia",
            "Silas Winter",
            "Christian Zalenski"
        };
        String[] verb = {
            "sudo rm -rf /",
            "eat",
            "write terrible fanfiction about",
            "steal",
            "submit the wrong code for",
            "screech loudly at",
            "belittle",
            "cook",
            "kill",
            "bear witness to",
            "catfish",
            "curse",
            "insult",
            "make a parody of",
            "marry",
            "dispose of",
            "worsen",
            "mangle",
            "defenestrate",
            "blow up",
            "kiss"
        };
        String[] object = {
            "your computer",
            "all your soup",
            "your favorite character",
            "your extended lineage",
            "an embarrassing mistake",
            "your physical attributes",
            "all your money",
            "your CS1131 group",
            "a pot of rancid stew",
            "the president of The United States of America",
            "Brazil",
            "your face",
            "your mother",
            "your father",
            "your job",
            "your family",
            "your student loans",
            "you",
            "Samuel Mitchell",
            "Charles Ceccardi",
            "Mitchell Oneka",
            "Arthur Socia",
            "Silas Winter",
            "Christian Zalenski"
        };
        Random generator = new Random();
        System.out.println("May " + noun[generator.nextInt(noun.length)] + " " + verb[generator.nextInt(verb.length)] + " " + object[generator.nextInt(object.length)]);
    }
}
