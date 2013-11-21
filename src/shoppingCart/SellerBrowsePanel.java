package shoppingCart;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/** A class that assembles the Seller JPanel for the UI.
 *  @author Newman Souza
 *  @author Seth Moore
 */ 
@SuppressWarnings("serial")
public class SellerBrowsePanel extends AbstractBrowsePanel {
	
    /** Constructs a SellerBrowsePanel object.
     *  @precondition 		none
     *  @postcondition 		object created
     */
    public SellerBrowsePanel() {
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
    	JLabel label;
    	
    	label = new JLabel(String.valueOf(product.getID()));
    	line.add(label);

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

    	label = new JLabel(product.getInvoicePrice().toString());
    	line.add(label);

    	label = new JLabel(product.getSellPrice().toString());
    	line.add(label);

    	label = new JLabel(String.valueOf(product.getQuantity()));
    	line.add(label);

    	this.add(line);
    }

}