import models.JobModel;
import play.Application;
import play.GlobalSettings;

public class Global extends GlobalSettings {

	@Override
	public void onStart(Application arg0) {
		new JobModel("Name of Job01", "description of the Job01").save();
		new JobModel("Name of Job02", "description of the Job02").save();
		new JobModel("Name of Job03", "description of the Job03").save();
		new JobModel("Name of Job04", "description of the Job04").save();
		new JobModel("Name of Job05", "description of the Job05").save();
		new JobModel("Name of Job06", "description of the Job06").save();
		new JobModel("Name of Job07", "description of the Job07").save();
		new JobModel("Name of Job08", "description of the Job08").save();
		new JobModel("Name of Job09", "description of the Job09").save();
		new JobModel("Name of Job10", "description of the Job10").save();
		new JobModel("Name of Job11", "description of the Job11").save();
		new JobModel("Name of Job12", "description of the Job12").save();
		new JobModel("Name of Job13", "description of the Job13").save();
		new JobModel("Name of Job14", "description of the Job14").save();
		new JobModel("Name of Job15", "description of the Job15").save();
		new JobModel("Name of Job16", "description of the Job16").save();
		new JobModel("Name of Job17", "description of the Job17").save();
		new JobModel("Name of Job18", "description of the Job18").save();
		new JobModel("Name of Job19", "description of the Job19").save();
		new JobModel("Name of Job20", "description of the Job20").save();
		super.onStart(arg0);
	}
}
