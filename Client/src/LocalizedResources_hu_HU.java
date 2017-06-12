import java.util.ListResourceBundle;

/**
 * Created by Денис on 12.06.2017.
 */
public class LocalizedResources_hu_HU extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"removeButton", "Töröl"},
                {"addButton", "Hozzáad"},
                {"removeLowerButton", "Távolítsa el az alsó"},
                {"importButton", "Import"},
                {"saveButton", "Megtartása"},
                {"refreshButton", "Frissítés"},
                {"windowTitle", "Laba №8"},
                {"error1", "„Hely” mező nem lehet üres. A helyszín csak a következőket tartalmazhatja cirill, az ábécé, számok, „-” és „_”"},
                {"error2", "„Név” mező nem lehet pustym.V neve tartalmazhat csak cirill és latin ábécé"},
                {"error3", "Életkor csak a 0-tól 120 éves"},
                {"filterButton","Szűrő"},
                {"loc","HU"}
        };
    }
}