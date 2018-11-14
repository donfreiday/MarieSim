
// File:        MarieSim1.java
// Author:      Julie Lobur
// JDK Version: 1.3.1
// Date:        November 9, 2001
// Notice:      This code may be freely used for noncommercial purposes.
import MarieSimulator.MarieSim;
import javax.swing.UIManager;
import java.awt.Color;

/******************************************************************************************
 * This console application creates an instance of the MARIE machine simulator.
 * See * MarieSim.java for details. *
 ******************************************************************************************/
public class MarieSim1 {
  public static void main(String args[]) {
      UIManager.put("MenuBar.background", Color.BLACK);
      UIManager.put("MenuBar.foreground", Color.WHITE);
      UIManager.put("Menu.background", Color.BLACK);
      UIManager.put("Menu.foreground", Color.WHITE);
      UIManager.put("MenuItem.background", Color.BLACK);
      UIManager.put("MenuItem.foreground", Color.WHITE);
      UIManager.put("Button.background", Color.BLACK);
      UIManager.put("Button.foreground", Color.WHITE);
      UIManager.put("ScrollPane.background", Color.DARK_GRAY);
      UIManager.put("ScrollPane.foreground", Color.WHITE);
      UIManager.put("Panel.background", Color.DARK_GRAY);
      UIManager.put("Panel.foreground", Color.WHITE);
      UIManager.put("TableHeader.background", Color.DARK_GRAY);
      UIManager.put("TableHeader.foreground", Color.WHITE);
      UIManager.put("ScrollBar.background", Color.DARK_GRAY);
      UIManager.put("ScrollBar.foreground", Color.BLACK);
      UIManager.put("Pane.background", Color.BLACK);
      UIManager.put("Pane.foreground", Color.WHITE);
      UIManager.put("TextArea.background", Color.DARK_GRAY);
      UIManager.put("TextArea.foreground", Color.WHITE);
      UIManager.put("ComboBox.background", Color.DARK_GRAY);
      UIManager.put("ComboBox.foreground", Color.WHITE);
      UIManager.put("Dialog.background", Color.BLACK);
      UIManager.put("Dialog.foreground", Color.WHITE);
      UIManager.put("Label.background", Color.BLACK);
      UIManager.put("Label.foreground", Color.WHITE);
      UIManager.put("TextField.background", Color.BLACK);
      UIManager.put("TextField.foreground", Color.WHITE);
      UIManager.put("TableCell.background", Color.BLACK);
      UIManager.put("TableCell.foreground", Color.WHITE);
      UIManager.put("Table.background", Color.DARK_GRAY);
      UIManager.put("TableColumn.foreground", Color.WHITE);
      UIManager.put("TableColumn.background", Color.DARK_GRAY);
      UIManager.put("Viewport.foreground", Color.WHITE);
      UIManager.put("Viewport.background", Color.DARK_GRAY);
      UIManager.put("EditorPane.foreground", Color.WHITE);
      UIManager.put("EditorPane.background", Color.DARK_GRAY);


    MarieSim sim = new MarieSim();
    sim.setVisible(true);
  }
} // MarieSim1
