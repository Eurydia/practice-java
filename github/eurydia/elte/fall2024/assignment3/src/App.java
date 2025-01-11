import components.theme.Palette;
import core.app.AppController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
    private static final String FRAME_NAME = "PROXIMA";
    private static final long TICK_INTERVAL_MILLISECOND = 50;
    private final JFrame frame = new JFrame(FRAME_NAME);
    private final ScheduledExecutorService executorService =
            Executors.newSingleThreadScheduledExecutor();

    public App() {


        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.getContentPane().setBackground(Palette.PRIMARY_DARK);
        frame.setLayout(new BorderLayout());
        frame.setPreferredSize(new Dimension(800, 800));
        frame.addWindowListener(new FrameCloseCleanupHandler());

        AppController appController = new AppController();


        executorService.scheduleWithFixedDelay(appController::tick, 0,
                                               TICK_INTERVAL_MILLISECOND,
                                               TimeUnit.MILLISECONDS);

        frame.getContentPane().add(appController.getView());
        frame.pack();

        appController.getView().requestFocusInWindow();
        frame.setVisible(true);
    }

    private class FrameCloseCleanupHandler extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            frame.setVisible(false);
            frame.dispose();
            executorService.shutdownNow();
            System.exit(0);
        }
    }
}
