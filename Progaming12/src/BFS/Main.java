package BFS;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Node> graph;
    public static void main(String[] args) throws FileNotFoundException {
        setupTree();
//        DFS(graph.get(0));
        ArrayList<Node> queue = new ArrayList<>();
        queue.add(graph.get(0));
        BFS(queue);
    }

    private static void DFS(Node node) {
        System.out.println(node.getKey());
        node.setVisited(true);
        //Your code here.  Feel free to modify signature or add helper functions.
        for (Integer i : node.getNodes()) {
            for (Node n : graph) {
                if (n.getKey() == i && !n.isVisited()) {
                    DFS(n);
                }
            }
        }
    }

    private static void BFS(ArrayList<Node> queue) {
        //Your code here.  Feel free to modify signature or add helper functions.
        if (queue.isEmpty()) {
            return;
        }
        System.out.println(queue.get(0).getKey());
        queue.get(0).setVisited(true);
        for (Integer i : queue.get(0).getNodes()) {
            for (Node n : graph) {
                if (n.getKey() == i && !n.isVisited()) {
                    n.setVisited(true);
                    queue.add(n);
                }
            }
        }
        queue.remove(0);
        BFS(queue);
    }

    private static void setupTree() throws FileNotFoundException {
        graph = new ArrayList<>();
        Scanner scan = new Scanner(new File("tree.txt"));
        while(scan.hasNext()){
            String line = scan.nextLine();
            parseLine(line);
        }
    }

    private static void parseLine(String line) {
        String[] keys = line.split(" ");
        int key = Integer.parseInt(keys[0]);
        ArrayList<Integer> points = new ArrayList<>();
        for(int i = 1; i < keys.length;i++){
            points.add(Integer.parseInt(keys[i]));
        }
        graph.add(new Node(key, points));
    }
}
