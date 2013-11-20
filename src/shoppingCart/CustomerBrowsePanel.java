package shoppingCart;

import javax.swing.JLabel;
import javax.swing.JPanel;

/** A class that assembles the Customer JPanel for the UI.
 *  @author Newman Souza
 *  @author Seth Moore
 */ 
public class CustomerBrowsePanel extends AbstractBrowsePanel {
	
    /** Constructs a CustomerBrowsePanel object.
     *  @precondition 		none
     *  @postcondition 		object created
     */
    public CustomerBrowsePanel() {
    	// TODO
    }

    /** Assembles a line for each Product in the Inventory.
	 *  @param product		The Product to be displayed in the line
	 *  @precondition 		product is a valid reference
	 *  @postcondition  	Line assembled
	 */
    @Override
    public void addLine(Product product) {
    	JPanel line = new JPanel();
    	line.add(new JLabel(product.getName()));
    	line.add(new JLabel("" + product.getSellPrice().toString()));
    	line.add(new JLabel("" + product.getQuantity()));
    	this.add(line);
    }

}
