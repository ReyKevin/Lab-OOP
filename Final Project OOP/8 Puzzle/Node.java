/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EightPuzzle;

import java.util.ArrayList;

public class Node {
    
    private String state;
    private ArrayList<Node> child;
    private Node parent;

    public Node(String state) {
        this.state = state;
        child = new ArrayList<Node>();
    }
    
    public void setState(String state) {
        this.state = state;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public String getState() {
        return state;
    }

    public ArrayList<Node> getChild() {
        return child;
    }

    public void addChild(Node child1) {
        child.add(child1);
    }
}
