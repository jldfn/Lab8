import java.util.ListResourceBundle;

/**
 * Created by Денис on 12.06.2017.
 */
public class LocalizedResources_es_CR extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"removeButton", "Borrar"},
                {"addButton", "Añadir"},
                {"removeLowerButton", "Retire menor"},
                {"importButton", "Importación"},
                {"saveButton", "Conservar"},
                {"refreshButton", "Actualización"},
                {"windowTitle", "Laba №8"},
                {"error1", "Campo \"Lugar\" no puede estar vacío. La ubicación puede contener solamente el cirílico, el alfabeto, números, \"-\" y \"_\""},
                {"error2", "Campo \"Nombre\" no puede ser el nombre pustym.V puede contener solamente el alfabeto cirílico y latino"},
                {"error3", "La edad sólo puede estar en el rango de 0 a 120 años"},
                {"filterButton","Filtro"},
                {"loc","ES"}
        };
    }
}