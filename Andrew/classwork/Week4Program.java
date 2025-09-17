/*
* @author Andrew Martin
*/

public class Week4Program {
    public static void main(String[] args) {
        // Declare a list of nouns
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
        // Declare a list of verbs
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
            "kiss",
            "sit on",
            "write love letters to",
            "make a popsicle out of",
            "spill water on",
            "go to the beach that makes you old with"
        };
        // Declare a list of objects
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
        // String together an insult by picking a random element from each list
        System.out.printf("May %s %s %s", noun[(int)(Math.random() * noun.length)], verb[(int)(Math.random() * verb.length)], object[(int)(Math.random() * object.length)]);
    }
}
