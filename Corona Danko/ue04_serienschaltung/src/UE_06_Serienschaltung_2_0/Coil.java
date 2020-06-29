package UE_06_Serienschaltung_2_0;

/**
 *
 * @author danko
 */

public class Coil extends Component {

    public Coil (double value) {
        super("L?", value);
    }
    
    public Coil (String id, double value) {
        super(id, value);
    }

    @Override
    public String unit () {
        return "H";
    }

    @Override
    public double energy () {
        return getValue() * getCurrent() * getCurrent() / 2;
    }
    
}
