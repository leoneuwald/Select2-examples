
import models.JobModel;
import play.Application;
import play.GlobalSettings;

public class Global extends GlobalSettings {

	@Override
	public void onStart(Application arg0) {
		new JobModel("Job1", "Job1").save();
		System.out.println("asdasd");
		new JobModel("Job1", "Job1").save();
		new JobModel("Job2", "Job2").save();
		new JobModel("Job3", "Job3").save();
		new JobModel("Job4", "Job4").save();
		new JobModel("Job5", "Job5").save();
		new JobModel("Job6", "Job6").save();
		new JobModel("Job7", "Job7").save();
		new JobModel("Job8", "Job8").save();
		new JobModel("Job9", "Job9").save();
		new JobModel("Job10", "Job10").save();
		new JobModel("Job11", "Job11").save();
		new JobModel("Job12", "Job12").save();
		new JobModel("Job13", "Job13").save();
		new JobModel("Job14", "Job14").save();
		new JobModel("Job15", "Job15").save();
		new JobModel("Job16", "Job16").save();
		new JobModel("Job17", "Job17").save();
		new JobModel("Job18", "Job18").save();
		new JobModel("Job19", "Job19").save();
		new JobModel("Job20", "Job20").save();
		super.onStart(arg0);
	}
}
