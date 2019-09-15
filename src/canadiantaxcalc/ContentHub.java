import java.awt.CardLayout;
import java.awt.Color;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class ContentHub {
    private JPanel mainContentPanel = new JPanel(new CardLayout());


    private void initComponents() {
        SaveSystem saveSystem = new SaveSystem();
        try {
            saveSystem.loadRates();
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(mainContentPanel, "Unable to Load Saved Rates... Keeping with defaults", CalculatorConstants.ERROR_DIALOG_TITLE, JOptionPane.ERROR_MESSAGE);
            try {
                saveSystem.resetRates();
            } catch (IOException ioe) {
                saveSystem.fallBack();
            }
        }
        TaxCalculator taxCalculator = new TaxCalculator(saveSystem);
        //THE SHIPPING CALC FUNCTIONALITY IS NOT PRESENT IN THIS BUILD
       // ShippingCalculator shippingCalculator = new ShippingCalculator(saveSystem);
        RateChanger rateChanger = new RateChanger(saveSystem);

        mainContentPanel.setBackground(Color.WHITE);
        mainContentPanel.setRequestFocusEnabled(false);
        mainContentPanel.add(taxCalculator.getMainPanel(), "1");
        mainContentPanel.add(rateChanger.getMainPanel(), "2");
       // mainContentPanel.add(shippingCalculator.getMainPanel(), "3");
    }


    JPanel getMainContentPanel() {
        return mainContentPanel;
    }

    ContentHub() {
        initComponents();
    }
}
