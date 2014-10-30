package controllers;

import java.util.LinkedList;
import java.util.List;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class Select2Result extends Controller {

	public static Result allJobs() {
		List<Jobs> jobs = new LinkedList<Jobs>();
		jobs.add(new Jobs(1, "Developer", "Code like a monkey"));
		jobs.add(new Jobs(2, "Tester", "teste like a monkey"));
		Select2ResultList select2ResultList = new Select2ResultList(jobs, false);
		System.out.println(select2ResultList.toString());

		return ok(Json.toJson(select2ResultList));
	}
}
