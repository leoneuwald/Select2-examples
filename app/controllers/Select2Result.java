package controllers;

import models.JobModel;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Page;

public class Select2Result extends Controller {

	public static Result allJobs(String query, Integer pageLimit, Integer page) {
		Page<JobModel> jobModelList = Ebean.createQuery(JobModel.class).where()
				.ilike("name", "%" + query + "%").orderBy("name")
				.findPagingList(pageLimit).getPage(page);

		Select2ResultList select2ResultList = new Select2ResultList(
				jobModelList.getList(), jobModelList.hasNext());
		return ok(Json.toJson(select2ResultList));
	}
}
