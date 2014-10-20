package ch.fhnw.webfr.flashcard.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ModeListener implements ServletContextListener {
	private static final String ATTR_MODE = "mode";
	private static final String MODE_TEST = "test";
	
	public void contextInitialized(ServletContextEvent sce) {
		if (MODE_TEST.equals(sce.getServletContext().getInitParameter(ATTR_MODE))) {
			QuestionnaireInitializer.createQuestionnaires();
		}
	}

	public void contextDestroyed(ServletContextEvent sce) {
	}
}
