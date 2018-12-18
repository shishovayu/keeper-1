//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package keeper.client;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class Barman extends JFrame {
//    public static void main(String[] args) {
//        new Barman("keeper: Barman");
//    }

    public Barman(String title) {
        super(title);
        this.setDefaultCloseOperation(3);
        DefaultMutableTreeNode Root = new DefaultMutableTreeNode("Menu");
        DefaultMutableTreeNode food = new DefaultMutableTreeNode("Kitchen");
        DefaultMutableTreeNode drinks = new DefaultMutableTreeNode("Bar");
        DefaultMutableTreeNode stuff1 = new DefaultMutableTreeNode("БОРЩ");
        JTree tree = new JTree(Root);
        Root.add(food);
        Root.add(drinks);
        food.add(stuff1);
        JButton stopList = new JButton("Show stoplist");
        JButton updateSL = new JButton("Update stoplist");
        JButton createOrder = new JButton("Create order");
        JScrollPane treeScrollPane1 = new JScrollPane(tree);
        JScrollPane treeScrollPane2 = new JScrollPane(tree);
        JSplitPane split = new JSplitPane(1, treeScrollPane1, treeScrollPane2);
        split.setOneTouchExpandable(true);
        split.setDividerLocation(150);
        Dimension minimumSize = new Dimension(100, 50);
        treeScrollPane1.setMinimumSize(minimumSize);
        treeScrollPane2.setMinimumSize(minimumSize);
        split.setPreferredSize(new Dimension(400, 200));
        JPanel leftPanel = new JPanel();
        JPanel topPanel = new JPanel();
        split.setLeftComponent(leftPanel);
        leftPanel.setLayout(new BorderLayout());
        leftPanel.add(topPanel, "North");
        topPanel.setLayout(new GridLayout(3, 1));
        topPanel.add(createOrder);
        topPanel.add(stopList);
        topPanel.add(updateSL);
        this.add(split);
        this.pack();
        this.setVisible(true);
    }
}
