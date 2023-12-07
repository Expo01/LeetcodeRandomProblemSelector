import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pair> learned = new ArrayList<>();
        ArrayList<Pair> problems = new ArrayList<>();

        problems.add(new Pair(1,"2 sum"));
        problems.add(new Pair(20, "Valid parentheses"));
        problems.add(new Pair(21, "Merge two linked lists"));
        problems.add(new Pair(121, "best time to buy and sell a stock"));
        problems.add(new Pair(125,"valid palindrome"));
        problems.add(new Pair(226,"invert binary tree"));
        problems.add(new Pair(242,"valid anagram"));
        problems.add(new Pair(704,"binary search"));
        problems.add(new Pair(773,"flood fill"));
        problems.add(new Pair(235,"lowest common ancestor of a binary search tree"));
        problems.add(new Pair(110,"balanced binary tree"));
        problems.add(new Pair(141,"detect cycle in a linked list"));
        problems.add(new Pair(232,"implement queue using stack"));
        problems.add(new Pair(278,"first bad version"));
        problems.add(new Pair(383,"ransom note"));
        problems.add(new Pair(70,"climbing stairs"));
        problems.add(new Pair(409,"longest palindrome"));
        problems.add(new Pair(206,"reverse a linked list"));
        problems.add(new Pair(169,"majority element"));
        problems.add(new Pair(67,"add binary"));
        problems.add(new Pair(543,"diameter of a binary tree"));
        problems.add(new Pair(876,"middle of a linked list"));
        problems.add(new Pair(104,"maximum depth of a binary tree"));
        problems.add(new Pair(218,"contains duplicate"));
        problems.add(new Pair(252,"meeting rooms"));
        problems.add(new Pair(13,"roman to integer"));
        problems.add(new Pair(844,"backspace string compare"));
        problems.add(new Pair(338,"counting bits"));
        problems.add(new Pair(100,"same tree"));
        problems.add(new Pair(191,"number of bits"));
        problems.add(new Pair(14,"longest common prefix"));
        problems.add(new Pair(136,"single number"));
        problems.add(new Pair(234,"palindrome linked list"));
        problems.add(new Pair(183,"move zeros"));
        problems.add(new Pair(101,"symmetric tree"));
        problems.add(new Pair(268,"missing number"));
        problems.add(new Pair(9,"palindrome number"));
        problems.add(new Pair(108,"converted sorted array to binary search tree"));
        problems.add(new Pair(190,"reverse bits"));
        problems.add(new Pair(572,"subtree of another tree"));
        problems.add(new Pair(977,"squares of a sorted array"));


        Random selector = new Random();
        int bound = problems.size();
        selectNext(selector,bound,problems);

//        removeAndStore(0,problems,learned);
    }

    private static void selectNext(Random selector, int bound, ArrayList<Pair> problems){
        int index = selector.nextInt(bound);
        Pair selection = problems.get(index);
        System.out.println("next problem # = " + selection.getProblemNumber() + " : " + selection.getProblemName() +
                " stored at index " + index);
    }

    private static void removeAndStore(int index, ArrayList<Pair> problems, ArrayList<Pair> learned){
        Pair temp = problems.get(index);
        problems.remove(index);
        learned.add(temp);
    }
}



class Pair{
    int problemNumber;
    String problemName;

    public Pair(int problemNumber, String problemName) {
        this.problemNumber = problemNumber;
        this.problemName = problemName;
    }
    public int getProblemNumber() {
        return problemNumber;
    }
    public String getProblemName() {
        return problemName;
    }
}




//        ArrayList<Integer> problems = new ArrayList<>();
//        problems.add(13);
//        problems.add(19);
//        problems.add(25);
//
//        Random selector = new Random();
//        int bound = problems.size();
//        System.out.println(problems.get(selector.nextInt(bound)));