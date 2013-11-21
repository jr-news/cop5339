package shoppingCart;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/** A class that assembles the Customer JPanel for the UI.
 *  @author Newman Souza
 *  @author Seth Moore
 */ 
@SuppressWarnings("serial")
public class CustomerBrowsePanel extends AbstractBrowsePanel {
	
    /** Constructs a CustomerBrowsePanel object.
     *  @precondition 		none
     *  @postcondition 		object created
     */
    public CustomerBrowsePanel() {
    	super();
    }

    /** Assembles a line for each Product in the Inventory.
	 *  @param product		The Product to be displayed in the line
	 *  @precondition 		product is a valid reference
	 *  @postcondition  	Line assembled
	 */
    @Override
    public void addLine(final Product product) {
    	JPanel line = new JPanel();
    	JLabel label;
    	
    	label = new JLabel(product.getName());
    	label.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED)); 
    	label.addMouseListener(new
    			MouseAdapter(){
    				public void mouseClicked(MouseEvent e) {
    						JOptionPane.showMessageDialog(null,
    								"Testing listener for\nProduct detail.");
    				};
    			}
    	);
    	line.add(label);

    	label = new JLabel(product.getSellPrice().toString());
    	line.add(label);

    	label = new JLabel(String.valueOf(product.getQuantity()));
    	line.add(label);

    	JButton addButton = new JButton("Add to Cart");
    	addButton.addMouseListener(new
    			MouseAdapter(){
    				public void mouseClicked(MouseEvent e) {
//    						JOptionPane.showMessageDialog(null,
//    								"Testing listener for\nAdd To Cart button.");
						Inventory.getInstance().decrement(product);
						Cart.getInstance().increment(product);
    				};
    			}
    	);
    	line.add(addButton);
    	this.add(line);
    }

}