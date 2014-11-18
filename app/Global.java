

import models.JobModel;
import play.Application;
import play.GlobalSettings;

public class Global extends GlobalSettings {

	@Override
	public void onStart(Application arg0) {
		new JobModel("Job1", "Job1").save();
		System.out.println("asdasd");
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		new JobModel("Job1", "Job1").save();
		super.onStart(arg0);
	}
}
