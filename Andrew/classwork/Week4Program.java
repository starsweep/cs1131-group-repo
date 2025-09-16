import java.util.Random;

public class Week4Program {
    public static void main(String[] args) {
        String[] noun = {
            "your mother",
            "your father",
            "that mouse over there",
            "everything you cherish",
            "Siffrin - protagonist of hit indie game \"In Stars and Time\" -",
            "Blizzard T. Husky",
            "Chuck Norris",
            "a greasy rat",
            "an assortment of strange creatures",
            "a giant bear",
            "Samuel Mitchell",
            "Charles Ceccardi",
            "Mitchell Oneka"
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
            "insult"
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
            "your face",
            "your mother",
            "your father"
        };
        Random generator = new Random();
        System.out.println("May " + noun[generator.nextInt(noun.length)] + " " + verb[generator.nextInt(verb.length)] + " " + object[generator.nextInt(object.length)]);
    }
}
