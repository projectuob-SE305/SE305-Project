import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClasspathRoots;

public class TestRunner {
    public static void main(String[] args) {
        Path classes = Paths.get("out");

        var request = LauncherDiscoveryRequestBuilder.request()
                .selectors(selectClasspathRoots(Collections.singleton(classes)))
                .build();

        SummaryGeneratingListener listener = new SummaryGeneratingListener();
        Launcher launcher = LauncherFactory.create();
        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request);

        var summary = listener.getSummary();
        summary.printTo(new PrintWriter(System.out));
        if (summary.getTotalFailureCount() > 0) {
            System.out.println("Failures details:");
            summary.getFailures().forEach(f -> {
                System.out.println("---");
                System.out.println(f.getTestIdentifier().getDisplayName());
                Throwable ex = f.getException();
                if (ex != null) {
                    ex.printStackTrace(System.out);
                }
            });
            System.exit(1);
        }
    }
}
