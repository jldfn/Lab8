import java.util.ListResourceBundle;

/**
 * Created by Денис on 12.06.2017.
 */
public class LocalizedResources_sk_SK extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"removeButton", "Odstrániť"},
                {"addButton", "Pridať"},
                {"removeLowerButton", "Odobrať nižší"},
                {"importButton", "Import"},
                {"saveButton", "Udržať"},
                {"refreshButton", "Аktualizovať"},
                {"windowTitle", "Laba №8"},
                {"error1", "Pole \"Namiesto\" nemôže byť prázdny. Umiestnenie môže obsahovať iba azbuke, abeceda, čísla, \"-\" a \"_\""},
                {"error2", "Pole \"Name\" nemôže byť názov pustym.V môže obsahovať iba Cyrillic a latinskej abecedy"},
                {"error3", "Starobe môže byť iba v rozmedzí od 0 do 120 rokov"},
                {"filterButton","Filter"},
                {"loc","SK"}
        };
    }
}