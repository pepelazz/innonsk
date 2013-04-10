import models.Article;
import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.test.Fixtures;


@OnApplicationStart
public class FillDemoDb extends Job<FillDemoDb> {
    @Override
    public void doJob() throws Exception {
        if (Article.count() == 0) {
            Fixtures.deleteAllModels(); // required for restarts in 'play test' mode
            Fixtures.loadModels("initial-data.yml");
        }
    }
}

