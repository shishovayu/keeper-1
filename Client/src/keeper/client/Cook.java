//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package keeper.client;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class Cook extends JFrame {
//    public static void main(String[] args) throws ClassNotFoundException {
//        new Cook("r_keeper: Cook");
//    }

    public Cook(String title) {
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
        JScrollPane treeScrollPane1 = new JScrollPane(tree);
        JScrollPane treeScrollPane2 = new JScrollPane();
        JSplitPane split = new JSplitPane(1, treeScrollPane1, treeScrollPane2);
        split.setOneTouchExpandable(true);
        split.setDividerLocation(150);
        Dimension minimumSize = new Dimension(100, 50);
        treeScrollPane1.setMinimumSize(minimumSize);
        treeScrollPane2.setMinimumSize(minimumSize);
        split.setPreferredSize(new Dimension(400, 200));
        JPanel leftPanel = new JPanel();
        JPanel bottomPanel = new JPanel();
        JPanel rightPanel = new JPanel();
        split.setLeftComponent(leftPanel);
        split.setRightComponent(rightPanel);
        leftPanel.setLayout(new BorderLayout());
        leftPanel.add(tree, "Center");
        leftPanel.add(bottomPanel, "South");
        bottomPanel.setLayout(new BorderLayout());
        bottomPanel.add(stopList, "North");
        bottomPanel.add(updateSL, "South");
        JButton btn1 = new JButton("order 1");
        JButton btn2 = new JButton("order 2");
        JButton btn3 = new JButton("order 3");
        rightPanel.setLayout(new BorderLayout());
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, 1));
        new JPanel();
        rightPanel.add((new JPanel()).add(new JLabel("ORDERS")), "North");
        rightPanel.add(centerPanel, "Center");
        centerPanel.add(btn1);
        centerPanel.add(btn2);
        centerPanel.add(btn3);
        btn1.setAlignmentX(0.5F);
        btn2.setAlignmentX(0.5F);
        btn3.setAlignmentX(0.5F);
        rightPanel.add(new JButton("OUT"), "South");
        add(split);
        pack();
        setVisible(true);
    }
}
