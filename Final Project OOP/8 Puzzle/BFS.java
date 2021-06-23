/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EightPuzzle;

import java.util.*;

public class BFS {
    private Node root;
    private String goal;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public BFS(Node root, String goal) {
        this.root = root;
        this.goal = goal;
    }

    public void BreadthFirstSearch() {

        Set<String> state = new HashSet<String>();
        String rootState = root.getState();
        Node node = new Node(rootState);
        LinkedList<Node> list = new LinkedList<Node>();
        Node nodeSekarang = node;
        String nodeTemp = nodeSekarang.getState();
        while (!nodeTemp.equals(goal)) {
            state.add(nodeTemp);
            List<String> nodeSuccessors = OperasiNode.getMove(nodeTemp);
            for (String n : nodeSuccessors) {
                if (state.contains(n))
                    continue;
                state.add(n);
                Node child = new Node(n);
                nodeSekarang.addChild(child);
                child.setParent(nodeSekarang);
                list.add(child);

            }
            nodeSekarang = list.poll();
            nodeTemp = nodeSekarang.getState();
        }

        OperasiNode.Solusi(nodeSekarang, state, root);

    }
}
