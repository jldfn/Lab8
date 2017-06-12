import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.regex.Pattern;

/**
 * Created by Денис on 25.04.2017.
 */
public class RemoveLowerListener extends LabListener {
    JProgressBar jpb1;

    RemoveLowerListener(JTextField nameField, JSpinner ageSpinner, JTextField locField, TreeSet<Human> col, LabTable colTable, JProgressBar jpb) {
        super(nameField, ageSpinner, locField, col, colTable, jpb);
        jpb1 = jpb;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ((int) getAgeSpinner().getValue() >= 0 && (int) getAgeSpinner().getValue() <= 120) {
            if (Pattern.compile("[A-zА-я']+").matcher(getNameField().getText()).matches()) {
                if (Pattern.compile("[A-zА-я0-9\\-_]+").matcher(getLocField().getText()).matches()) {
                    if (ConsoleApp.timedOut) {
                        System.out.print(ConsoleApp.localization.getString("timedOutError"));
                        ConsoleApp.tryToConnect();
                        ConsoleApp.timedOut = false;
                    }
                    Human consoleArgument = new Human(getNameField().getText(), (int) getAgeSpinner().getValue(), getLocField().getText());
                    ProgressBarThread jPBarThread = new ProgressBarThread(jpb1);
                    jPBarThread.start();
                    ConsoleApp.timeOut.sleepTime = 120000;
                    ConsoleApp.timeOut.interrupt();
                    getCollection().clear();
                    getCollection().addAll(makeCall("remove_lower", consoleArgument).getUselessData());
                    getNameField().setText("");
                    getTable().fireTableDataChanged();
                    getAgeSpinner().setValue(0);
                    getLocField().setText("");
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    jPBarThread.interrupt();
                } else {
                    System.out.print(ConsoleApp.localization.getString("error1"));
                    String path = "src/music/shekh.wav";
                    MusicRunnable t1 = new MusicRunnable();
                    t1.path = path;
                    Thread thread = new Thread(t1);
                    thread.start();
                }
            } else {
                System.out.print(ConsoleApp.localization.getString("error2"));
                String path = "src/music/shekh.wav";
                MusicRunnable t1 = new MusicRunnable();
                t1.path = path;
                Thread thread = new Thread(t1);
                thread.start();
            }
        } else {
            System.out.print(ConsoleApp.localization.getString("error3"));
            String path = "src/music/shekh.wav";
            MusicRunnable t1 = new MusicRunnable();
            t1.path = path;
            Thread thread = new Thread(t1);
            thread.start();
        }
    }
}
