package ZipCodeDB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Jpanel is the "base class". GuiPanel is the "derived"
public class GUIPanel extends JPanel {
    private JTextField zipcode;
    private JButton submit;
    private JTextArea output;

    private JButton north;

    private Database db;  // the zipcode database

    public GUIPanel() {
        this.zipcode = new JTextField("zipcode", 7);
        this.add(this.zipcode);

        this.submit = new JButton("submit");
        this.add(this.submit);
        this.submit.addActionListener(new SubmitButtonListener());

        this.output = new JTextArea(5, 20);
        this.add(this.output);

        this.north = new JButton("Northernmost");
        this.add(this.north);
        this.north.addActionListener(new NorthButtonListener());

        this.db = new Database(); // load the zipcodes
    }

    class SubmitButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // function will get called when the user presses submit

            // get the zipcode out of the text field
            String code = zipcode.getText();

            Zipcode zc = db.search(code);
            WeatherObservation wob = zc.getWeatherData();
            output.setText(wob.toString());
        }
    }

    class NorthButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String code = zipcode.getText();
            double lat = Double.parseDouble(zipcode.getText());

            Zipcode zc = db.getNorthern(lat);
            output.setText(zc.toString());

        }
    }

}
