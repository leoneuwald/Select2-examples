package controllers;

import java.util.LinkedList;
import java.util.List;

import models.JobModel;
import objects.Select2Model;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import com.avaje.ebean.Ebean;

public class Select2Result extends Controller {

	public static Result allJobs(String query, Integer pageLimit) {
		List<Select2Model> jobs = new LinkedList<Select2Model>();
		jobs.add(new JobModel(1, "Developer", "Code like a monkey"));
		jobs.add(new JobModel(2, "Tester", "teste like a monkey"));
		Ebean.createQuery(JobModel.class).findList();
		Select2ResultList select2ResultList = new Select2ResultList(jobs, false);
		System.out.println(select2ResultList.toString());
		return ok(Json.toJson(select2ResultList));
	}
}
